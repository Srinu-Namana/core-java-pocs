package com.corejavapocs.Multithreading;

class BookMyShow {

	int totalTickets = 10;

	synchronized void BookMyTickets(String name, int tickets) {

		if (tickets <= totalTickets) {

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			totalTickets = totalTickets - tickets;

			System.out.println("Tickets Booked Successfully Mr/Ms :" + name);
			System.out.println("Your total tickets are : " + tickets);
			System.out.println("Available Tickets : " + totalTickets);
		} else {
			System.err.println("Tickets Have been Sold Out");
			System.err.println("Sorry Available Tickets are : " + totalTickets);
		}
	}

}

class Customer extends Thread {

	BookMyShow bms;
	String customerName;
	int tickets;

	Customer(BookMyShow bms, String customer, int tickets) {

		this.bms = bms;
		this.customerName = customer;
		this.tickets = tickets;
	}

	@Override
	public void run() {

		bms.BookMyTickets(customerName, tickets);

	}

}

public class TestBookMyShow {

	public static void main(String[] args) {

		System.out.println("main method started");

		BookMyShow bms = new BookMyShow();

		Customer Tejo = new Customer(bms, "Tejo Bnadaru", 10);
		Tejo.start();

		Customer srinu = new Customer(bms, "Srinu Namana", 4);
		srinu.start();

		Customer siva = new Customer(bms, "Siva Kailasa", 9);
		siva.start();
		
		Customer Aryan = new Customer(bms, "Aryan", 2);
		Aryan.start();
		
		Customer sai = new Customer(bms, "Sai", 1);
		sai.start();

		System.out.println("main method ended");
	}

}
