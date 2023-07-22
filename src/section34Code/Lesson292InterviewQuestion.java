package section34Code;

import java.text.MessageFormat;

public class Lesson292InterviewQuestion {

	public static void main(String[] args) {

		// After identifying the lowest number in a multi-dimensional array,
		// find the largest number in the same column
		int lowestNumber;
		int maxNumber;
		int column = 0;

		int[][] a = { { 2, 4, 5 }, { 3, 0, 7 }, { 1, 2, 9 } };

		lowestNumber = a[0][0];

		// Find the lowest number in the array
		// i gives the column
		for (int i = 0; i < a.length; i++) {

			// j gives the row
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < lowestNumber) {
					lowestNumber = a[i][j];
					column = i;
				}
			}
		}

		// Initialise the maxNumber variable
		maxNumber = a[0][column];

		// Find the max number in the same row as smallest number
		for (int i = 0; i < a.length; i++) {
			if (a[i][column] > maxNumber) {
				maxNumber = a[i][column];
			}
		}
		System.out.println(
				MessageFormat.format("The minimum number in the multi dimensional array is: {0} ", lowestNumber));
		System.out.println(MessageFormat.format("The maximum number in the same column as the minimum number is: {0} ",
				maxNumber));
	}
}
