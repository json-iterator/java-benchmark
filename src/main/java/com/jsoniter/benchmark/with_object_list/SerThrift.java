package com.jsoniter.benchmark.with_object_list;

import com.jsoniter.benchmark.All;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TIOStreamTransport;
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
Benchmark      Mode  Cnt        Score       Error  Units
SerThrift.ser  avgt    5  1885052.964 ± 27295.760  ns/op
 */
@State(Scope.Thread)
public class SerThrift {

    private ThriftTestObject testObject;
    private ByteArrayOutputStream byteArrayOutputStream;
    private TProtocol protocol;

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
        byteArrayOutputStream = new ByteArrayOutputStream();
        TCompactProtocol.Factory protocolFactory = new TCompactProtocol.Factory();
        protocol = protocolFactory.getProtocol(new TIOStreamTransport(byteArrayOutputStream));
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
    public void ser(Blackhole bh) throws TException {
        for (int i = 0; i < 1000; i++) {
            byteArrayOutputStream.reset();
            testObject.write(protocol);
            bh.consume(byteArrayOutputStream);
        }
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_object_list.SerThrift",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
