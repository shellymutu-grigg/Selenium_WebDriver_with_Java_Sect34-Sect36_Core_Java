package section35Code;

import java.text.MessageFormat;

public class Lesson308Exceptions {

	int a = 4;
	static int b = 7;
	static int c = 0;
	int error;

	public void getData() {
		System.out.println(MessageFormat.format("Value of variable 'error': ", error));
	}

	public static void main(String[] args) {

		Lesson308Exceptions lesson308 = new Lesson308Exceptions();

		// Catch errors using try/catch
		try {

			int error = b / c;

			// Triggers ArithmeticException
			lesson308.getData();

		} catch (Exception e) {
			System.out.println(
					MessageFormat.format("Exception of type: {0}, with error: {1}", e.toString(), e.getMessage()));
		}
	}

}
