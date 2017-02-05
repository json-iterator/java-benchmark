package com.jsoniter.benchmark.skip_multi_levels;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

@CompiledJson
public class TestReadObject {

    public String field3;

    public static TestReadObject createTestObject() {
        TestReadObject testObject = new TestReadObject();
        testObject.field3 = "";
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
