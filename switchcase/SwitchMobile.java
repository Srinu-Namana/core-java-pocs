package corejavapocs.switchcase;

import java.util.Scanner;

public class SwitchMobile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		double discount = 0;
		String st;
		do {
			System.out.println("choose the catagory:");
			System.out.println("airtel/jio");

			String cat = sc.next();
			switch (cat.toLowerCase()) {
			case "airtel":
				do {
					System.out.println("airtel prepaid plans");
					System.out.println("1.$359");
					System.out.println("2.$659");
					System.out.println("3.$859");
					System.out.println("4.$3200");
					System.out.print("choose your plan number:");

					int plans = sc.nextInt();
					switch (plans) {
					case 1:
						System.out.println("for one month plan $359");
						total += 359;
						break;
					case 2:
						System.out.println("for two month plan $659");
						total += 659;
						break;
					case 3:
						System.out.println("for three month plan $859");
						total += 859;
						break;
					case 4:
						System.out.println("for yearly plan $3200");
						total += 3200;
						break;
					default:
						System.out.println("invalid plan");
					}
					System.out.println("if you want to reacharge another number click: yes/no");

					st = sc.next();

				} while (st.equalsIgnoreCase("yes"));
				break;

			case "jio":
				do {
					System.out.println("jio prepaid plans");
					System.out.println("choose your plan");
					System.out.println("1.$349");
					System.out.println("2.$666");
					System.out.println("3.$899");
					System.out.println("4.$3100");
					System.out.print("choose your plan number:");

					int plan = sc.nextInt();
					switch (plan) {
					case 1:
						System.out.println("for one month plan $349");
						total += 349;
						break;
					case 2:
						System.out.println("for two month plan $666");
						total += 666;
						break;
					case 3:
						System.out.println("for three month plan $899");
						total += 899;
						break;
					case 4:
						System.out.println("for yearly plan $3100");
						total += 3100;
						break;
					default:
						System.out.println("invalid plan ");
					}
					System.out.println("if you want to reacharge another number click: yes/no");

					st = sc.next();
				} while (st.equalsIgnoreCase("yes"));
				break;
			default:
				System.out.println("invalid catgory");
			}

			System.out.println("if you want to prepaid click yes/no");

			st = sc.next();

		} while (st.equalsIgnoreCase("yes"));

		System.out.println("total bill:" + total);
		if (total > 2000) {
			discount = ((total * 2) / 100);
			total = total - discount;
		} else {
			System.out.println("sorry ! try discount for next time");
		}
		System.out.println("disscount: " + discount);
		System.out.println("After discount bill:" + total);
		System.out.println("thanks for recharging!! visit again");
	}

}
