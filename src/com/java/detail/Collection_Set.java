package com.java.detail;

import java.util.HashSet;
import java.util.Set;

public class Collection_Set {
	public static void main(String[] args) {
		Set<Integer>v=new HashSet<Integer>();
		Set<Object>c=new HashSet<Object>();
		v.add(5);
		v.add(10);
		v.add(15);
		v.add(20);
		v.add(25);
		v.add(30);
		
		c.add("Tamizh");
		c.add("Raja");
		c.add("Raghu");
		c.add("HAri");
		c.add(15);
		c.add(25);
		System.out.println(v);
		
		int size = v.size();
		System.out.println(size);
		
		boolean contains = v.contains(10);
		System.out.println(contains);
		
//		v.clear();
//		System.out.println(v);
		
//		c.addAll(v);
//		System.out.println(c);
	     
		c.retainAll(v);
		System.out.println(c);
         	    
//	    v.removeAll(c);
//	    System.out.println(c);
	     
	    boolean empty = c.isEmpty();
	    System.out.println(empty);
	    
	    boolean equals = v.equals(c);
	    System.out.println(equals);
	
	}

}
