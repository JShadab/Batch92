package p1;

import p1.Car;
import p1.Engine;

public class Test {

	public static void main(String[] args) {

		Engine engine = new Engine();

	//	Car car = new Car(engine); // Constructor Injection
		
		Car car = new Car();
		car.setEngine(engine); // Setter Injection
		
		car.startCar();
	}

}
