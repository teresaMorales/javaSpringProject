package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/coding")

	public class CodingControlerr {
	
	@RequestMapping("")
	public String saluda() {
		return "Hola coding dojo";
	}
	@RequestMapping("/python")
	public String saludaPython() {
		return "¡Python/Django fue increíble!";
	}
	@RequestMapping("/java")
	public String saludaJava() {
		return "¡Java Spring es mejor!";
	}
}
