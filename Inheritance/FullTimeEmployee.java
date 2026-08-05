package com.corejavapocs.Inheritance;

public class FullTimeEmployee extends Employee {

	@Override
	String Hello() {
		return "Full Time Employee";
	}

	double calculateSalary(double basic) {

		double hra = basic * 0.20;

		double da = basic * 0.10;

		return basic + hra + da;

	}

	void employeeBenfits() {

		System.out.println("Eligible for HRA and DA");
	}

	public static void main(String[] args) {

		System.out.println("Main Method Called : Full-time-employees");

		FullTimeEmployee ft = new FullTimeEmployee();

		int id = ft.getEmployeeId();

		String name = ft.getEmployeeName();

		double basic = ft.getBasicSalary();

		double netSalary = ft.calculateSalary(basic);

		System.out.println();

		System.out.println("Employee ID : " + id);

		System.out.println("Employee Name : " + name);

		System.out.println("Employee Type : " + ft.Hello());

		ft.employeeBenfits();

		System.out.println("Net Salary : " + netSalary);
	}

}
