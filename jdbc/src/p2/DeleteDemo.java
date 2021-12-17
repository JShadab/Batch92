package p2;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {

		Connection connection = DbConnection.getConnection();
		
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