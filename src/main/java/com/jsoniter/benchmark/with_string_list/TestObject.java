package com.jsoniter.benchmark.with_string_list;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

import java.util.Arrays;
import java.util.List;

@CompiledJson
public class TestObject {

    public List<String> field1;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = Arrays.asList(
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "");
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
