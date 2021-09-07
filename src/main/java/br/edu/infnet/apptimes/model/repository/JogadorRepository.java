package br.edu.infnet.apptimes.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apptimes.model.domain.Jogador;

@Repository
public interface JogadorRepository extends CrudRepository<Jogador, Integer> {

}
