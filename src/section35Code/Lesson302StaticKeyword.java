package section35Code;

import java.text.MessageFormat;

public class Lesson302StaticKeyword {

	// Example for census report
	// Instance variables
	String name;
	String address;

	// Static variables are shared between all instances of the class
	static String city;
	static int i;

	// Static block
	static {
		city = "Santa Marta";
		i = 0;
	}

	Lesson302StaticKeyword(String name, String address) {
		this.name = name;
		this.address = address;
		this.city = city;

		// This will increment every time a new instance is created
		i++;
		System.out.println(MessageFormat.format("Value of i: {0}", i));

	}

	public String getAddress() {
		return address + ", " + city;
	}

	// Static
	public static void getCity() {
		System.out.println(MessageFormat.format("Value of city variable: {0}", city));
	}

	public static void main(String[] args) {

		Lesson302StaticKeyword lesson302_01 = new Lesson302StaticKeyword("Gerardo", "Carrera 3 #9-45, El Rodadero");
		Lesson302StaticKeyword lesson302_02 = new Lesson302StaticKeyword("Shelly", "Carrera 2 #10-23 El Rodadero");
		System.out.println(MessageFormat.format("Address of Person 01: {0}", lesson302_01.getAddress()));
		System.out.println(MessageFormat.format("Address of Person 02: {0}", lesson302_02.getAddress()));
		Lesson302StaticKeyword.getCity();
		lesson302_01.getCity();
	}

}
