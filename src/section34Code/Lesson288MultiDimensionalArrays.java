package section34Code;

import java.text.MessageFormat;

public class Lesson288MultiDimensionalArrays {

	public static void main(String[] args) {

		// An multiple dimensional array is an object construct that allows storage of
		// multiple objects of the same data type
		int[][] a = new int[3][3];

		// [0,0] [0,1] [0,2]
		// [1,0] [1,1] [1,2]
		// [2,0] [2,1] [2,2]

		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		a[2][0] = 70;
		a[2][1] = 80;
		a[2][2] = 90;

		int[][] b = { { 100, 110, 120 }, { 130, 140, 150 }, { 160, 170, 180 } };

		// [0,0] [0,1] [0,2]
		// [1,0] [1,1] [1,2]
		// [2,0] [2,1] [2,2]

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(MessageFormat.format("int[][] a object at index a[{0}][{1}]: {2}", i, j, a[i][j]));
				System.out.println(MessageFormat.format("int[][] b object at index b[{0}][{1}]: {2}", i, j, b[i][j]));
			}
		}
	}

}
