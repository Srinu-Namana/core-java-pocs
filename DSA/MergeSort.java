package com.DSA;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 6, 5, 4, 3 };

		divide(arr);

		System.out.println("After Sorting: " + Arrays.toString(arr));

	}

	static void divide(int[] arr) {

		if (arr.length <= 1) {
			return;
		}

		int[] left = new int[arr.length / 2];

		int[] right = new int[arr.length - left.length];

		int i;

		// copying elements of given array to left array
		for (i = 0; i < left.length; i++) {

			left[i] = arr[i];

		}
		// copying elements of given array to right array
		for (int j = 0; j < right.length; j++) {

			right[j] = arr[i++];
		}

		divide(left);

		System.out.println("left values:" + Arrays.toString(left));

		divide(right);

		System.out.println("right values :" + Arrays.toString(right));

		merge(arr, left, right);
	}

	static void merge(int[] arr, int[] left, int[] right) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left.length && j < right.length) {

			if (left[i] < right[j]) {

				arr[k++] = left[i++];

			} else {

				arr[k++] = right[j++];
			}

		}

		while (i < left.length) {

			arr[k++] = left[i++];

		}
		while (j < right.length) {

			arr[k++] = right[j++];

		}

	}

}
