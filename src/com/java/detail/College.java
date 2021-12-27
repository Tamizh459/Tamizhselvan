package com.java.detail;

public class College extends Child{
	@Override
	public void discipline(String a) {
		// TODO Auto-generated method stub
		super.discipline(a);
	}

	public static void main(String[] args) {
		// Upcasting method
             Child students=new College();
             students.discipline("TAMIZH");
	}

}