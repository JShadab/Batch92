package com.shad.SpringBootRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shad.SpringBootRest.entity.Train;
import com.shad.SpringBootRest.repository.TrainRepository;

@Service
public class TrainService {

	@Autowired
	private TrainRepository trainRepository;

	public Train saveTrain(Train train) {
		return trainRepository.save(train);

	}

	public Train updateTrain(Train train) {
		return trainRepository.save(train);

	}

	public void deleteTrain(int trainId) {
		trainRepository.deleteById(trainId);

	}

	public Optional<Train> getTrainById(int trainId) {
	return	trainRepository.findById(trainId);

	}

	public List<Train> getAllTrains() {
		return trainRepository.findAll();

	}

}
