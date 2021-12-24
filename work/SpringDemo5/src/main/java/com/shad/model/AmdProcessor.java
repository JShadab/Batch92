package com.shad.model;

import org.springframework.stereotype.Component;

@Component("amd")
public class AmdProcessor implements Processor {

	@Override
	public void start() {
		System.out.println("Amd processor is running...");

	}

}
