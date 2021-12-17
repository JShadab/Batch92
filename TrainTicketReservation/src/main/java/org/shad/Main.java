package org.shad;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

import org.shad.dao.TrainDAO;
import org.shad.model.Ticket;
import org.shad.model.Train;

public class Main {

	public static void main(String[] args) {

		TrainDAO trainDAO = new TrainDAO();

		// Used Only First time
		// trainDAO.populateTrainTable();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Train Number: ");
		int trainNo = sc.nextInt();

		Optional<Train> trainOptional = trainDAO.findTrain(trainNo);

		if (trainOptional.isEmpty()) {

			System.out.println("No Train exist in the DB...");
			sc.close();
			return;

		}

		Train train = trainOptional.get();

		System.out.println("Enter Travel Date (dd/MM/YYY):");
		String travelDateStr = sc.next();

		Date travelDate = new Date();

		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			travelDate = formatter.parse(travelDateStr);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid date format");
			sc.close();
			return;
		}

		Ticket ticket = new Ticket(travelDate, train);

		System.out.println("Enter Number of Passengers");
		int noOfPassengers = sc.nextInt();

		sc.nextLine();

		for (int i = 1; i <= noOfPassengers; i++) {

			System.out.println("Enter Passenger Name");
			String name = sc.nextLine();

			System.out.println("Enter Age");
			int age = sc.nextInt();

			System.out.println("Enter Gender(M/F)");
			String gender = sc.next();

			ticket.addPassenger(name, age, gender);

			sc.nextLine();

		}
		ticket.generateTicket();
		ticket.writeTicket();

		System.out.println("Ticket Booked with PNR : " + ticket.getPnr());
		System.out.println("Ticket should be written to the file with filename " + ticket.getPnr() + ".txt");

		sc.close();

	}

}
