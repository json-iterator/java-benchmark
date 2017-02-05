package com.jsoniter.benchmark.with_10_double_fields;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

@CompiledJson
public class TestObject {

    public double field1;
    public double field2;
    public double field3;
    public double field4;
    public double field5;
    public double field6;
    public double field7;
    public double field8;
    public double field9;
    public double field10;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = 31.415926;
        testObject.field2 = 61.415923;
        testObject.field3 = 31.415269;
        testObject.field4 = 53.141926;
        testObject.field5 = 13.145926;
        testObject.field6 = 43.115926;
        testObject.field7 = 31.419265;
        testObject.field8 = 23.141596;
        testObject.field9 = 43.161592;
        testObject.field10 = 0.112;
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }
}
