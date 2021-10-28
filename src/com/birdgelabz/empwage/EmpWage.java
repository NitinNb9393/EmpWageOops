package com.birdgelabz.empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		EmpCheck();
		FullTimeWage();
		PartTimeWage();
		UsingSwitchCase();
		WageForMonth();
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

	public static void PartTimeWage() {
		// UC-3-Part time employee wage calculation

		// Constants
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;

		// Variables
		int empHrs = 0;
		int empWage = 0;

		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 3;

		if (empCheck == IS_PART_TIME) {
			empHrs = 4;
			System.out.println("Employee is PartTime");
		}

		else if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
			System.out.println("Employee is FullTime");
		} else {
			System.out.println("Employee is Absent");
		}

		// Formula
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage is: " + empWage);
	}

	public static void UsingSwitchCase() {
		// UC-4-Solve employee wage using case statement

		// Constants
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20;

		// Variables
		int empHrs = 0;
		int empWage = 0;

		// Computation
		int empCheck = (int) (Math.random() * 100) % 3;

		switch (empCheck) {
		case IS_FULL_TIME:
			empHrs = 8;
			System.out.println("Employee is present full time");
			break;

		case IS_PART_TIME:
			empHrs = 4;
			System.out.println("Employee is present part time");
			break;

		default:
			empHrs = 0;
			System.out.println("Employee is absent");
			break;

		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage is :" + empWage);

	}

	public static void WageForMonth() {
		// UC-5-Emp wage for month

		// Constants
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int WORKING_DAYS_IN_MONTH = 20;

		// Variables
		int empHrs = 0;
		int empWage = 0;

		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 3;

		if (empCheck == IS_PART_TIME) {
			empHrs = 4;
			System.out.println("Employee is PartTime");
		}

		else if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
			System.out.println("Employee is FullTime");
		} else {
			System.out.println("Employee is Absent");
		}

		// Formula
		empWage = empHrs * EMP_RATE_PER_HOUR * WORKING_DAYS_IN_MONTH;
		System.out.println("Employee Wage is: " + empWage);
	}
}
