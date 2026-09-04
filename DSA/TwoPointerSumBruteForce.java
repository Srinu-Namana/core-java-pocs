package com.DSA;

//Brute-Force Methodolgy
public class TwoPointerSumBruteForce {

	public static void main(String[] args) {

		System.out.println("main method started!!");

		int arr[] = { 10, 3, 5, 4, 4, 99, 2, 11 };

		int target = 15;

		boolean status = false;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {

					System.out.println(i + " " + j);

					status = true;
				}
			}
			if (status) {
				break;
			}
		}
	}

}
