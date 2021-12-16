package p4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployeeList {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, 25, "Shadab", 1000);
		Employee e2 = new Employee(2, 23, "Pritam", 1234);
		Employee e3 = new Employee(3, 26, "Madhu", 1200);
		Employee e4 = new Employee(4, 22, "Neha", 1500);

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		System.out.println("Before Sorting------------");
		System.out.println(empList);

		System.out.println("After Sorting( Age wise)------------");
		Collections.sort(empList); // e1.compareTo(e2), e2.compareTo(e3),.......
		System.out.println(empList);

		System.out.println("After Sorting( Name wise)------------");
		Collections.sort(empList, new NameComparator());
		System.out.println(empList);

		System.out.println("After Sorting( Salary wise)------------");
		Collections.sort(empList, new SalaryComparator());
		System.out.println(empList);

	}

}
