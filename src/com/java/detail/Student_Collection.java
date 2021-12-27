package com.java.detail;

import java.util.ArrayList;
import java.util.Comparator;

public class Student_Collection {
	

	public static void main(String[] args) {
		ArrayList<String> x= new ArrayList<String>();
		ArrayList<Object> x1=new ArrayList<Object>();
		x.add("Prakash");
		x.add("Kamesh");
		x.add("Ravi");
		x.add("Saran");
		
		x1.add(15);
		x1.add(12);
		x1.add(22);
		x1.add(25);
		System.out.println("x is:" +x);
		System.out.println("x1 is:" +x1);
		
		String name=x.get(2);
		System.out.println(name);
		Object s=x1.get(3);
		System.out.println(s);
		
		x.set(2,"Praveen");
		System.out.println(x);
		x1.set(1,10);
		System.out.println(x1);
		
		x.remove(1);
		System.out.println(x);
		x1.remove(3);
		System.out.println(x1);
		
		int size = x.size();
		System.out.println(size);
		
		int indexOf = x.indexOf("Praveen");
		System.out.println(indexOf);
		
		boolean contains = x.contains("Ravi");
		System.out.println(contains);
		
//		x.clear();
//	System.out.println(x);
	
		x1.addAll(x);
	System.out.println(x1);	
		
//		x.retainAll(x1);                // output is given same values of x and x1 
//		System.out.println(x);
		
//		x1.removeAll(x);
//		System.out.println(x1);
		
		boolean empty = x.isEmpty();
		System.out.println(empty);
		
		
		
		boolean equals = x1.equals(x);
		System.out.println(equals);
		
		x1.removeAll(x);
		System.out.println(x1);
		
		
		
	}

}
