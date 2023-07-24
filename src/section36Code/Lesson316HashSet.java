package section36Code;

import java.text.MessageFormat;
import java.util.HashSet;

public class Lesson316HashSet {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Colombia");
		hashSet.add("Aotearoa");
		hashSet.add("Colombia");
		hashSet.add("USA");
		System.out.println(MessageFormat.format("hashSet value: {0}", hashSet));
		hashSet.remove("Aotearoa");
		System.out.println(MessageFormat.format("hashSet value: {0}", hashSet));
		System.out.println(MessageFormat.format("hashSet is empty: {0}", hashSet.isEmpty()));
		System.out.println(MessageFormat.format("hashSet size is: {0}", hashSet.size()));
	}

}
