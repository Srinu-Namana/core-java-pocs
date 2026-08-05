package com.corejavapocs.Inheritance;

public class CarLoan extends Loan {

	void CarDoc() {
		System.out.println("CarLoans documents have been received successfully");
	}

	public static void main(String[] args) {

		System.out.println("welcome to Car Loans:");

		CarLoan cl = new CarLoan();

		boolean isValidPhone = cl.isValidPhone();
		boolean isValidAadhar = cl.isValidAadhar();
		boolean isValidPanCard = cl.isValidPanCard();

		if (isValidPhone && isValidAadhar && isValidPanCard) {

			String name = cl.getCustomerName();

			System.out.println("welcome for Car Loans MR." + name);

			double Salary = cl.getSalary();

			double Cibil = cl.getCibil();

			int age = cl.getAge();

			if (Salary >= 500000.00 && (age >= 20 && age <= 45) && (Cibil >= 300 && Cibil <= 900)) {

				System.out.println("congratulations....your eligible for HOME LOAN");

				cl.CarDoc();

				System.out.println("your rate of intrest" + " " + cl.getROI());

			} else {

				System.out.println("your not eligible for Loans!!");
			}

		} else {
			System.out.println("Invalid Credentials");
		}

	}
}
