package section35Code;

import java.text.MessageFormat;

public class Lesson309ExceptionsMultipleCatches {

	int a = 4;
	static int b = 7;
	static int c = 0;
	int error;

	public void getData() {
		System.out.println(MessageFormat.format("Value of variable 'error': ", error));
	}

	public static void main(String[] args) {

		Lesson309ExceptionsMultipleCatches lesson308 = new Lesson309ExceptionsMultipleCatches();

		// Catch errors using try/catch
		try {

			int array[] = new int[4];

			// Triggers IndexOutOfBoundsException
			System.out.println(MessageFormat.format("array[7] value: {0},", array[7]));

			int error = b / c;

			// Triggers ArithmeticException
			lesson308.getData();

		} catch (ArithmeticException e) {
			System.out.println(MessageFormat.format("ArithmeticException of type: {0}, with error: {1}", e.toString(),
					e.getMessage()));
		} catch (IndexOutOfBoundsException e) {
			System.out.println(MessageFormat.format("IndexOutOfBoundsException of type: {0}, with error: {1}",
					e.toString(), e.getMessage()));
		} catch (Exception e) {
			System.out.println(
					MessageFormat.format("Exception of type: {0}, with error: {1}", e.toString(), e.getMessage()));
		}
	}

}
