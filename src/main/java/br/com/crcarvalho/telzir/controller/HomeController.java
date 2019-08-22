package br.com.crcarvalho.telzir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	@ResponseBody
	public String index() {
		return "Seja bem vindo ao aplicativo de consulta da Telzir.";
	}
	
}
