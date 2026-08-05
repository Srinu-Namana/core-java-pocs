package corejavapocs.LogicalStatements;

import java.util.Scanner;

public class LogicalStatementNaukariPlatform {

	public static void main(String[] args) {

		System.out.println("Welcome To Naukari Platform ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me your name: ");
		String name = sc.nextLine();
		System.out.println("which year are you passed out :");
		int year = sc.nextInt();
		if (year == 2026 || year >= 2025) {
			System.out.println("oke that's fine..continue to next");

			System.out.println("Are you from which Branch:");
			String branch = sc.next();
			if (branch.equalsIgnoreCase("CSE") || branch.equalsIgnoreCase("ECE")) {
				System.out.println("oke then, your eligible to apply");

				System.out.println("which languages have you learned :");
				sc.nextLine();
				String lang = sc.nextLine();
				if (lang.equalsIgnoreCase("java") || lang.equalsIgnoreCase("python")) {
					System.out.println("oke then proceed to techincal round");

					System.out.println("Are you willing to relocate");
					boolean bool = sc.nextBoolean();
					if (bool == true) {
						System.out.println("yeah i'm willing to relocate");

						System.out.println("okey! you are now eligible to join in our MNC company what your answer??");
						boolean bools = sc.nextBoolean();
						if (bools == true) {
							System.out.println("yeah im ready to join");
						} else {
							System.out.println("im sorry to join ,ican't assure the 3years bond");
						}
					} else {
						System.out.println("if don't want to relocate we are sorry to hire you");
					}
				} else {
					System.out.println("we are sorry,you learn some of the courses");
				}
			} else {
				System.out.println("sorry!!");
			}

		} else {
			System.out.println("I'M Sorry.We will try later");
		}

	}

}