package p4;

import java.util.Arrays;

public class SortEmployeeArray {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, 25, "Shadab", 1000);
		Employee e2 = new Employee(2, 23, "Pritam", 1234);
		Employee e3 = new Employee(3, 26, "Madhu", 1200);
		Employee e4 = new Employee(4, 22, "Neha", 1500);

		Employee[] empArr = { e1, e2, e3, e4 };

		System.out.println(Arrays.toString(empArr));

		Arrays.sort(empArr); // e1.compareTo(e2), e2.compareTo(e3),.......

		System.out.println(Arrays.toString(empArr));

	}

}
