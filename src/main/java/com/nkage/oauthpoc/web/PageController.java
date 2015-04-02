package com.nkage.oauthpoc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping("/hello")
	public ModelAndView indexAction() {
		return new ModelAndView("test");
	}
}
