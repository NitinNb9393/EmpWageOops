package com.birdgelabz.empwage;

public class EmpWage {
	private static final int IS_PART_TIME1 = 1;
	private static final int IS_FULL_TIME1 = 2;
	private static final int MAX_WORKING_HRS = 0;
	private static final int MAX_WORKING_DAYS = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		EmpWageComp company1 = new EmpWageComp();
		EmpWageComp("Dmart", 20, 20, 100);
		EmpWageComp company2 = new EmpWageComp();
		EmpWageComp("Kmart", 22, 20, 70);
		EmpWageComp company3 = new EmpWageComp();
		EmpWageComp("Bridgelabz", 15, 2, 20);

		EmpCheck();
		FullTimeWage();
		PartTimeWage();
		UsingSwitchCase();
		WageForMonth();
		WageTillCondition();
		EmployeeWage();

	}

	public static int EmpWageComp(String company, int empRatePerHr, int numWorkingDays, int maxHrs) {
		int empHrs = 0, totalEmpHrs = 8, totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS) {
			totalWorkingDays++;
			int empcheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empcheck) {
			case 2:
				System.out.println("Employee is Part time ");
				empHrs = 4;
				break;
			case 1:
				System.out.println("Employee is Full time ");
				empHrs = 8;
				break;
			default:
				System.out.println("Employee is Absent");
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println(company + " company Total Daily Wage for days " + totalWorkingDays + " and hours "
				+ totalEmpHrs + " is: " + totalEmpWage);

		return totalEmpWage;
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

	// UC-6-Wage till condition of total working hour is reached in month
	// Constatnts
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static final int EMP_RATE_PER_HOUR = 20;
	static final int WORKING_DAYS_IN_MONTH = 20;
	static final int MAX_HOURS_IN_MONTH = 100;

	public static void WageTillCondition() {

		// Variables
		int empHrs = 0;
		int totalWorkday = 0;
		int totalEmpHrs = 0;
		int totalWage = 0;

		while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkday < WORKING_DAYS_IN_MONTH) {
			totalWorkday++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("empCheck : " + empCheck);
			System.out.println("WorkDay : " + totalWorkday);
			switch (empCheck) {
			case IS_FULL_TIME1:
				System.out.println("Employee is Full Time present");
				empHrs = 8;
				break;
			case IS_PART_TIME1:
				System.out.println("Employee is Part Time Present");
				empHrs = 4;
				break;
			default:
				System.out.println("Employee is Absent");
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("totalWorkday" + " Emp Hrs :" + totalEmpHrs);
		}
		int totalEmpWage = EMP_RATE_PER_HOUR * totalEmpHrs;
		System.out.println("total Emp Wage: " + totalEmpWage);
	}
	// Constatnts
	// static final int IS_FULL_TIME = 1;
	// static final int IS_PART_TIME = 2;
	// static final int EMP_RATE_PER_HOUR = 20;
	// static final int WORKING_DAYS_IN_MONTH = 20;
	// static final int MAX_HOURS_IN_MONTH = 100;

	public static void EmployeeWage() {

		// Loacl Variables
		int empHrs = 0;
		int totalWorkday = 0;
		int totalEmpHrs = 0;

		while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkday < WORKING_DAYS_IN_MONTH) {
			totalWorkday++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("empCheck : " + empCheck);
			System.out.println("WorkDay : " + totalWorkday);
			switch (empCheck) {
			case IS_FULL_TIME1:
				System.out.println("Employee is Full Time present");
				empHrs = 8;
				break;
			case IS_PART_TIME1:
				System.out.println("Employee is Part Time Present");
				empHrs = 4;
				break;
			default:
				System.out.println("Employee is Absent");
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("totalWorkday" + " Emp Hrs :" + totalEmpHrs);
		}
		int totalEmpWage = EMP_RATE_PER_HOUR * totalEmpHrs;
		System.out.println("total Emp Wage: " + totalEmpWage);
	}

//UC 8 EmpWageForMultipleCompany
	public static int EmpWageForMultipleCompany(String company, int empRatePerHour, int NoOfWorkDay,
			int MaxHourPerMonth) {

		// variables
		int empHour = 0, totalEmpHour = 0, totalWorkingDays = 0;
		// computation
		while (totalEmpHour <= MaxHourPerMonth && totalWorkingDays <= NoOfWorkDay) {
			totalWorkingDays++;

			int empCheck = (int) Math.random() * 3;
			switch (empCheck) {
			case IS_PART_TIME1:
				empHour = 4;
				break;
			case IS_FULL_TIME1:
				empHour = 8;
				break;
			default:
				empHour = 0;
			}
			totalEmpHour += empHour;
			System.out.println("Day" + totalWorkingDays + "Emp Hour " + empHour);
		}
		int totalEmpWage = totalEmpHour * empRatePerHour;
		System.out.println("Total Employee wage for company " + company + " is " + totalEmpWage);
		return totalEmpWage;
	}
}
