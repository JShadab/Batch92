package p2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {

		Set set = new HashSet();

		set.add("Java8");
		set.add("SpringBoot");
		set.add("Hibernate");
		set.add("Java8");
		set.add("RESTful");

		System.out.println(set);

		// Not RECOMMENDED
		System.out.println("******** First Way: using for loop with the help of toArray() *************");

		Object[] arr = set.toArray();

		for (int i = 0; i < arr.length; i++) {
			Object element = arr[i];
			System.out.println(element);

		}

		System.out.println("*************** Second Way: using for each loop *********************");

		for (Object element : set) {
			System.out.println(element);
		}

		System.out.println("*************** Third Way: using iterator *********************");

		Iterator it = set.iterator();

		while (it.hasNext()) {
			Object element = it.next();
			System.out.println(element);
		}

		System.out.println("*************** Fourth Way: using Java8 *********************");

		set.stream().forEach(element -> System.out.println(element));

	}

}
