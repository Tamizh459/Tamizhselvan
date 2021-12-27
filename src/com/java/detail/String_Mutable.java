package com.java.detail;

public class String_Mutable {
public static void main(String[] args) {
	StringBuffer xyz=new StringBuffer("I Love Cricket");
	StringBuffer xy=new StringBuffer("I Love Cricket");
    System.out.println(xyz);
    System.out.println(System.identityHashCode(xyz));
    System.out.println(xy);
    System.out.println(System.identityHashCode(xy));
    xyz=xyz.append(xy);
System.out.println(xyz);
System.out.println(System.identityHashCode(xyz));

xy.reverse();
System.out.println(xy);
}
}
