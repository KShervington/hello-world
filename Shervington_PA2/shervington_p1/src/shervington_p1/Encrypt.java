package shervington_p1;

import java.util.Scanner;
import java.lang.Math;

public class Encrypt {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int numInput; // User input to be encrypted

		// STORAGE VARIABLES
		int num1;
		int num2;
		int num3;
		int num4;
		int temp;

		// TAKE INPUT FROM THE USER
		System.out.println("Enter a four digit number:");
		numInput = scnr.nextInt();

		/*
		 * REPLACE EACH DIGIT WITH THE RESULT OF ADDING 7 TO THE DIGIT AND GETTING THE
		 * REMAINDER AFTER DIVIDING THE NEW VALUE BY 10
		 */

		// STORE EACH DIGIT FROM INPUT
		num4 = numInput % 10;
		num3 = (numInput % 100) / 10;
		num2 = (numInput % 1000) / 100;
		num1 = numInput / 1000;

		// MODIFY EACH DIGIT
		num4 = (num4 + 7) % 10;
		num3 = (num3 + 7) % 10;
		num2 = (num2 + 7) % 10;
		num1 = (num1 + 7) % 10;

		/*
		 * OUTPUTS FOR TESTING PURPOSES System.out.println ("num4 is: " + num4);
		 * System.out.println ("num3 is: " + num3); System.out.println ("num2 is: " +
		 * num2); System.out.println ("num1 is: " + num1);
		 */

		// SWAP THE FIRST DIGIT WITH THE THIRD
		temp = num1;
		num1 = num3;
		num3 = temp;

		// SWAP THE SECOND DIGIT WITH THE FOURTH
		temp = num2;
		num2 = num4;
		num4 = temp;

		// PRINT THE ENCRYPTED INTEGER
		System.out.println("Encrypted integer: " + num1 + num2 + num3 + num4);

		scnr.close();

	}

}
