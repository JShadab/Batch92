package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertDemo2 {

	public static void main(String[] args) throws Exception {

		// Step#1 Load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step#2 Established the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/boot_camp", "root", "root");

		String name = "Kallu Khan";
		int age = 19;
		double salary = 100;

		// Step#3 Write SQL query
		String insert = "INSERT INTO employee (name, age, salary) VALUES('" + name + "', " + age + ", " + salary + ")";

		// Step#5 Get carrier
		Statement ps = connection.createStatement();

		// Step#5 Execute the queries
		ps.executeUpdate(insert);

		// Step#6 close the resources
		ps.close();
		connection.close();

		System.out.println("Done");

	}

}