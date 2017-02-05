package com.jsoniter.benchmark.with_object_list;

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
import java.util.concurrent.TimeUnit;

/*
Benchmark          Mode  Cnt        Score       Error  Units
DeserThrift.deser  avgt    5  1078278.555 ± 32731.319  ns/op
 */
@State(Scope.Thread)
public class DeserThrift {

    private TSerializer serializer;
    private ThriftTestObject testObject;
    private TDeserializer deserializer;
    private byte[] testData;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) throws TException {
        testObject = new ThriftTestObject();
        testObject.addToField1(createElement("1"));
        testObject.addToField1(createElement("2"));
        testObject.addToField1(createElement("3"));
        testObject.addToField1(createElement("4"));

        testObject.addToField1(createElement("1"));
        testObject.addToField1(createElement("2"));
        testObject.addToField1(createElement("3"));
        testObject.addToField1(createElement("4"));

        testObject.addToField1(createElement("1"));
        testObject.addToField1(createElement("2"));
        testObject.addToField1(createElement("3"));
        testObject.addToField1(createElement("4"));

        testObject.addToField1(createElement("1"));
        testObject.addToField1(createElement("2"));
        testObject.addToField1(createElement("3"));
        testObject.addToField1(createElement("4"));
        serializer = new TSerializer(new TCompactProtocol.Factory());
        deserializer = new TDeserializer(new TCompactProtocol.Factory());
        testData = serializer.serialize(testObject);
    }

    private ThriftElementObject createElement(String field1) {
        ThriftElementObject thriftElementObject = new ThriftElementObject();
        thriftElementObject.setField1(field1);
        return thriftElementObject;
    }

    @Test
    public void test() throws TException {
        byte[] output = new TSerializer(new TCompactProtocol.Factory()).serialize(testObject);
        System.out.println(output.length);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) throws TException {
        for (int i = 0; i < 1000; i++) {
            ThriftTestObject obj = new ThriftTestObject();
            deserializer.deserialize(testObject, testData);
            bh.consume(obj);
        }
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_object_list.DeserThrift",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
