package com.jsoniter.benchmark.with_string_map_string;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

import java.util.HashMap;
import java.util.Map;

@CompiledJson
public class TestObject {

    public Map<String, String> field1;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = new HashMap<>();
        testObject.field1.put("1", "");
        testObject.field1.put("2", "");
        testObject.field1.put("3", "");
        testObject.field1.put("4", "");
        testObject.field1.put("5", "");
        testObject.field1.put("6", "");
        testObject.field1.put("7", "");
        testObject.field1.put("8", "");
        testObject.field1.put("9", "");
        testObject.field1.put("10", "");
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
