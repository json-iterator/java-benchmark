package com.jsoniter.benchmark.with_10_int_fields;

import com.jsoniter.DecodingMode;
import com.jsoniter.JsonIterator;
import com.jsoniter.benchmark.All;
import com.jsoniter.output.EncodingMode;
import com.jsoniter.output.JsonStream;
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
Benchmark        Mode  Cnt     Score     Error  Units
SerJsoniter.ser  avgt    5  5227.980 ± 246.125  ns/op

    55,954,769,626      cycles                                                        (66.70%)
    92,606,806,682      instructions              #    1.66  insns per cycle          (83.32%)
       314,644,367      cache-references                                              (83.34%)
        47,722,145      cache-misses              #   15.167 % of all cache refs      (83.32%)
            44,954      page-faults
    16,550,644,697      branches                                                      (83.31%)
       137,954,713      branch-misses             #    0.83% of all branches          (83.43%)

      15.852883000 seconds time elapsed
 */
@State(Scope.Thread)
public class SerJsoniter {

    private TestObject testObject;
    private JsonStream stream;
    private ByteArrayOutputStream byteArrayOutputStream;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
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
                "with_10_int_fields.SerJsoniter",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
