package section35Code;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lesson294DateClass {

	public static void main(String[] args) {

		// Working with dates via the Date class
		Date date = new Date();

		// Print out current date time
		System.out.println(MessageFormat.format("Current date is: {0}", date.toString()));

		// Print date in specific format
		SimpleDateFormat newDateFormat = new SimpleDateFormat("dd MM yyyy");
		System.out.println(MessageFormat.format("Current date in specific format is: {0}", newDateFormat.format(date)));

		// Print date in specific format
		SimpleDateFormat otherDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		System.out.println(
				MessageFormat.format("Current date in other specific format is: {0}", otherDateFormat.format(date)));
	}

}
