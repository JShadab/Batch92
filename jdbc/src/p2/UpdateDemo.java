package p2;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {

		Connection connection = DbConnection.getConnection();

		// Step#3 Write SQL query
		String update = "UPDATE employee SET name=?, age=?, salary=? WHERE id=?";

		// Step#5 Get carrier
		PreparedStatement ps = connection.prepareStatement(update);

		ps.setString(1, "Sapna");
		ps.setInt(2, 23);
		ps.setDouble(3, 4536.75);
		ps.setInt(4, 104);

		// Step#5 Execute the queries
		ps.executeUpdate();

		// Step#6 close the resources
		ps.close();
		connection.close();

		System.out.println("Data updated Successfully");

	}

}