package br.com.crcarvalho.telzir.model;

public class Plano {

	private String descricao;
	private Integer limite;

	public Plano(String descricao, Integer limite) {
		this.descricao = descricao;
		this.limite = limite;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getLimite() {
		return limite;
	}

}
