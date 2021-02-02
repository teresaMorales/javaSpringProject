package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class DojoControler {
	
	@RequestMapping("/{saluda}")
	
	public String saluda(@PathVariable("saluda") String saluda){
		
		if(saluda.equals("dojo")) {
			return "El dojo es increible!!";
		}
		else if(saluda.equals("burbank-dojo")){
			return "El Dojo Burbank está localizado al sur de California";
		}	
		else if(saluda.equals("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		}
		return "ingresar datos";
	}
	
}
