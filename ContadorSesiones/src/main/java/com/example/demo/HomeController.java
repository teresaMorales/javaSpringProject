package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(HttpSession miSesion) {
		//obtengo los atributos de mi usuario xk es null por eso le asigno 0
		// la primera vez pasa por aquí xk es null y le asigno 0 , retorna a mi jsp
		if(miSesion.getAttribute("usuario")==null) {
			int sum =0;
			sum++;
			miSesion.setAttribute("usuario", sum);
			System.out.println(sum);
			return "your_server.jsp";
		}
		else {
			//se crea una nueva variable donde se hace un cast para 
			//pasar mi objeto sesion a int, hago mi seteo para pasarle 
			//el valor de suma(variable nueva) objeto usuario + nuevo valor 
			int suma = (int) miSesion.getAttribute("usuario");
			suma++;
			miSesion.setAttribute("usuario", suma);	
			System.out.println(suma);
			return "your_server.jsp";
		}
	}
	@RequestMapping("/counter")
	//se crea el model objeto con su nombre para recibir los atributos de mi usuario
	// con su nombre y recibe el objeto usuario
	public String login(Model model, HttpSession miSesion) {
		model.addAttribute("conteo", miSesion.getAttribute("usuario"));
			return "counter.jsp";
	}
	
	@RequestMapping("/contador_dos")
	public String loginDos(HttpSession miSesion) {
		if(miSesion.getAttribute("usuario")==null) {
			
			miSesion.setAttribute("usuario", 2);
			System.out.println(miSesion.getAttribute("usuario"));
			return "contador_dos.jsp";
			}
		else {
			int suma = (int) miSesion.getAttribute("usuario");
			suma+=2;
			miSesion.setAttribute("usuario", suma);
			System.out.println(suma);
			return "contador_dos.jsp";
			}
		}
	}
	
//get obtener
//set establecer