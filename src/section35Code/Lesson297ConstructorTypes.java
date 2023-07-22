package section35Code;

import java.text.MessageFormat;

public class Lesson297ConstructorTypes {

	// Constructor should be defined initially
	// Must have the class name

	// If a constructor for a class is not explicitly defined for a class then the
	// java compiler will call the implicit constructor for the class upon
	// instantiation.

	public Lesson297ConstructorTypes() {
		System.out.println(
				MessageFormat.format("Have triggered Lesson297ConstructorType constructor {0}", "successfully"));
	}

	public Lesson297ConstructorTypes(String string) {
		System.out.println(
				MessageFormat.format("Have triggered Lesson297ConstructorType paramatrised constructor {0}", string));
	}

	// Constructor instantiation will look for the correct method signature to
	// create
	public Lesson297ConstructorTypes(int a, int b) {
		System.out.println(MessageFormat
				.format("Have triggered Lesson297ConstructorType paramatrised constructor {0}, {1}", a, b));
	}

	public void getData() {
		System.out.println(MessageFormat.format("Triggered {0} method", "getData()"));
	}

	public static void main(String[] args) {
		Lesson297ConstructorTypes lesson297ConstructorType01 = new Lesson297ConstructorTypes();
		Lesson297ConstructorTypes lesson297ConstructorType02 = new Lesson297ConstructorTypes("Lesson297");
		Lesson297ConstructorTypes lesson297ConstructorType03 = new Lesson297ConstructorTypes(4, 5);
	}

}
