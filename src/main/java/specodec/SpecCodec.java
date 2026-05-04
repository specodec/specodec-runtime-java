package specodec;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public record SpecCodec<T>(SpecWriter.EncodeFn<T> encode, SpecReader.DecodeFn<T> decode) {

    public record FormatEntry(
        String name,
        Supplier<SpecWriter> newWriter,
        Function<byte[], SpecReader> newReader
    ) {}

    public static class FormatRegistry {
        private final List<FormatEntry> entries = new ArrayList<>();

        public FormatRegistry register(FormatEntry entry) {
            entries.add(entry);
            return this;
        }

        public FormatEntry match(String format) {
            String lc = format.toLowerCase();
            return entries.stream()
                .filter(e -> lc.equals(e.name()) || lc.contains(e.name()))
                .findFirst()
                .orElse(entries.get(0));
        }
    }

    public static final FormatRegistry defaultRegistry = new FormatRegistry()
        .register(new FormatEntry("json", JsonWriter::new, JsonReader::new))
        .register(new FormatEntry("msgpack", MsgPackWriter::new, MsgPackReader::new))
        .register(new FormatEntry("gron", GronWriter::new, GronReader::new));

    public static <T> T dispatch(SpecCodec<T> codec, byte[] body, String format,
                                  FormatRegistry registry) {
        FormatEntry fmt = registry.match(format);
        return codec.decode().decode(fmt.newReader().apply(body));
    }

    public record RespondResult(byte[] body, String name) {}

    public static <T> RespondResult respond(SpecCodec<T> codec, T obj, String format,
                                             FormatRegistry registry) {
        FormatEntry fmt = registry.match(format);
        SpecWriter w = fmt.newWriter().get();
        codec.encode().encode(w, obj);
        return new RespondResult(w.toBytes(), fmt.name());
    }
}
