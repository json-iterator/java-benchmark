package com.jsoniter.benchmark.with_5_string_fields;

import com.jsoniter.DecodingMode;
import com.jsoniter.JsonIterator;
import com.jsoniter.benchmark.All;
import com.jsoniter.output.EncodingMode;
import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.TypeLiteral;
import org.junit.Test;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/*
Benchmark            Mode  Cnt      Score      Error  Units
DeserJsoniter.deser  avgt    5  10279.368 ± 1320.001  ns/op (2.83x)

    55,119,796,533      cycles                                                        (66.61%)
   136,893,417,782      instructions              #    2.48  insns per cycle          (83.30%)
       390,678,706      cache-references                                              (83.37%)
        75,572,218      cache-misses              #   19.344 % of all cache refs      (83.38%)
            45,530      page-faults
    21,262,585,640      branches                                                      (83.36%)
       138,715,626      branch-misses             #    0.65% of all branches          (83.40%)

      15.927331070 seconds time elapsed
 */
@State(Scope.Thread)
public class DeserJsoniter {

    private byte[] testJSON;
    private JsonIterator iter;
    private TypeLiteral<TestObject> typeLiteral;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        JsonStream.setMode(EncodingMode.DYNAMIC_MODE);
        JsonIterator.setMode(DecodingMode.DYNAMIC_MODE_AND_MATCH_FIELD_WITH_HASH);
        testJSON = TestObject.createTestJSON();
        iter = new JsonIterator();
        typeLiteral = TypeLiteral.create(TestObject.class);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            iter.reset(testJSON);
            bh.consume(iter.read(typeLiteral));
        }
    }

    @Test
    public void test() throws IOException {
        benchSetup(null);
        iter.reset(testJSON);
        assertEquals("", iter.read(typeLiteral).field1);
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_5_string_fields.DeserJsoniter",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
