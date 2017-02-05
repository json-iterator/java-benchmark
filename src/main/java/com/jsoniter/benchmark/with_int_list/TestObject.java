package com.jsoniter.benchmark.with_int_list;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

import java.util.Arrays;
import java.util.List;

@CompiledJson
public class TestObject {

    public List<Integer> field1;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = Arrays.asList(
                321, 123, 132, 312,
                321, 123, 132, 312,
                321, 123, 132, 312,
                321, 123, 132, 312);
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
