package com.web.bank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.bank.service.AuthService;

@Controller
public class AuthController {

//	@Autowired
//	@Qualifier("AuthServiceImpl")
	private AuthService authService;

	@RequestMapping(value="auth-user", method=RequestMethod.POST)
	public String authUser(String username, String password, HttpSession session, Model model) {
		String redirect = "login";
		String role = authService.authUser(username, password);
		if (role.length() > 0) {
			session.setAttribute("username", username);
			session.setAttribute("role", role);
		} else {
			return "redirect:/login.jsp?message=Incorrect username or password.";
		}
		return redirect;
	}
	
	@RequestMapping(value="auth", method=RequestMethod.GET)
	public String login() {
		return "login";
	}
}
