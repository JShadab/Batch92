package p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput1 {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter your name");
		String name = br.readLine();

		System.out.println("Enter your age");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Enter your salary");
		double salary = Double.parseDouble(br.readLine());

		System.out.println(name + " : " + age + " : " + salary);

		br.close();
	}

}
