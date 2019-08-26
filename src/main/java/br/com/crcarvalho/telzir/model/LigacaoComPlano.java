package br.com.crcarvalho.telzir.model;

import java.math.BigDecimal;

import br.com.crcarvalho.telzir.model.entity.Plano;

public class LigacaoComPlano implements Ligacao {
	
	private Plano plano;

	public LigacaoComPlano(Plano plano) {
		this.plano = plano;
	}

	@Override
	public BigDecimal calcular(Integer tempo, BigDecimal valorPorMinuto) {
		Integer excedente = tempo-plano.getLimite();
		
		if(excedente <= 0)
			return BigDecimal.ZERO;
		
		return valorPorMinuto.multiply(new BigDecimal(excedente).multiply(new BigDecimal("1.10")));

	}

}
