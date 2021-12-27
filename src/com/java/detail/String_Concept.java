package com.java.detail;

public class String_Concept {

	public static void main(String[] args) {
    String s="WELCOME TO OCTOBER";
   String substring = s.substring(7,10);
   System.out.println(substring);
	char charAt = s.charAt(13);
	System.out.println(charAt);
	boolean empty = s.isEmpty();
	System.out.println(empty);
	String[] split = s.split("COM");
	for (String string : split) {
System.out.print(string);		
  String trim = s.trim();
System.out.println(trim);
	String S1="AB";
	String S2="ab";
	int compareTo = S1.compareTo(S2);
	System.out.println(compareTo);
	
	String concat = S1.concat(S2);
	System.out.println(concat);
	
	int a=54632;
	String valueOf = String.valueOf(a);
	System.out.println(valueOf);
	}
	}

}
