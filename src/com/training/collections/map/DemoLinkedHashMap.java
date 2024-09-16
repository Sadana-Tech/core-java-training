package com.training.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DemoLinkedHashMap {

	public static void main(String args[]) {

		Map<String, Integer> map = new LinkedHashMap<>();

		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 200);
		map.put("A", 200);
		map.put(null, 300);
		map.put("Z", null);

		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + ":" + val);
		}

	}
}
