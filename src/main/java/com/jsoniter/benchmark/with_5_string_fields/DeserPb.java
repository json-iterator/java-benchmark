package com.jsoniter.benchmark.with_5_string_fields;

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
Benchmark      Mode  Cnt       Score      Error  Units
DeserPb.deser  avgt    5  276972.857 ± 8704.378  ns/op
 */
@State(Scope.Thread)
public class DeserPb {

    private byte[] testData;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        PbTestObect.PbTestObject obj = PbTestObect.PbTestObject.newBuilder()
                .setField1("1")
                .setField2("2")
                .setField3("3")
                .setField4("4")
                .setField5("5")
                .build();
        testData = obj.toByteArray();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            bh.consume(PbTestObect.PbTestObject.parseFrom(testData));
        }
    }

    @Test
    public void test() throws InvalidProtocolBufferException {
        PbTestObect.PbTestObject obj = PbTestObect.PbTestObject.newBuilder()
                .setField1("1")
                .setField2("2")
                .setField3("3")
                .setField4("4")
                .setField5("5")
                .build();
        PbTestObect.PbTestObject parsed = PbTestObect.PbTestObject.parseFrom(obj.toByteArray());
        System.out.println(parsed.getField1());
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_5_string_fields.DeserPb",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
