package br.com.crcarvalho.telzir.controller.form;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.crcarvalho.telzir.controller.dto.ConsultaDto;
import br.com.crcarvalho.telzir.model.LigacaoComPlano;
import br.com.crcarvalho.telzir.model.LigacaoSemPlano;
import br.com.crcarvalho.telzir.model.entity.Plano;
import br.com.crcarvalho.telzir.model.repository.PlanoRepository;
import br.com.crcarvalho.telzir.service.CalculadoraDeLigacao;

public class ConsultaForm {
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 5)
	private String origem;
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 5)
	private String destino;
	
	@NotNull
	@Min(1)
	private Integer tempo;
	
	@NotNull
	private Long plano;

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Integer getTempo() {
		return tempo;
	}

	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}

	public Long getPlano() {
		return plano;
	}

	public void setPlano(Long plano) {
		this.plano = plano;
	}

	public ConsultaDto cenverter(CalculadoraDeLigacao calculadora, PlanoRepository planoRepository) {
		Plano plano = planoRepository.findById(this.plano).get();
		BigDecimal comPlano = calculadora.calcular(this.origem, this.destino, this.tempo, new LigacaoComPlano(plano));
		BigDecimal semPlano = calculadora.calcular(this.origem, this.destino, this.tempo, new LigacaoSemPlano());
		
		return new ConsultaDto(this, plano.getDescricao(), comPlano, semPlano);
	}

}
