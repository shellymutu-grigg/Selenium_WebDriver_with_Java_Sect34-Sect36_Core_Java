package section34Code;

import java.text.MessageFormat;

public class lesson271DoWhileLoops {

	public static void main(String[] args) {

		// Initialize variable
		int i = 20;

		// A do while loop will always guarantee one execution
		do {
			System.out.println(MessageFormat.format("i is {0}", i));

			// Ensure to decrement rather than increment
			i--;

		} while (i > 0);
	}
}
