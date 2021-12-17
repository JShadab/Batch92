package p2;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map map = new HashMap();

		System.out.println(map.size()); // no of entries
		System.out.println(map.isEmpty()); // true

		map.put("India", "New Delhi");
		map.put("Pakistan", "Islamabad");
		map.put("BanglaDesh", "Dhaka");
		map.put("SriLanka", "Columbo");
		map.put("Nepal", "Kathmandu");

		System.out.println(map);
		System.out.println(map.size()); // no of entries
		System.out.println(map.isEmpty()); // true

		System.out.println("-------------------------------");

		System.out.println(map.get("Nepal")); // Kathmandu
		System.out.println(map.get("USA")); // null

		map.putIfAbsent("Pakistan", "Lahore");

		System.out.println(map.get("Pakistan")); // Lahore

		System.out.println("-------------------------------");

		map.remove("Nepal");

		System.out.println(map);
		System.out.println(map.size()); // no of entries
		System.out.println(map.isEmpty()); // true
		
	//how to access all keys or values from a map...

	}

}
