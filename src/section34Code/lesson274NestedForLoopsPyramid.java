package section34Code;

import java.text.MessageFormat;

public class lesson274NestedForLoopsPyramid {

	public static void main(String[] args) {

		int count = 1;
		// 1st loop will run 4 times
		do {
			System.out.print(MessageFormat.format("{0} ", count));
			count++;
		} while (count < 5);
		System.out.println();

		// 2nd loop will run 3 times
		while (count < 8) {
			System.out.print(MessageFormat.format("{0} ", count));
			count++;
		}
		System.out.println();

		// 3nd loop will run 2 times
		for (int i = count; i < 10; i++) {
			System.out.print(MessageFormat.format("{0} ", count));
			count++;
		}
		System.out.println();
		System.out.println(MessageFormat.format("{0} ", count));

		// Second implementation
		int counter = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(MessageFormat.format("{0} ", counter));
				counter++;
			}
			System.out.println();
		}

	}
}
