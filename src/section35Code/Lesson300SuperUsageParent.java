package section35Code;

import java.text.MessageFormat;

public class Lesson300SuperUsageParent {

	String name = "Parent";

	public Lesson300SuperUsageParent() {
		System.out.println(MessageFormat.format("Constructor called from {0} class", name));
	}

	public void getData() {
		System.out.println(MessageFormat.format("Accessing method from {0} class", name));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
