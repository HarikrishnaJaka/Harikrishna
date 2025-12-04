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
		System.out.println("wish method");
		System.out.println("kjabfiwejfb");
		return "hello boss Good Morning,how is your day";
	}
	@GetMapping("/greet")
	public String greet() {
		System.out.println("greet method");
		System.out.println("kjabfiwejfb");
		return "hello boss how are you,how is your day";
	}
	@GetMapping("/date")
	public void date() {
		System.out.println("date and time:");
			System.out.println("kjabfiwejfb");
		System.out.println(LocalDateTime.now());
	}
}
