package com.shad.SpringBootMVC.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shad.SpringBootMVC.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	//SELECT * FROM customer WHERE email=? AND password=?
	Optional<Customer> findByEmailAndPassword(String email, String password);

}
