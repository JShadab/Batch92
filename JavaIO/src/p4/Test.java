package p4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import p3.Employee;

public class Test {

	public static void main(String[] args) throws Exception {
		// write();
		read();
	}

	public static void write() throws Exception {

		Employee emp1 = new Employee();
		emp1.setName("Gyan");
		emp1.setAge(21);
		emp1.setSalary(1234);

		Employee emp2 = new Employee();
		emp2.setName("Akshay");
		emp2.setAge(36);
		emp2.setSalary(4537);

		Employee emp3 = new Employee();
		emp3.setName("Ankit");
		emp3.setAge(24);
		emp3.setSalary(3434);

		Employee[] empArr = { emp1, emp2, emp3 };

		File file = new File("D:\\salman.khan");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(empArr);
		oos.close();
		System.out.println("Object saved Successfully");
	}

	public static void read() throws Exception {

		File file = new File("D:\\salman.khan");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee[] empArr = (Employee[]) ois.readObject();
		ois.close();

		System.out.println(Arrays.toString(empArr));

	}
}
