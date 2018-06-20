package com.sky.webportal.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author vidhya 
 * This class contains main method to run the application
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan("com.sky.webportal.web")
public class ParentalControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParentalControlApplication.class, args);
	}
}
