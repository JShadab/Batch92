package p5;

import java.util.ArrayList;
import java.util.List;

public class ListWithoutGenerics {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(11);
		list.add("Shad");
		list.add(true);

		Dog d = new Dog();
		list.add(d);

		Cat c = new Cat();
		list.add(c);

		System.out.println(list.size()); // 5
		System.out.println(list);

		Object x = list.get(4);

		if (x instanceof Dog) {
			Dog dog = (Dog) x;
			System.out.println(dog);
		}

	}

}

