package com.jsoniter.benchmark.with_double_array;

import com.jsoniter.DecodingMode;
import com.jsoniter.JsonIterator;
import com.jsoniter.benchmark.All;
import com.jsoniter.output.EncodingMode;
import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.TypeLiteral;
import org.junit.Test;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/*
Benchmark            Mode  Cnt       Score      Error  Units
DeserJsoniter.deser  avgt    5  305553.080 ± 4411.824  ns/op
 */
@State(Scope.Thread)
public class DeserJsoniter {

    private byte[] testJSON;
    private JsonIterator iter;
    private TypeLiteral<TestObject> typeLiteral;

    @Setup(Level.Trial)
    public void benchSetup(BenchmarkParams params) {
        JsonStream.setMode(EncodingMode.DYNAMIC_MODE);
        JsonIterator.setMode(DecodingMode.DYNAMIC_MODE_AND_MATCH_FIELD_WITH_HASH);
        testJSON = TestObject.createTestJSON();
        iter = new JsonIterator();
        typeLiteral = TypeLiteral.create(TestObject.class);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void deser(Blackhole bh) throws IOException {
        for (int i = 0; i < 1000; i++) {
            iter.reset(testJSON);
            bh.consume(iter.read(typeLiteral));
        }
    }

    @Test
    public void test() throws IOException {
        benchSetup(null);
        iter.reset(testJSON);
        assertEquals(31415926, iter.read(typeLiteral).field1);
    }

    public static java.lang.Object decode_(com.jsoniter.JsonIterator iter) throws java.io.IOException { com.jsoniter.CodegenAccess.resetExistingObject(iter);
        byte nextToken = com.jsoniter.CodegenAccess.readByte(iter);
        if (nextToken != '[') {
            if (nextToken == 'n') {
                com.jsoniter.CodegenAccess.skipFixedBytes(iter, 3);
                com.jsoniter.CodegenAccess.resetExistingObject(iter); return null;
            } else {
                nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
                if (nextToken == 'n') {
                    com.jsoniter.CodegenAccess.skipFixedBytes(iter, 3);
                    com.jsoniter.CodegenAccess.resetExistingObject(iter); return null;
                }
            }
        }
        nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
        if (nextToken == ']') {
            return new double[0];
        }
        com.jsoniter.CodegenAccess.unreadByte(iter);
        double a1 = iter.readDouble();
        if (!com.jsoniter.CodegenAccess.nextTokenIsComma(iter)) {
            return new double[]{ a1 };
        }
        double a2 = iter.readDouble();
        if (!com.jsoniter.CodegenAccess.nextTokenIsComma(iter)) {
            return new double[]{ a1, a2 };
        }
        double a3 = iter.readDouble();
        if (!com.jsoniter.CodegenAccess.nextTokenIsComma(iter)) {
            return new double[]{ a1, a2, a3 };
        }
        double a4 = (double) iter.readDouble();
        if (!com.jsoniter.CodegenAccess.nextTokenIsComma(iter)) {
            return new double[]{ a1, a2, a3, a4 };
        }
        double a5 = (double) iter.readDouble();
        double[] arr = new double[10];
        arr[0] = a1;
        arr[1] = a2;
        arr[2] = a3;
        arr[3] = a4;
        arr[4] = a5;
        int i = 5;
        while (com.jsoniter.CodegenAccess.nextTokenIsComma(iter)) {
            if (i == arr.length) {
                double[] newArr = new double[arr.length * 2];
                System.arraycopy(arr, 0, newArr, 0, arr.length);
                arr = newArr;
            }
            arr[i++] = iter.readDouble();
        }
        double[] result = new double[i];
        System.arraycopy(arr, 0, result, 0, i);
        return result;
    }

    public static void main(String[] args) throws IOException, RunnerException {
        All.loadJMH();
        Main.main(new String[]{
                "with_double_array.DeserJsoniter",
                "-i", "5",
                "-wi", "5",
                "-f", "1",
        });
    }
}
