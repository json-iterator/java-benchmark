package com.jsoniter.benchmark.with_int;

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
Tuple
Benchmark           Mode  Cnt        Score        Error  Units
DeserThrift.deser  thrpt    5  4894731.174 ± 190486.954  ops/s (1.38x)
DeserThrift.ser    thrpt    5  2537935.619 ± 132875.762  ops/s (0.47x)

Compact
Benchmark           Mode  Cnt        Score        Error  Units
DeserThrift.deser  thrpt    5  4490620.091 ± 118728.895  ops/s
DeserThrift.ser    thrpt    5  2114218.709 ±  66750.207  ops/s

Binary
Benchmark           Mode  Cnt        Score       Error  Units
DeserThrift.deser  thrpt    5  4463916.092 ± 74085.264  ops/s
DeserThrift.ser    thrpt    5  1780672.495 ± 21550.292  ops/s
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
        testObject.setField1(31415926);
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
                "with_int.DeserThrift",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
