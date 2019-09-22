package shervington_p3;

import java.util.Scanner;

public class survey {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int rating;
		int temp;
		int max = 0;
		int min = 0;
		// LOOPING VARIABLES
		int i;
		int o;
		int t;
		boolean quit = false;
		// double[] rowAvg = new double[5];

		// CREATE AN ARRAY OF TOPICS
		String[] topicArray = new String[] { "SEA TURTLES", "SELF-DRIVING VEHICLES", "BURGERS", "ORAGAMI",
				"PRESIDENT TRUMP" };

		double[] rowAvg = new double[topicArray.length];

		int[] rowTotal = new int[topicArray.length];

		int[][] ratingArray = new int[topicArray.length][10];

		// ratingArray [0][0] = 1;

		while (quit == false) {
			// LOOP THROUGH TO RATE EACH TOPIC
			for (o = 0; o < topicArray.length; o++) {
				System.out.printf("Rate %s: \n", topicArray[o]);

				// PRINT NUMBER 1 COLUMN
				System.out.printf("%25d", 1);

				// PRINT COLUMN NUMBERS 2-10
				for (i = 0; i < 9; i++) {
					System.out.printf("%10d", i + 2);
				}

				System.out.println("");

				// PRINT ROWS
				/*
				 * for (i = 0; i < topicArray.length; i++) { System.out.printf("%-10s\n",
				 * topicArray[i]); }
				 */
				// REFERRED TO OLD CODE OF MINE TO REMEMBER HOW TO DO THIS
				int row;
				int col;
				for (row = 0; row < topicArray.length; row++) {
					System.out.printf("%-24s", topicArray[row]);
					for (col = 0; col < 10; col++) {
						System.out.printf("%-10d", ratingArray[row][col]);

					}

					System.out.print("" + rowAvg[row]);
					System.out.println("");
				}

				// rowAvg[o] = 0;

				System.out.printf("\n\t\t\t\t\t\t%s\n", "*Type a negative number at any time to quit*");

				// GET RATING
				rating = scnr.nextInt();

				// SKIPS CURRENT TOPIC WHEN ZERO ENTERED
				if (rating == 0) {
					continue;
				}

				// ONLY READS LAST DIGIT ENTERED WHEN INPUT IS ABOVE 10
				if (rating > 10) {
					rating = rating % 10;
				}

				// RATING EVALUATION
				if (rating < 0) {
					quit = true;
					break;
				}

				// POPULATING RATINGARRAY'S INDEXES
				ratingArray[o][rating - 1] += 1;

				temp = 0;
				int cLp;
				// LOOPING THROUGH A ROW'S COLUMN TO GET TOTAL
				for (cLp = 0; cLp < 10; cLp++) {
					if (ratingArray[o][cLp] > 0) {
						temp += (cLp + 1) * ratingArray[o][cLp];
					}
					// temp += ratingArray[o][cLp];
					rowAvg[o] = temp / 10.0;
					// rowTotal[o] = temp;
				}

			}
		}

		// temp = 0;
		for (o = 0; o < topicArray.length; o++) {
			temp = 0;
			for (int cLp2 = 0; cLp2 < 10; cLp2++) {
				if (ratingArray[o][cLp2] > 0) {
					temp += (cLp2 + 1) * ratingArray[o][cLp2];
				}
				// temp += ratingArray[o][cLp];
				// rowAvg[o] = temp / 10.0;
				rowTotal[o] = temp;
			}
		}

		for (t = 0; t < topicArray.length; t++) {
			// max = rowTotal[t];
			if (rowTotal[t] > max) {
				max = rowTotal[t];
			} else {
				continue;
			}
		}
		for (t = 0; t < topicArray.length; t++) {
			if (rowTotal[t] == max) {
				System.out.printf("%s has the highest point total at %d points!\n", topicArray[t], max);

			} else {
				continue;
			}
		}

		min = max;
		for (t = 0; t < topicArray.length; t++) {
			// min = rowTotal[t];
			if (rowTotal[t] < min) {
				min = rowTotal[t];
			}
		}
		for (t = 0; t < topicArray.length; t++) {
			if (rowTotal[t] == min) {
				System.out.printf("%s has the lowest point total at %d points!\n", topicArray[t], min);

			}
		}
		// System.out.println ("" + max);
		scnr.close();
	}

}
