package com.jsoniter.benchmark.skip_multi_levels;

import com.google.protobuf.InvalidProtocolBufferException;
import com.jsoniter.benchmark.All;
import org.junit.Test;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
public class DeserPb {

    private byte[] testData;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        Pb.PbTestWriteObject obj = Pb.PbTestWriteObject.newBuilder()
                .addAllField1(Arrays.asList("1", "2", "3", "4", "5"))
                .setField2(Pb.PbTestWriteObject.Field2.newBuilder()
                        .addAllField1(Arrays.asList("1", "2", "3", "4", "5"))
                        .addAllField2(Arrays.asList("1", "2", "3", "4", "5"))
                        .addAllField3(Arrays.asList("1", "2", "3", "4", "5"))
                        .build())
                .setField3("xxxx-3")
                .build();
        testData = obj.toByteArray();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            bh.consume(Pb.PbTestReadObject.parseFrom(testData));
        }
    }

    @Test
    public void test() throws InvalidProtocolBufferException {
        benchSetup(null);
        Pb.PbTestReadObject parsed = Pb.PbTestReadObject.parseFrom(testData);
        System.out.println(parsed.getField3());
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "skip_multi_levels.DeserPb",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
