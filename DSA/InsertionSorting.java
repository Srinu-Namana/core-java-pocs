package com.DSA;

import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) {

		int[] arr = { 5, 7, 9, 0, 2, 21,-1, 76, 9,-54 };

		for (int i = 1; i < arr.length; i++) {

			int temp = arr[i];

			int j = i;

			while (j > 0 && arr[j - 1] > temp) {

				arr[j] = arr[j - 1];

				j = j - 1;

			}

			arr[j] = temp;

		}

		System.out.println(Arrays.toString(arr));

	}

}
