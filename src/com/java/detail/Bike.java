package com.java.detail;

public class Bike implements Yamaha,Duke {

	@Override
	public void milage1() {
		System.out.println("40km/l");// TODO Auto-generated method stub
		
	}

	@Override
	public void milage2() {
		System.out.println("35km/l");
	}
     public static void main(String[] args) {
		Bike milage=new Bike();
		milage.milage1();
		milage.milage2();
	}
}
