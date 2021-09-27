package com.bridgelab.empwagebuilder;

public class EmpWageBuilderUC1 {

	public static void main(String[] args) {

		checkEmp();
	}
	
	public static void checkEmp() {
		int empPresent = 1;
		int rand = (int)Math.floor((Math.random()*10)/2);
		if (rand == empPresent) {
			System.out.println("Employee is Present.");
		}else 
			System.out.println("Employee is Absent.");
	}

}
