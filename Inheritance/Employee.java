package com.corejavapocs.Inheritance;

import java.util.*;

public class Employee {

	String Hello() {
		return "Employee";
	}

	static Scanner sc = new Scanner(System.in);

	int getEmployeeId() {

		System.out.println("enter your ID: ");

		int id = sc.nextInt();

		return id;
	}

	String getEmployeeName() {
		sc.nextLine();

		System.out.println("enter your Name: ");

		String name = sc.nextLine();

		return name;
	}

	double getBasicSalary() {

		System.out.println("enter your Salary: ");

		double Salary = sc.nextInt();

		return Salary;
	}

}
