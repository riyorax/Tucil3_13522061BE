package com.example.tucil3_13522061be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.tucil3_13522061be.model.ResponseClass;

import java.net.URL;

@SpringBootApplication
@RestController
public class Tucil313522061BeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tucil313522061BeApplication.class, args);
	}

}
