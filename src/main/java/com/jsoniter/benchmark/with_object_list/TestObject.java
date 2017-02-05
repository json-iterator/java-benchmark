package com.jsoniter.benchmark.with_object_list;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.annotation.JsonProperty;
import com.jsoniter.output.JsonStream;

import java.util.ArrayList;
import java.util.List;

@CompiledJson
public class TestObject {

    @JsonProperty(nullable = false, collectionValueNullable = false)
    public List<ElementObject> field1;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = new ArrayList<>();
        testObject.field1.add(createElement("1"));
        testObject.field1.add(createElement("2"));
        testObject.field1.add(createElement("3"));
        testObject.field1.add(createElement("4"));

        testObject.field1.add(createElement("1"));
        testObject.field1.add(createElement("2"));
        testObject.field1.add(createElement("3"));
        testObject.field1.add(createElement("4"));

        testObject.field1.add(createElement("1"));
        testObject.field1.add(createElement("2"));
        testObject.field1.add(createElement("3"));
        testObject.field1.add(createElement("4"));

        testObject.field1.add(createElement("1"));
        testObject.field1.add(createElement("2"));
        testObject.field1.add(createElement("3"));
        testObject.field1.add(createElement("4"));
        return testObject;
    }

    private static ElementObject createElement(String field1) {
        ElementObject elementObject = new ElementObject();
        elementObject.field1 = field1;
        return elementObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
