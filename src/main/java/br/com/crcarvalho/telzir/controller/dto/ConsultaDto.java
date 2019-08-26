package br.com.crcarvalho.telzir.controller.dto;

import java.math.BigDecimal;

import br.com.crcarvalho.telzir.controller.form.ConsultaForm;

public class ConsultaDto {

	private String origem;
	private String destino;
	private Integer tempo;
	private BigDecimal comPlano;
	private BigDecimal semPlano;
	private String plano;

	public ConsultaDto(ConsultaForm form, String plano, BigDecimal comPlano, BigDecimal semPlano) {
		this.origem = form.getOrigem();
		this.destino = form.getDestino();
		this.tempo = form.getTempo();
		this.plano = plano;
		this.comPlano = comPlano;
		this.semPlano = semPlano;
	}

	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}

	public Integer getTempo() {
		return tempo;
	}
	
	public String getPlano() {
		return plano;
	}

	public BigDecimal getComPlano() {
		return comPlano;
	}

	public BigDecimal getSemPlano() {
		return semPlano;
	}

}
