# java-benchmark
various payload matters

```
mvn compile
schedtool -a 1 -e perf stat -e cycles,instructions,cache-references,cache-misses,page-fa ults,branches,branch-misses mvn exec:java -Dexec.mainClass="com.jsoniter.benchmark.with_1_string_field.DeserJackson"
```

```
--add-opens java.base/java.lang=ALL-UNNAMED
-XX:+CompactStrings
```