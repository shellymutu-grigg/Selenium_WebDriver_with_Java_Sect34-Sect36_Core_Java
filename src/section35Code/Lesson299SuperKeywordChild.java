package section35Code;

import java.text.MessageFormat;

public class Lesson299SuperKeywordChild extends Lesson299SuperKeywordParent {

	// Will always give preference to the local class
	String name = "Child string";

	public void getStringData() {
		System.out.println(MessageFormat.format("String name value is: {0}", name));

		// Use the super key word to access parent class variable
		System.out.println(MessageFormat.format("String name value is: {0}", super.name));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lesson299SuperKeywordChild lesson299SuperKeywordChild = new Lesson299SuperKeywordChild();
		lesson299SuperKeywordChild.getStringData();
	}

}
