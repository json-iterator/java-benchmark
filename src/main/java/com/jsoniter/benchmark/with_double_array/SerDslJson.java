package com.jsoniter.benchmark.with_double_array;

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
Benchmark       Mode  Cnt        Score       Error  Units
SerDslJson.ser  avgt    5  1478332.248 ± 23664.541  ns/op
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
        for (int i = 0; i < 1000; i++) {
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
                "with_double_array.SerDslJson",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
