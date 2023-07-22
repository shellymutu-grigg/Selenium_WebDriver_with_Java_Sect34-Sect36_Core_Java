package section35Code;

import java.text.MessageFormat;

public class Lesson299Child extends Lesson299Parent {

	// Will always give preference to the local class
	String name = "Child string";

	public void getStringData() {
		System.out.println(MessageFormat.format("String name value is: {0}", name));

		// Use the super key word to access parent class variable
		System.out.println(MessageFormat.format("String name value is: {0}", super.name));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lesson299Child lesson299Child = new Lesson299Child();
		lesson299Child.getStringData();
	}

}
