package com.spring.websocket.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}

    @GetMapping("/hm")
    public String hm(Model model) {
        return "hm";
    }

    @GetMapping("/hello")
    public String hello(Model model, Authentication authentication) {
        System.out.println(authentication.getName());
        return "hello";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
}
