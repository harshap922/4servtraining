package com.jtraining.assign1;

import java.util.Scanner;

public class Pay {
	public static void main (String args []) {
	
		double hoursWorked;
		double hourlyPayRate;
		double grossPay;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many hours did you work?");
		hoursWorked=sc.nextDouble();
		System.out.println("How much do you get per hour?");
		hourlyPayRate =sc.nextDouble();
		
		if(hoursWorked<=40) {
			grossPay=hoursWorked*hourlyPayRate;
		}
		else {
			grossPay=1.5*hoursWorked*hourlyPayRate;
		}
		
		System.out.println("You've earned$"+grossPay);
		
		double taxes = 0.33*grossPay;
		double netPay = grossPay-taxes;
		
		System.out.println("Taxes are $"+taxes);
		System.out.println("Your net pay $"+netPay);
		
		sc.close();
		
		
	}

}
