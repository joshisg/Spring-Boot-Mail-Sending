package com.ncs.hrms.springbootmailsending.service;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Service;

import com.ncs.hrms.springbootmailsending.dao.MailSendingService;
import com.ncs.hrms.springbootmailsending.model.Candidate;

@Service
public class MailService {

	@Autowired
	MailSendingService mailSendingService;
	public void sendNotificaitoin(Candidate candidate) throws MailException, InterruptedException, MessagingException {
		mailSendingService.sendNotificaitoin(candidate);
	}
}
