package com.DSA;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {

		System.out.println("main method started!!");

		int[] arr = { 90, 8, 2, 7, 4, 1 };

		System.out.println("Before Selection Sorting" );
		
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {

					minIndex = j;

				}

				int temp = arr[i];

				arr[i] = arr[minIndex];

				arr[minIndex] = temp;

			}

		}
		System.out.println("After Selection Sorting");

		System.out.println(Arrays.toString(arr));
	}

}
