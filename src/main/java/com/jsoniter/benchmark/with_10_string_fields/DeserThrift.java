package com.jsoniter.benchmark.with_10_string_fields;

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
Benchmark          Mode  Cnt       Score       Error  Units
DeserThrift.deser  avgt    5  503725.605 ± 24426.145  ns/op
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
        testObject.setField1("1");
        testObject.setField2("2");
        testObject.setField3("3");
        testObject.setField4("4");
        testObject.setField5("5");
        testObject.setField6("6");
        testObject.setField7("7");
        testObject.setField8("8");
        testObject.setField9("9");
        testObject.setField10("10");
        serializer = new TSerializer(new TCompactProtocol.Factory());
        deserializer = new TDeserializer(new TCompactProtocol.Factory());
        testData = serializer.serialize(testObject);
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
                "with_10_string_fields.DeserThrift",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
