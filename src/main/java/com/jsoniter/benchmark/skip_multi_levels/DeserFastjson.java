package com.jsoniter.benchmark.skip_multi_levels;

import com.alibaba.fastjson.JSON;
import com.jsoniter.benchmark.All;
import org.junit.Test;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
public class DeserFastjson {
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


    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) {
        for (int i = 0; i < 1000; i++) {
            bh.consume(JSON.parseObject(testJSON, TestReadObject.class));
        }
    }

    @Test
    public void test() {
        TestReadObject obj = JSON.parseObject(testJSON, TestReadObject.class);
        System.out.println(obj.field3);
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "skip_multi_levels.DeserFastjson",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
