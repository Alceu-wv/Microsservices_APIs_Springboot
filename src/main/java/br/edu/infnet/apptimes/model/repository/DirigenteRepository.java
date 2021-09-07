package br.edu.infnet.apptimes.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apptimes.model.domain.Dirigente;

@Repository
public interface DirigenteRepository extends CrudRepository<Dirigente, Integer> {

}
