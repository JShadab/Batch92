package com.shad;

public class Car {

	private Engine engine;// dependency

	public Car() {
		//this.engine = new Engine();
	}

	Car(Engine engine123) {
		this.engine = engine123;
	}

	/*
	 * public void setEngine(Engine engine) { this.engine = engine; }
	 */

	public void startCar() {

		System.out.println("Car is starting...");
		engine.startEngine();

	}

}
