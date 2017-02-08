/*
* Created by DSL Platform
* v1.7.6218.18384 
*/

package com.jsoniter.benchmark;



public class ExternalSerialization implements com.dslplatform.json.Configuration {
	
	
	@SuppressWarnings("unchecked")
	public void configure(final com.dslplatform.json.DslJson json) {
		setup(json);
	}

	@SuppressWarnings("unchecked")
	public static void setup(final com.dslplatform.json.DslJson json) {
		
		
		json.registerReader(com.jsoniter.benchmark.skip_same_level.TestReadObject.class, JSON_READER_struct18);
		json.registerWriter(com.jsoniter.benchmark.skip_same_level.TestReadObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.skip_same_level.TestReadObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.skip_same_level.TestReadObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_10_int_fields.TestObject.class, JSON_READER_struct5);
		json.registerWriter(com.jsoniter.benchmark.with_10_int_fields.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_10_int_fields.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_10_int_fields.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_5_string_fields.TestObject.class, JSON_READER_struct1);
		json.registerWriter(com.jsoniter.benchmark.with_5_string_fields.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_5_string_fields.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_5_string_fields.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject.class, JSON_READER_struct10);
		json.registerWriter(com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_15_string_fields.TestObject.class, JSON_READER_struct2);
		json.registerWriter(com.jsoniter.benchmark.with_15_string_fields.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_15_string_fields.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_15_string_fields.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_int.TestObject.class, JSON_READER_struct12);
		json.registerWriter(com.jsoniter.benchmark.with_int.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_int.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_int.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_long_string.TestObject.class, JSON_READER_struct3);
		json.registerWriter(com.jsoniter.benchmark.with_long_string.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_long_string.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_long_string.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_int_list.TestObject.class, JSON_READER_struct15);
		json.registerWriter(com.jsoniter.benchmark.with_int_list.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_int_list.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_int_list.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_string_list.TestObject.class, JSON_READER_struct11);
		json.registerWriter(com.jsoniter.benchmark.with_string_list.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_string_list.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_string_list.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_object_list.ElementObject.class, JSON_READER_struct8);
		json.registerWriter(com.jsoniter.benchmark.with_object_list.ElementObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_object_list.ElementObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_object_list.ElementObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_10_double_fields.TestObject.class, JSON_READER_struct13);
		json.registerWriter(com.jsoniter.benchmark.with_10_double_fields.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_10_double_fields.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_10_double_fields.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_string_map_string.TestObject.class, JSON_READER_struct14);
		json.registerWriter(com.jsoniter.benchmark.with_string_map_string.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_string_map_string.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_string_map_string.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_double.TestObject.class, JSON_READER_struct17);
		json.registerWriter(com.jsoniter.benchmark.with_double.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_double.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_double.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_1_string_field.TestObject.class, JSON_READER_struct9);
		json.registerWriter(com.jsoniter.benchmark.with_1_string_field.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_1_string_field.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_1_string_field.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_10_string_fields.TestObject.class, JSON_READER_struct16);
		json.registerWriter(com.jsoniter.benchmark.with_10_string_fields.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_10_string_fields.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_10_string_fields.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_object_list.TestObject.class, JSON_READER_struct4);
		json.registerWriter(com.jsoniter.benchmark.with_object_list.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_object_list.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_object_list.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_double_array.TestObject.class, JSON_READER_struct6);
		json.registerWriter(com.jsoniter.benchmark.with_double_array.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_double_array.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_double_array.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.skip_multi_levels.TestReadObject.class, JSON_READER_struct7);
		json.registerWriter(com.jsoniter.benchmark.skip_multi_levels.TestReadObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.skip_multi_levels.TestReadObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.skip_multi_levels.TestReadObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
		
		json.registerReader(com.jsoniter.benchmark.with_string_array.TestObject.class, JSON_READER_struct0);
		json.registerWriter(com.jsoniter.benchmark.with_string_array.TestObject.class, new com.dslplatform.json.JsonWriter.WriteObject<com.jsoniter.benchmark.with_string_array.TestObject>() {
			@Override
			public void write(com.dslplatform.json.JsonWriter writer, com.jsoniter.benchmark.with_string_array.TestObject value) {
				serialize(value, writer, json.omitDefaults);
			}
		});
	}
	
	public static void serialize(final com.jsoniter.benchmark.skip_same_level.TestReadObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.skip_same_level.TestReadObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field15 != null) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field15\":", 10);
				sw.writeString(self.field15);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.skip_same_level.TestReadObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			if (self.field15 != null) {
				sw.writeAscii("\"field15\":", 10);
				sw.writeString(self.field15);
			} else {
				sw.writeAscii("\"field15\":null", 14);
			}
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.skip_same_level.TestReadObject> JSON_READER_struct18 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.skip_same_level.TestReadObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.skip_same_level.TestReadObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.skip_same_level.TestReadObject instance = new com.jsoniter.benchmark.skip_same_level.TestReadObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.skip_same_level.TestReadObject deserializestruct18(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.skip_same_level.TestReadObject instance = new com.jsoniter.benchmark.skip_same_level.TestReadObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.skip_same_level.TestReadObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		String _field15_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 352534517:
						_field15_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 352534517:
						_field15_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field15 = _field15_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_10_int_fields.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_10_int_fields.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field1 != 0) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field1\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field1, sw);
			}
		
			if (self.field10 != 0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field10\":", 10);
				com.dslplatform.json.NumberConverter.serialize(self.field10, sw);
			}
		
			if (self.field7 != 0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field7\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field7, sw);
			}
		
			if (self.field6 != 0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field6\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field6, sw);
			}
		
			if (self.field9 != 0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field9\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field9, sw);
			}
		
			if (self.field8 != 0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field8\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field8, sw);
			}
		
			if (self.field3 != 0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field3\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field3, sw);
			}
		
			if (self.field2 != 0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field2\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field2, sw);
			}
		
			if (self.field5 != 0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field5\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field5, sw);
			}
		
			if (self.field4 != 0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field4\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field4, sw);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_10_int_fields.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			sw.writeAscii("\"field1\":", 9);
			com.dslplatform.json.NumberConverter.serialize(self.field1, sw);
		
			
			sw.writeAscii(",\"field10\":", 11);
			com.dslplatform.json.NumberConverter.serialize(self.field10, sw);
		
			
			sw.writeAscii(",\"field7\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field7, sw);
		
			
			sw.writeAscii(",\"field6\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field6, sw);
		
			
			sw.writeAscii(",\"field9\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field9, sw);
		
			
			sw.writeAscii(",\"field8\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field8, sw);
		
			
			sw.writeAscii(",\"field3\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field3, sw);
		
			
			sw.writeAscii(",\"field2\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field2, sw);
		
			
			sw.writeAscii(",\"field5\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field5, sw);
		
			
			sw.writeAscii(",\"field4\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field4, sw);
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_10_int_fields.TestObject> JSON_READER_struct5 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_10_int_fields.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_10_int_fields.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_10_int_fields.TestObject instance = new com.jsoniter.benchmark.with_10_int_fields.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_10_int_fields.TestObject deserializestruct5(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_10_int_fields.TestObject instance = new com.jsoniter.benchmark.with_10_int_fields.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_10_int_fields.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		int _field1_ = 0;
		int _field10_ = 0;
		int _field7_ = 0;
		int _field6_ = 0;
		int _field9_ = 0;
		int _field8_ = 0;
		int _field3_ = 0;
		int _field2_ = 0;
		int _field5_ = 0;
		int _field4_ = 0;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 268646422:
						_field10_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1111540720:
						_field7_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1128318339:
						_field6_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1346427386:
						_field9_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1363205005:
						_field8_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1178651196:
						_field3_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1195428815:
						_field2_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1145095958:
						_field5_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1161873577:
						_field4_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 268646422:
						_field10_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1111540720:
						_field7_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1128318339:
						_field6_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1346427386:
						_field9_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1363205005:
						_field8_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1178651196:
						_field3_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1195428815:
						_field2_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1145095958:
						_field5_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					case 1161873577:
						_field4_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
		instance.field10 = _field10_;
		instance.field7 = _field7_;
		instance.field6 = _field6_;
		instance.field9 = _field9_;
		instance.field8 = _field8_;
		instance.field3 = _field3_;
		instance.field2 = _field2_;
		instance.field5 = _field5_;
		instance.field4 = _field4_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_5_string_fields.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_5_string_fields.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field1 != null) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			}
		
			if (self.field3 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field3\":", 9);
				sw.writeString(self.field3);
			}
		
			if (self.field2 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field2\":", 9);
				sw.writeString(self.field2);
			}
		
			if (self.field5 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field5\":", 9);
				sw.writeString(self.field5);
			}
		
			if (self.field4 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field4\":", 9);
				sw.writeString(self.field4);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_5_string_fields.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			if (self.field1 != null) {
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			} else {
				sw.writeAscii("\"field1\":null", 13);
			}
		
			
			if (self.field3 != null) {
				sw.writeAscii(",\"field3\":", 10);
				sw.writeString(self.field3);
			} else {
				sw.writeAscii(",\"field3\":null", 14);
			}
		
			
			if (self.field2 != null) {
				sw.writeAscii(",\"field2\":", 10);
				sw.writeString(self.field2);
			} else {
				sw.writeAscii(",\"field2\":null", 14);
			}
		
			
			if (self.field5 != null) {
				sw.writeAscii(",\"field5\":", 10);
				sw.writeString(self.field5);
			} else {
				sw.writeAscii(",\"field5\":null", 14);
			}
		
			
			if (self.field4 != null) {
				sw.writeAscii(",\"field4\":", 10);
				sw.writeString(self.field4);
			} else {
				sw.writeAscii(",\"field4\":null", 14);
			}
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_5_string_fields.TestObject> JSON_READER_struct1 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_5_string_fields.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_5_string_fields.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_5_string_fields.TestObject instance = new com.jsoniter.benchmark.with_5_string_fields.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_5_string_fields.TestObject deserializestruct1(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_5_string_fields.TestObject instance = new com.jsoniter.benchmark.with_5_string_fields.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_5_string_fields.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		String _field1_ = null;
		String _field3_ = null;
		String _field2_ = null;
		String _field5_ = null;
		String _field4_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1178651196:
						_field3_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1195428815:
						_field2_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1145095958:
						_field5_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1161873577:
						_field4_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1178651196:
						_field3_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1195428815:
						_field2_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1145095958:
						_field5_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1161873577:
						_field4_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
		instance.field3 = _field3_;
		instance.field2 = _field2_;
		instance.field5 = _field5_;
		instance.field4 = _field4_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field1 != null) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			}
		
			if (self.field10 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field10\":", 10);
				sw.writeString(self.field10);
			}
		
			if (self.field7 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field7\":", 9);
				sw.writeString(self.field7);
			}
		
			if (self.field6 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field6\":", 9);
				sw.writeString(self.field6);
			}
		
			if (self.field9 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field9\":", 9);
				sw.writeString(self.field9);
			}
		
			if (self.field8 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field8\":", 9);
				sw.writeString(self.field8);
			}
		
			if (self.field3 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field3\":", 9);
				sw.writeString(self.field3);
			}
		
			if (self.field2 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field2\":", 9);
				sw.writeString(self.field2);
			}
		
			if (self.field5 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field5\":", 9);
				sw.writeString(self.field5);
			}
		
			if (self.field4 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field4\":", 9);
				sw.writeString(self.field4);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			if (self.field1 != null) {
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			} else {
				sw.writeAscii("\"field1\":null", 13);
			}
		
			
			if (self.field10 != null) {
				sw.writeAscii(",\"field10\":", 11);
				sw.writeString(self.field10);
			} else {
				sw.writeAscii(",\"field10\":null", 15);
			}
		
			
			if (self.field7 != null) {
				sw.writeAscii(",\"field7\":", 10);
				sw.writeString(self.field7);
			} else {
				sw.writeAscii(",\"field7\":null", 14);
			}
		
			
			if (self.field6 != null) {
				sw.writeAscii(",\"field6\":", 10);
				sw.writeString(self.field6);
			} else {
				sw.writeAscii(",\"field6\":null", 14);
			}
		
			
			if (self.field9 != null) {
				sw.writeAscii(",\"field9\":", 10);
				sw.writeString(self.field9);
			} else {
				sw.writeAscii(",\"field9\":null", 14);
			}
		
			
			if (self.field8 != null) {
				sw.writeAscii(",\"field8\":", 10);
				sw.writeString(self.field8);
			} else {
				sw.writeAscii(",\"field8\":null", 14);
			}
		
			
			if (self.field3 != null) {
				sw.writeAscii(",\"field3\":", 10);
				sw.writeString(self.field3);
			} else {
				sw.writeAscii(",\"field3\":null", 14);
			}
		
			
			if (self.field2 != null) {
				sw.writeAscii(",\"field2\":", 10);
				sw.writeString(self.field2);
			} else {
				sw.writeAscii(",\"field2\":null", 14);
			}
		
			
			if (self.field5 != null) {
				sw.writeAscii(",\"field5\":", 10);
				sw.writeString(self.field5);
			} else {
				sw.writeAscii(",\"field5\":null", 14);
			}
		
			
			if (self.field4 != null) {
				sw.writeAscii(",\"field4\":", 10);
				sw.writeString(self.field4);
			} else {
				sw.writeAscii(",\"field4\":null", 14);
			}
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject> JSON_READER_struct10 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject instance = new com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject deserializestruct10(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject instance = new com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_10_string_fields_exact_match.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		String _field1_ = null;
		String _field10_ = null;
		String _field7_ = null;
		String _field6_ = null;
		String _field9_ = null;
		String _field8_ = null;
		String _field3_ = null;
		String _field2_ = null;
		String _field5_ = null;
		String _field4_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
					if (reader.wasLastName("field1")) {
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 268646422:
					if (reader.wasLastName("field10")) {
						_field10_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1111540720:
					if (reader.wasLastName("field7")) {
						_field7_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1128318339:
					if (reader.wasLastName("field6")) {
						_field6_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1346427386:
					if (reader.wasLastName("field9")) {
						_field9_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1363205005:
					if (reader.wasLastName("field8")) {
						_field8_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1178651196:
					if (reader.wasLastName("field3")) {
						_field3_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1195428815:
					if (reader.wasLastName("field2")) {
						_field2_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1145095958:
					if (reader.wasLastName("field5")) {
						_field5_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1161873577:
					if (reader.wasLastName("field4")) {
						_field4_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
					if (reader.wasLastName("field1")) {
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 268646422:
					if (reader.wasLastName("field10")) {
						_field10_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1111540720:
					if (reader.wasLastName("field7")) {
						_field7_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1128318339:
					if (reader.wasLastName("field6")) {
						_field6_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1346427386:
					if (reader.wasLastName("field9")) {
						_field9_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1363205005:
					if (reader.wasLastName("field8")) {
						_field8_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1178651196:
					if (reader.wasLastName("field3")) {
						_field3_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1195428815:
					if (reader.wasLastName("field2")) {
						_field2_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1145095958:
					if (reader.wasLastName("field5")) {
						_field5_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					case 1161873577:
					if (reader.wasLastName("field4")) {
						_field4_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
					}
						else { nextToken = reader.skip(); }
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
		instance.field10 = _field10_;
		instance.field7 = _field7_;
		instance.field6 = _field6_;
		instance.field9 = _field9_;
		instance.field8 = _field8_;
		instance.field3 = _field3_;
		instance.field2 = _field2_;
		instance.field5 = _field5_;
		instance.field4 = _field4_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_15_string_fields.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_15_string_fields.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field11 != null) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field11\":", 10);
				sw.writeString(self.field11);
			}
		
			if (self.field12 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field12\":", 10);
				sw.writeString(self.field12);
			}
		
			if (self.field1 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			}
		
			if (self.field10 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field10\":", 10);
				sw.writeString(self.field10);
			}
		
			if (self.field15 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field15\":", 10);
				sw.writeString(self.field15);
			}
		
			if (self.field13 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field13\":", 10);
				sw.writeString(self.field13);
			}
		
			if (self.field14 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field14\":", 10);
				sw.writeString(self.field14);
			}
		
			if (self.field7 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field7\":", 9);
				sw.writeString(self.field7);
			}
		
			if (self.field6 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field6\":", 9);
				sw.writeString(self.field6);
			}
		
			if (self.field9 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field9\":", 9);
				sw.writeString(self.field9);
			}
		
			if (self.field8 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field8\":", 9);
				sw.writeString(self.field8);
			}
		
			if (self.field3 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field3\":", 9);
				sw.writeString(self.field3);
			}
		
			if (self.field2 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field2\":", 9);
				sw.writeString(self.field2);
			}
		
			if (self.field5 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field5\":", 9);
				sw.writeString(self.field5);
			}
		
			if (self.field4 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field4\":", 9);
				sw.writeString(self.field4);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_15_string_fields.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			if (self.field11 != null) {
				sw.writeAscii("\"field11\":", 10);
				sw.writeString(self.field11);
			} else {
				sw.writeAscii("\"field11\":null", 14);
			}
		
			
			if (self.field12 != null) {
				sw.writeAscii(",\"field12\":", 11);
				sw.writeString(self.field12);
			} else {
				sw.writeAscii(",\"field12\":null", 15);
			}
		
			
			if (self.field1 != null) {
				sw.writeAscii(",\"field1\":", 10);
				sw.writeString(self.field1);
			} else {
				sw.writeAscii(",\"field1\":null", 14);
			}
		
			
			if (self.field10 != null) {
				sw.writeAscii(",\"field10\":", 11);
				sw.writeString(self.field10);
			} else {
				sw.writeAscii(",\"field10\":null", 15);
			}
		
			
			if (self.field15 != null) {
				sw.writeAscii(",\"field15\":", 11);
				sw.writeString(self.field15);
			} else {
				sw.writeAscii(",\"field15\":null", 15);
			}
		
			
			if (self.field13 != null) {
				sw.writeAscii(",\"field13\":", 11);
				sw.writeString(self.field13);
			} else {
				sw.writeAscii(",\"field13\":null", 15);
			}
		
			
			if (self.field14 != null) {
				sw.writeAscii(",\"field14\":", 11);
				sw.writeString(self.field14);
			} else {
				sw.writeAscii(",\"field14\":null", 15);
			}
		
			
			if (self.field7 != null) {
				sw.writeAscii(",\"field7\":", 10);
				sw.writeString(self.field7);
			} else {
				sw.writeAscii(",\"field7\":null", 14);
			}
		
			
			if (self.field6 != null) {
				sw.writeAscii(",\"field6\":", 10);
				sw.writeString(self.field6);
			} else {
				sw.writeAscii(",\"field6\":null", 14);
			}
		
			
			if (self.field9 != null) {
				sw.writeAscii(",\"field9\":", 10);
				sw.writeString(self.field9);
			} else {
				sw.writeAscii(",\"field9\":null", 14);
			}
		
			
			if (self.field8 != null) {
				sw.writeAscii(",\"field8\":", 10);
				sw.writeString(self.field8);
			} else {
				sw.writeAscii(",\"field8\":null", 14);
			}
		
			
			if (self.field3 != null) {
				sw.writeAscii(",\"field3\":", 10);
				sw.writeString(self.field3);
			} else {
				sw.writeAscii(",\"field3\":null", 14);
			}
		
			
			if (self.field2 != null) {
				sw.writeAscii(",\"field2\":", 10);
				sw.writeString(self.field2);
			} else {
				sw.writeAscii(",\"field2\":null", 14);
			}
		
			
			if (self.field5 != null) {
				sw.writeAscii(",\"field5\":", 10);
				sw.writeString(self.field5);
			} else {
				sw.writeAscii(",\"field5\":null", 14);
			}
		
			
			if (self.field4 != null) {
				sw.writeAscii(",\"field4\":", 10);
				sw.writeString(self.field4);
			} else {
				sw.writeAscii(",\"field4\":null", 14);
			}
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_15_string_fields.TestObject> JSON_READER_struct2 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_15_string_fields.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_15_string_fields.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_15_string_fields.TestObject instance = new com.jsoniter.benchmark.with_15_string_fields.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_15_string_fields.TestObject deserializestruct2(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_15_string_fields.TestObject instance = new com.jsoniter.benchmark.with_15_string_fields.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_15_string_fields.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		String _field11_ = null;
		String _field12_ = null;
		String _field1_ = null;
		String _field10_ = null;
		String _field15_ = null;
		String _field13_ = null;
		String _field14_ = null;
		String _field7_ = null;
		String _field6_ = null;
		String _field9_ = null;
		String _field8_ = null;
		String _field3_ = null;
		String _field2_ = null;
		String _field5_ = null;
		String _field4_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 285424041:
						_field11_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 235091184:
						_field12_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1212206434:
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 268646422:
						_field10_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 352534517:
						_field15_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 251868803:
						_field13_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 335756898:
						_field14_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1111540720:
						_field7_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1128318339:
						_field6_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1346427386:
						_field9_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1363205005:
						_field8_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1178651196:
						_field3_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1195428815:
						_field2_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1145095958:
						_field5_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1161873577:
						_field4_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 285424041:
						_field11_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 235091184:
						_field12_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1212206434:
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 268646422:
						_field10_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 352534517:
						_field15_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 251868803:
						_field13_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 335756898:
						_field14_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1111540720:
						_field7_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1128318339:
						_field6_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1346427386:
						_field9_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1363205005:
						_field8_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1178651196:
						_field3_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1195428815:
						_field2_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1145095958:
						_field5_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1161873577:
						_field4_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field11 = _field11_;
		instance.field12 = _field12_;
		instance.field1 = _field1_;
		instance.field10 = _field10_;
		instance.field15 = _field15_;
		instance.field13 = _field13_;
		instance.field14 = _field14_;
		instance.field7 = _field7_;
		instance.field6 = _field6_;
		instance.field9 = _field9_;
		instance.field8 = _field8_;
		instance.field3 = _field3_;
		instance.field2 = _field2_;
		instance.field5 = _field5_;
		instance.field4 = _field4_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_int.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_int.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field1 != 0) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field1\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field1, sw);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_int.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			sw.writeAscii("\"field1\":", 9);
			com.dslplatform.json.NumberConverter.serialize(self.field1, sw);
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_int.TestObject> JSON_READER_struct12 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_int.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_int.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_int.TestObject instance = new com.jsoniter.benchmark.with_int.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_int.TestObject deserializestruct12(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_int.TestObject instance = new com.jsoniter.benchmark.with_int.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_int.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		int _field1_ = 0;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.NumberConverter.deserializeInt(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_long_string.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_long_string.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field1 != null) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_long_string.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			if (self.field1 != null) {
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			} else {
				sw.writeAscii("\"field1\":null", 13);
			}
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_long_string.TestObject> JSON_READER_struct3 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_long_string.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_long_string.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_long_string.TestObject instance = new com.jsoniter.benchmark.with_long_string.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_long_string.TestObject deserializestruct3(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_long_string.TestObject instance = new com.jsoniter.benchmark.with_long_string.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_long_string.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		String _field1_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_int_list.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_int_list.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
		final java.util.List<Integer> _tmp_field1_ = self.field1;
		if(_tmp_field1_ != null && _tmp_field1_.size() != 0) {
			hasWrittenProperty = true;
			sw.writeAscii("\"field1\":[", 10);
			com.dslplatform.json.NumberConverter.serializeNullable(_tmp_field1_.get(0), sw);
			for(int i = 1; i < _tmp_field1_.size(); i++) {
				sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
				com.dslplatform.json.NumberConverter.serializeNullable(_tmp_field1_.get(i), sw);
			}
			sw.writeByte(com.dslplatform.json.JsonWriter.ARRAY_END);
		}
		else if(self.field1 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
			sw.writeAscii("\"field1\":[]", 11);
		}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_int_list.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
		final java.util.List<Integer> _tmp_field1_ = self.field1;
		if(_tmp_field1_ != null && _tmp_field1_.size() != 0) {
			sw.writeAscii("\"field1\":[", 10);
			com.dslplatform.json.NumberConverter.serializeNullable(_tmp_field1_.get(0), sw);
			for(int i = 1; i < _tmp_field1_.size(); i++) {
				sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
				com.dslplatform.json.NumberConverter.serializeNullable(_tmp_field1_.get(i), sw);
			}
			sw.writeByte(com.dslplatform.json.JsonWriter.ARRAY_END);
		}
		else if(self.field1 != null) sw.writeAscii("\"field1\":[]", 11);
		else sw.writeAscii("\"field1\":null", 13);
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_int_list.TestObject> JSON_READER_struct15 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_int_list.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_int_list.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_int_list.TestObject instance = new com.jsoniter.benchmark.with_int_list.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_int_list.TestObject deserializestruct15(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_int_list.TestObject instance = new com.jsoniter.benchmark.with_int_list.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_int_list.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		java.util.List<Integer> _field1_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						
					if (nextToken == '[') {
						nextToken = reader.getNextToken();
						if (nextToken != ']') {
							java.util.List<Integer> __res = com.dslplatform.json.NumberConverter.deserializeIntNullableCollection(reader);
							_field1_ = __res;
						}
						nextToken = reader.getNextToken();
					}
					else throw new java.io.IOException("Expecting '[' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						
					if (nextToken == '[') {
						nextToken = reader.getNextToken();
						if (nextToken != ']') {
							java.util.List<Integer> __res = com.dslplatform.json.NumberConverter.deserializeIntNullableCollection(reader);
							_field1_ = __res;
						}
						nextToken = reader.getNextToken();
					}
					else throw new java.io.IOException("Expecting '[' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_string_list.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_string_list.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
		final java.util.List<String> _tmp_field1_ = self.field1;
		if(_tmp_field1_ != null && _tmp_field1_.size() != 0) {
			hasWrittenProperty = true;
			sw.writeAscii("\"field1\":[", 10);
			com.dslplatform.json.StringConverter.serializeNullable(_tmp_field1_.get(0), sw);
			for(int i = 1; i < _tmp_field1_.size(); i++) {
				sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
				com.dslplatform.json.StringConverter.serializeNullable(_tmp_field1_.get(i), sw);
			}
			sw.writeByte(com.dslplatform.json.JsonWriter.ARRAY_END);
		}
		else if(self.field1 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
			sw.writeAscii("\"field1\":[]", 11);
		}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_string_list.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
		final java.util.List<String> _tmp_field1_ = self.field1;
		if(_tmp_field1_ != null && _tmp_field1_.size() != 0) {
			sw.writeAscii("\"field1\":[", 10);
			com.dslplatform.json.StringConverter.serializeNullable(_tmp_field1_.get(0), sw);
			for(int i = 1; i < _tmp_field1_.size(); i++) {
				sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
				com.dslplatform.json.StringConverter.serializeNullable(_tmp_field1_.get(i), sw);
			}
			sw.writeByte(com.dslplatform.json.JsonWriter.ARRAY_END);
		}
		else if(self.field1 != null) sw.writeAscii("\"field1\":[]", 11);
		else sw.writeAscii("\"field1\":null", 13);
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_string_list.TestObject> JSON_READER_struct11 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_string_list.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_string_list.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_string_list.TestObject instance = new com.jsoniter.benchmark.with_string_list.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_string_list.TestObject deserializestruct11(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_string_list.TestObject instance = new com.jsoniter.benchmark.with_string_list.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_string_list.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		java.util.List<String> _field1_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						
					if (nextToken == '[') {
						nextToken = reader.getNextToken();
						if (nextToken != ']') {
							java.util.List<String> __res = com.dslplatform.json.StringConverter.deserializeNullableCollection(reader);
							_field1_ = __res;
						}
						nextToken = reader.getNextToken();
					}
					else throw new java.io.IOException("Expecting '[' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						
					if (nextToken == '[') {
						nextToken = reader.getNextToken();
						if (nextToken != ']') {
							java.util.List<String> __res = com.dslplatform.json.StringConverter.deserializeNullableCollection(reader);
							_field1_ = __res;
						}
						nextToken = reader.getNextToken();
					}
					else throw new java.io.IOException("Expecting '[' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_object_list.ElementObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_object_list.ElementObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field1 != null) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_object_list.ElementObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			if (self.field1 != null) {
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			} else {
				sw.writeAscii("\"field1\":null", 13);
			}
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_object_list.ElementObject> JSON_READER_struct8 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_object_list.ElementObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_object_list.ElementObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_object_list.ElementObject instance = new com.jsoniter.benchmark.with_object_list.ElementObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_object_list.ElementObject deserializestruct8(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_object_list.ElementObject instance = new com.jsoniter.benchmark.with_object_list.ElementObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_object_list.ElementObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		String _field1_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_10_double_fields.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_10_double_fields.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field1 != 0.0) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field1\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field1, sw);
			}
		
			if (self.field10 != 0.0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field10\":", 10);
				com.dslplatform.json.NumberConverter.serialize(self.field10, sw);
			}
		
			if (self.field7 != 0.0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field7\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field7, sw);
			}
		
			if (self.field6 != 0.0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field6\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field6, sw);
			}
		
			if (self.field9 != 0.0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field9\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field9, sw);
			}
		
			if (self.field8 != 0.0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field8\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field8, sw);
			}
		
			if (self.field3 != 0.0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field3\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field3, sw);
			}
		
			if (self.field2 != 0.0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field2\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field2, sw);
			}
		
			if (self.field5 != 0.0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field5\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field5, sw);
			}
		
			if (self.field4 != 0.0) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field4\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field4, sw);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_10_double_fields.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			sw.writeAscii("\"field1\":", 9);
			com.dslplatform.json.NumberConverter.serialize(self.field1, sw);
		
			
			sw.writeAscii(",\"field10\":", 11);
			com.dslplatform.json.NumberConverter.serialize(self.field10, sw);
		
			
			sw.writeAscii(",\"field7\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field7, sw);
		
			
			sw.writeAscii(",\"field6\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field6, sw);
		
			
			sw.writeAscii(",\"field9\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field9, sw);
		
			
			sw.writeAscii(",\"field8\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field8, sw);
		
			
			sw.writeAscii(",\"field3\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field3, sw);
		
			
			sw.writeAscii(",\"field2\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field2, sw);
		
			
			sw.writeAscii(",\"field5\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field5, sw);
		
			
			sw.writeAscii(",\"field4\":", 10);
			com.dslplatform.json.NumberConverter.serialize(self.field4, sw);
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_10_double_fields.TestObject> JSON_READER_struct13 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_10_double_fields.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_10_double_fields.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_10_double_fields.TestObject instance = new com.jsoniter.benchmark.with_10_double_fields.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_10_double_fields.TestObject deserializestruct13(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_10_double_fields.TestObject instance = new com.jsoniter.benchmark.with_10_double_fields.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_10_double_fields.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		double _field1_ = 0.0;
		double _field10_ = 0.0;
		double _field7_ = 0.0;
		double _field6_ = 0.0;
		double _field9_ = 0.0;
		double _field8_ = 0.0;
		double _field3_ = 0.0;
		double _field2_ = 0.0;
		double _field5_ = 0.0;
		double _field4_ = 0.0;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 268646422:
						_field10_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1111540720:
						_field7_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1128318339:
						_field6_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1346427386:
						_field9_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1363205005:
						_field8_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1178651196:
						_field3_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1195428815:
						_field2_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1145095958:
						_field5_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1161873577:
						_field4_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 268646422:
						_field10_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1111540720:
						_field7_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1128318339:
						_field6_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1346427386:
						_field9_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1363205005:
						_field8_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1178651196:
						_field3_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1195428815:
						_field2_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1145095958:
						_field5_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					case 1161873577:
						_field4_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
		instance.field10 = _field10_;
		instance.field7 = _field7_;
		instance.field6 = _field6_;
		instance.field9 = _field9_;
		instance.field8 = _field8_;
		instance.field3 = _field3_;
		instance.field2 = _field2_;
		instance.field5 = _field5_;
		instance.field4 = _field4_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_string_map_string.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_string_map_string.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field1 != null) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field1\":", 9);
				com.dslplatform.json.MapConverter.serialize(self.field1, sw);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_string_map_string.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			if (self.field1 != null) {
				sw.writeAscii("\"field1\":", 9);
				com.dslplatform.json.MapConverter.serialize(self.field1, sw);
			} else {
				sw.writeAscii("\"field1\":null", 13);
			}
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_string_map_string.TestObject> JSON_READER_struct14 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_string_map_string.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_string_map_string.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_string_map_string.TestObject instance = new com.jsoniter.benchmark.with_string_map_string.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_string_map_string.TestObject deserializestruct14(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_string_map_string.TestObject instance = new com.jsoniter.benchmark.with_string_map_string.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_string_map_string.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		java.util.Map<String, String> _field1_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.MapConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.MapConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_double.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_double.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field1 != 0.0) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field1\":", 9);
				com.dslplatform.json.NumberConverter.serialize(self.field1, sw);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_double.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			sw.writeAscii("\"field1\":", 9);
			com.dslplatform.json.NumberConverter.serialize(self.field1, sw);
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_double.TestObject> JSON_READER_struct17 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_double.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_double.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_double.TestObject instance = new com.jsoniter.benchmark.with_double.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_double.TestObject deserializestruct17(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_double.TestObject instance = new com.jsoniter.benchmark.with_double.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_double.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		double _field1_ = 0.0;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.NumberConverter.deserializeDouble(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_1_string_field.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_1_string_field.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field1 != null) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_1_string_field.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			if (self.field1 != null) {
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			} else {
				sw.writeAscii("\"field1\":null", 13);
			}
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_1_string_field.TestObject> JSON_READER_struct9 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_1_string_field.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_1_string_field.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_1_string_field.TestObject instance = new com.jsoniter.benchmark.with_1_string_field.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_1_string_field.TestObject deserializestruct9(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_1_string_field.TestObject instance = new com.jsoniter.benchmark.with_1_string_field.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_1_string_field.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		String _field1_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_10_string_fields.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_10_string_fields.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field1 != null) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			}
		
			if (self.field10 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field10\":", 10);
				sw.writeString(self.field10);
			}
		
			if (self.field7 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field7\":", 9);
				sw.writeString(self.field7);
			}
		
			if (self.field6 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field6\":", 9);
				sw.writeString(self.field6);
			}
		
			if (self.field9 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field9\":", 9);
				sw.writeString(self.field9);
			}
		
			if (self.field8 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field8\":", 9);
				sw.writeString(self.field8);
			}
		
			if (self.field3 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field3\":", 9);
				sw.writeString(self.field3);
			}
		
			if (self.field2 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field2\":", 9);
				sw.writeString(self.field2);
			}
		
			if (self.field5 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field5\":", 9);
				sw.writeString(self.field5);
			}
		
			if (self.field4 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
				sw.writeAscii("\"field4\":", 9);
				sw.writeString(self.field4);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_10_string_fields.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			if (self.field1 != null) {
				sw.writeAscii("\"field1\":", 9);
				sw.writeString(self.field1);
			} else {
				sw.writeAscii("\"field1\":null", 13);
			}
		
			
			if (self.field10 != null) {
				sw.writeAscii(",\"field10\":", 11);
				sw.writeString(self.field10);
			} else {
				sw.writeAscii(",\"field10\":null", 15);
			}
		
			
			if (self.field7 != null) {
				sw.writeAscii(",\"field7\":", 10);
				sw.writeString(self.field7);
			} else {
				sw.writeAscii(",\"field7\":null", 14);
			}
		
			
			if (self.field6 != null) {
				sw.writeAscii(",\"field6\":", 10);
				sw.writeString(self.field6);
			} else {
				sw.writeAscii(",\"field6\":null", 14);
			}
		
			
			if (self.field9 != null) {
				sw.writeAscii(",\"field9\":", 10);
				sw.writeString(self.field9);
			} else {
				sw.writeAscii(",\"field9\":null", 14);
			}
		
			
			if (self.field8 != null) {
				sw.writeAscii(",\"field8\":", 10);
				sw.writeString(self.field8);
			} else {
				sw.writeAscii(",\"field8\":null", 14);
			}
		
			
			if (self.field3 != null) {
				sw.writeAscii(",\"field3\":", 10);
				sw.writeString(self.field3);
			} else {
				sw.writeAscii(",\"field3\":null", 14);
			}
		
			
			if (self.field2 != null) {
				sw.writeAscii(",\"field2\":", 10);
				sw.writeString(self.field2);
			} else {
				sw.writeAscii(",\"field2\":null", 14);
			}
		
			
			if (self.field5 != null) {
				sw.writeAscii(",\"field5\":", 10);
				sw.writeString(self.field5);
			} else {
				sw.writeAscii(",\"field5\":null", 14);
			}
		
			
			if (self.field4 != null) {
				sw.writeAscii(",\"field4\":", 10);
				sw.writeString(self.field4);
			} else {
				sw.writeAscii(",\"field4\":null", 14);
			}
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_10_string_fields.TestObject> JSON_READER_struct16 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_10_string_fields.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_10_string_fields.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_10_string_fields.TestObject instance = new com.jsoniter.benchmark.with_10_string_fields.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_10_string_fields.TestObject deserializestruct16(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_10_string_fields.TestObject instance = new com.jsoniter.benchmark.with_10_string_fields.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_10_string_fields.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		String _field1_ = null;
		String _field10_ = null;
		String _field7_ = null;
		String _field6_ = null;
		String _field9_ = null;
		String _field8_ = null;
		String _field3_ = null;
		String _field2_ = null;
		String _field5_ = null;
		String _field4_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 268646422:
						_field10_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1111540720:
						_field7_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1128318339:
						_field6_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1346427386:
						_field9_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1363205005:
						_field8_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1178651196:
						_field3_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1195428815:
						_field2_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1145095958:
						_field5_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1161873577:
						_field4_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						_field1_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 268646422:
						_field10_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1111540720:
						_field7_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1128318339:
						_field6_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1346427386:
						_field9_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1363205005:
						_field8_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1178651196:
						_field3_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1195428815:
						_field2_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1145095958:
						_field5_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					case 1161873577:
						_field4_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
		instance.field10 = _field10_;
		instance.field7 = _field7_;
		instance.field6 = _field6_;
		instance.field9 = _field9_;
		instance.field8 = _field8_;
		instance.field3 = _field3_;
		instance.field2 = _field2_;
		instance.field5 = _field5_;
		instance.field4 = _field4_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_object_list.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_object_list.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
		final java.util.List<com.jsoniter.benchmark.with_object_list.ElementObject> _tmp_field1_ = self.field1;
		if(_tmp_field1_ != null && self.field1.size() != 0) {
			hasWrittenProperty = true;
			sw.writeAscii("\"field1\":[", 10);
			com.jsoniter.benchmark.with_object_list.ElementObject item = _tmp_field1_.get(0);
				if(item != null)  {
					sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
					ExternalSerialization.__serializeJsonObjectMinimal(item, sw, false); 
					sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
				} else sw.writeNull();
			for(int i = 1; i < _tmp_field1_.size(); i++) {
				sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);	
				item = _tmp_field1_.get(i);
				if(item != null)  {
					sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
					ExternalSerialization.__serializeJsonObjectMinimal(item, sw, false); 
					sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
				} else sw.writeNull();
			}
			sw.writeByte(com.dslplatform.json.JsonWriter.ARRAY_END);
		}
		else if(self.field1 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
			sw.writeAscii("\"field1\":[]", 11);
		}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_object_list.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
		final java.util.List<com.jsoniter.benchmark.with_object_list.ElementObject> _tmp_field1_ = self.field1;
		if(_tmp_field1_ != null && self.field1.size() != 0) {
			sw.writeAscii("\"field1\":[", 10);
			com.jsoniter.benchmark.with_object_list.ElementObject item = _tmp_field1_.get(0);
				if(item != null)  {
					sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
					ExternalSerialization.__serializeJsonObjectFull(item, sw, false); 
					sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
				} else sw.writeNull();
			for(int i = 1; i < _tmp_field1_.size(); i++) {
				sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);	
				item = _tmp_field1_.get(i);
				if(item != null)  {
					sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
					ExternalSerialization.__serializeJsonObjectFull(item, sw, false); 
					sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
				} else sw.writeNull();
			}
			sw.writeByte(com.dslplatform.json.JsonWriter.ARRAY_END);
		}
		else if(self.field1 != null) sw.writeAscii("\"field1\":[]", 11);
		else sw.writeAscii("\"field1\":null", 13);
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_object_list.TestObject> JSON_READER_struct4 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_object_list.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_object_list.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_object_list.TestObject instance = new com.jsoniter.benchmark.with_object_list.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_object_list.TestObject deserializestruct4(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_object_list.TestObject instance = new com.jsoniter.benchmark.with_object_list.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_object_list.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		java.util.List<com.jsoniter.benchmark.with_object_list.ElementObject> _field1_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						
					if (nextToken == '[') {
						nextToken = reader.getNextToken();
						if (nextToken == ']') {
							_field1_ = new java.util.ArrayList<com.jsoniter.benchmark.with_object_list.ElementObject>(4);
						} else {
							java.util.List<com.jsoniter.benchmark.with_object_list.ElementObject> __res = reader.deserializeNullableCollection(JSON_READER_struct8);
							_field1_ = __res;
						}
						nextToken = reader.getNextToken();
					} else throw new java.io.IOException("Expecting '[' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						
					if (nextToken == '[') {
						nextToken = reader.getNextToken();
						if (nextToken == ']') {
							_field1_ = new java.util.ArrayList<com.jsoniter.benchmark.with_object_list.ElementObject>(4);
						} else {
							java.util.List<com.jsoniter.benchmark.with_object_list.ElementObject> __res = reader.deserializeNullableCollection(JSON_READER_struct8);
							_field1_ = __res;
						}
						nextToken = reader.getNextToken();
					} else throw new java.io.IOException("Expecting '[' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_double_array.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_double_array.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
		final double[] _tmp_field1_ = self.field1;
		if(_tmp_field1_ != null && _tmp_field1_.length != 0) {
			hasWrittenProperty = true;
			sw.writeAscii("\"field1\":", 9);
			com.dslplatform.json.NumberConverter.serialize(_tmp_field1_, sw);
		}
		else if(self.field1 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
			sw.writeAscii("\"field1\":[]", 11);
		}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_double_array.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
		final double[] _tmp_field1_ = self.field1;
		if(_tmp_field1_ != null && _tmp_field1_.length != 0) {
			sw.writeAscii("\"field1\":", 9);
			com.dslplatform.json.NumberConverter.serialize(_tmp_field1_, sw);
		}
		else if(self.field1 != null) sw.writeAscii("\"field1\":[]", 11);
		else sw.writeAscii("\"field1\":null", 13);
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_double_array.TestObject> JSON_READER_struct6 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_double_array.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_double_array.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_double_array.TestObject instance = new com.jsoniter.benchmark.with_double_array.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_double_array.TestObject deserializestruct6(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_double_array.TestObject instance = new com.jsoniter.benchmark.with_double_array.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_double_array.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		double[] _field1_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						
					if (nextToken == '[') {
						reader.getNextToken();
						_field1_ = com.dslplatform.json.NumberConverter.deserializeDoubleArray(reader);
						nextToken = reader.getNextToken();
					}
					else throw new java.io.IOException("Expecting '[' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						
					if (nextToken == '[') {
						reader.getNextToken();
						_field1_ = com.dslplatform.json.NumberConverter.deserializeDoubleArray(reader);
						nextToken = reader.getNextToken();
					}
					else throw new java.io.IOException("Expecting '[' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.skip_multi_levels.TestReadObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.skip_multi_levels.TestReadObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			if (self.field3 != null) {
			hasWrittenProperty = true;
				sw.writeAscii("\"field3\":", 9);
				sw.writeString(self.field3);
			}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.skip_multi_levels.TestReadObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
			
			if (self.field3 != null) {
				sw.writeAscii("\"field3\":", 9);
				sw.writeString(self.field3);
			} else {
				sw.writeAscii("\"field3\":null", 13);
			}
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.skip_multi_levels.TestReadObject> JSON_READER_struct7 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.skip_multi_levels.TestReadObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.skip_multi_levels.TestReadObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.skip_multi_levels.TestReadObject instance = new com.jsoniter.benchmark.skip_multi_levels.TestReadObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.skip_multi_levels.TestReadObject deserializestruct7(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.skip_multi_levels.TestReadObject instance = new com.jsoniter.benchmark.skip_multi_levels.TestReadObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.skip_multi_levels.TestReadObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		String _field3_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1178651196:
						_field3_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1178651196:
						_field3_ = com.dslplatform.json.StringConverter.deserialize(reader);
					nextToken = reader.getNextToken();
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field3 = _field3_;
	}
	
	public static void serialize(final com.jsoniter.benchmark.with_string_array.TestObject self, final com.dslplatform.json.JsonWriter sw, final boolean minimal) {
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_START);
		if (minimal) {
			__serializeJsonObjectMinimal(self, sw, false);
		} else {
			__serializeJsonObjectFull(self, sw, false);
		}
		sw.writeByte(com.dslplatform.json.JsonWriter.OBJECT_END);
	}

	public static void __serializeJsonObjectMinimal(final com.jsoniter.benchmark.with_string_array.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
		final String[] _tmp_field1_ = self.field1;
		if(_tmp_field1_ != null && _tmp_field1_.length != 0) {
			hasWrittenProperty = true;
			sw.writeAscii("\"field1\":[", 10);
			com.dslplatform.json.StringConverter.serializeNullable(_tmp_field1_[0], sw);
			for(int i = 1; i < _tmp_field1_.length; i++) {
				sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
				com.dslplatform.json.StringConverter.serializeNullable(_tmp_field1_[i], sw);
			}
			sw.writeByte(com.dslplatform.json.JsonWriter.ARRAY_END);
		}
		else if(self.field1 != null) {
			if(hasWrittenProperty) sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
			hasWrittenProperty = true;
			sw.writeAscii("\"field1\":[]", 11);
		}
	}

	public static void __serializeJsonObjectFull(final com.jsoniter.benchmark.with_string_array.TestObject self, com.dslplatform.json.JsonWriter sw, boolean hasWrittenProperty) {
		
		
		final String[] _tmp_field1_ = self.field1;
		if(_tmp_field1_ != null && _tmp_field1_.length != 0) {
			sw.writeAscii("\"field1\":[", 10);
			com.dslplatform.json.StringConverter.serializeNullable(_tmp_field1_[0], sw);
			for(int i = 1; i < _tmp_field1_.length; i++) {
				sw.writeByte(com.dslplatform.json.JsonWriter.COMMA);
				com.dslplatform.json.StringConverter.serializeNullable(_tmp_field1_[i], sw);
			}
			sw.writeByte(com.dslplatform.json.JsonWriter.ARRAY_END);
		}
		else if(self.field1 != null) sw.writeAscii("\"field1\":[]", 11);
		else sw.writeAscii("\"field1\":null", 13);
	}

	public static final com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_string_array.TestObject> JSON_READER_struct0 = new com.dslplatform.json.JsonReader.ReadObject<com.jsoniter.benchmark.with_string_array.TestObject>() {
		@SuppressWarnings("unchecked")
		@Override
		public com.jsoniter.benchmark.with_string_array.TestObject read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if(reader.last() != '{') {
				throw new java.io.IOException("Expecting \'{\' at position " + reader.positionInStream() + ". Found " + (char)reader.last());
			}
			reader.getNextToken();
			final com.jsoniter.benchmark.with_string_array.TestObject instance = new com.jsoniter.benchmark.with_string_array.TestObject();
			deserialize(instance, reader);
			return instance;
		}
	};

	@SuppressWarnings("unchecked")
	static com.jsoniter.benchmark.with_string_array.TestObject deserializestruct0(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		final com.jsoniter.benchmark.with_string_array.TestObject instance = new com.jsoniter.benchmark.with_string_array.TestObject();
		deserialize(instance, reader);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static void deserialize(final com.jsoniter.benchmark.with_string_array.TestObject instance, final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
		
		String[] _field1_ = null;
		byte nextToken = reader.last();
		if(nextToken != '}') {
			int nameHash = reader.fillName();
			nextToken = reader.getNextToken();
			if(nextToken == 'n') {
				if (reader.wasNull()) {
					nextToken = reader.getNextToken();
				} else {
					throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
				}
			} else {
				switch(nameHash) {
					
					case 1212206434:
						
					if (nextToken == '[') {
						nextToken = reader.getNextToken();
						if (nextToken != ']') {
							java.util.List<String> __res = com.dslplatform.json.StringConverter.deserializeNullableCollection(reader);
							_field1_ = __res.toArray(new String[0]);
						}
						nextToken = reader.getNextToken();
					}
					else throw new java.io.IOException("Expecting '[' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			while (nextToken == ',') {
				nextToken = reader.getNextToken();
				nameHash = reader.fillName();
				nextToken = reader.getNextToken();
				if(nextToken == 'n') {
					if (reader.wasNull()) {
						nextToken = reader.getNextToken();
						continue;
					} else {
						throw new java.io.IOException("Expecting 'u' (as null) at position " + reader.positionInStream() + ". Found " + (char)nextToken);
					}
				}
				switch(nameHash) {
					
					case 1212206434:
						
					if (nextToken == '[') {
						nextToken = reader.getNextToken();
						if (nextToken != ']') {
							java.util.List<String> __res = com.dslplatform.json.StringConverter.deserializeNullableCollection(reader);
							_field1_ = __res.toArray(new String[0]);
						}
						nextToken = reader.getNextToken();
					}
					else throw new java.io.IOException("Expecting '[' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
						break;
					default:
						nextToken = reader.skip();
						break;
				}
			}
			if (nextToken != '}') {
				throw new java.io.IOException("Expecting '}' at position " + reader.positionInStream() + ". Found " + (char)nextToken);
			}
		}
		
		instance.field1 = _field1_;
	}
}
