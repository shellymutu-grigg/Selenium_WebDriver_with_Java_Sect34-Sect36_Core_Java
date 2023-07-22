package section34Code;

import java.text.MessageFormat;

public class Lesson286Arrays {

	public static void main(String[] args) {

		// An array is an object construct that allows storage of multiple objects of
		// the same data type
		int[] a = new int[5];

		int[] b = new int[5];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;

		int[] c = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(MessageFormat.format("int[] a object at index {0}: {1}", i, a[i]));
			System.out.println(MessageFormat.format("int[] b object at index {0}: {1}", i, b[i]));
			System.out.println(MessageFormat.format("int[] c object at index {0}: {1}", i, c[i]));
		}
	}

}
