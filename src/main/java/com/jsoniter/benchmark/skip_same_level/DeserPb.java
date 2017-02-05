package com.jsoniter.benchmark.skip_same_level;

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

@State(Scope.Thread)
public class DeserPb {

    private byte[] testData;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        Pb.PbTestWriteObject obj = Pb.PbTestWriteObject.newBuilder()
                .setField1("xxxx-1")
                .setField2("xxxx-2")
                .setField3("xxxx-3")
                .setField4("xxxx-4")
                .setField5("xxxx-5")
                .setField6("xxxx-6")
                .setField7("xxxx-7")
                .setField8("xxxx-8")
                .setField9("xxxx-9")
                .setField10("xxxx-10")
                .setField11("xxxx-11")
                .setField12("xxxx-12")
                .setField13("xxxx-13")
                .setField14("xxxx-14")
                .setField15("xxxx-15")
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
        System.out.println(parsed.getField15());
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "skip_same_level.DeserPb",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
