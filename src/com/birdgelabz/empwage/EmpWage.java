package com.birdgelabz.empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		EmpCheck();
		FullTimeWage();

	}

	public static void EmpCheck() {
		// UC-1-Check Employee is present or Absent

		// Constants
		int IS_FULL_TIME = 1;

		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;

		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

	public static void FullTimeWage() {
		// UC-2-Calculate daily full time employee wage

		// Constants
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;

		// Variables
		int empHrs = 0;
		int empWage = 0;

		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;

		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		System.out.println("Employee is FullTime");

		// Formula
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage for full time is: " + empWage);
	}
}
