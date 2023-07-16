package section34Code;

import java.text.MessageFormat;

public class lesson270WhileLoops {

	public static void main(String[] args) {

		// Initialize variable
		int i = 10;

		while (i < 10) {
			System.out.println(MessageFormat.format("i is {0}", i));

			// Ensure to decrement rather than increment
			i--;
		}

	}

}
