package com.jsoniter.benchmark.skip_multi_levels;

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
Benchmark            Mode  Cnt     Score     Error  Units
DeserJsoniter.deser  avgt    5  2371.497 ± 217.607  ns/op (7.41x)

    55,298,363,003      cycles                                                        (66.73%)
   134,257,098,760      instructions              #    2.43  insns per cycle          (83.46%)
       378,869,967      cache-references                                              (83.33%)
        80,583,430      cache-misses              #   21.269 % of all cache refs      (83.34%)
            45,041      page-faults
    23,279,091,965      branches                                                      (83.38%)
       147,305,324      branch-misses             #    0.63% of all branches          (83.33%)

      16.429735981 seconds time elapsed
 */
@State(Scope.Thread)
public class DeserJsoniter {

    private byte[] testJSON = ("{\"field2\":{" +
            "\"1\":[\"1\",\"2\",\"3\",\"4\",\"5\"]," +
            "\"2\":[\"1\",\"2\",\"3\",\"4\",\"5\"]," +
            "\"3\":[\"1\",\"2\",\"3\",\"4\",\"5\"]" +
            "}," +
            "\"field1\":[" +
            "\"1\",\"2\",\"3\",\"4\",\"5\"," +
            "\"1\",\"2\",\"3\",\"4\",\"5\"," +
            "\"1\",\"2\",\"3\",\"4\",\"5\"" +
            "]," +
            "\"field3\":\"x-3\"}").getBytes();
    private JsonIterator iter;
    private TypeLiteral<TestReadObject> typeLiteral;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        JsonStream.setMode(EncodingMode.DYNAMIC_MODE);
        JsonIterator.setMode(DecodingMode.DYNAMIC_MODE_AND_MATCH_FIELD_WITH_HASH);
        iter = new JsonIterator();
        typeLiteral = TypeLiteral.create(TestReadObject.class);
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

//    @Benchmark
//    @BenchmarkMode(Mode.AverageTime)
//    @OutputTimeUnit(TimeUnit.NANOSECONDS)
//    public void deserAny(Blackhole bh) throws IOException {
//        for (int i = 0; i < 1000; i++) {
//            iter.reset(testJSON);
//            bh.consume(iter.readAny().toString("field3"));
//        }
//    }

    @Test
    public void test() throws IOException {
        benchSetup(null);
        System.out.println(new String(testJSON));
        iter.reset(testJSON);
        assertEquals("x-3", iter.read(typeLiteral).field3);
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "skip_multi_levels.DeserJsoniter",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
