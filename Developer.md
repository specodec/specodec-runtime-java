# Developer Guide — Java Runtime

## Type Mapping Table

| TypeSpec Type        | Java Type (Required) | Java Type (Optional) | Notes                                    |
|----------------------|---------------------|---------------------|------------------------------------------|
| `boolean`            | `boolean`           | `Boolean`           | Boxed for nullable                       |
| `int8`               | `byte`              | `Byte`              | `readInt32()` result cast to `byte`      |
| `int16`              | `short`             | `Short`             | `readInt32()` result cast to `short`     |
| `int32`              | `int`               | `Integer`           | Direct                                   |
| `int64`              | `long`              | `Long`              | Direct                                   |
| `uint8`              | `int`               | `Integer`           | Java lacks unsigned byte                 |
| `uint16`             | `int`               | `Integer`           | Java lacks unsigned short                |
| `uint32`             | `int`               | `Integer`           | Stored as signed with masks              |
| `uint64`             | `long`              | `Long`              | Unsigned ops via `Long.divideUnsigned`   |
| `float32`            | `float`             | `Float`             | Direct                                   |
| `float64`            | `double`            | `Double`            | Direct                                   |
| `string`             | `String`            | `String`            | Nullable ref, not boxed                  |
| `bytes`              | `byte[]`            | `byte[]`            |                                          |

**Dual type system:** The emitter uses `typeToJava()` for primitives (required fields) and `boxedJavaType()` for optionals. This produces idiomatic `Integer`/`Boolean` boxed types for nullable fields while using `int`/`boolean` for required fields.

## Model Representation

**Models** are emitted as Java `record` types:

```java
public record Person(String name, int age, String nickname) {}
```

Records provide automatic `equals`, `hashCode`, `toString`, and accessor methods. The canonical constructor is used. Fields appear in declaration order.

## Optional / Nullable

- **Optional fields** use **boxed wrapper types**: `Integer` (not `int`), `Boolean` (not `boolean`), `Double` (not `double`).
- `null` represents absent value.
- Reference types (`String`, `byte[]`) already support `null` without boxing.
- Generated decode:
  - For boxed optionals: `Integer __age = null;` then `if (__age != null) w.writeInt32(__age);`
  - For required primitives: `int __age = 0;` with unconditional read/write.
- `SpecUndefined` is an empty final class: `public final class SpecUndefined {}`

## Union Representation

Discriminated unions use Java's **`sealed interface` with `permits` clause**:

```java
public sealed interface Shape permits Circle, Rectangle {
    public static final SpecUndefined Undefined = new SpecUndefined();
}

public record Circle(double radius) implements Shape {}
public record Rectangle(double width, double height) implements Shape {}
```

The `@type` discriminator field is read/written by the codec to select the variant.

## Enum Representation

Enums are represented as **`String`** — not Java enums. This provides forward compatibility since TypeSpec enums are extensible.

## Ryu Implementation

Package `specodec.ryu`:

| File          | Purpose                                           |
|---------------|---------------------------------------------------|
| `RyuF32.java` | `float32` → shortest decimal string               |
| `RyuF64.java` | `float64` → shortest decimal string               |
| `RyuMath.java`| Shared integer math                               |
| `TablesF32.java` | F32 lookup tables                             |
| `TablesF64.java` | F64 lookup tables                             |

**Bit extraction:**
- F32: `Float.floatToRawIntBits(f)` — raw bits (no NaN normalization)
- F64: `Double.doubleToRawLongBits(d)` — raw bits

**Critical implementation detail — unsigned division:**
Java has no unsigned primitives. The code uses **`Long.divideUnsigned`** for unsigned 64-bit division:
```java
Long.divideUnsigned(vp - 1L, 10L) <= Long.divideUnsigned(vm, 10L)
```
This is critical for correctness — using `/` would treat high-bit values as negative.

**Table sizes:** Same as C#:
- `FLOAT_POW5_INV_SPLIT`: 27 × `long` (indices 0..26)
- `FLOAT_POW5_SPLIT`: 48 × `long` (indices 0..47)
- `DOUBLE_POW5_INV_SPLIT`: ~342 × `long[]`
- `DOUBLE_POW5_SPLIT`: ~309 × `long[]`

**Key functions:**
- `mulShift32(long m, long factor, int shift)` — 64×64→64 with shift
- `mulShift64(long m, long[] mul, int shift)` — 128-bit multiply
- `decimalLength9(int)` / `decimalLength17(long)`
- `log10Pow2 / log10Pow5 / pow5bits`
- `multipleOfPowerOf5_32 / multipleOfPowerOf2_32` (32-bit)
- `multipleOfPowerOf5_64 / multipleOfPowerOf2_64` (64-bit)

## MsgPack Reader / Writer

**Reader** (`MsgPackReader.java`):
- Accumulation strategy: counter-based. `ArrayList<Integer> containerCount` — `beginObject()`/`beginArray()` push header count, `hasNextField()`/`hasNextElement()` decrement.
- `byte[] data`, `int pos` linear scan.
- **int8/int16 decoding**: `readInt32()` returns result as `int`, then cast to `byte`/`short`:
  ```java
  // int8 with mask
  w.writeInt32(expr & 0xFF);
  w.writeInt32(expr & 0xFFFF);
  ```
- Unsigned reads use `& 0xFF` masking per byte. `readU32()` returns signed `int` but all internal arithmetic masks to `0xFFFFFFFFL` for unsigned interpretation.
- Float: `Float.intBitsToFloat`, `Double.longBitsToDouble`.
- NaN/Inf: raw IEEE 754 bits stored directly.

**Writer** (`MsgPackWriter.java`):
- Accumulation: `ArrayList<Byte>` for byte collection.
- **uint32/uint64**: Use `Long.compareUnsigned` for comparisons:
  ```java
  if (Long.compareUnsigned(value, 0x7FL) <= 0) ...
  ```
- Float: `Float.floatToRawIntBits`, `Double.doubleToRawLongBits`.
- `int16` masking: `writeU16((int) value & 0xFFFF)` for negative values in signed paths.
- `SpecWriter.writeUint32` takes `int` (not unsigned type), masking handled internally: `value & 0xFFFFFFFFL`.

## JSON Reader / Writer

**Reader** (`JsonReader.java`):
- Converts `byte[]` to `String` via `new String(data, StandardCharsets.UTF_8)`.
- **Unicode escape**: `\uXXXX` parsed with `Integer.parseInt(hex, 16)`. Surrogate pairs supported.
- **Number parsing**: validates via character-by-character parsing, then `Integer.parseInt`/`Long.parseLong`/`Double.parseDouble`.
- int64/uint64: both bare numbers and quoted strings accepted.
- NaN/Inf: `"NaN"`, `"Infinity"`, `"-Infinity"` as quoted strings.
- Bytes: base64 via `java.util.Base64.getDecoder().decode(s)`.

**Writer** (`JsonWriter.java`):
- Accumulation: `StringBuilder`.
- Escape: same set as other languages (`"`, `\`, control chars, etc.).
- int64/uint64: quoted strings for JavaScript safety.
- NaN/Inf: `"NaN"`, `"Infinity"`, `"-Infinity"`.
- Comma tracking: `ArrayList<Boolean> firstItem` stack.

## Gron Reader / Writer

**Reader** (`GronReader.java`):
- Parses `byte[]` to `String`, splits on `\n`, extracts `path` and `value` from `path = value;` lines.
- Ignore lines starting with `#` (comments).
- Context stack: `List<Context>`, with `Context` as inner record class storing `prefix`, `type`, `index`.
- Path-based nesting: `hasNextField()` verifies prefix match and no sub-fields. `hasNextElement()` matches `prefix + "[N]"`.
- Unescape: handles JSON escape sequences + `\uXXXX` with surrogate pairs.

**Writer** (`GronWriter.java`):
- Segment stack: `ArrayList<String>` starting with `"json"`.
- Nesting tracked via inner `NestInfo` class (depth + array index).
- Final output: `String.join("\n", lines) + "\n"` → UTF-8 bytes.

## State Management

Java uses **mutable** state. All state fields are instance variables mutated directly. Models are Java `record` types (immutable, but constructed from mutable accumulators during decode).

## SpecReader / SpecWriter Interfaces

**SpecReader** (`SpecReader.java:1-29`):
```java
public interface SpecReader {
    void beginObject(); boolean hasNextField(); String readFieldName(); void endObject();
    void beginArray(); boolean hasNextElement(); void endArray();
    String readString(); boolean readBool(); int readInt32(); long readInt64();
    int readUint32(); long readUint64(); float readFloat32(); double readFloat64();
    void readNull(); byte[] readBytes(); String readEnum();
    boolean isNull(); void skip();

    @FunctionalInterface interface DecodeFn<T> { T decode(SpecReader r); }
}
```

**SpecWriter** (`SpecWriter.java:1-27`):
```java
public interface SpecWriter {
    void writeString(String value); void writeBool(boolean value);
    void writeInt32(int value); void writeInt64(long value);
    void writeUint32(int value); void writeUint64(long value);
    void writeFloat32(float value); void writeFloat64(double value);
    void writeNull(); void writeBytes(byte[] value); void writeEnum(String value);
    void beginObject(int fieldCount); void writeField(String name); void endObject();
    void beginArray(int elementCount); void nextElement(); void endArray();
    byte[] toBytes();

    @FunctionalInterface interface EncodeFn<T> { void encode(SpecWriter w, T obj); }
}
```

Note: `writeUint32` takes `int` (signed) — the runtime handles unsigned interpretation via `& 0xFFFFFFFFL`.

**SpecCodec** (`SpecCodec.java`):
```java
public record SpecCodec<T>(SpecWriter.EncodeFn<T> encode, SpecReader.DecodeFn<T> decode) { ... }
```
Format dispatch via `FormatRegistry` with `defaultRegistry` containing json, msgpack, gron.

## Emitter Generation Pattern

```java
// Generated:
public record Person(String name, int age, String nickname) {

    public static final SpecCodec<Person> CODEC = new SpecCodec<>(
        EncodeFn: (w, v) -> {
            w.beginObject(v.nickname() != null ? 3 : 2);
            w.writeField("name");
            w.writeString(v.name());
            w.writeField("age");
            w.writeInt32(v.age());
            if (v.nickname() != null) {
                w.writeField("nickname");
                w.writeString(v.nickname());
            }
            w.endObject();
        },
        DecodeFn: r -> {
            String __name = "";
            int __age = 0;
            String __nickname = null;
            r.beginObject();
            while (r.hasNextField()) {
                switch (r.readFieldName()) {
                    case "name": __name = r.readString(); break;
                    case "age": __age = r.readInt32(); break;
                    case "nickname": __nickname = r.readString(); break;
                    default: r.skip();
                }
            }
            r.endObject();
            return new Person(__name, __age, __nickname);
        }
    );
}
```

## Known Quirks / Bugs

1. **No unsigned primitive types**: Java lacks `uint8`, `uint16`, `uint32`, `uint64`. All unsigned values use signed types with explicit masking:
   - `int` for uint8/uint16/uint32 (with `& 0xFF`, `& 0xFFFF`, `& 0xFFFFFFFFL`)
   - `long` for uint64
   - Unsigned comparison: `Long.compareUnsigned(a, b)` and `Long.divideUnsigned(a, b)` used throughout

2. **uint32 SpecWriter signature takes `int`**: Unlike C# which uses `uint`, Java's `writeUint32(int value)` takes a signed `int`. Internal methods mask to `& 0xFFFFFFFFL` before bit-level ops.

3. **Two type namespaces**: `typeToJava()` for primitives vs `boxedJavaType()` for optionals — important to keep in mind when modifying the emitter.

4. **int8/int16 in MsgPack**: The emitter emits `w.writeInt32(expr & 0xFF)` / `w.writeInt32(expr & 0xFFFF)` masking to handle Java's signed byte/short widening correctly.

## DevContainer

- Base image: `dev:java`
- Build: `gradle jar --no-daemon -q`
- Config: `build.gradle` + `settings.gradle` (Groovy DSL)
- Output: `/out/` from `build/libs/`
- Containerfile: `Containerfile.build` — copies gradle configs + `src/`, runs `gradle jar`, copies JAR to scratch
