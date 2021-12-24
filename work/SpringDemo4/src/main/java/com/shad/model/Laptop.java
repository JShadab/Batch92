package com.shad.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Autowired
	private Processor processor;

	public void boot() {
		processor.start();
	}

}
