package section34Code;

import java.text.MessageFormat;

public class Lesson280ChildAbstractClass extends Lesson280AbstractClass {

	public static void main(String[] args) {
		Lesson280ChildAbstractClass lesson280 = new Lesson280ChildAbstractClass();
		lesson280.engine();
		lesson280.safetyGuidelines();
		lesson280.bodyColor();
	}

	@Override
	public void bodyColor() {
		System.out.println(MessageFormat.format("Implementation of {0} ", "bodyColor()"));

	}
}
