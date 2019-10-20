package shervington_p1;

import java.util.Scanner;
import java.lang.Math;

public class Decrypt {

	public static void main(String[] args) {
		// System.out.println ("Hello, World!");

		int num1;
		int num2;
		int num3;
		int num4;
		int temp;
		int numInput; // Input to be decrypted

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter number to be decrypted: ");
		numInput = scnr.nextInt();

		// STORE EACH DIGIT
		num4 = numInput % 10;
		num3 = (numInput % 100) / 10;
		num2 = (numInput % 1000) / 100;
		num1 = numInput / 1000;

		// REVERSE ENCRYPTION

		// SWAP FOURTH DIGIT WITH THE SECOND
		temp = num4;
		num4 = num2;
		num2 = temp;

		// SWAP THE THIRD DIGIT WITH THE FIRST DIGIT
		temp = num3;
		num3 = num1;
		num1 = temp;

		/*
		 * System.out.println("num4 is: " + num4); System.out.println("num3 is: " +
		 * num3); System.out.println("num2 is: " + num2); System.out.println("num1 is: "
		 * + num1);
		 */

		// REVERSE DIGIT MODIFICATION
		num4 = ((num4 + 10) - 7) % 10;
		num3 = ((num3 + 10) - 7) % 10;
		num2 = ((num2 + 10) - 7) % 10;
		num1 = ((num1 + 10) - 7) % 10;

		// PRINT THE DECRYPTED NUMBER
		System.out.println("Decrypted integer: " + num1 + num2 + num3 + num4);

		/*
		 * System.out.println("num4 is: " + num4); System.out.println("num3 is: " +
		 * num3); System.out.println("num2 is: " + num2); System.out.println("num1 is: "
		 * + num1);
		 */
		scnr.close();

	}

}
