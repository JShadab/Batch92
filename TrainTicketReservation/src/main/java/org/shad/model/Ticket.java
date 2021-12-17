package org.shad.model;

import java.util.Date;
import java.util.Map;

public class Ticket {

	private int counter;
	private String pnr;
	private Date travelDate;
	private Train train;
	private Map<Passenger, Integer> passengers;

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
