package com.hk.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hari")
public class Controller
{

	
	@GetMapping("/wish")
	public String wish() {
		return "hello boss Good Morning,how is your day";
	}
	@GetMapping("/greet")
	public String greet() {
		return "hello boss how are you";
	}
	@GetMapping("/date")
	public void date() {
		System.out.println(LocalDateTime.now());
	}
}
