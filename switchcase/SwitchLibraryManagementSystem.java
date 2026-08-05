package corejavapocs.switchcase;

import java.util.Scanner;

public class SwitchLibraryManagementSystem {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("LIBRARY MANAGEMENT SYSTEM");
		System.out.println("Did you have library card ?: Yes/No");
		Scanner sc = new Scanner(System.in);

		String cat = sc.nextLine();

		switch (cat.toUpperCase()) {
		case "YES": {
			System.out.println("check the number of books borrowed ??");

			int barrow = sc.nextInt();
			if (barrow >= 3) {
				System.out.println("barrrowing limit is reached");
			} else {
				System.out.println("choose the book : ");
				System.out.println("1.fiction");
				System.out.println("2.science");
				System.out.println("3.history");

				int book = sc.nextInt();
				switch (book) {

				case 1: {
					System.out.println("Duration for this book only 7Days");
					break;
				}

				case 2: {
					System.out.println("Duration for this book only 14Days");
					break;
				}

				case 3: {
					System.out.println("Duration for this book only 21Days");
					break;
				}
				default:
					System.out.println("invalid book");

				}

			}
			break;
		}

		case "NO": {
			System.out.println("Library card required to borrow books.");
			break;
		}

		default:
			System.out.println("invalidCatogory");
		}
	}
}
