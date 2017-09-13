package com.jsoniter.benchmark.with_10_string_fields;

import com.jsoniter.JsonIterator;
import com.jsoniter.benchmark.All;
import com.jsoniter.output.EncodingMode;
import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.DecodingMode;
import org.junit.Test;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/*
Benchmark        Mode  Cnt       Score      Error  Units
SerJsoniter.ser  avgt    5  129305.086 ± 3322.190  ns/op
 */
@State(Scope.Thread)
public class SerJsoniter {

    private TestObject testObject;
    private JsonStream stream;
    private ByteArrayOutputStream byteArrayOutputStream;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        //JsonIterator.enableAnnotationSupport();
        JsonStream.setMode(EncodingMode.DYNAMIC_MODE);
        JsonIterator.setMode(DecodingMode.DYNAMIC_MODE_AND_MATCH_FIELD_WITH_HASH);
        testObject = TestObject.createTestObject();
        stream = new JsonStream(null, 512);
        byteArrayOutputStream = new ByteArrayOutputStream();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void ser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            byteArrayOutputStream.reset();
            stream.reset(byteArrayOutputStream);
            stream.writeVal(testObject);
            stream.flush();
            bh.consume(byteArrayOutputStream);
        }
    }

    @Test
    public void test() throws IOException {
        benchSetup(null);
        byteArrayOutputStream.reset();
        stream.reset(byteArrayOutputStream);
        stream.writeVal(testObject);
        stream.flush();
        assertEquals("{\"field1\":\"\"}", byteArrayOutputStream.toString());
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_10_string_fields.SerJsoniter",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
