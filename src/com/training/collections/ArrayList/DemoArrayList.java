package com.training.collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
	
	public static void main(String args[]) {
		
		List<String> al = new ArrayList<>(5);
		
		
		List al1= new ArrayList();
		al1.add("d");
		al1.add(1);
		al1.add(1.5f);
		System.out.println(al1.get(0));
	
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add(null);
		System.out.println(al.toString());
		al.add("h");
		System.out.println(al.toString());
		al.add(5,"g");
		System.out.println(al.toString());
		
		al.addAll(al);
		
		System.out.println(al.toString());
		
		Iterator<String> itr= al.listIterator();
		while(itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele);
		}
		System.out.println("foreach");
		al.forEach((ele)->System.out.println(ele));
	}

}
