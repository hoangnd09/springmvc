package com.vn.training.sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@RequestMapping(value="/hello")
	public ModelAndView sample(HttpServletRequest request,
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        // Prepare the result view (guest.jsp):
		ModelAndView view = new ModelAndView("hello");
        view.addObject("name", name);
        return view;
    }
}
