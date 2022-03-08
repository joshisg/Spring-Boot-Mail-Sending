package com.ncs.hrms.springbootmailsending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncs.hrms.springbootmailsending.model.Candidate;
import com.ncs.hrms.springbootmailsending.service.MailService;
// @Sushant Joshi
// Owner
@RestController
@RequestMapping("/email")
public class MailSendingController {


	@Autowired
	private MailService mailService;

	@GetMapping("/signup-success")
	public String signupSuccess(){
		
		Candidate candidate = new Candidate();
		candidate.setCandidateName("Sushant Joshi");
		candidate.setEmailId("joshisg12@gmail.com");
		
		try {
			mailService.sendNotificaitoin(candidate);
		}catch( Exception e ){
			e.printStackTrace();
		}
		

		return "Thank you for registering with us.";
	}
}
