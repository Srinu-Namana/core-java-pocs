package com.corejavapocs.Inheritance;

public class HomeLoan extends Loan {

	void HomeDoc() {
		System.out.println("HomeLoans documents have been received successfully");
	}

	public static void main(String[] args) {

		System.out.println("welcome to Home Loans:");

		HomeLoan hl = new HomeLoan();

		boolean isValidPhone = hl.isValidPhone();
		boolean isValidAadhar = hl.isValidAadhar();
		boolean isValidPanCard = hl.isValidPanCard();

		if (isValidPhone && isValidAadhar && isValidPanCard) {

			String name = hl.getCustomerName();

			System.out.println("welcome for Home Loans MR." + name);

			double Salary = hl.getSalary();

			double Cibil = hl.getCibil();

			int age = hl.getAge();

			if (Salary >= 500000.00 && (age >= 20 && age <= 45) && (Cibil >= 300 && Cibil <= 900)) {

				System.out.println("congratulations....your eligible for HOME LOAN");

				hl.HomeDoc();

				System.out.println("your rate of intrest" + " " + hl.getROI());

			} else {

				System.out.println("your not eligible for Loans!!");
			}

		} else {
			System.out.println("Invalid Credentials");
		}

	}
}
