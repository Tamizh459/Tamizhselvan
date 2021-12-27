package com.java.detail;

import java.util.Scanner;

public class Throw_Exception {

	public static void main(String[] args) throws Throwable{
      Scanner sc= new Scanner (System.in);	
      int mark = sc.nextInt();
      System.out.println(mark);
      if (mark<35) {
    	  System.out.println("PASS");
	} 
      else {
		System.out.println("FAIL");
	}

}
}
