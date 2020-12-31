package com.jtraining.assign1;

public class CelsiusToF {

	public static void main(String[] args) {
		final double CELS = 37;
		double FAHR;

		// calculate Fahrenheit temp using formula
		FAHR = (9 / 5) * CELS + 32;
		// display intro message

		System.out.println("This program converts Celsius to Fahrenheit");
		// display the result

		System.out.println("Celsius Temp = " + CELS);
		System.out.println("Fahrenheit Temp = " + FAHR);

		// display end message
		System.out.println("End of program");
		
	}

}
