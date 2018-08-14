package com.luke.beans;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemProperties {

	public static void main(String[] args) {

		Properties properties = System.getProperties();
		Set<Map.Entry<Object, Object>> set = properties.entrySet();
		for (Map.Entry<Object, Object> objectObjectEntry : set) {
//			System.out.println(objectObjectEntry.getKey() + ":" + objectObjectEntry.getValue());
		}

		System.out.println(properties.getProperty("user.home"));
	}

}
