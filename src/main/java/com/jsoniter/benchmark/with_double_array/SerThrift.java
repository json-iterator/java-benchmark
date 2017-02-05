package com.jsoniter.benchmark.with_double_array;

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
SerThrift.ser  thrpt    5  3125678.472 ± 91558.008  ops/s
 */
@State(Scope.Thread)
public class SerThrift {

    private ThriftTestObject testObject;
    private ByteArrayOutputStream byteArrayOutputStream;
    private TProtocol protocol;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) throws TException {
        testObject = new ThriftTestObject();
        testObject.addToField1(31.415926);
        testObject.addToField1(61.415923);
        testObject.addToField1(31.415269);
        testObject.addToField1(53.141926);
        testObject.addToField1(13.145926);
        testObject.addToField1(43.115926);
        testObject.addToField1(31.419265);
        testObject.addToField1(23.141596);
        testObject.addToField1(43.161592);
        testObject.addToField1(0.112);
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
                "with_double_array.SerThrift",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
