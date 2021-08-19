package com.megait.nocoronazone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class NoCoronaZoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoCoronaZoneApplication.class, args);
	}

//	@Bean
//	public PasswordEncoder passwordEncoder(){
//		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//	}

	@Bean
	public PasswordEncoder passwordEncoder(){
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}
}
