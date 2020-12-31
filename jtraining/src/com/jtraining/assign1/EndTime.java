package com.jtraining.assign1;

import java.util.Scanner;

public class EndTime {

	public static void main(String[] args) {

		int startingtimehour;
		int startingtimemin;
		int duration;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the starting time(in hours and minutes):");
		startingtimehour = keyboard.nextInt();
		if (startingtimehour > 23 || startingtimehour < 0) {
			System.out.println("Entered hours not between 0 and 23");
			System.exit(0);
		}
			startingtimemin = keyboard.nextInt();
			
		if (startingtimemin > 59 || startingtimemin <0) {
			System.out.println("Entered minutes not between 0 and 59");
			System.exit(0);
		}
		System.out.println("Enter the duration (in minutes):");
		duration = keyboard.nextInt();

		int endingtime = 60 * (startingtimehour) + startingtimemin + duration;
		int endinghour = endingtime / 60;
		int endingmin = endingtime % 60;

		System.out.println("Ending hour is:" + endinghour);
		System.out.println("Ending min is:" + endingmin);

		keyboard.close();
	}

}
