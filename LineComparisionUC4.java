package com.bridgelab.empwagebuilder;

import java.util.Scanner;

public class LineComparisionUC4 {

	public static void main(String[] args) {

		System.out.println("Welcome to line length calculato.");

		Cordinates lineOne = new Cordinates();
		System.out.println("Enter the following cordinates for the first line.");
		System.out.println("Enter the X-cordinato of the 1st point : ");
		lineOne.setX1(getDoubleValue());
		System.out.println("Enter the Y-cordinato of the 1st point : ");
		lineOne.setY1(getDoubleValue());
		System.out.println("Enter the X-cordinato of the 2nd point : ");
		lineOne.setX2(getDoubleValue());
		System.out.println("Enter the Y-cordinato of the 2nd point : ");
		lineOne.setY2(getDoubleValue());

		double lengthOne = lineOne.getLength();

		Cordinates lineTwo = new Cordinates();
		System.out.println("Enter the following cordinates for the second line.");
		System.out.println("Enter the X-cordinato of the 1st point : ");
		lineTwo.setX1(getDoubleValue());
		System.out.println("Enter the Y-cordinato of the 1st point : ");
		lineTwo.setY1(getDoubleValue());
		System.out.println("Enter the X-cordinato of the 2nd point : ");
		lineTwo.setX2(getDoubleValue());
		System.out.println("Enter the Y-cordinato of the 2nd point : ");
		lineTwo.setY2(getDoubleValue());

		double lengthTwo = lineTwo.getLength();

		compareLength(lengthOne, lengthTwo);
	}

	public static double getDoubleValue() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}

	public static void compareLength(double length1, double length2) {
		Double d1 = (Double) length1;
		Double d2 = (Double) length2;
		if (d1.compareTo(d2) < 0) {
			System.out.println("First line is smaller than the second line.");
		} else if (d1.compareTo(d2) > 0) {
			System.out.println("Second line is smaller than the first line.");
		} else
			System.out.println("Both the lines are equal.");
	}
}
