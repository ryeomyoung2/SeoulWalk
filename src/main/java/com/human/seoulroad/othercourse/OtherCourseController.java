package com.human.seoulroad.othercourse;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class OtherCourseController {
	
	private final OtherCourseService othercourseService;
	

	
	
	@RequestMapping("/home/other")
	public String other() {
		return "other";
	}
	
	@GetMapping("/home/form-action")
	public String list(Model model) {
		

		List<OtherCourse> ocList = this.othercourseService.getList();
		

		model.addAttribute("ocList",ocList);
		return "other_course";
	}
	
}
