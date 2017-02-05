package com.jsoniter.benchmark.with_10_string_fields;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.jsoniter.benchmark.All;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
Benchmark           Mode  Cnt      Score      Error  Units
DeserJackson.deser  avgt    5  29180.023 ± 1749.310  ns/op

    56,279,412,462      cycles                                                        (66.70%)
   116,926,101,144      instructions              #    2.08  insns per cycle          (83.36%)
       573,621,852      cache-references                                              (83.40%)
       108,661,118      cache-misses              #   18.943 % of all cache refs      (83.36%)
            44,355      page-faults
    21,278,471,110      branches                                                      (83.33%)
       146,063,366      branch-misses             #    0.69% of all branches          (83.32%)

      16.180194459 seconds time elapsed
 */
@State(Scope.Thread)
public class DeserJackson {

    private ObjectMapper objectMapper;
    private TypeReference<TestObject> typeReference;
    private byte[] testJSON;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new AfterburnerModule());
        typeReference = new TypeReference<TestObject>() {
        };
        testJSON = TestObject.createTestJSON();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            bh.consume(objectMapper.readValue(testJSON, typeReference));
        }
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_10_string_fields.DeserJackson",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
