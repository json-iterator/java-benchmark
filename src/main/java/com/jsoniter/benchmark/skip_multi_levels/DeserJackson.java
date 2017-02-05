package com.jsoniter.benchmark.skip_multi_levels;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.jsoniter.benchmark.All;
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
Benchmark           Mode  Cnt      Score     Error  Units
DeserJackson.deser  avgt    5  17576.385 ± 228.182  ns/op

   126,386,032,615      cycles                                                        (66.68%)
   263,160,822,593      instructions              #    2.08  insns per cycle          (83.30%)
     1,673,330,433      cache-references                                              (83.33%)
       308,170,490      cache-misses              #   18.417 % of all cache refs      (83.36%)
            44,738      page-faults
    41,044,621,048      branches                                                      (83.35%)
       148,438,183      branch-misses             #    0.36% of all branches          (83.34%)

      36.199834604 seconds time elapsed
 */
@State(Scope.Thread)
public class DeserJackson {

    private ObjectMapper objectMapper;
    private TypeReference<TestReadObject> typeReference;
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

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new AfterburnerModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        typeReference = new TypeReference<TestReadObject>() {
        };
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            bh.consume(objectMapper.readValue(testJSON, typeReference));
        }
    }

    @Test
    public void test() throws IOException {
        benchSetup(null);
        TestReadObject obj = objectMapper.readValue(testJSON, typeReference);
        assertEquals("xxxx-3", obj.field3);
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "skip_multi_levels.DeserJackson",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
