package com.corejavapocs.PredefinedFunctions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Product {

	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class TestPredefFunProductDiscount {

	public static void main(String[] args) {

		System.out.println("main method started");

		Predicate<Product> p1 = (s) -> s.price >= 1000;

		Function<Product, Double> f = (p) -> {

			double discount = 0;

			if (p.price > 5000) {

				discount = 20;
			} else if (p.price > 3000) {
				discount = 15;
			} else if (p.price > 1000) {
				discount = 10;
			} else {
				discount = 2;
			}
			return discount;
		};

		Product[] arr = {

				new Product(101, "Laptop", 60000), new Product(102, "Mobile", 40000),
				new Product(103, "Headphones", 3000), new Product(104, "Keyboard", 800),
				new Product(105, "Monitor", 5000) };

		Consumer<Product> c1 = (p) -> {

			double discount = f.apply(p);
			double discountAmount = p.price * discount / 100;
			double finalAmount = p.price - discountAmount;
			System.out.println("Product ID : " + p.id);
			System.out.println("Product Name : " + p.name);
			System.out.println("Product Price : " + p.price);
			System.out.println("Discount : " + discount + "%");
			System.out.println("Discount Amount : " + discountAmount);
			System.out.println("Final Price : " + finalAmount);
			System.out.println("------------------------");
		};

		for (Product a : arr) {

			if (p1.test(a)) {

				c1.accept(a);
			}
		}

		System.out.println("main method ended");

	}

}
