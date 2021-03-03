package com.teresa.examen.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.teresa.examen.models.User;
import com.teresa.examen.service.UserService;
import com.teresa.examen.validator.UserValidator;

@Controller
public class ExamenController {
	private final UserService userService;
	private final UserValidator userValidator;

	public ExamenController(UserService userService, UserValidator userValidator) {
		this.userService = userService;
		this.userValidator = userValidator;
	}
	
	//RM para registrarse, con validacion

	@RequestMapping("/registration")
	public String registerForm(@ModelAttribute("user") User user) {
		return "registrationPage.jsp";
	}
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			return "registrationPage.jsp";
		}
		User u = userService.registerUser(user);
		session.setAttribute("userId", u.getId());
		return "redirect:/ideas";
		}
		
	//RM para hacer login, con validacion
	@RequestMapping("/login")
	public String login() {
		return "loginPage.jsp";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model,
			HttpSession session) {
		boolean isAuthenticated = userService.authenticateUser(email, password);
		if (isAuthenticated) {
			User u = userService.findByEmail(email);
			session.setAttribute("userId", (Long) u.getId());
			return "redirect:/ideas";
		} else {
			model.addAttribute("error", "invalid credentials. Please try again");
			return "loginPage.jsp";
		}
	}

	@RequestMapping("/home")
	public String home(HttpSession session, Model model) {
		// Obtener el usuario desde session, guardarlo en el modelo y retornar a la
		// página principal
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findUserById(userId);
		model.addAttribute("user", u);
		return "homePage.jsp";
	}
	
	//RM para cerrar sesion 
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
			session.invalidate();
			return "redirect:/login";
	}
}
