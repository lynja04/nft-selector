package com.jimmylynn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class NftSelectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(NftSelectorApplication.class, args);
	}

	@Bean
	public List<String> categories() {
		List<String> categories = new ArrayList<>();
		categories.add("Sports");
		categories.add("Art");
		return categories;
	}

}
