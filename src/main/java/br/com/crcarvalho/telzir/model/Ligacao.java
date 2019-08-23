package br.com.crcarvalho.telzir.model;

import java.math.BigDecimal;

public interface Ligacao {
	
	BigDecimal calcular(Integer tempo, BigDecimal valorPorMinuto);
	
}
