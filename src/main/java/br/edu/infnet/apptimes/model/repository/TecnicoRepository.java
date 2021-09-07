package br.edu.infnet.apptimes.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apptimes.model.domain.Tecnico;

@Repository
public interface TecnicoRepository extends CrudRepository<Tecnico, Integer> {

}
