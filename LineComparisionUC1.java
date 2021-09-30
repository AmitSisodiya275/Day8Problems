package com.bridgelab.empwagebuilder;

import java.util.Scanner;

public class LineComparisionUC1 {

public static void main(String[] args) {
		
		System.out.println("Welcome to line length calculato.");
		System.out.println("Enter the X-cordinato of the 1st point : ");
		double x1 = getDoubleValue();
		System.out.println("Enter the Y-cordinato of the 1st point : ");
		double y1 = getDoubleValue();
		System.out.println("Enter the X-cordinato of the 2nd point : ");
		double x2= getDoubleValue();
		System.out.println("Enter the Y-cordinato of the 2nd point : ");
		double y2 = getDoubleValue();
		
		//Formula for calculating the length of the line
		double lengthOfLine = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
		System.out.println("The length of the line is : "+lengthOfLine);
	
	}
	public static double getDoubleValue() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}

}
