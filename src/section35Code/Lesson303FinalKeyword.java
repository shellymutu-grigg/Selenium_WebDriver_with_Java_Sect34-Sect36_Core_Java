package section35Code;

// If a class is marked as final the class cannot be extended - cannot have children classes
public final class Lesson303FinalKeyword {

	// A final method cannot be overridden in children instances.
	final void getData() {

	}

	public static void main(String[] args) {

		// Variable can not be changed when marked as final
		final int i = 4;
	}

}
