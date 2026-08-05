package com.corejavapocs.Inheritance;

public class PartTimeEmployee extends Employee {

	@Override
	String Hello() {
		return "Part Time Employee";
	}

	double calculateSalary(double basic) {

		double Allowance = basic * 0.05;

		return basic + Allowance;

	}

	void employeeBenfits() {

		System.out.println("Eligible for Allowance");
	}

	public static void main(String[] args) {

		System.out.println("Main Method Called : part-time-employees");

		PartTimeEmployee pt = new PartTimeEmployee();

		int id = pt.getEmployeeId();

		String name = pt.getEmployeeName();

		double basic = pt.getBasicSalary();

		double netSalary = pt.calculateSalary(basic);

		System.out.println();

		System.out.println("Employee ID : " + id);

		System.out.println("Employee Name : " + name);

		System.out.println("Employee Type : " + pt.Hello());

		pt.employeeBenfits();

		System.out.println("Net Salary : " + netSalary);
	}

}
