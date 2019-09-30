package com.ncs.hrms.springbootmailsending;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBootMailSendingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMailSendingApplication.class, args);
	}

}
