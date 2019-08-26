package br.com.crcarvalho.telzir.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crcarvalho.telzir.model.entity.Plano;

public interface PlanoRepository extends JpaRepository<Plano, Long> {

}
