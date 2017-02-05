package com.jsoniter.benchmark.with_10_string_fields;

import com.dslplatform.json.CompiledJson;
import com.jsoniter.output.JsonStream;

@CompiledJson
public class TestObject {

    public String field1;
    public String field2;
    public String field3;
    public String field4;
    public String field5;
    public String field6;
    public String field7;
    public String field8;
    public String field9;
    public String field10;

    public static TestObject createTestObject() {
        TestObject testObject = new TestObject();
        testObject.field1 = "";
        testObject.field2 = "";
        testObject.field3 = "";
        testObject.field4 = "";
        testObject.field5 = "";
        testObject.field6 = "";
        testObject.field7 = "";
        testObject.field8 = "";
        testObject.field9 = "";
        testObject.field10 = "";
        return testObject;
    }

    public static byte[] createTestJSON() {
        return JsonStream.serialize(createTestObject()).getBytes();
    }

    public static byte[] createLargeTestJSON() {
        TestObject testObject = new TestObject();
        testObject.field1 = "Javaone Keynotelkajldfjlskajdflkjslfjdslfjldjfljsdfljsdlfjsljfldjfldjals;djfasldjf;alskdjf;aslkdjf;asdjf;laskdjflsjdalfjd;alksjdfl;jsa;lfdja;slkdjf;alsjfd;lajsfl;dj";
        testObject.field2 = "video/mpg4lkajldfjlskajdflkjslfjdslfjldjfljsdfljsdlfjsljfldjfldjals;djfasldjf;alskdjf;aslkdjf;asdjf;laskdjflsjdalfjd;alksjdfl;jsa;lfdja;slkdjf;alsjfd;lajsfl;dj";
        testObject.field3 = "video/mpg4lkajldfjlskajdflkjslfjdslfjldjfljsdfljsdlfjsljfldjfldjals;djfasldjf;alskdjf;aslkdjf;asdjf;laskdjflsjdalfjd;alksjdfl;jsa;lfdja;slkdjf;alsjfd;lajsfl;dj";
        testObject.field4 = "video/mpg4lkajldfjlskajdflkjslfjdslfjldjfljsdfljsdlfjsljfldjfldjals;djfasldjf;alskdjf;aslkdjf;asdjf;laskdjflsjdalfjd;alksjdfl;jsa;lfdja;slkdjf;alsjfd;lajsfl;dj";
        testObject.field5 = "video/mpg4lkajldfjlskajdflkjslfjdslfjldjfljsdfljsdlfjsljfldjfldjals;djfasldjf;alskdjf;aslkdjf;asdjf;laskdjflsjdalfjd;alksjdfl;jsa;lfdja;slkdjf;alsjfd;lajsfl;dj";
        testObject.field6 = "video/mpg4lkajldfjlskajdflkjslfjdslfjldjfljsdfljsdlfjsljfldjfldjals;djfasldjf;alskdjf;aslkdjf;asdjf;laskdjflsjdalfjd;alksjdfl;jsa;lfdja;slkdjf;alsjfd;lajsfl;dj";
        testObject.field7 = "video/mpg4lkajldfjlskajdflkjslfjdslfjldjfljsdfljsdlfjsljfldjfldjals;djfasldjf;alskdjf;aslkdjf;asdjf;laskdjflsjdalfjd;alksjdfl;jsa;lfdja;slkdjf;alsjfd;lajsfl;dj";
        testObject.field8 = "video/mpg4lkajldfjlskajdflkjslfjdslfjldjfljsdfljsdlfjsljfldjfldjals;djfasldjf;alskdjf;aslkdjf;asdjf;laskdjflsjdalfjd;alksjdfl;jsa;lfdja;slkdjf;alsjfd;lajsfl;dj";
        testObject.field9 = "video/mpg4lkajldfjlskajdflkjslfjdslfjldjfljsdfljsdlfjsljfldjfldjals;djfasldjf;alskdjf;aslkdjf;asdjf;laskdjflsjdalfjd;alksjdfl;jsa;lfdja;slkdjf;alsjfd;lajsfl;dj";
        testObject.field10 = "video/mpg4lkajldfjlskajdflkjslfjdslfjldjfljsdfljsdlfjsljfldjfldjals;djfasldjf;alskdjf;aslkdjf;asdjf;laskdjflsjdalfjd;alksjdfl;jsa;lfdja;slkdjf;alsjfd;lajsfl;dj";
        return JsonStream.serialize(testObject).getBytes();
    }
}
