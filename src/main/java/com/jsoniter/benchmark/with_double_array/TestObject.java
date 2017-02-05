package com.jsoniter.benchmark.with_double_array;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

@CompiledJson
public class TestObject {

    public double[] field1;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = new double[]{
                31.415926,
                61.415923,
                31.415269,
                53.141926,
                13.145926,
                43.115926,
                31.419265,
                23.141596,
                43.161592,
                0.112
        };
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
