package com.shad.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Autowired
	private Processor processor;

	public void on() {
		processor.start();
	}

}
