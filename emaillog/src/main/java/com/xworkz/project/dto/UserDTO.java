package com.xworkz.project.dto;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UserDTO {
	
private static Logger logger = Logger.getLogger(UserDTO.class);
	
	private String emailId;
	private String subject;
	private String body;
	
		public UserDTO() {
		logger.info("inside getMessage()...Invoked :" + this.getClass().getSimpleName());
	}

}
