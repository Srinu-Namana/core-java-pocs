package com.DSA;

//Two-Pointer Sum Is Must Be Sorted Array....
public class TwoPointerSumBigOofN {

	public static void main(String[] args) {

		System.out.println("main method started!!");

		int arr[] = new int[] { 3, 4, 5, 6, 8, 10, 12, 15 };

		int target = 15;

		int start = 0;

		int end = arr.length - 1;

		while (start < end) {

			int sum = arr[start] + arr[end];

			if (sum == target) {

				System.out.println("target found: ");

				System.out.println(start + " " + end);

				start++;

				end--;

			} else if (sum < target) {

				start++;

			} else {

				end--;

			}
		}
	}

}
