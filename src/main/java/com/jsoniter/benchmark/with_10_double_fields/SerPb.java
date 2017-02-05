package com.jsoniter.benchmark.with_10_double_fields;

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
SerPb.ser  avgt    5  143346.157 ± 8530.555  ns/op
 */
@State(Scope.Thread)
public class SerPb {

    private Pb.PbTestObject testObject;
    private ByteArrayOutputStream byteArrayOutputStream;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        testObject = Pb.PbTestObject.newBuilder()
                .setField1(31.415926)
                .setField2(61.415923)
                .setField3(31.415269)
                .setField4(53.141926)
                .setField5(13.145926)
                .setField6(43.115926)
                .setField7(31.419265)
                .setField8(23.141596)
                .setField9(43.161592)
                .setField10(0.112)
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
                "with_10_double_fields.SerPb",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
