package com.shad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine engine; // dependency

	/*
	 * public void setEngine(Engine engine) { this.engine = engine; }
	 */

	public void startCar() {

		System.out.println("Car is starting...");
		engine.startEngine();

	}

}
