package com.jsoniter.benchmark.with_string_array;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

@CompiledJson
public class TestObject {

    public String[] field1;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = new String[]{
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
