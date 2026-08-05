package com.corejavapocs.Inheritance;

public class ContarctEmployee extends Employee {

	@Override
	String Hello() {
		return "Contract-EMployee";
	}

	double calculateSalary(double basic) {

		return basic;

	}

	void employeeBenfits() {

		System.out.println("No-Additional Benfits!!");
	}

	public static void main(String[] paras) {

		System.out.println("Main Method Called : Contract-Employee");

		ContarctEmployee ce = new ContarctEmployee();

		int id = ce.getEmployeeId();

		String name = ce.getEmployeeName();

		double basic = ce.getBasicSalary();

		double netSalary = ce.calculateSalary(basic);

		System.out.println();

		System.out.println("Employee ID : " + id);

		System.out.println("Employee Name : " + name);

		System.out.println("Employee Type : " + ce.Hello());

		ce.employeeBenfits();

		System.out.println("Net Salary : " + netSalary);
	}

}
