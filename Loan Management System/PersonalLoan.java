package com.corejavapocs.Inheritance;

//Child - Sub - Derived
public class PersonalLoan extends Loan {

	@Override
	String hello() {
		return "Personal Loan"; // this is override method from parent class...
	}

//	@Override   
//	private int add() {  // we have write the same method But can't @override the private method 
//		return 5;
//	}

	void personalDoc() {
		System.out.println("personalLoans documents have been received successfully");
	}

	public static void main(String[] args) {

		System.out.println("welcome to personal Loans:");

		// Scenario : 1
		// Child reference vs Child Object
		// by using Child Object and with Child Reference we can call both
		// Child class Functionalities as well as Parent class Functionalities.
		PersonalLoan pl = new PersonalLoan();
		// Scenario : 2
		// Parent reference vs parent object
		// by using parent object and with parent reference we can call
		// only parent class functionalities .
		Loan l1 = new Loan();

		// Scenario : 3
		// child object vs parent reference
		// by using child object and with (parent reference)we can call only
		// parent class functionalities,but not from child class functionalities.
//----------------------------------------------------------------------------------------//
		// interviewer : what is the purpose Scenario 3 then we said the about.....?
		// UPcasting or dynamic method dispatching ..?
		// UPcasting means : Storing child object in to parent
		// DMD(Dynamic method Dispatching) : generally,child object and with parent
		// reference
		// we can call only parent class functionalities but when we @Override the Same
		// method
		// from parent class to child class even it's pointing to parent reference,the
		// method
		// executing from child at runtime the process is Called DMD.(Abstraction)

		Loan l2 = new PersonalLoan();
		System.out.println(l2.hello());// override method...from Loan.

		// with parent reference and executing the child object behavior
		// is said to be a Abstraction - UPcasting - DMD & Rum-time polymorphism.
		// [By hiding the implementation of child and it's pointing to
		// parent interface isknow as ABSTRACTION]

		// ABSTRACTION (DEPENDS ON)------> UPCASTING
		// ---->INHERITANCE-->ENCAPSULATION--->JAVA.

		// Scenario : 4
		// Exception in thread "main" java.lang.ClassCastException:
		// class com.oops.inheritance.Loan cannot be cast to
		// class com.oops.inheritance.PersonalLoan
		// (com.oops.inheritance.Loan and com.oops.inheritance.PersonalLoan
		// are in unnamed module of loader 'app')
		// at com.oops.inheritance.PersonalLoan.main(PersonalLoan.java:61)

//		PersonalLoan pl2  = new Loan(); //compile time error
//      Normally it throws an ERROR after casting..
//		PersonalLoan pl2  = (PersonalLoan)new Loan();// Scenario : 4
//		pl2.getCustomerName();   //from parent&child methods are appear but 
//		pl2.personalDoc();       //accessible at run-time error is classcastexception.
//	    pl2.getAge();
		boolean isValidPhone = pl.isValidPhone();
		boolean isValidAadhar = pl.isValidAadhar();
		boolean isValidPanCard = pl.isValidPanCard();

		if (isValidPhone && isValidAadhar && isValidPanCard) {

			String name = pl.getCustomerName();

			System.out.println("welcome for personal Loans MR." + name);

			double Salary = pl.getSalary(); // Parent Class functionality

			double Cibil = pl.getCibil();

			int age = pl.getAge();

			if (Salary >= 700000.00 && (age >= 20 && age <= 50) && (Cibil >= 300 && Cibil <= 900)) {

				System.out.println("congratulations....your eligible for PERSONAL LOAN");

				pl.personalDoc(); // child class functionality

				System.out.println("your rate of intrest" + " " + pl.getROI());

			} else {

				System.out.println("your not eligible for Loans!!");
			}

		} else {
			System.out.println("Invalid Credentials");
		}

	}

}
