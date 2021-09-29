package com.bridgelab.empwagebuilder;

public class EmpWageBuilderUC7 {
	// Constants
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static final int PER_HR_WAGE = 20;
	static final int MAX_WORKING_DAYS = 20;
	static final int MAX_WORKING_HRS = 100;

	public static void main(String[] args) {
		EmpWageBuilderUC7 wage = new EmpWageBuilderUC7();
		wage.calculateWage();
	}

	public void calculateWage() {
		// Variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHr = 0;
		int totalEmpWorkingDays = 0;

		while (totalEmpWorkingDays < MAX_WORKING_DAYS && totalEmpHr <= MAX_WORKING_HRS) {
			int empCheck = (int) Math.floor(Math.random() * 10 % 3);
			totalEmpWorkingDays++;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHr += empHrs;
			empWage = empHrs * PER_HR_WAGE;

			System.out.println(
					"Day " + totalEmpWorkingDays + " Working Hours " + empHrs + " , & Todays wage is " + empWage);
		}
		totalEmpWage = totalEmpHr * PER_HR_WAGE;
		System.out.println("Total wage = " + totalEmpWage);
	}
}
