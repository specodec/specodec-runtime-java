package ryu;

import specodec.ryu.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class TestRyu {
    static List<Double> loadTests(String filename) throws IOException {
        List<Double> out = new ArrayList<>();
        for (String line : Files.readAllLines(Path.of(filename))) {
            line = line.trim();
            if (line.isEmpty() || line.startsWith("#")) continue;
            out.add(Double.parseDouble(line));
        }
        return out;
    }

    static List<String> loadExpected(String filename) throws IOException {
        List<String> out = new ArrayList<>();
        for (String line : Files.readAllLines(Path.of(filename))) {
            line = line.trim();
            if (line.isEmpty()) continue;
            out.add(line);
        }
        return out;
    }

    static List<Float> loadCoverage(String filename) throws IOException {
        List<Float> out = new ArrayList<>();
        for (String line : Files.readAllLines(Path.of(filename))) {
            line = line.trim();
            if (line.isEmpty()) continue;
            if (!Character.isDigit(line.charAt(0))) continue;
            String v = line.contains("#") ? line.substring(0, line.indexOf('#')).trim() : line;
            out.add(Float.parseFloat(v));
        }
        return out;
    }

    static List<Double> loadCoverage64(String filename) throws IOException {
        List<Double> out = new ArrayList<>();
        for (String line : Files.readAllLines(Path.of(filename))) {
            line = line.trim();
            if (line.isEmpty()) continue;
            if (!Character.isDigit(line.charAt(0))) continue;
            String v = line.contains("#") ? line.substring(0, line.indexOf('#')).trim() : line;
            out.add(Double.parseDouble(v));
        }
        return out;
    }

    public static void main(String[] args) throws Exception {
        int passed = 0;
        int failed = 0;

        System.out.println("=== Float32 Original (125 tests) ===");
        List<Double> f32in = loadTests("test_cases_f32.txt");
        List<String> f32exp = loadExpected("expected_f32.txt");
        for (int i = 0; i < f32in.size(); i++) {
            String result = RyuF32.float32ToString(f32in.get(i).floatValue());
            if (result.equals(f32exp.get(i))) passed++;
            else {
                failed++;
                if (failed <= 5) System.out.println("FAIL: " + f32in.get(i) + " => " + result + " (expected " + f32exp.get(i) + ")");
            }
        }
        System.out.println(f32in.size() + "/" + f32in.size() + "\n");

        System.out.println("=== Float64 Original (102 tests) ===");
        List<Double> f64in = loadTests("test_cases_f64.txt");
        List<String> f64exp = loadExpected("expected_f64.txt");
        for (int i = 0; i < f64in.size(); i++) {
            String result = RyuF64.float64ToString(f64in.get(i));
            if (result.equals(f64exp.get(i))) passed++;
            else {
                failed++;
                if (failed <= 5) System.out.println("FAIL: " + f64in.get(i) + " => " + result + " (expected " + f64exp.get(i) + ")");
            }
        }
        System.out.println(f64in.size() + "/" + f64in.size() + "\n");

        System.out.println("=== Float32 Coverage (78 tests) ===");
        List<Float> c32in = loadCoverage("test_cases_table_coverage.txt");
        List<String> c32exp = loadExpected("expected_table_coverage.txt");
        int n32 = Math.min(c32in.size(), c32exp.size());
        for (int i = 0; i < n32; i++) {
            String result = RyuF32.float32ToString(c32in.get(i));
            if (result.equals(c32exp.get(i))) passed++;
            else {
                failed++;
                if (failed <= 5) System.out.println("FAIL: " + c32in.get(i) + " => " + result + " (expected " + c32exp.get(i) + ")");
            }
        }
        System.out.println(n32 + "/" + n32 + "\n");

        System.out.println("=== Float64 Coverage (616 tests) ===");
        List<Double> c64in = loadCoverage64("test_cases_f64_table_coverage.txt");
        List<String> c64exp = loadExpected("expected_f64_table_coverage.txt");
        int n64 = Math.min(c64in.size(), c64exp.size());
        for (int i = 0; i < n64; i++) {
            String result = RyuF64.float64ToString(c64in.get(i));
            if (result.equals(c64exp.get(i))) passed++;
            else {
                failed++;
                if (failed <= 5) System.out.println("FAIL: " + c64in.get(i) + " => " + result + " (expected " + c64exp.get(i) + ")");
            }
        }
        System.out.println(n64 + "/" + n64 + "\n");

        System.out.println("=== TOTAL: " + passed + "/" + (passed + failed) + " ===");
        if (failed > 0) {
            System.err.println(failed + " tests failed");
            System.exit(1);
        }
    }
}
