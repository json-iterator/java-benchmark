package com.jsoniter.benchmark.with_1_string_field;

import com.google.protobuf.InvalidProtocolBufferException;
import com.jsoniter.benchmark.All;
import org.junit.Test;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
Benchmark      Mode  Cnt      Score      Error  Units
DeserPb.deser  avgt    5  68666.658 ± 7438.707  ns/op
 */
@State(Scope.Thread)
public class DeserPb {

    private byte[] testData;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        Pb.PbTestObject obj = Pb.PbTestObject.newBuilder()
                .setField1("1")
                .build();
        testData = obj.toByteArray();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            bh.consume(Pb.PbTestObject.parseFrom(testData));
        }
    }

    @Test
    public void test() throws InvalidProtocolBufferException {
        benchSetup(null);
        Pb.PbTestObject parsed = Pb.PbTestObject.parseFrom(testData);
        System.out.println(parsed.getField1());
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_1_string_field.DeserPb",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
