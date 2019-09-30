package com.ncs.hrms.springbootmailsending.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.ncs.hrms.springbootmailsending.model.Candidate;

@Service
public class MailSendingServiceImpl implements MailSendingService {

	@Autowired
	private JavaMailSender javaMailSender;

	@Async
	public void sendNotificaitoin(Candidate candidate) throws MailException, InterruptedException, MessagingException {
		List<String> candidateList = new ArrayList<>();
		candidateList.add("joshisg12@gmail.com");
		candidateList.add("rushikeshj.143@gmail.com");
		candidateList.add("sushantgjoshi@gmail.com");
		candidateList.add("joshisushantg@gmail.com");
		
		Object[] objectArrayOfMailID=candidateList.toArray();
		String[] strings = Arrays.stream(objectArrayOfMailID).toArray(String[]::new);		
		System.out.println("Sleeping now...");
		Thread.sleep(10000);

		System.out.println("Sending email...");

		//SimpleMailMessage mail = new SimpleMailMessage();
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		 MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
		 //helper.setTo(candidate.getEmailId());
		helper.setTo(strings);
		 helper.setSubject("demo mail");
		 helper.setText("Why aren't you using Spring Boot?");
		FileSystemResource file = new FileSystemResource(new File("C:\\Users\\SUSHANT\\Downloads\\Aadhar Card.pdf"));
	    helper.addAttachment(file.getFilename(), file);
		javaMailSender.send(mimeMessage);
		System.out.println("Email Sent!");
	}
}
