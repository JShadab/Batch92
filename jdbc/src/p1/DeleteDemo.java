package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {

		// Step#1 Load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step#2 Established the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/boot_camp", "root", "root");

		// Step#3 Write SQL query
		String delete = "DELETE FROM employee WHERE id=?";

		// Step#5 Get carrier
		PreparedStatement ps = connection.prepareStatement(delete);

		ps.setInt(1, 103);

		// Step#5 Execute the queries
		ps.executeUpdate();

		// Step#6 close the resources
		ps.close();
		connection.close();

		System.out.println("Data deleted Successfully");

	}

}