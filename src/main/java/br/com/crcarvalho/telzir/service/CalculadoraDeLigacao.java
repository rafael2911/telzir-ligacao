package br.com.crcarvalho.telzir.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crcarvalho.telzir.model.Ligacao;
import br.com.crcarvalho.telzir.model.entity.TarifaId;
import br.com.crcarvalho.telzir.model.repository.TarifaRepository;

@Service
public class CalculadoraDeLigacao {
	
	@Autowired
	private TarifaRepository tarifaRepository;

	public BigDecimal calcular(String origem, String destino, Integer tempo, Ligacao ligacao) {
		BigDecimal valorPorMinuto = tarifaRepository.findById(new TarifaId(origem, destino)).get().getValorPorMinuto();
		return ligacao.calcular(tempo, valorPorMinuto).setScale(2);
	}
}
