package p1;

public class Car {

	private Engine engine;// dependency

	public Car() {
		//this.engine = new Engine();
	}

	Car(Engine engine) {
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void startCar() {

		System.out.println("Car is starting...");
		engine.startEngine();

	}

}
