package com.shad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		// Engine engine = new Engine();

		// IOC container
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//		Engine engine = (Engine) context.getBean("engine");
//		engine.startEngine();

		Car car = context.getBean(Car.class);
		car.startCar();

	}
}
