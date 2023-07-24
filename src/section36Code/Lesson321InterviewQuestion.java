package section36Code;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Lesson321InterviewQuestion {

	public static void main(String[] args) {

		// Identify the unique number
		// Identify how many times each value is present in the array
		int[] a = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int key : a) {
			arrayList.add(key);
		}
		System.out.println(MessageFormat.format("arrayList value is: {0}", arrayList));

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			int key = iterator.next();
			if (hashMap.containsKey(key)) {
				int value = hashMap.get(key) + 1;
				;
				hashMap.put(key, value);
			} else {
				hashMap.put(key, 1);
			}
		}
		System.out.println(MessageFormat.format("hashMap key value pairs are: {0}", hashMap));

		if (hashMap.containsValue(1)) {
			for (Entry<Integer, Integer> entry : hashMap.entrySet()) {
				if (entry.getValue() == 1) {
					System.out.println(MessageFormat.format("int[] a has unique number: {0}", entry.getKey()));
				}
			}
		}
		for (Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() != 1) {
				System.out.println(MessageFormat.format("int[] a has number {0} appear {1} times", entry.getKey(),
						entry.getValue()));
			}
		}
	}

}
