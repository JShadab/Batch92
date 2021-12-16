package p4;

import java.util.Set;
import java.util.TreeSet;

public class SortEmployeeSet {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, 25, "Shadab", 1000);
		Employee e2 = new Employee(2, 23, "Pritam", 1234);
		Employee e3 = new Employee(3, 26, "Madhu", 1200);
		Employee e4 = new Employee(4, 22, "Neha", 1500);

		Set<Employee> empList = new TreeSet<>();
	
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		System.out.println(empList);

	}

}
