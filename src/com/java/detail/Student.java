package com.java.detail;

public class Student {
  public Student() {
	System.out.println("Default Constructor");
}
  public Student(int a) {
	  System.out.println(a);
	  
  }
  public static void main(String[] args) {
	Student S1=new Student(100);
}
}
 