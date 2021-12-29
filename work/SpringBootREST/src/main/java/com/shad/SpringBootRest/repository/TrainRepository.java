package com.shad.SpringBootRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shad.SpringBootRest.entity.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {

	

}
