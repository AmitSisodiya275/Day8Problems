package com.bridgelab.empwagebuilder;

public class EmpWageBuilderUC5 {
	// Constants
	static final int EMP_IS_FULL_TIME = 1;
	static final int EMP_IS_PART_TIME = 2;
	static final int EMP_PER_HR_WAGE = 20;
	static final int MAX_WORKING_DAYS = 20;

	public static void main(String[] args) {
		calculateWage();
	}

	public static void calculateWage() {

		// Variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		for (int day = 1; day <= MAX_WORKING_DAYS; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10 % 3);

			switch (empCheck) {
			case EMP_IS_FULL_TIME:
				empHrs = 8;
				break;
			case EMP_IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}

			empWage = empHrs * EMP_PER_HR_WAGE;
			System.out.println("Wage of the employee is : " + empWage);
			totalEmpWage += empWage;
		}
		System.out.println("Total Employee wage is : " + totalEmpWage);
	}
}
