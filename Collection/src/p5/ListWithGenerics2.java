package p5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Generics provide type safe collections

public class ListWithGenerics2 {

	public static void main(String[] args) {

		ArrayList<Dog> dogsList = new ArrayList<Dog>();

		Set<Dog> dogsSet = new HashSet<Dog>();

		Map<Integer, Dog> dogsMap = new HashMap<Integer, Dog>();

		Dog[] dogsArr = new Dog[6];

		dogsList.trimToSize();

		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Dog d4 = new Dog();
		Dog d5 = new Dog();

		Cat cat = new Cat();

		dogsList.add(d1);
		dogsList.add(d2);
		dogsList.add(d3);
		// dogsList.add(cat);
		dogsList.add(d4);
		dogsList.add(d5);

		Dog d_0 = dogsList.get(0);
		Dog d_1 = dogsList.get(1);
		Dog d_2 = dogsList.get(2);
		Dog d_3 = dogsList.get(3);
		Dog d_4 = dogsList.get(4);
		Dog d_5 = dogsList.get(5);

		System.out.println(dogsList);

	}

}
