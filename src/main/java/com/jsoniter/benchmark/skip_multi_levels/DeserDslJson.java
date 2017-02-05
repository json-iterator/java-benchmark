package com.jsoniter.benchmark.skip_multi_levels;

import com.dslplatform.json.CustomJsonReader;
import com.jsoniter.benchmark.All;
import com.jsoniter.benchmark.ExternalSerialization;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
Benchmark           Mode  Cnt     Score     Error  Units
DeserDslJson.deser  avgt    5  2505.631 ± 306.468  ns/op (7.02x)

    56,227,961,592      cycles                                                        (66.74%)
   137,334,774,671      instructions              #    2.44  insns per cycle          (83.41%)
       351,296,620      cache-references                                              (83.26%)
        74,536,866      cache-misses              #   21.218 % of all cache refs      (83.29%)
            43,679      page-faults
    24,124,817,022      branches                                                      (83.41%)
       138,654,693      branch-misses             #    0.57% of all branches          (83.43%)

      16.165292565 seconds time elapsed
 */
@State(Scope.Thread)
public class DeserDslJson {


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
    private CustomJsonReader reader;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        reader = new CustomJsonReader(testJSON);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            reader.reset();
            reader.read();
            reader.getNextToken();
            TestReadObject obj = new TestReadObject();
            ExternalSerialization.deserialize(obj, reader);
            bh.consume(obj);
        }
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "skip_multi_levels.DeserDslJson",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
