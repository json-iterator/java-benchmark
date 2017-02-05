package com.jsoniter.benchmark.with_10_string_fields;

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
Benchmark      Mode  Cnt       Score       Error  Units
SerThrift.ser  avgt    5  888230.783 ± 29232.775  ns/op
 */
@State(Scope.Thread)
public class SerThrift {

    private ByteArrayOutputStream byteArrayOutputStream;
    private TProtocol protocol;
    private ThriftTestObject testObject;

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
        byteArrayOutputStream = new ByteArrayOutputStream();
        TCompactProtocol.Factory protocolFactory = new TCompactProtocol.Factory();
        protocol = protocolFactory.getProtocol(new TIOStreamTransport(byteArrayOutputStream));
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
                "with_10_string_fields.SerThrift",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
