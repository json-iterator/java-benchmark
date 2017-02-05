package com.jsoniter.benchmark.with_5_string_fields;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

@CompiledJson
public class TestObject {

    public String field1;
    public String field2;
    public String field3;
    public String field4;
    public String field5;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = "1";
        testObject.field2 = "2";
        testObject.field3 = "3";
        testObject.field4 = "4";
        testObject.field5 = "5";
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
