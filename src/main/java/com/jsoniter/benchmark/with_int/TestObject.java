package com.jsoniter.benchmark.with_int;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

@CompiledJson
public class TestObject {

    public int field1;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = 31415926;
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
