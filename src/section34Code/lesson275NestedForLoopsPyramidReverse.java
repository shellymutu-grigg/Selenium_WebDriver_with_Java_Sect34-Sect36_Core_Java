package section34Code;

import java.text.MessageFormat;

public class Lesson275NestedForLoopsPyramidReverse {

	public static void main(String[] args) {

		// First implementation
		int counter = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(MessageFormat.format("{0} ", counter));
				counter++;
			}
			System.out.println();
		}

	}
}
