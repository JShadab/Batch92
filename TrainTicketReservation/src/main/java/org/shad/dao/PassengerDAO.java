package org.shad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.shad.model.Passenger;

public class PassengerDAO {

	private static final String TABLE_NAME = "passenger";

	public void save(Passenger passenger) {

		String insert = "INSERT INTO " + TABLE_NAME + " VALUES(?,?,?)";

		try (Connection connection = DbConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(insert);) {

			ps.setString(1, passenger.getName());
			ps.setInt(2, passenger.getAge());
			ps.setString(3, passenger.getGender());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void update(Passenger passenger) {

		String update = "UPDATE " + TABLE_NAME + " SET name=?, age=?, gender=? WHERE id=?";

		try (Connection connection = DbConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(update);) {

			ps.setString(1, passenger.getName());
			ps.setInt(2, passenger.getAge());
			ps.setString(3, passenger.getGender());
			ps.setInt(4, passenger.getId());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void delete(int passengerId) {

		String delete = "DELETE FROM " + TABLE_NAME + " WHERE id=?";

		try (Connection connection = DbConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(delete);) {

			ps.setInt(1, passengerId);
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	List<Passenger> getAll() {

		String select = "SELECT * FROM " + TABLE_NAME;

		List<Passenger> passengers = new ArrayList<>();

		try (Connection connection = DbConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(select);) {

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				int age = rs.getInt("age");

				Passenger passenger = new Passenger(id, name, age, gender);

				passengers.add(passenger);

			}

			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return passengers;
	}

	Optional<Passenger> getOne(int passengerId) {

		String select = "SELECT * FROM " + TABLE_NAME + " WHERE id=?";

		Passenger passenger = null;

		try (Connection connection = DbConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(select);) {

			ps.setInt(1, passengerId);

			ResultSet rs = ps.executeQuery();

			if (rs.next())

			{

				int id = rs.getInt("id");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				int age = rs.getInt("age");

				passenger = new Passenger(id, name, age, gender);
			}

			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Optional.of(passenger);
	}

}
