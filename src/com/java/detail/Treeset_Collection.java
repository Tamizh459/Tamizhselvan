package com.java.detail;

import java.util.Set;
import java.util.TreeSet;

public class Treeset_Collection {
   public static void main(String[] args) {
	Set<Integer>L=new TreeSet<Integer>();
	Set<Object>L1=new TreeSet<Object>();
	
	L.add(50);
	L.add(53);
	L.add(94);
	L.add(27);
	L.add(975);
	
	L1.add("ENGLISH");
    L1.add("MATHS");
    L1.add("SCIENCE");
    L1.add("TAMIL");
    L1.add("TOTAL");
     System.out.println(L);
     System.out.println(L1);
     
     int size = L.size();
     System.out.println(size);
     
     boolean contains = L.contains(975);
     System.out.println(contains);
     
     L1.addAll(L);
     System.out.println(L1);
     
     L.clear();
    System.out.println(L);
     
        }
}
