package com.shad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// Engine engine = new Engine();

		// IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		// Engine engine = (Engine) context.getBean("engine");
		// engine.startEngine();

		Car car = context.getBean(Car.class);
		car.startCar();

	}
}
