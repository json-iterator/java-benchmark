package com.jsoniter.benchmark.with_1_string_field;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.jsoniter.benchmark.All;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
Benchmark       Mode  Cnt      Score      Error  Units
SerJackson.ser  avgt    5  11514.836 ± 1401.830  ns/op

    56,897,396,428      cycles                                                        (66.59%)
   105,861,125,532      instructions              #    1.86  insns per cycle          (83.36%)
       516,826,736      cache-references                                              (83.32%)
        93,550,691      cache-misses              #   18.101 % of all cache refs      (83.39%)
            45,144      page-faults
    18,363,789,516      branches                                                      (83.40%)
       149,463,993      branch-misses             #    0.81% of all branches          (83.39%)

      16.360015478 seconds time elapsed
 */
@State(Scope.Thread)
public class SerJackson {

    private ObjectMapper objectMapper;
    private ByteArrayOutputStream byteArrayOutputStream;
    private TestObject testObject;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new AfterburnerModule());
        byteArrayOutputStream = new ByteArrayOutputStream();
        testObject = TestObject.createTestObject();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void ser(Blackhole bh) throws IOException {
        for (int i = 0; i < 100; i++) {
            byteArrayOutputStream.reset();
            objectMapper.writeValue(byteArrayOutputStream, testObject);
            bh.consume(byteArrayOutputStream);
        }
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_1_string_field.SerJackson",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
