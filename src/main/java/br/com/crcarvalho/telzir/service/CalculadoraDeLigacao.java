package br.com.crcarvalho.telzir.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import br.com.crcarvalho.telzir.model.Ligacao;
import br.com.crcarvalho.telzir.model.Tarifa;
import br.com.crcarvalho.telzir.model.TarifaId;

public class CalculadoraDeLigacao {
	
	private Map<TarifaId, Tarifa> tarifas = new HashMap<>();
	
	public CalculadoraDeLigacao() {
		this.adicionar(new Tarifa("011", "016", new BigDecimal("1.9")));
		this.adicionar(new Tarifa("016", "011", new BigDecimal("2.9")));
		this.adicionar(new Tarifa("011", "017", new BigDecimal("1.7")));
		this.adicionar(new Tarifa("017", "011", new BigDecimal("2.7")));
		this.adicionar(new Tarifa("011", "018", new BigDecimal("0.9")));
		this.adicionar(new Tarifa("018", "011", new BigDecimal("1.9")));
	}

	private void adicionar(Tarifa tarifa) {
		this.tarifas.put(tarifa.getIdentificador(), tarifa);
	}

	public BigDecimal calcular(String origem, String destino, Integer tempo, Ligacao ligacao) {
		BigDecimal valorPorMinuto = this.tarifas.get(new TarifaId(origem, destino)).getValorPorMinuto();
		return ligacao.calcular(tempo, valorPorMinuto).setScale(2);
	}
}
