package com.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringJenkinsApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Started.......");
		logger.info("this logger is added to test build pipeline");
		logger.info("this logger is added to ccreate docker image");
		logger.info("Added Something new");
	}
	
	public static void main(String[] args) {
		logger.info("Application executed........");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
