package org.shad.dao;

import java.util.List;
import java.util.Optional;

import org.shad.model.Train;

public class TrainDAO {

	public void save(Train train) {
		// save train object in to DB
	}

	public void update(Train train) {
		// update existing train object in to DB
	}

	public void delete(int trainNo) {
		// delete train object using train number from DB
	}

	List<Train> getAll() {
		// return all trains available in the DB
		return null;
	}

	Optional<Train> getOne(int trainNo) {
		// return a train object using train number available in the DB
		return null;
	}

}
