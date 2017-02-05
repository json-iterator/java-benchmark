package com.jsoniter.benchmark.with_10_string_fields;

import com.dslplatform.json.CustomJsonReader;
import com.jsoniter.benchmark.All;
import com.jsoniter.benchmark.ExternalSerialization;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
Benchmark           Mode  Cnt       Score      Error  Units
DeserDslJson.deser  avgt    5  307569.103 ± 6459.946  ns/op
 */
@State(Scope.Thread)
public class DeserDslJson {

    private byte[] testJSON;
    private CustomJsonReader reader;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        testJSON = TestObject.createTestJSON();
        reader = new CustomJsonReader(testJSON);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            reader.reset();
            reader.read();
            reader.getNextToken();
            TestObject obj = new TestObject();
            ExternalSerialization.deserialize(obj, reader);
            bh.consume(obj);
        }
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_10_string_fields.DeserDslJson",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
