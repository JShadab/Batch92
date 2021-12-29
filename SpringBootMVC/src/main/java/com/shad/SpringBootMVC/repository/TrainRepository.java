package com.shad.SpringBootMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shad.SpringBootMVC.entity.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {

	

}
