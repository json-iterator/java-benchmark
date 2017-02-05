package com.jsoniter.benchmark.with_double;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

@CompiledJson
public class TestObject {

    public double field1;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = 24.646182098202726;
        return testObject;
    }

    public static byte[] createTestJSON() {
        return "{\"field1\":24.646182098202726}".getBytes();
    }
}
