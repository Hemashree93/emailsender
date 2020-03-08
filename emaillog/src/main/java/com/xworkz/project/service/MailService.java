package com.xworkz.project.service;

import com.xworkz.project.exceptions.ServiceException;

public interface MailService {
	public boolean sendMailToUser(String toEmailId, String subject, String body) throws ServiceException;


}
