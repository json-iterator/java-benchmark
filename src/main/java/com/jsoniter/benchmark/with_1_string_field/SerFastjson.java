package com.jsoniter.benchmark.with_1_string_field;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.util.IOUtils;
import com.jsoniter.benchmark.All;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
public class SerFastjson {

    private TestObject testObject;
    private ByteArrayOutputStream byteArrayOutputStream;
    private SerializeConfig serializeConfig;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        testObject = TestObject.createTestObject();
        byteArrayOutputStream = new ByteArrayOutputStream();
        serializeConfig = SerializeConfig.getGlobalInstance();
    }


    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void ser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            byteArrayOutputStream.reset();
            SerializeWriter writer = new SerializeWriter();
            JSONSerializer serializer = new JSONSerializer(writer, serializeConfig);
            serializer.write(testObject);
            writer.writeToEx(byteArrayOutputStream, IOUtils.UTF8);
            serializer.close();
            bh.consume(byteArrayOutputStream);
        }
    }
    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_1_string_field.SerFastjson",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
