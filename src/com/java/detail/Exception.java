package com.java.detail;

public class Exception {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Output");
		}
	}

}
