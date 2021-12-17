package p2;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set set = new HashSet();

		System.out.println(set.size()); // 0
		System.out.println(set.isEmpty()); // true

		set.add("Java8");
		set.add("SpringBoot");
		set.add("Hibernate");
		set.add("Java8");
		set.add("RESTful");

		System.out.println(set.size()); // 4
		System.out.println(set.isEmpty()); // false
		System.out.println(set);

		System.out.println(set.contains("JPA"));
		
	//	System.out.println(set.get(2));

		set.clear();

		System.out.println("-------------------------------");

		System.out.println(set.size()); // 0
		System.out.println(set.isEmpty()); // true
		System.out.println(set);

	}

}
