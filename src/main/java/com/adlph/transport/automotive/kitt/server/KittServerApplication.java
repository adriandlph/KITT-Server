package com.adlph.transport.automotive.kitt.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.Logger;

@SpringBootApplication
public class KittServerApplication {
	private static final Logger LOGGER = Logger.getLogger(KittServerApplication.class.getName());

	public static void main(String[] args) {
		LOGGER.info("Starting KITT server...");
		SpringApplication.run(KittServerApplication.class, args);
		LOGGER.info("KITT server started!");
	}

}
