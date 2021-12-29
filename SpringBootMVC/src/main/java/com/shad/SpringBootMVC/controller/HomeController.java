package com.shad.SpringBootMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@ResponseBody
	@GetMapping("/papa")
	public String getPapaSong() {
		return "Chanda ne puch taaro se, TYaaro ne puch hajarro se, Sabse pyaara kon hai, Papa mere papa hai";
	}

	@GetMapping(value = { "/", "/home" })
	public String getHomePage() {
		return "home";
	}

	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}

	@GetMapping("/signup")
	public String getSignupPage() {
		return "signup";
	}

	@GetMapping("/bookTicket")
	public String getBookTicketPage() {
		return "bookTicket";
	}

	@GetMapping("/findTrain")
	public String getFindTrainPage() {
		return "findTrain";
	}

	@GetMapping("/addTrain")
	public String getAddTrainPage() {

		return "addTrain";
	}

	@GetMapping("/updateTrain")
	public String getUpdateTrainPage() {

		return "updateTrain";
	}

	@GetMapping("/deleteTrainPage")
	public String getDeleteTrainPage() {

		return "deleteTrain";
	}

	@GetMapping("/ticketDetails")
	public String getTicketDetailsPage() {
		return "ticketDetails";
	}

	@GetMapping("/downloadTicket")
	public String getDownloadTicketPage() {
		return "downloadTicket";
	}

}
