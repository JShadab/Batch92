package p3;

import java.util.Arrays;

public class ArraySortDemo {

	public static void main(String[] args) {

		String[] names = { "Samuel Tigga", "Aman Kumar Rastogi", "Gyan Punj", "Madhu Ramesh", "Pranjal Singh",
				"Muskan Gupta", "Amit Kumar Yadav", "Durga Phukan", "Neha Sapalya", "Bhargav Mandadi", "Piyush Thakur",
				"Kerkere Mallikarjun" };

		System.out.println(Arrays.toString(names));

		Arrays.sort(names);

		System.out.println(Arrays.toString(names));

	}

}
