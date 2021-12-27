package com.java.detail;

public class Overloading {
	public void students_Name(String a) {
		// TODO Auto-generated method stub
      System.out.println("a");
	}
public void student_Id(String b) {
	// TODO Auto-generated method stub
System.out.println("b");
} private void student_Present(int a, int b,int c) {
	// TODO Auto-generated method stub
System.out.println(a*b*c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                     Overloading xyz=new Overloading();
                     xyz.students_Name("TAMIZH");
                     xyz.student_Id("TN14525555");
                     xyz.student_Present(5, 10, 15);
	}

}
