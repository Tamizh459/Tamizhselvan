package com.java.detail;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hashset {
	public static void main(String[] args) {
		Set<Integer> m= new LinkedHashSet<Integer>();
		Set<Object> n= new LinkedHashSet<Object>();
		
		m.add(1000);
		m.add(1001);
		m.add(1002);
		m.add(1003);
		m.add(1004);
		
		n.add("BALU");
		n.add("JAYA");
		n.add("THIRU");
		n.add("KARAN");
		n.add("ARUN");
		n.add(1002);
		n.add(1000);
		System.out.println(m);
	    System.out.println(n);
	    
	    int size = m.size();
	    System.out.println(size);
	    
	    boolean contains = m.contains(1);
	    System.out.println(contains);
	    
//	    m.clear();
//	    System.out.println(m);
//	    
      n.addAll(m);
      System.out.println(n);
      
      m.retainAll(n);
      System.out.println(m);
	}

}
