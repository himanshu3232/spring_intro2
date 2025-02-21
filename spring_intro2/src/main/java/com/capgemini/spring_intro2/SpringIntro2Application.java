package com.capgemini.spring_intro2;

import com.capgemini.spring_intro2.controller.MyController;
import com.capgemini.spring_intro2.service.EmployeeBean;
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
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEmpId(100);
		employeeBean.setEmpName("Rohit");
		employeeBean.showDetails();
	}
}
