package com.jsoniter.benchmark.with_int_list;

import com.jsoniter.JsonIterator;
import com.jsoniter.benchmark.All;
import com.jsoniter.output.EncodingMode;
import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.DecodingMode;
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
Benchmark            Mode  Cnt       Score      Error  Units
DeserJsoniter.deser  avgt    5  245837.298 ± 7178.562  ns/op
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
        assertEquals(31415926, iter.read(typeLiteral).field1);
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_int_list.DeserJsoniter",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
