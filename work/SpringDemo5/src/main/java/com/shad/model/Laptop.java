package com.shad.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Autowired
	@Qualifier("amd")
	private Processor processor;

	public void boot() {
		processor.start();
	}

}
