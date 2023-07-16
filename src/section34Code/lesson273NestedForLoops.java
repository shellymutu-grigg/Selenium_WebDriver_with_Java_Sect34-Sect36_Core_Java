package section34Code;

import java.text.MessageFormat;

public class lesson273NestedForLoops {

	public static void main(String[] args) {

		int count = 0;
		// Outer loop will run 4 times
		for (int i = 0; i < 4; i++) {
			System.out.println(MessageFormat.format("Outer loop i {0}", i));

			// Inner loop will run 4 times
			for (int j = 0; j < 4; j++) {
				System.out.println(MessageFormat.format("Inner loop j {0}", j));
				count++;
			}
		}
		System.out.println(MessageFormat.format("Times run: {0}", count));
	}
}
