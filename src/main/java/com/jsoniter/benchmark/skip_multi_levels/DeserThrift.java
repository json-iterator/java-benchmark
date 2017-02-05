package com.jsoniter.benchmark.skip_multi_levels;

import com.jsoniter.benchmark.All;
import org.apache.thrift.TDeserializer;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TCompactProtocol;
import org.junit.Test;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
Benchmark          Mode  Cnt       Score      Error  Units
DeserThrift.deser  avgt    5  140635.170 ± 2962.132  ns/op
 */
@State(Scope.Thread)
public class DeserThrift {

    private TSerializer serializer;
    private TDeserializer deserializer;
    private byte[] testData;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) throws TException {
        ThriftTestWriteObject testObject = new ThriftTestWriteObject();
        testObject.setField1(Arrays.asList("1", "2", "3", "4", "5",
                "1", "2", "3", "4", "5",
                "1", "2", "3", "4", "5"));
        HashMap<String, List<String>> field2 = new HashMap<>();
        field2.put("1", Arrays.asList("1", "2", "3", "4", "5"));
        field2.put("2", Arrays.asList("1", "2", "3", "4", "5"));
        field2.put("3", Arrays.asList("1", "2", "3", "4", "5"));
        testObject.setField2(field2);
        testObject.setField3("x-3");
        serializer = new TSerializer(new TCompactProtocol.Factory());
        deserializer = new TDeserializer(new TCompactProtocol.Factory());
        testData = serializer.serialize(testObject);
    }

    @Test
    public void test() throws TException {
//        byte[] output = new TSerializer(new TCompactProtocol.Factory()).serialize(testObject);
//        System.out.println(output.length);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) throws TException {
        for (int i = 0; i < 1000; i++) {
            ThriftTestReadObject obj = new ThriftTestReadObject();
            deserializer.deserialize(obj, testData);
            bh.consume(obj);
        }
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_long_string.DeserThrift",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
