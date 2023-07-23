package section35Code;

import java.text.MessageFormat;

public class Lesson301ThisUsage {

	int a = 2;

	public void getData() {
		int a = 3;
		System.out.println(MessageFormat.format("Value in local variable 'a' for getData() method: {0}", a));

		// This keyword will give you access to global variable
		System.out.println(MessageFormat.format("Value in global variable 'a' for getData() method: {0}", this.a));
	}

	public static void main(String[] args) {

		Lesson301ThisUsage lesson301 = new Lesson301ThisUsage();
		lesson301.getData();

	}

}
