package section34Code;

import java.text.MessageFormat;

public class Lesson270WhileLoops {

	public static void main(String[] args) {

		// Initialize variable
		int i = 10;

		// A while loop will NOT always guarantee one execution
		while (i > 0) {
			System.out.println(MessageFormat.format("i is {0}", i));

			// Ensure to decrement rather than increment
			i--;
		}

	}

}
