package com.corejavapocs.Multithreading;

class Resource {

	int i = 0;

	boolean status = false;

	synchronized void Put(int i) throws InterruptedException {

		while (status) {
			wait();
		}
		this.i = i;
		System.out.println("Put : " + i);
		status = true;
		notify();
	}

	synchronized void Get() throws InterruptedException {
		while (!status) {
			wait();
		}
		System.out.println("Get : " + i);
		status = false;
		notify();
	}
}

class Producer implements Runnable {

	Resource r;

	Producer(Resource r) {

		this.r = r;

		Thread t = new Thread(this, "Producer");

		t.start();
	}

	@Override
	public void run() {

		int i = 0;

		while (true) {

			try {
				r.Put(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class Consumer implements Runnable {

	Resource r;

	Consumer(Resource r) {

		this.r = r;

		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {

		while (true) {

			try {
				r.Get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class TestProducerConsumer {

	public static void main(String[] args) {

		System.out.println("main method started");

		Resource r = new Resource();
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);

		System.out.println("main method ended");
	}

}
