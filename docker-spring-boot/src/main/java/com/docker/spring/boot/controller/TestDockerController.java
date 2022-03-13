package com.docker.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDockerController {

	@GetMapping("/")
	public String helloWorld() {
		return "Hello !!";
	}
}
