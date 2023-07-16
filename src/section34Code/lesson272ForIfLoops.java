package section34Code;

import java.text.MessageFormat;

public class lesson272ForIfLoops {

	public static void main(String[] args) {

		if (5 > 2) {
			System.out.println(MessageFormat.format("Successful", "run"));
			System.out.println("second step");
		} else
			System.out.println("fail");

		for (int i = 0; i < 10; i = i + 3) {
			if (i == 9)
				System.out.println("9 is displayed");
			else
				System.out.println("I did not find");
		}
	}
}
