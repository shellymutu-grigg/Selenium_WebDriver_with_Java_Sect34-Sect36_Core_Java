package section35Code;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lesson295CalendarClass {

	public static void main(String[] args) {

		// Working with dates via Calendar class
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		int monthDay = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(MessageFormat.format("Current date is: {0} and day of month is: {1}",
				dateFormat.format(calendar.getTime()), monthDay));

		int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println(MessageFormat.format("Day of week in month is: {0}", dayOfWeekInMonth));

		int amPM = calendar.get(Calendar.AM_PM);
		System.out.println(MessageFormat.format("AM (0) or PM (1) is: {0}", amPM));

	}

}
