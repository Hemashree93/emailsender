package com.xworkz.project.exceptions;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ControllerException extends Exception {
	
	private static Logger logger = Logger.getLogger(ControllerException.class);

	private String message = "Exception has occured:" + this.getClass().getSimpleName();

	public ControllerException() {
		logger.info("inside getMessage()...Created :" + this.getClass().getSimpleName() );
	}

	public ControllerException(String message) {
		this.message = message;
		logger.info("inside getMessage()...Created :" + this.getClass().getSimpleName());
	}

	public String getMessage() {
		logger.info("inside getMessage()..." + message);
		return message;
	}

}


