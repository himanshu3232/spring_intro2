package com.capgemini.spring_intro2;

import com.capgemini.spring_intro2.controller.MyController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIntro2Application {

	public static final Logger logger = LoggerFactory.getLogger(SpringIntro2Application.class);

	public static void main(String[] args) {
		logger.debug("Welcome to spring concept demo");
		ApplicationContext context = SpringApplication.run(SpringIntro2Application.class, args);
		logger.debug("Checking context: {}", context.getBean(MyController.class));
		logger.debug("\n*** Example using @Autowire on property ***");
	}

}
