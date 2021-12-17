package p2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List list = new ArrayList();

		System.out.println(list.size()); // 0
		System.out.println(list.isEmpty()); // true

		list.add("Java8");
		list.add("SpringBoot");
		list.add("Hibernate");
		list.add("Java8");
		list.add("RESTful");

		System.out.println(list.size()); // 5
		System.out.println(list.isEmpty()); // false
		System.out.println(list);

		System.out.println(list.contains("JPA"));
		
		System.out.println("-------------------------------");
		
		System.out.println(list.get(2));

		list.clear();

		System.out.println("-------------------------------");

		System.out.println(list.size()); // 0
		System.out.println(list.isEmpty()); // true
		System.out.println(list);

	}

}
