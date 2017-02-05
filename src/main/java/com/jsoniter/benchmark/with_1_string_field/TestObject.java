package com.jsoniter.benchmark.with_1_string_field;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.annotation.JsonProperty;
import com.jsoniter.output.JsonStream;

@CompiledJson
public class TestObject {

    @JsonProperty(nullable = false)
    public String field1;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = "1";
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
