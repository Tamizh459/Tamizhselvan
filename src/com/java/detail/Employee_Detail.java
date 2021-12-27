package com.java.detail;

public class Employee_Detail {
    public void employee_Name(String a) {
		System.out.println(a);
	}
         public void employee_Salary(int b) {
			System.out.println(b);
		}
         private void employee_Id(String c) {
			System.out.println(c);
		}
         public static void main(String[] args) {
			Employee_Detail xyz = new Employee_Detail();
			xyz.employee_Name("SATHISH");
			xyz.employee_Salary(19000);		
			xyz.employee_Id("TN142545325");
			
		}
	}
