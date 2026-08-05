package corejavapocs.switchcase;

import java.util.Scanner;

public class SwitchLSRestaurent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double total = 0;
		double discount = 0;
		String choice;

		do {
			System.out.println("Veg or Nonveg?");
			String category = sc.nextLine();

			switch (category.toLowerCase()) {

			case "veg":
				do {
					System.out.println("Veg Menu:");
					System.out.println("1. tomato rice");
					System.out.println("2. pudhina rice");
					System.out.println("3. veg biriyani");

					System.out.print("Enter item name: ");
					String vegItem = sc.nextLine();

					switch (vegItem.toLowerCase()) {

					case "tomato rice":
						total += 2400;
						System.out.println("Price = $2400");
						break;

					case "pudhina rice":
						total += 240;

						System.out.println("Price = $240");
						break;

					case "veg biriyani":
						total += 340;
						System.out.println("Price = $340");
						break;

					default:
						System.out.println("Invalid item");
					}
					System.out.print("Do you want to order another veg item? (yes/no): ");
					choice = sc.nextLine();
				} while (choice.equalsIgnoreCase("yes"));
				break;

			case "nonveg":
				do {
					System.out.println("Non-Veg Menu:");
					System.out.println("1. chicken biriyani");
					System.out.println("2. mutton biriyani");
					System.out.println("3. prawns biriyani");

					System.out.print("Enter item name: ");
					String nonVegItem = sc.nextLine();

					switch (nonVegItem.toLowerCase()) {

					case "chicken biriyani":
						total += 500;
						System.out.println("Price = $500");
						break;

					case "mutton biriyani":
						total += 600;
						System.out.println("Price = $600");
						break;

					case "prawns biriyani":
						total += 550;
						System.out.println("Price = $550");
						break;

					default:
						System.out.println("Invalid item");
					}
					System.out.print("Do you want to order another non-veg item?: ");
					choice = sc.nextLine();
				} while (choice.equalsIgnoreCase("yes"));
				break;

			default:
				System.out.println("Invalid category");
			}

			System.out.print("Do you want to order another item? (yes/no): ");
			choice = sc.nextLine();

		} while (choice.equalsIgnoreCase("yes"));

		if (total > 1000) {
			discount = ((total * 2) / 100);
			System.out.println("discount :" + discount);
		} else {
			System.out.println("sorry u have no discount");
		}

		total = total - (discount);
		System.out.println("\nTotal Bill = $" + total);

//		System.out.println("\nFinal Bill = $" + (total-discount));

		System.out.println("Thank you! Visit Again.");

		sc.close();
	}
}
