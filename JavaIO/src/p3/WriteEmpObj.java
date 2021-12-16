package p3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteEmpObj {

	public static void main(String[] args) throws Exception {

		Employee emp = new Employee();
		emp.setName("Gyan");
		emp.setAge(21);
		emp.setSalary(1234);

		File file = new File("D:\\data.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//First Read all objects from the file..
		//The save again along with new objects.
		
		oos.writeObject(emp);

		oos.close();
		
		System.out.println("Object saved Successfully");
	}

}
