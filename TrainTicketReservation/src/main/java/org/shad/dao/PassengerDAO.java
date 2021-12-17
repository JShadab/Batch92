package org.shad.dao;

import java.util.List;
import java.util.Optional;

import org.shad.model.Passenger;

public class PassengerDAO {

	public void save(Passenger passenger) {
		// save passenger object in to DB
	}

	public void update(Passenger passenger) {
		// update existing passenger object in to DB
	}

	public void delete(int passengerId) {
		// delete passenger object using passenger id from DB
	}

	List<Passenger> getAll() {
		// return all passengers available in the DB
		return null;
	}

	Optional<Passenger> getOne(int passengerId) {
		// return a passenger object using passenger id available in the DB
		return null;
	}

}
