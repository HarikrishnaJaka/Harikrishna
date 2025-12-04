package com.hk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hari")
public class Controller
{

	@GetMapping
	public String wish() {
		return "hello boss how are you";
	}
}
