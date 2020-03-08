package com.xworkz.project.exceptions;

import org.apache.log4j.Logger;

public class UtilException extends Exception {
	private static Logger logger = Logger.getLogger(UtilException.class);

	private String message = ("Exception has occured" + this.getClass().getSimpleName());

	public UtilException() {
		logger.info("inside getMessage()...Created :" + this.getClass().getSimpleName());
	}

	public UtilException(String message) {
		this.message = message;
		logger.info("inside getMessage()...Created :" + this.getClass().getSimpleName());
	}

	public String getMessage() {
		logger.info("inside getMessage()..." + message);
		return message;
	}

}


