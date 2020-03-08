package com.xworkz.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "mail")
@Data
public class UserEntity implements Serializable {
	
	private static Logger logger = Logger.getLogger(UserEntity.class);

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "mailId")
	private String emailId;
	@Column(name = "subject")
	private String subject = "Greetings";
	@Column(name = "body")
	private String body = "Welcome";

	public UserEntity() {
	logger.info("inside getMessage()...Invoked :" + this.getClass().getSimpleName());

}
}
