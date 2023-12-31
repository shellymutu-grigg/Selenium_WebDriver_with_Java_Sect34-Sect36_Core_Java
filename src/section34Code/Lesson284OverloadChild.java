package section34Code;

public class Lesson284OverloadChild extends Lesson282InheritanceCourseCodeParent {

	String name = "QAClickAcademy";

	public Lesson284OverloadChild() {
		super();// this should be always be at first line
		System.out.println("child class construtor");

	}

	public void getStringdata() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
		super.getData();
		System.out.println("I am in child class");
	}

	// Lesson 284: Functionally overloaded method
	public void getData(int a) {
		System.out.println("I am in child class - getData() method 01: " + a);
	}

	// Lesson 284: Functionally overloaded method
	public void getData(String a) {
		System.out.println("I am in child class - getData() method 01 overload 01: " + a);
	}

	// Lesson 284: Functionally overloaded method
	public void getData(int a, int b) {
		System.out.println("I am in child class - getData() method 01 overload 02: " + a + ", " + b);
	}

	public static void main(String[] args) {
		Lesson284OverloadChild cd = new Lesson284OverloadChild();

		cd.getData(10);
		cd.getData("ten");
		cd.getData(11, 12);

	}

}