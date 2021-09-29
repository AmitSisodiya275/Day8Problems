package com.bridgelab.empwagebuilder;

public class EmpWageBuilderUC2 {
	static int empIsPresent = 1;
	static final int EMP_PER_HR_WAGE = 20; // Constant bcz the rate is fix.

	public static void main(String[] args) {
		calculateWage();
	}

	public static void calculateWage() {
		int empHrs = 0;
		int empCheck = (int) Math.floor(Math.random() * 10 % 2);
		if (empCheck == empIsPresent)
			empHrs = 8;
		int empWage = empHrs * EMP_PER_HR_WAGE;
		System.out.println("Wage of the employee is : " + empWage);
	}
}
