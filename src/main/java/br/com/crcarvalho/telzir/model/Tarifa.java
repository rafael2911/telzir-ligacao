package br.com.crcarvalho.telzir.model;

import java.math.BigDecimal;

public class Tarifa {
	private TarifaId identificador;
	private BigDecimal valorPorMinuto;

	public Tarifa(String origem, String destino, BigDecimal valorPorMinuto) {
		this.identificador = new TarifaId(origem, destino);
		this.valorPorMinuto = valorPorMinuto;
	}

	public TarifaId getIdentificador() {
		return identificador;
	}

	public BigDecimal getValorPorMinuto() {
		return valorPorMinuto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarifa other = (Tarifa) obj;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		return true;
	}

}
