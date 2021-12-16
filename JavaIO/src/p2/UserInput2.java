package p2;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = sc.nextLine();

		System.out.println("Enter your age");
		int age = sc.nextInt();

		System.out.println("Enter your salary");
		double salary = sc.nextDouble();

		System.out.println(name + " : " + age + " : " + salary);

		sc.close();
	}

}
