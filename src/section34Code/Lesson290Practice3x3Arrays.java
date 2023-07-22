package section34Code;

import java.text.MessageFormat;

public class Lesson290Practice3x3Arrays {

	public static void main(String[] args) {

		int lowestNumber;

		int[][] a = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };

		lowestNumber = a[0][0];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < lowestNumber) {
					lowestNumber = a[i][j];
				}
			}
		}
		System.out.println(
				MessageFormat.format("The minimum number in the multi dimensional array is: {0} ", lowestNumber));
	}
}
