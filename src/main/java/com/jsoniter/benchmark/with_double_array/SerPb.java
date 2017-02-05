package com.jsoniter.benchmark.with_double_array;

import com.google.protobuf.InvalidProtocolBufferException;
import com.jsoniter.benchmark.All;
import org.junit.Test;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
Benchmark  Mode  Cnt       Score      Error  Units
SerPb.ser  avgt    5  107760.788 ± 1373.834  ns/op
 */
@State(Scope.Thread)
public class SerPb {

    private Pb.PbTestObject testObject;
    private ByteArrayOutputStream byteArrayOutputStream;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        testObject = Pb.PbTestObject.newBuilder()
                .addField1(31.415926)
                .addField1(61.415923)
                .addField1(31.415269)
                .addField1(53.141926)
                .addField1(13.145926)
                .addField1(43.115926)
                .addField1(31.419265)
                .addField1(23.141596)
                .addField1(43.161592)
                .addField1(0.112)
                .build();
        byteArrayOutputStream = new ByteArrayOutputStream();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void ser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            byteArrayOutputStream.reset();
            testObject.writeTo(byteArrayOutputStream);
            bh.consume(byteArrayOutputStream);
        }
    }

    @Test
    public void test() throws InvalidProtocolBufferException {
//        benchSetup(null);
//        Pb.PbTestObject parsed = Pb.PbTestObject.parseFrom(testData);
//        System.out.println(parsed.getField1());
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_double_array.SerPb",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
