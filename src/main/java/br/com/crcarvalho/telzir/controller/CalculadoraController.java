package br.com.crcarvalho.telzir.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.crcarvalho.telzir.controller.form.ConsultaForm;
import br.com.crcarvalho.telzir.model.repository.PlanoRepository;
import br.com.crcarvalho.telzir.service.CalculadoraDeLigacao;

@Controller
@RequestMapping("calculadora")
public class CalculadoraController {
	
	@Autowired
	private CalculadoraDeLigacao calculadora;
	
	@Autowired
	private PlanoRepository planoRepository;
	
	@GetMapping
	public ModelAndView index(@ModelAttribute ConsultaForm consultaForm) {
		
		ModelAndView modelAndView = new ModelAndView("layout");
		modelAndView.addObject("planos", planoRepository.findAll());
		modelAndView.addObject("conteudo", "calculadora/form");

		return modelAndView;
	}
	
	@PostMapping(params = "form")
	public ModelAndView buscar(@Valid ConsultaForm form, BindingResult result) {
		
		ModelAndView modelAndView = new ModelAndView("layout");
		modelAndView.addObject("planos", planoRepository.findAll());
		modelAndView.addObject("conteudo", "calculadora/form");
		
		if(!result.hasErrors()) {
			modelAndView.addObject("resultado", form.cenverter(calculadora, planoRepository));
		}

		return modelAndView;		

	}
	
}
