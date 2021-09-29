package com.bridgelab.empwagebuilder;

public class EmpWageBuilderUC3 {
	static final int EMP_PER_HR_WAGE = 20;

	public static void main(String[] args) {
		calculateWage();
	}

	public static void calculateWage() {
		int empIsFullTime = 1;
		int empIsPartTime = 2;
		int empHrs = 0;
		int empCheck = (int) Math.floor(Math.random() * 10 % 3);
		if (empCheck == empIsFullTime) {
			empHrs = 8;
		} else if (empCheck == empIsPartTime) {
			empHrs = 4;
		}
		int empWage = empHrs * EMP_PER_HR_WAGE;
		System.out.println("Wage of the employee is : " + empWage);
	}
}
