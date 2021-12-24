package com.shad.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AmdProcessor implements Processor {

	@Override
	public void start() {
		System.out.println("Amd processor is running...");

	}

}
