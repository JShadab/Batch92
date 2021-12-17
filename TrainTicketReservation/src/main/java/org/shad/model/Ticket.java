package org.shad.model;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ticket {

	private int counter;
	private String pnr;
	private Date travelDate;
	private Train train;
	private Map<Passenger, Integer> passengers;

	public Ticket(Date travelDate, Train train) {
		this.train = train;
		this.travelDate = travelDate;

		counter = 100;

		passengers = new TreeMap<>();
	}

	private String generatePNR() {

		char firstChar = train.getSource().charAt(0);
		char secondChar = train.getDestination().charAt(0);

		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			String travelDateStr = formatter.format(travelDate);

			this.pnr = firstChar + "" + secondChar + "_" + travelDateStr + "_" + counter;
			counter++;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid date format");

		}

		return this.pnr;
	}

	private double calculatePassengerFare(Passenger passenger) {

		double price = train.getTicketPrice();

		double discount = 0;
		if (passenger.getAge() >= 60) {
			discount = (price * 40) / 100;
		} else if (passenger.getAge() <= 12) {
			discount = (price * 50) / 100;
		} else if (passenger.getGender().equals("F")) {
			discount = (price * 25) / 100;
		}

		return (price - discount);
	}

	public void addPassenger(String name, int age, String gender) {

		Passenger passenger = new Passenger(name, age, gender);
		int fare = (int) calculatePassengerFare(passenger);

		passengers.put(passenger, fare);

	}

	private double calculateTotalTicketPrice() {

		double total = 0;

		Collection<Integer> allFares = passengers.values();

		for (int fare : allFares) {
			total = total + fare;
		}

		return total;
	}

	public StringBuilder generateTicket() {

		generatePNR();

		StringBuilder sb = new StringBuilder();

		sb.append("PNR           :" + getPnr() + "\n").append("Train no      :" + train.getTrainNo() + "\n")
				.append("Train Name    :" + train.getTrainName() + "\n")
				.append("From          :" + train.getSource() + "\n")
				.append("To            :" + train.getDestination() + "\n")
				.append("Travel Date   :" + travelDate + "\n\n\n\n").append("Passengers:\n")
				.append("Name  Age       Gender    Fare     \n");

		Set<Passenger> allPassengers = passengers.keySet();

		for (Passenger passenger : allPassengers) {
			sb.append(passenger.getName() + "  " + passenger.getAge() + "       " + passenger.getGender() + "    "
					+ passengers.get(passenger) + "     \n");
		}

		sb.append("Total Price:" + calculateTotalTicketPrice() + "");

		return sb;

	}

	public void writeTicket() {

		String path = "D:\\tickets\\" + getPnr() + ".txt";

		File file = new File(path);

		try (FileWriter fw = new FileWriter(file);) {

			StringBuilder sb = generateTicket();
			fw.write(sb.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Map<Passenger, Integer> getPassengers() {
		return passengers;
	}

	public void setPassengers(Map<Passenger, Integer> passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Ticket [counter=" + counter + ", pnr=" + pnr + ", travelDate=" + travelDate + ", train=" + train
				+ ", passengers=" + passengers + "]";
	}

}
