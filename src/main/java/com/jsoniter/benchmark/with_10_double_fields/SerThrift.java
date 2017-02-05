package com.jsoniter.benchmark.with_10_double_fields;

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

/*
Benchmark       Mode  Cnt        Score       Error  Units
SerThrift.ser  thrpt    5  2093533.015 ± 61061.517  ops/s
 */
@State(Scope.Thread)
public class SerThrift {

    private ThriftTestObject testObject;
    private ByteArrayOutputStream byteArrayOutputStream;
    private TProtocol protocol;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) throws TException {
        testObject = new ThriftTestObject();
        testObject.setField1(31.415926);
        testObject.setField2(61.415923);
        testObject.setField3(31.415269);
        testObject.setField4(53.141926);
        testObject.setField5(13.145926);
        testObject.setField6(43.115926);
        testObject.setField7(31.419265);
        testObject.setField8(23.141596);
        testObject.setField9(43.161592);
        testObject.setField10(0.112);
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
    public void ser(Blackhole bh) throws TException {
        byteArrayOutputStream.reset();
        testObject.write(protocol);
        bh.consume(byteArrayOutputStream);
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_10_double_fields.SerThrift",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
