package com.jtraining.assign3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("C:\\Users\\harsh\\Desktop\\allemployees.csv"));

		String[] str = null;
		int i;
		String store;

		Employee workers[] = new Employee[11];
		
		while (scanner.hasNext()) {

			for (i = 0; i < 11; i++) {
				store = scanner.nextLine();
				str = store.split(",");

				if ((str.length == 6) && (str[4].equals("FALSE") || str[4].equals("TRUE"))) {
					workers[i] = new StudentEmployee(str[0], str[1], str[2], str[3], str[4], str[5]);
					System.out.println(workers[i].toString());
				}
				if ((str.length == 6)
						&& (str[5].equals("Computer Science") || str[5].equals("Math") || str[5].equals("English"))) {
					workers[i] = new Faculty(str[0], str[1], str[2], str[3], str[4], str[5]);
					System.out.println(workers[i].toString());
				}
				if (str.length == 5) {
					workers[i] = new ClassifiedStaff(str[0], str[1], str[2], str[3], str[4]);
					System.out.println(workers[i].toString());

				}

			}

		}

		System.out.println("");
		System.out.println("Pay for two-week pay period");
		System.out.println("===========================");

		for (i = 0; i < 11; i++) {
			if(workers[i].getPay() != 0){
				System.out.println(workers[i].getEmployeeName() + "\t" + workers[i].getPay());
			}
			
		}

	}

}