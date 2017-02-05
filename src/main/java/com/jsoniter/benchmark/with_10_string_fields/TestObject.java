package com.jsoniter.benchmark.with_10_string_fields;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.annotation.JsonProperty;
import com.jsoniter.output.JsonStream;

@CompiledJson
public class TestObject {

    @JsonProperty(nullable = false)
    public String field1;
    @JsonProperty(nullable = false)
    public String field2;
    @JsonProperty(nullable = false)
    public String field3;
    @JsonProperty(nullable = false)
    public String field4;
    @JsonProperty(nullable = false)
    public String field5;
    @JsonProperty(nullable = false)
    public String field6;
    @JsonProperty(nullable = false)
    public String field7;
    @JsonProperty(nullable = false)
    public String field8;
    @JsonProperty(nullable = false)
    public String field9;
    @JsonProperty(nullable = false)
    public String field10;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = "1";
        testObject.field2 = "2";
        testObject.field3 = "3";
        testObject.field4 = "4";
        testObject.field5 = "5";
        testObject.field6 = "6";
        testObject.field7 = "7";
        testObject.field8 = "8";
        testObject.field9 = "9";
        testObject.field10 = "10";
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
