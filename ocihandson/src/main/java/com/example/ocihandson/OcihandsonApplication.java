package com.example.ocihandson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OcihandsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcihandsonApplication.class, args);
	}

    @GetMapping(value = "/")
    public String helloWorld() {
        return "Hello World";
    }

}
