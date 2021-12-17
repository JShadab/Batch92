package org.shad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.shad.model.Train;

public class TrainDAO {

	private static final String TABLE_NAME = "train";

	public void save(Train train) {

		String insert = "INSERT INTO " + TABLE_NAME + " VALUES(?,?,?,?,?)";

		try (Connection connection = DbConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(insert);) {

			ps.setInt(1, train.getTrainNo());
			ps.setString(2, train.getTrainName());
			ps.setString(3, train.getSource());
			ps.setString(4, train.getDestination());
			ps.setDouble(5, train.getTicketPrice());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void update(Train train) {

		String update = "UPDATE " + TABLE_NAME
				+ " SET trainName=?, source=?, destination=?, ticketPrice=? WHERE trainNo=?";

		try (Connection connection = DbConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(update);) {

			ps.setString(1, train.getTrainName());
			ps.setString(2, train.getSource());
			ps.setString(3, train.getDestination());
			ps.setDouble(4, train.getTicketPrice());
			ps.setInt(5, train.getTrainNo());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void delete(int trainNo) {

		String delete = "DELETE FROM " + TABLE_NAME + " WHERE trainNo=?";

		try (Connection connection = DbConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(delete);) {

			ps.setInt(1, trainNo);
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

public	List<Train> getAll() {

		String select = "SELECT * FROM " + TABLE_NAME;

		List<Train> trains = new ArrayList<>();

		try (Connection connection = DbConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(select);) {

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int trainNo = rs.getInt("trainNo");
				String trainName = rs.getString("trainName");
				String source = rs.getString("source");
				String destination = rs.getString("destination");
				double ticketPrice = rs.getDouble("ticketPrice");

				Train train = new Train(trainNo, trainName, source, destination, ticketPrice);

				trains.add(train);

			}

			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return trains;
	}

public	Optional<Train> findTrain(int trainNo) {

		String select = "SELECT * FROM " + TABLE_NAME + " WHERE trainNo=?";

		Train train = null;

		try (Connection connection = DbConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(select);) {

			ps.setInt(1, trainNo);

			ResultSet rs = ps.executeQuery();

			if (rs.next())

			{

				String trainName = rs.getString("trainName");
				String source = rs.getString("source");
				String destination = rs.getString("destination");
				double ticketPrice = rs.getDouble("ticketPrice");

				train = new Train(trainNo, trainName, source, destination, ticketPrice);

			}

			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Optional.of(train);
	}

	public void populateTrainTable() {

		Train train1 = new Train(1001, "Shatabdi Express", "Bangalore", "Delhi", 2500);
		Train train2 = new Train(1002, "Shatabdi	Express", "Delhi", "Bangalore", 2500);
		Train train3 = new Train(1003, "Udyan Express", "Bangalore", "Mumbai", 1500);
		Train train4 = new Train(1004, "Udyan Express", "Mumbai", "Bangalore", 1500);
		Train train5 = new Train(1005, "Brindavan Express", "Bangalore", "Chennai", 1000);
		Train train6 = new Train(1006, "Brindavan Express", "Chennai", "Bangalore", 1000);

		save(train1);
		save(train2);
		save(train3);
		save(train4);
		save(train5);
		save(train6);

	}

}
