package com.jsoniter.benchmark.with_1_string_field;

import com.dslplatform.json.JsonWriter;
import com.jsoniter.benchmark.All;
import com.jsoniter.benchmark.ExternalSerialization;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
Benchmark       Mode  Cnt     Score     Error  Units
SerDslJson.ser  avgt    5  4541.694 ± 397.950  ns/op

    55,889,149,229      cycles                                                        (66.74%)
    77,791,206,834      instructions              #    1.39  insns per cycle          (83.43%)
       309,121,326      cache-references                                              (83.32%)
        47,371,881      cache-misses              #   15.325 % of all cache refs      (83.31%)
            42,598      page-faults
    14,086,658,168      branches                                                      (83.38%)
       137,337,352      branch-misses             #    0.97% of all branches          (83.37%)

      15.968127239 seconds time elapsed
 */
@State(Scope.Thread)
public class SerDslJson {

    private JsonWriter jsonWriter;
    private ByteArrayOutputStream byteArrayOutputStream;
    private TestObject testObject;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        testObject = TestObject.createTestObject();
        jsonWriter = new JsonWriter();
        byteArrayOutputStream = new ByteArrayOutputStream();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void ser(Blackhole bh) throws IOException {
        for (int i = 0; i < 100; i++) {
            jsonWriter.reset();
            byteArrayOutputStream.reset();
            ExternalSerialization.serialize(testObject, jsonWriter, false);
            jsonWriter.toStream(byteArrayOutputStream);
            bh.consume(byteArrayOutputStream);
        }
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_1_string_field.SerDslJson",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
