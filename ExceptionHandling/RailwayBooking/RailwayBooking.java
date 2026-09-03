package com.corejavapocs.ExceptionHandling;

import java.util.Scanner;

public class RailwayBooking {

	static int availableSeats = 10;

	public static void bookTicket(String name, int age, int tickets) throws NoSeatsAvailableException {

		// Check passenger age
		if (age <= 0 || age > 120) {
			throw new IllegalArgumentException("Invalid passenger age");
		}

		// Check number of tickets
		if (tickets <= 0) {
			throw new IllegalArgumentException("Number of tickets must be greater than 0");
		}

		// Check available seats
		if (tickets > availableSeats) {
			throw new NoSeatsAvailableException("Requested tickets exceed available seats");
		}

		// Successful booking
		availableSeats = availableSeats - tickets;

		System.out.println("\nTicket Booking Successful!");
		System.out.println("Passenger Name: " + name);
		System.out.println("Passenger Age: " + age);
		System.out.println("Tickets Booked: " + tickets);
		System.out.println("Remaining Seats: " + availableSeats);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Enter Passenger Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Passenger Age: ");
			int age = sc.nextInt();

			System.out.print("Enter Number of Tickets: ");
			int tickets = sc.nextInt();

			bookTicket(name, age, tickets);

		} catch (IllegalArgumentException e) {

			System.out.println("Error: " + e.getMessage());

		} catch (NoSeatsAvailableException e) {

			System.out.println("Booking Failed: " + e.getMessage());

		} finally {

			System.out.println("\nBooking process completed.");
		}

		// Program continues after exception handling
		System.out.println("Thank you for using Railway Ticket Booking System.");

		sc.close();
	}
}
