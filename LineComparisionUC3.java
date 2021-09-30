package com.bridgelab.empwagebuilder;

import java.util.Scanner;

public class LineComparisionUC3 {

	public static void main(String[] args) {

		System.out.println("Welcome to line length calculato.");
		System.out.println("Enter the following cordinates for the first line.");
		System.out.println("Enter the X-cordinato of the 1st point : ");
		double x1 = getDoubleValue();
		System.out.println("Enter the Y-cordinato of the 1st point : ");
		double y1 = getDoubleValue();
		System.out.println("Enter the X-cordinato of the 2nd point : ");
		double x2 = getDoubleValue();
		System.out.println("Enter the Y-cordinato of the 2nd point : ");
		double y2 = getDoubleValue();

		double length1 = calculateLength(x1, y1, x2, y2);
		System.out.println("Lenght of the first line is : " + length1);

		System.out.println("Enter the following cordinates for the second line.");
		System.out.println("Enter the X-cordinato of the 1st point : ");
		double a1 = getDoubleValue();
		System.out.println("Enter the Y-cordinato of the 1st point : ");
		double b1 = getDoubleValue();
		System.out.println("Enter the X-cordinato of the 2nd point : ");
		double a2 = getDoubleValue();
		System.out.println("Enter the Y-cordinato of the 2nd point : ");
		double b2 = getDoubleValue();

		double length2 = calculateLength(a1, b1, a2, b2);
		System.out.println("Length of the second line is : " + length2);

		compareTwoLine(length1, length2);
	}

	public static double getDoubleValue() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}

	public static double calculateLength(double x1, double y1, double x2, double y2) {
		double lengthOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return lengthOfLine;
	}

	public static void compareTwoLine(double length1, double length2) {
		Double d1 = (Double) length1;
		Double d2 = (Double) length2;
		int value = d1.compareTo(d2);
		if (value < 0) {
			System.out.println("Length of the first line is smaller than length of the second line.");
		} else if (value > 0) {
			System.out.println("Length of the first line is greater than length of the second line.");
		} else
			System.out.println("Both the lines are equals in size.");
	}
}
