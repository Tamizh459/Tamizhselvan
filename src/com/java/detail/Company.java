package com.java.detail;

public class Company extends Government {

	@Override
	public void model() {
	 System.out.println("INNOVA");
		
	}

	@Override
	public void color() {
		System.out.println("BLACK");
		
	}
	public static void main(String[] args) {
		Company yamaha=new Company();
		yamaha.engine();
		yamaha.speed();
		yamaha.cc();
		yamaha.model();
		yamaha.color();
	}
}
