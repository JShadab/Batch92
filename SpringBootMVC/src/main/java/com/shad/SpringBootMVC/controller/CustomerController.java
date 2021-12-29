package com.shad.SpringBootMVC.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.shad.SpringBootMVC.entity.Customer;
import com.shad.SpringBootMVC.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/signup")
	public String saveCustomer(Customer customer) {

		customerService.saveCustomer(customer);

		return "redirect:/login";
	}

	@PostMapping("/login")
	public String doLogin(String email, String password) {

		Optional<Customer> optonal = customerService.getCustomer(email, password);

		if (optonal.isEmpty()) {
			return "redirect:/login";
		} else {

			return "redirect:/home";
		}
	}

}
