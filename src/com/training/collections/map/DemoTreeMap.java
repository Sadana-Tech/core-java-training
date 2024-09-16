package com.training.collections.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoTreeMap {
	
	public static void main(String args[]) {

		TreeMap<String, Integer> map = new TreeMap<>();

		map.put("C", 200);
		map.put("A", 100);
		map.put("B", 200);		
		map.put("A", 200);
		map.put("Z", null);

		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + ":" + val);
		}

	}
}
