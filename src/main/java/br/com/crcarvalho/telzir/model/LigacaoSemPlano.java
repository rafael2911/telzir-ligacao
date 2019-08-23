package br.com.crcarvalho.telzir.model;

import java.math.BigDecimal;

public class LigacaoSemPlano implements Ligacao {

	@Override
	public BigDecimal calcular(Integer tempo, BigDecimal valorPorMinuto) {
		
		return valorPorMinuto.multiply(new BigDecimal(tempo));
	}

}
