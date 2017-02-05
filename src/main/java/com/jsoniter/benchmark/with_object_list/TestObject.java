package com.jsoniter.benchmark.with_object_list;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

import java.util.ArrayList;
import java.util.List;

@CompiledJson
public class TestObject {

    public List<ElementObject> field1;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = new ArrayList<>();
        ElementObject elementObject = new ElementObject();
        elementObject.field1 = "1";
        testObject.field1.add(elementObject);
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
