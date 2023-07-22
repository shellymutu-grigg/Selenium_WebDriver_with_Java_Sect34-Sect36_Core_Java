package section35Code;

import java.text.MessageFormat;

public class Lesson300SuperUsageChild extends Lesson300SuperUsageParent {

	// Will always give preference to the local class
	String name = "Child";

	public Lesson300SuperUsageChild() {
		// When super constructor used in child class super(); must be first line
		super();

		System.out.println(MessageFormat.format("Constructor called from {0} class", name));

	}

	// This will override the parent implementation of the method as the local
	// instance is given priority
	public void getData() {
		System.out.println(MessageFormat.format("Accessing method from {0} class", name));

		// To access parent of method
		super.getData();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lesson300SuperUsageChild lesson300SuperUsageChild = new Lesson300SuperUsageChild();
		lesson300SuperUsageChild.getData();

	}

}
