package com.xworkz.project.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.project.dao.UserDAO;
import com.xworkz.project.entity.UserEntity;
import com.xworkz.project.exceptions.ServiceException;
import com.xworkz.project.exceptions.UtilException;
import com.xworkz.project.util.EmailUtil;

@Service
public class MailServiceImpl implements MailService {
	
	private static Logger logger = Logger.getLogger(MailServiceImpl.class);

	@Autowired
	private EmailUtil util;

	@Autowired
	private UserDAO dao;

	public MailServiceImpl() {
		logger.info("inside getMessage()...Created :" + this.getClass().getSimpleName());
	}

	public boolean sendMailToUser(String toEmailId, String subject, String body) throws ServiceException {
		logger.info("sendMailToUser() Invoked...");
		boolean valid = false;

		if (toEmailId != null && toEmailId.length() > 10 && toEmailId.contains("@")) {
			logger.info("Entered Email Id length is valid");
			valid = true;
			if (valid && subject != null && subject.length() >= 4) {
				logger.info("Entered subject is length is valid");
				valid = true;
				if (valid && body != null && body.length() >= 5) {
					logger.info("Entered body length is valid");
					valid = true;
				} else {
					if (body == null && body.length() < 4) {
						logger.info("Not Valid:Body length is less than 4");
					}
				}
			} else {
				if (subject == null && subject.length() < 4) {
					logger.info("Not Valid:Subject length is less than 4");
				}
			}
		} else {
			if (toEmailId == null && toEmailId.length() < 10) {
				logger.info("Not Valid:Email Id length is less than 4");
			}
		}

		if (valid) {
			logger.info("inside getMessage()...Data is valid,Can Save in Database");

			UserEntity userEntity = new UserEntity();
			userEntity.setEmailId(toEmailId);
			userEntity.setSubject(subject);
			userEntity.setBody(body);
			dao.save(userEntity);

			try {
				valid = util.sendMail(toEmailId, body, subject);
			} catch (UtilException e) {
				logger.info("Exception: " + e.getMessage());
			}

		} else {
			logger.info("inside getMessage()...Data is not saved in Database");
			valid = false;
		}

		return valid;

	}

}


