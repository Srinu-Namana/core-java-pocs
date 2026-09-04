package com.DSA;

import java.util.Arrays;

public class BubbleSortingArranging {

	public static void main(String[] args) {

		int[] arr = { 90, 20, 71, 2, 0, 45 };

		int temp;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					temp = arr[j];

					arr[j] = arr[j + 1];

					arr[j + 1] = temp;

				}

			}

		}
		System.out.print(Arrays.toString(arr));
	}

}
