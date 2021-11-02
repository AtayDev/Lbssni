package org.example.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.example.beans.Client;
import org.example.interfaces.InterfaceClient;
import org.example.services.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan(basePackages = {"org.example.services"})
public class HomeController {
	@Autowired
	ServiceClient serviceClient;

	@RequestMapping(value="/")
	public String  index() throws IOException{
		return "common/index";
	}
	@RequestMapping("/login")
	public String login(Model model)throws IOException{
		model.addAttribute("client", new Client());
		return "common/login";
	}
	@RequestMapping("/sign-up")
	public String signUp(Model model)throws IOException{
		model.addAttribute("client", new Client());
		return "common/sign-up";
	}
	@RequestMapping("/success-register")
	public String registerSuccess(@ModelAttribute("client") Client client)throws IOException{
		//Save the client
		serviceClient.addClient(client);
		return "common/success-register";
	}
	@RequestMapping(value="/client")
	public String  homeClient() throws IOException{
		return "client/home-client";
	}
	@RequestMapping(value="/admin")
	public String  homeAdmin() throws IOException{
		return "admin/home-admin";
	}
}
