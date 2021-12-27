package com.java.detail;

public class Loop {

	public static void main(String[] args) {
		for (int i = 0; i<50; i++) {
			for (int j = 0; j < i/5; j++) {
				System.out.println(i-j);
			}
		}

	}

}
