package com.shad.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Autowired
	@Qualifier("snapDragon")
	private Processor processor;

	public void on() {
		processor.start();
	}

}
