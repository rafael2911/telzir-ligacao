package br.com.crcarvalho.telzir.model.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TarifaId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String origem;
	private String destino;

	public TarifaId(String origem, String destino) {
		this.origem = origem;
		this.destino = destino;
	}

	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
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
		TarifaId other = (TarifaId) obj;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		return true;
	}

}
