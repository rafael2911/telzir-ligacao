package br.com.crcarvalho.telzir.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crcarvalho.telzir.model.Ligacao;
import br.com.crcarvalho.telzir.model.entity.Tarifa;
import br.com.crcarvalho.telzir.model.entity.TarifaId;
import br.com.crcarvalho.telzir.model.repository.TarifaRepository;

@Service
public class CalculadoraDeLigacao {
	
	@Autowired
	private TarifaRepository tarifaRepository;

	public BigDecimal calcular(String origem, String destino, Integer tempo, Ligacao ligacao) {
		Optional<Tarifa> optionalTarifa = tarifaRepository.findById(new TarifaId(origem, destino));
		
		if(optionalTarifa.isPresent()) {
			return ligacao.calcular(tempo, optionalTarifa.get().getValorPorMinuto()).setScale(2);
		}
		
		return null;
		
	}
}
