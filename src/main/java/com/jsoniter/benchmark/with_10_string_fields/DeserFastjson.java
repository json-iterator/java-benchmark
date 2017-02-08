package com.jsoniter.benchmark.with_10_string_fields;

import com.alibaba.fastjson.JSON;
import com.jsoniter.benchmark.All;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
public class DeserFastjson {
    private byte[] testJSON;


    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        testJSON = TestObject.createTestJSON();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) {
        for (int i = 0; i < 1000; i++) {
            bh.consume(JSON.parseObject(testJSON, TestObject.class));
        }
    }
    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_10_string_fields.DeserFastjson",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
