package br.com.crcarvalho.telzir.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plano {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private Integer limite;
	
	public Plano() {};

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
