package p3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Samuel Tigga", "Aman Kumar Rastogi", "Gyan Punj", "Madhu Ramesh",
				"Pranjal Singh", "Muskan Gupta", "Amit Kumar Yadav", "Durga Phukan", "Neha Sapalya", "Bhargav Mandadi",
				"Piyush Thakur", "Kerkere Mallikarjun");

		System.out.println(names);

		Collections.sort(names);

		System.out.println(names);

	}

}
