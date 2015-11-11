package com.bakapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Main {	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public ModelAndView main(Model model) {
        model.addAttribute("main");
        return new ModelAndView("main");
    }
}
