package com.training.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesreader {
	public  String getproperties(String key) throws IOException {
		String getdir = System.getProperty("user.dir");
		String filepath = getdir + "/Properties/application.properties";
		FileInputStream fileinput = new FileInputStream(filepath);
		Properties prop = new Properties();
		prop.load(fileinput);
		String value = prop.getProperty(key);
		return value;
	}

}
