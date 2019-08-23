package br.com.crcarvalho.telzir.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.crcarvalho.telzir.controller.form.ConsultaForm;
import br.com.crcarvalho.telzir.model.Plano;

@Controller
@RequestMapping("calculadora")
public class CalculadoraController {
	
	@GetMapping
	public ModelAndView index(@ModelAttribute ConsultaForm consultaForm) {
		
		List<Plano> planos = Arrays.asList(
				new Plano(1L, "FalaMais 30", 30),
				new Plano(2L, "FalaMais 60", 60),
				new Plano(3L, "FalaMais 90", 90)
				);
		ModelAndView modelAndView = new ModelAndView("layout");
		modelAndView.addObject("planos", planos);
		modelAndView.addObject("conteudo", "calculadora/form");

		return modelAndView;
	}
	
	@ResponseBody
	@PostMapping(params = "form")
	public String buscar(ConsultaForm form) {
		
		return "Destino: " + form.getDestino() + " Origem: " + form.getOrigem();
	}
	
}
