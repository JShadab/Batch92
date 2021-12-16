package p2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {

		Map map = new HashMap();

		map.put("India", "New Delhi");
		map.put("Pakistan", "Islamabad");
		map.put("BanglaDesh", "Dhaka");
		map.put("SriLanka", "Columbo");
		map.put("Nepal", "Kathmandu");

		System.out.println("================= Using keySet =====================");
		Set allKeys = map.keySet();

		for (Object key : allKeys) {

			Object value = map.get(key);
			System.out.println(key + " -> " + value);
		}

		System.out.println("================= Using values =====================");

		Collection allValues = map.values();

		for (Object value : allValues) {
			System.out.println(value);
		}

		System.out.println("================= Using entrySet =====================");
		Set<Entry> allEntries = map.entrySet();

		for (Entry entry : allEntries) {

			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " -> " + value);
		}

		System.out.println("================= Using Java8 =====================");

		map.forEach((k, v) -> System.out.println(k + " -> " + v));

	}

}
