package br.com.crcarvalho.telzir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	public ModelAndView index() {		
		ModelAndView modelAndView = new ModelAndView("layout");
		modelAndView.addObject("conteudo", "home/sobre");

		return modelAndView;

	}
	
}
