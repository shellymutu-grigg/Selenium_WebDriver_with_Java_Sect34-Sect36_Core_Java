package section36Code;

import java.text.MessageFormat;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lesson320HashTable {

	public static void main(String[] args) {

		// hashTable is based on a key-value pair structure
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(0, "Kia ora");
		hashTable.put(1, "Morena");
		hashTable.put(32, "Ka kite");
		hashTable.put(3, "Buen dia");
		hashTable.put(5, "Ciao");

		System.out.println(MessageFormat.format("hashTable.get(32) value is: {0}", hashTable.get(32)));
		hashTable.remove(32);
		System.out.println(MessageFormat.format("hashTable.get(32) value is: {0}", hashTable.get(32)));

		// Convert to a Set object
		Set set = hashTable.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry map = (Map.Entry) iterator.next();
			System.out.println(MessageFormat.format("map.getKey() value is: {0}", map.getKey()));
			System.out.println(MessageFormat.format("map.getValue() value is: {0}", map.getValue()));
		}

	}

}
