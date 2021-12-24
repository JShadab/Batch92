package com.shad.model;

import org.springframework.stereotype.Component;

@Component
public class SnapDragonProcessor implements Processor {

	@Override
	public void start() {
		System.out.println("SnapDragon processor is running...");

	}

}
