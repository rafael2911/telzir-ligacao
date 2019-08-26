package br.com.crcarvalho.telzir.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crcarvalho.telzir.model.entity.Tarifa;
import br.com.crcarvalho.telzir.model.entity.TarifaId;

public interface TarifaRepository extends JpaRepository<Tarifa, TarifaId> {

}
