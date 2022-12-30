package com.human.seoulroad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String root() {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/home/introduce")
	public String introduce() {
		return "introduce";
	}
	@RequestMapping("/home/course")
	public String course() {
		return "course";
	}
	@RequestMapping("/home/course/course1")
	public String course1() {
		return "course1";
	}
	@RequestMapping("/home/other")
	public String other() {
		return "other";
	}
	
	@RequestMapping("/recommendcourse")
	public String rcmcourse() {
		return "rcmcourse";
	}
	
}
