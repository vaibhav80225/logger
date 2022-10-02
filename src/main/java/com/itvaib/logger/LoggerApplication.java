package com.itvaib.logger;

import com.sun.deploy.association.utility.AppConstants;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggerApplication.class, args);
		MDC.put("id", "random string");
		log.info("---------- Spring Application started successfully ----------");
		log.debug("This is a debug message.");
		log.info("This is an info message.");
		log.warn("This is a warn message.");
		log.error("This is an error message.");
		log.info("---------- Spring Application ended successfully ----------");
	}

}
