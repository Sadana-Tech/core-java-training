package com.training.collections.vevtor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String args[]) {
		 Vector<Integer> vector = new Vector<>(5);		
		 vector.add(100);
		 vector.add(null);
		 vector.add(200);
		 Iterator< Integer> itr = vector.iterator();
		 while(itr.hasNext()) {
			 Integer i = itr.next();
			 System.out.println(i);
		 }
		 
		 Enumeration<Integer> enumeration = vector.elements();
		 while(enumeration.hasMoreElements()) {
			 Integer i = enumeration.nextElement();
			 System.out.println(i);
		 }
	}

}
