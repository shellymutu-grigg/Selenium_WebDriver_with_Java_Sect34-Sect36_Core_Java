package section34Code;

import java.text.MessageFormat;

public class Lesson281InheritanceChild extends Lesson281InheritanceParent {

	public static void main(String[] args) {
		Lesson281InheritanceChild lesson281 = new Lesson281InheritanceChild();
		lesson281.colour();
		lesson281.brakes();
	}

	public void engine() {
		System.out.println(MessageFormat.format("Implementation of:s {0} ", "engine()"));

	}

	// Colour variable is inherited from parent class
	public void colour() {
		System.out.println(MessageFormat.format("Implementation of colour: {0} ", colour));

	}

}
