package com.shad.model;

import org.springframework.stereotype.Component;

@Component
public class IntelProcessor implements Processor {

	@Override
	public void start() {
		System.out.println("Intel processor is running...");

	}

}
