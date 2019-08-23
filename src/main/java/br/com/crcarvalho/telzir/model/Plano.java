package br.com.crcarvalho.telzir.model;

public class Plano {
	
	private Long id;
	private String descricao;
	private Integer limite;

	public Plano(Long id, String descricao, Integer limite) {
		this.id = id;
		this.descricao = descricao;
		this.limite = limite;
	}
	
	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getLimite() {
		return limite;
	}

}
