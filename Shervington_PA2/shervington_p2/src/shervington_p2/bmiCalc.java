package shervington_p2;

import java.util.Scanner;
import java.lang.Math;

public class bmiCalc {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int weightPound;
		int weightKilo;
		int heightInch;
		int heightFeet;
		double heightMeter;
		// INITIALIZED TO ZERO TO AVOID ERROR LATER ON
		double bmiStand = 0;
		double bmiMetric = 0;
		// INITIALIZED TO ZERO IN ORDER TO ENTER THE LOOP
		int choice = 0;

		// LOOP UNTIL VALID INPUT IS RECOGNIZED
		while (choice != 1 && choice != 2) {
			System.out.printf("Which units would you like to use? 1 or 2"
					+ "\n\t1. Pounds (lbs) & Inches (in.)\n\t2. Kilograms (kg) & Centimeters (cm)\n");

			choice = scnr.nextInt();

			switch (choice) {
			case 1:
				System.out.printf("Enter weight (Pounds):\n");
				weightPound = scnr.nextInt();
				System.out.printf("Enter height in feet and inches separated by a space:\n");
				heightFeet = scnr.nextInt();
				heightInch = scnr.nextInt();

				// CONVERT FEET TO INCHES THEN GET TOTAL INCHES
				heightFeet *= 12;
				heightInch = heightInch + heightFeet;

				bmiStand = (703 * weightPound) / Math.pow(heightInch, 2);

				System.out.printf("Your BMI is %.1f\n", bmiStand);

				break;

			case 2:
				System.out.printf("Enter weight (Kilograms):\n");
				weightKilo = scnr.nextInt();
				System.out.printf("Enter height (Centimeters):\n");
				heightMeter = scnr.nextInt();
				heightMeter /= 100.0; // CONVERT CENTIMETERS TO METERS

				bmiMetric = weightKilo / Math.pow(heightMeter, 2.0);

				System.out.printf("Your BMI is %.1f\n", bmiMetric);

				break;

			}
		}

		// WAS GETTING A "NOT INITIALIZED" ERROR SO I MADE THIS VARIABLE TO AVOID IT
		double bmi = bmiMetric + bmiStand;

		if (bmi < 0) {
			System.out.println("INVALID BMI");
		} else if (bmi <= 18.5) {
			System.out.println("Underweight");
		} else if (bmi < 25) {
			System.out.println("Normal Weight");
		} else if (bmi < 30) {
			System.out.println("Overweight");
		} else if (bmi >= 30) {
			System.out.println("Obesity");
		}

		System.out.println("\nBMI Categories:");
		System.out.println("Underweight =< 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");

		scnr.close();

	}

}
