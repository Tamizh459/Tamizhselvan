package com.java.detail;

public class Class_Variable {
  int a=5,b=6,c=7;
  public void add() {
	  int a=51,b=49;
	  System.out.println(a+b);
}
  public void multiply() {
	System.out.println(a*b*c);
}
  public static void main(String[] args) {
	Class_Variable a=new Class_Variable();
	a.add();
	a.multiply();
}
}

