package section36Code;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Iterator;

public class Lesson317Iterator {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Colombia");
		hashSet.add("Aotearoa");
		hashSet.add("Colombia");
		hashSet.add("USA");
		hashSet.add("USA");
		hashSet.add("Guatemala");
		hashSet.add("Mexico");
		System.out.println(MessageFormat.format("hashSet value: {0}", hashSet));
		hashSet.remove("Aotearoa");
		System.out.println(MessageFormat.format("hashSet value: {0}", hashSet));
		System.out.println(MessageFormat.format("hashSet is empty: {0}", hashSet.isEmpty()));
		System.out.println(MessageFormat.format("hashSet size is: {0}", hashSet.size()));

		// Create a method of iterating over objects in the HashSet
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(MessageFormat.format("hashSet value at iterator.next(): {0}", iterator.next()));
		}
	}

}
