package br.edu.infnet.apptimes.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apptimes.model.domain.Aluno;
import br.edu.infnet.apptimes.model.domain.Usuario;
import br.edu.infnet.apptimes.model.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;

	
	public List<Aluno> obterLista(Usuario usuario){
		return alunoRepository.obterLista(usuario.getId());
	}
	
	public List<Aluno> obterLista(){

		return (List<Aluno>) alunoRepository.findAll();
	}
		
	public void incluir(Aluno aluno) {

		alunoRepository.save(aluno);
	}
	
	public void excluir(Integer id) {
		alunoRepository.deleteById(id);
	}
}