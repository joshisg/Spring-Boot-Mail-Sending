package com.ncs.hrms.springbootmailsending.dao;

import javax.mail.MessagingException;

import org.springframework.mail.MailException;

import com.ncs.hrms.springbootmailsending.model.Candidate;

public interface MailSendingService {

	public void sendNotificaitoin(Candidate candidate) throws MailException, InterruptedException, MessagingException;
}
