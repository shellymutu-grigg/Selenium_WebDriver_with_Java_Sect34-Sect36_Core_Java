package section36Code;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lesson318HashMap {

	public static void main(String[] args) {

		// HashMap is based on a key-value pair structure
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "Kia ora");
		hashMap.put(1, "Morena");
		hashMap.put(32, "Ka kite");
		hashMap.put(3, "Buen dia");
		hashMap.put(5, "Ciao");

		System.out.println(MessageFormat.format("hashMap.get(32) value is: {0}", hashMap.get(32)));
		hashMap.remove(32);
		System.out.println(MessageFormat.format("hashMap.get(32) value is: {0}", hashMap.get(32)));

		// Convert to a Set object
		Set set = hashMap.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry map = (Map.Entry) iterator.next();
			System.out.println(MessageFormat.format("map.getKey() value is: {0}", map.getKey()));
			System.out.println(MessageFormat.format("map.getValue() value is: {0}", map.getValue()));
		}

	}

}
