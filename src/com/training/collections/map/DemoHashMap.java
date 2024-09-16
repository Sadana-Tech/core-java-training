package com.training.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {

	public static void main(String args[]) {

		Map<Emp, Integer> map = new HashMap<>();
		
		map.put(new Emp(10, "A"), 200000);
		
		map.put(new Emp(11, "A"), 200000);
		
		map.put(new Emp(10, "A"), 200000);
		
		


		Set<Map.Entry<Emp, Integer>> entries = map.entrySet();
		for (Map.Entry<Emp, Integer> entry : entries) {
			String key = entry.getKey().toString();
			Integer val = entry.getValue();
			System.out.println(key + ":" + val);
		}

		/*
		 * Set<String> keys = map.keySet();
		 * 
		 * for (String key : keys) {
		 * 
		 * System.out.println(key + ":" + map.get(key)); }
		 * 
		 * Iterator<Map.Entry<String, Integer>> itr = entries.iterator(); while
		 * (itr.hasNext()) { Map.Entry<String, Integer> entry = itr.next();
		 * System.out.println(entry.getKey() + ":" + entry.getValue()); }
		 */
	}

}

class Emp {
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

	int id;
	String name;

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}