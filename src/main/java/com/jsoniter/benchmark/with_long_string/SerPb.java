package com.jsoniter.benchmark.with_long_string;

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
Benchmark  Mode  Cnt      Score      Error  Units
SerPb.ser  avgt    5  65802.792 ± 1028.761  ns/op
 */
@State(Scope.Thread)
public class SerPb {

    private Pb.PbTestObject testObject;
    private ByteArrayOutputStream byteArrayOutputStream;
    private String longStr;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        longStr= "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";
        testObject = Pb.PbTestObject.newBuilder()
                .setField1(longStr)
//                .setField1("0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789")
                .build();
        byteArrayOutputStream = new ByteArrayOutputStream();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void ser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            testObject.field1_ = longStr;
            byteArrayOutputStream.reset();
            testObject.writeTo(byteArrayOutputStream);
            bh.consume(byteArrayOutputStream);
        }
    }

    @Test
    public void test() throws IOException {
        benchSetup(null);
        testObject.field1_ = longStr;
        byteArrayOutputStream.reset();
        testObject.writeTo(byteArrayOutputStream);
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_long_string.SerPb",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
