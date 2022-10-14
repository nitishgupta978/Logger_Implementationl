package com.spicemoney.logger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggerApplication.class, args);
		log.trace("{}","trace");
		log.debug("{} is {}","debug",687687);
		log.info("{} is {}","info",687687);
		log.warn("{}","warm");
		log.error("{}","error");



	}

}
