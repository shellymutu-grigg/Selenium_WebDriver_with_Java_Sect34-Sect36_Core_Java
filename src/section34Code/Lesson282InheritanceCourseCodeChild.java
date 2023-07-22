package section34Code;

public class Lesson282InheritanceCourseCodeChild extends Lesson282InheritanceCourseCodeParent {

	String name = "QAClickAcademy";

	public Lesson282InheritanceCourseCodeChild() {
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

	public static void main(String[] args) {
		Lesson282InheritanceCourseCodeChild cd = new Lesson282InheritanceCourseCodeChild();

		cd.getStringdata();
		cd.getData();

	}

}