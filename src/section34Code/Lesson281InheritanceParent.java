package section34Code;

import java.text.MessageFormat;

public class Lesson281InheritanceParent {

	String colour = "red";

	public static void main(String[] args) {

	}

	public void gear() {
		System.out.println(MessageFormat.format("Implementation of: {0} ", "gear()"));
	}

	public void brakes() {
		System.out.println(MessageFormat.format("Implementation of: {0} ", "brakes()"));
	}

	public void audioSystem() {
		System.out.println(MessageFormat.format("Implementation of: {0} ", "audioSystem()"));
	}

}
