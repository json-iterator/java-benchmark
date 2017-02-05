package com.jsoniter.benchmark.skip_same_level;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

@CompiledJson
public class TestReadObject {

    public String field15;

    public static TestReadObject createTestObject() {
        TestReadObject testObject = new TestReadObject();
        testObject.field15 = "";
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
