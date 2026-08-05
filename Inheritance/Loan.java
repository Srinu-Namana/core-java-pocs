package com.corejavapocs.Inheritance;

import java.util.Scanner;

// Parent - Super - Base
public class Loan {

	String hello() {
		return "Loan"; // method
	}

	private int add() {
		return 5;
	}

	static Scanner sc = new Scanner(System.in);

	String getCustomerName() {

		sc.nextLine();

		System.out.println("enter your name: ");

		String name = sc.nextLine();

		return name;
	}

	int getAge() {

		System.out.println("enter your age: ");

		int age = sc.nextInt();

		return age;
	}

	double getSalary() {

		System.out.println("enter your Salary: ");

		double Salary = sc.nextDouble();

		return Salary;
	}

	double getCibil() {

		System.out.println("enter your CibilScore: ");

		double Cibil = sc.nextDouble();

		return Cibil;
	}

	double getROI() {

		double Cibil = getCibil();

		double ROI = 12.0;

		if (Cibil >= 300 && Cibil < 550) {

			System.out.println("poor & high risk for lenders");

			return ROI + 1.0;

		} else if (Cibil >= 550 && Cibil < 650) {

			System.out.println("Average - may be approved with diffculty");

			return ROI;

		} else if (Cibil >= 650 && Cibil < 750) {

			System.out.println("good - Acceptable to many lenders");

			return ROI - 2.0;

		} else if (Cibil >= 750 && Cibil <= 900) {

			System.out.println("Excellent - High Approval chances and better intrest rates");

			return ROI - 4.0;
		} else {
			System.out.println("invalid cibilscore!!!");
			return ROI;
		}
	}

	boolean isValidPhone() {
		System.out.println("enter your phone number: ");
		String Phone = sc.next();
		boolean isValid = Phone.matches("[6-9]{1}[0-9]{9}");
		return isValid;
	}

	boolean isValidAadhar() {
		System.out.println("enter your Aadhar Number: ");
		String Aadhar = sc.next();
		boolean isValid = Aadhar.matches("^[2-9]{1}[0-9]{11}");
		return isValid;
	}

	// ABCDE1234F---PANCARD NUMBER
	boolean isValidPanCard() {
		System.out.println("enter your pancard Number: ");
		String PanCard = sc.next();
		boolean isValid = PanCard.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return isValid;
	}

}
