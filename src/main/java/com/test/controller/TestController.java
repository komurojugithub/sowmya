package com.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/v1")
public class TestController {

	public TestController() {

	}

	@GetMapping("/data")
	public ResponseEntity<String> getData() {
		String s = "This is a test application";
		return new ResponseEntity<>(s, HttpStatus.OK);
	}

	@PostMapping("/data/{content}")
	public ResponseEntity<String> postData(@PathVariable("content") String data) {
		String s = "The data posted is : " + data;
		return new ResponseEntity<>(s, HttpStatus.OK);

	}

}
