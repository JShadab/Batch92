package com.shad.SpringBootMVC.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shad.SpringBootMVC.entity.Train;
import com.shad.SpringBootMVC.service.TrainService;

@Controller
public class TrainController {

	@Autowired
	private TrainService trainService;

	@GetMapping("/showTrains")
	public ModelAndView getShowTrainsPage() {

		List<Train> allTrains = trainService.getAllTrains();

		ModelAndView modelAndView = new ModelAndView("showTrains");
		modelAndView.addObject("allTrains", allTrains);

		return modelAndView;
	}

	@PostMapping("/saveTrain")
	public Train saveTrain(Train train) {
		return trainService.saveTrain(train);

	}

	@PostMapping("/updateTrain")
	public Train updateTrain(Train train) {
		return trainService.updateTrain(train);

	}

	@GetMapping("/deleteTrain")
	public void deleteTrain(int trainId) {
		trainService.deleteTrain(trainId);

	}

	@GetMapping("/getTrain")
	public Optional<Train> getTrainById(int trainId) {
		return trainService.getTrainById(trainId);

	}

}
