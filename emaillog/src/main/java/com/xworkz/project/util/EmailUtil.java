package com.xworkz.project.util;

import com.xworkz.project.exceptions.UtilException;

public interface EmailUtil {
	public boolean sendMail(String toEmailId, String body, String subject) throws UtilException;


}
