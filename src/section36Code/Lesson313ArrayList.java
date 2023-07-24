package section36Code;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Lesson313ArrayList {

	public static void main(String[] args) {

		// ArrayList is a dynamic storage facility that is easier to manipulate than an
		// Array
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Object_01");
		arrayList.add("Object_02");
		System.out.println(MessageFormat.format("arrayList value: {0}", arrayList));
		arrayList.add(1, "Object_05");
		System.out.println(MessageFormat.format("arrayList value: {0}", arrayList));
		arrayList.remove(1);
		System.out.println(MessageFormat.format("arrayList value: {0}", arrayList));
		arrayList.add("Object_02");
		arrayList.add("Object_02");
		System.out.println(MessageFormat.format("arrayList value: {0}", arrayList));
		System.out.println(MessageFormat.format("arrayList value at 4 {0}", arrayList.get(1)));
		System.out.println(
				MessageFormat.format("Does arrayList contain 'Object_05': {0}", arrayList.contains("Object_05")));
		System.out.println(MessageFormat.format("arrayList index of 'Object_01': {0}", arrayList.indexOf("Object_01")));
	}

}
