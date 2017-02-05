package com.jsoniter.benchmark.with_object_list;

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
SerPb.ser  avgt    5  328219.768 ± 2099.515  ns/op
 */
@State(Scope.Thread)
public class SerPb {

    private Pb.PbTestObject testObject;
    private ByteArrayOutputStream byteArrayOutputStream;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        testObject = Pb.PbTestObject.newBuilder()
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("1").build())
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("2").build())
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("3").build())
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("4").build())

                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("1").build())
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("2").build())
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("3").build())
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("4").build())

                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("1").build())
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("2").build())
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("3").build())
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("4").build())

                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("1").build())
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("2").build())
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("3").build())
                .addField1(Pb.PbTestObject.ElementObject.newBuilder().setField1("4").build())
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
                "with_object_list.SerPb",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
