package section34Code;

import java.text.MessageFormat;

public class Lesson285OverrideChild extends Lesson281InheritanceParent {

	public static void main(String[] args) {
		Lesson285OverrideChild lesson285 = new Lesson285OverrideChild();
		lesson285.audioSystem();
	}

	public void engine() {
		System.out.println(MessageFormat.format("Child implementation of:s {0} ", "engine()"));

	}

	// Colour variable is inherited from parent class
	public void colour() {
		System.out.println(MessageFormat.format("Child implementation of colour: {0} ", colour));

	}

	// audioSystem() method in parent class is overridden in child class
	public void audioSystem() {
		System.out.println(MessageFormat.format("Child implementation of: {0} ", "audioSystem()"));
	}

}
