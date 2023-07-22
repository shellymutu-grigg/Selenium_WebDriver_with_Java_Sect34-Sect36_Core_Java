package section35Code;

import java.text.MessageFormat;

public class Lesson296Constructors {

	// Constructor should be defined initially
	// Must have the class name

	// If a constructor for a class is not explicitly defined for a class then the
	// java compiler will call the implicit constructor for the class upon
	// instantiation.

	public Lesson296Constructors() {
		System.out
				.println(MessageFormat.format("Have triggered Lesson296Constructors constructor {0}", "successfully"));
	}

	public void getData() {
		System.out.println(MessageFormat.format("Triggered {0} method", "getData()"));
	}

	public static void main(String[] args) {
		Lesson296Constructors lesson296Constructors = new Lesson296Constructors();
	}

}
