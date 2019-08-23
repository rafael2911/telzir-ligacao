package br.com.crcarvalho.telzir.controller.form;

public class ConsultaForm {

	private String origem;
	private String destino;
	private Integer tempo;
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

}
