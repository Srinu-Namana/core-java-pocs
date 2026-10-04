package com.MultiThreading;

class TTDTickets {

	int total_Tickets = 55000;

	synchronized void BookMyTickets(String name, int tickets) {

		if (tickets <= total_Tickets) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			total_Tickets = total_Tickets - tickets;
			System.out.println("ఓం నమో వేంకటేశాయ");
			System.out.println("your tickets has been booked successfully Mr/Ms : " + name);
			System.out.println("Available Tickets are :" + total_Tickets);
			System.out.println("-------------------------------------");
		} else {
			System.err.println("Sorry!----NOT SELECTED");
			System.err.println("Available Tickets are : " + total_Tickets);
		}
	}
}

class Devotees extends Thread {

	TTDTickets ttd;
	String DevoteeName;
	int tickets;

	Devotees(TTDTickets ttd, String DevoteeName, int tickets) {

		this.ttd = ttd;
		this.DevoteeName = DevoteeName;
		this.tickets = tickets;
	}

	@Override
	public void run() {

		ttd.BookMyTickets(DevoteeName, tickets);
	}

}

public class TestTTDBokingTickets {

	public static void main(String[] args) {

		System.out.println("main method started");

		TTDTickets ttd = new TTDTickets();

		Devotees babi = new Devotees(ttd, "PeddiRaju", 5);
		babi.start();
		
		Devotees Adhi = new Devotees(ttd, "Adhi", 5);
		Adhi.start();
		
		Devotees Babi = new Devotees(ttd, "Babi", 10);
		Babi.start();
		
		Devotees Somesh = new Devotees(ttd, "Somesh", 10);
		Somesh.start();

		System.out.println("main method ended");
	}

}
