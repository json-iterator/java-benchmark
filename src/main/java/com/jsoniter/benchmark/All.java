package com.jsoniter.benchmark;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class All {
    public static void loadJMH() {
        URLClassLoader classLoader = (URLClassLoader) All.class.getClassLoader();
        StringBuilder classpath = new StringBuilder();
        for(URL url : classLoader.getURLs())
            classpath.append(url.getPath()).append(File.pathSeparator);
        System.setProperty("java.class.path", classpath.toString());
    }
}
