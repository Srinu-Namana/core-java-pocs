package com.DSA;

//Introduction
//Sliding Window is a technique used to solve problems on arrays or strings.
//It is a form of the Two Pointers Technique.
//We create a window(a small part of the array/string)and move it step-by-step.
//This window can be:
//Fixed Size:The window size remains constant.
//Variable Size:The window size can expand or contract based on conditions.
//It helps reduce time complexity from O(n²)to O(n)in many problems.
//Sliding Window Technique is also used in real-world projects.
//For example,if you want to calculate how many users visited your 
//website in the last 3 days or the last 24 hours,you can keep a moving window of data 
//and update the count as the window shifts.
//This helps you get real-time analytics without recalculating everything again.
public class SlidingWindow {

	public static void main(String[] args) {

		System.out.println("main method started!!");

		int users[] = { 50, 70, 120, 200, 320, 40, 50, 60 };

		int days = 3;

		int windowSum = 0;

		int avg;

		for (int i = 0; i < days; i++) {

			windowSum += users[i];
		}

		avg = windowSum / days;

		System.out.println("First 3 days windowsSum" + " " + windowSum + " & " + "average" + " " + avg);

		for (int i = 1; i < users.length - days; i++) {

			windowSum += -users[i - 1] + users[i + days - 1];

			avg = windowSum / days;

			System.out.println("windowsSum" + " " + windowSum + " " + "average" + " " + avg);

		}
	}

}
