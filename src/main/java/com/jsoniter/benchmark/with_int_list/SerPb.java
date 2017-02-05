package com.jsoniter.benchmark.with_int_list;

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
SerPb.ser  avgt    5  159337.360 ± 1744.681  ns/op
 */
@State(Scope.Thread)
public class SerPb {

    private Pb.PbTestObject testObject;
    private ByteArrayOutputStream byteArrayOutputStream;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        testObject = Pb.PbTestObject.newBuilder()
                .addField1(321)
                .addField1(123)
                .addField1(132)
                .addField1(312)

                .addField1(321)
                .addField1(123)
                .addField1(132)
                .addField1(312)

                .addField1(321)
                .addField1(123)
                .addField1(132)
                .addField1(312)

                .addField1(321)
                .addField1(123)
                .addField1(132)
                .addField1(312)
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
                "with_int_list.SerPb",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
