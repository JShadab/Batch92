package p5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {

		Dog[] dogs = new Dog[6];

		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Dog d4 = new Dog();
		Dog d5 = new Dog();

		Cat cat = new Cat();

		dogs[0] = d1;
		dogs[1] = d2;
		//dogs[2] = cat;// C.E.
		dogs[3] = d4;
		dogs[4] = d5;
		dogs[5] = d5;

		System.out.println(Arrays.toString(dogs));
		
		Dog d = dogs[4];


	}

}
