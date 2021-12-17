package p5;

import java.util.ArrayList;
import java.util.List;

//Generics provide type safe collections

public class ListWithoutGenerics2 {

	public static void main(String[] args) {

		List dogs = new ArrayList();

		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Dog d4 = new Dog();
		Dog d5 = new Dog();

		Cat cat = new Cat();

		dogs.add(d1);
		dogs.add(d2);
		dogs.add(d3);
		dogs.add(cat);
		dogs.add(d4);
		dogs.add(d5);

		Dog d_0 = (Dog) dogs.get(0);
		Dog d_1 = (Dog) dogs.get(1);
		Dog d_2 = (Dog) dogs.get(2);
		Dog d_3 = (Dog) dogs.get(3);
		Dog d_4 = (Dog) dogs.get(4);
		Dog d_5 = (Dog) dogs.get(5);

		System.out.println(dogs);

	}

}
