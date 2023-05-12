package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@RequestMapping("/")
	public String home() {
	//return "Hello Docker World!!! App Version 1.0";
	return "Hello Docker World!!! App Version 1.0 -> S2I Build >>> ";
	}
	@RequestMapping("/session")
	public String session() {
		session = request.getSession(true);
		String ssid = session.getId();
	//return "Hello Docker World!!! App Version 1.0";
	return ssid;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
