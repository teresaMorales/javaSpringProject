package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorTime {

	Date fechaHora = new Date();
		
	@RequestMapping ("/")
	public String index() {
		return "home.jsp";
    }
	
	@RequestMapping ("/date")
	public String date(Model fechaUno) {	
		SimpleDateFormat sm = new SimpleDateFormat("EEE, d MMM yyyy");
		fechaUno.addAttribute("Fecha", 	sm.format(fechaHora));
		return "date.jsp";
    }
	
	@RequestMapping ("/time")
	public String time(Model horaUno) {
		SimpleDateFormat sm = new SimpleDateFormat("h:mm a");
		horaUno.addAttribute("Hora", sm.format(fechaHora));
		return "time.jsp";
    }
}
