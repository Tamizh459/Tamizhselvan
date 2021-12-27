package com.java.detail;

public class String_Imutable {
	public static void main(String[] args) {
		String xyz="Cricket is my favourite game";
		System.out.println(xyz);
	System.out.println(System.identityHashCode(xyz));
	
	String S2="I Love Cricket";
	System.out.println(S2);
	System.out.println(System.identityHashCode(S2));
	
	String x="Cricket is my favourite game";
	System.out.println(xyz);
System.out.println(System.identityHashCode(x));

     String S=xyz+x;
     System.out.println(S);
     System.out.println(System.identityHashCode(S));
	}

}
