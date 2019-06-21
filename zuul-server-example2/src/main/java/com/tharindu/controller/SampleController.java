package com.tharindu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample2")
public class SampleController {

	
	@GetMapping
	public String printString() {
		return "String two is here";
	}
}
