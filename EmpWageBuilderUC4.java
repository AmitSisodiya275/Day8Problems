package com.bridgelab.empwagebuilder;

public class EmpWageBuilderUC4 {
	static final int EMP_PER_HR_WAGE = 20;

	public static void main(String[] args) {
		calculateWage();
	}

	public static void calculateWage() {
		final int empIsFullTime = 1;
		final int empIsPartTime = 2;
		int empHrs = 0;
		int empCheck = (int) Math.floor(Math.random() * 10 % 3);

		switch (empCheck) {
		case empIsFullTime:
			empHrs = 8;
			break;
		case empIsPartTime:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
		}
		int empWage = empHrs * EMP_PER_HR_WAGE;
		System.out.println("Wage of the employee is : " + empWage);
	}
}
