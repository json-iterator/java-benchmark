package com.jsoniter.benchmark.with_5_string_fields;

import com.jsoniter.benchmark.All;
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
public class SerThrift {

    private TSerializer serializer;
    private ThriftTestObject testObject;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) throws TException {
        testObject = new ThriftTestObject();
        testObject.setField1("1");
        testObject.setField2("2");
        testObject.setField3("3");
        testObject.setField4("4");
        testObject.setField5("5");
        serializer = new TSerializer(new TCompactProtocol.Factory());
    }

    @Test
    public void test() throws TException {
        byte[] output = new TSerializer(new TCompactProtocol.Factory()).serialize(testObject);
        System.out.println(output.length);
    }

    @Benchmark
    public void ser(Blackhole bh) throws TException {
        bh.consume(serializer.serialize(testObject));
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_5_string_fields.SerThrift",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
