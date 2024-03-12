package br.infnet.edu.com.sistemaClinica.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.edu.com.sistemaClinica.model.domain.Medico;
import br.infnet.edu.com.sistemaClinica.model.repository.IMedicoRepository;

@Service
public class MedicoService {
	@Autowired
	IMedicoRepository medicoRepository;
	
	public void incluir(Medico medico) {
		medicoRepository.save(medico);
	}
	
	public void excluir(Integer id) {
		medicoRepository.deleteById(id);
	}
	
	public Collection<Medico> obterLista(){
		return (Collection<Medico>) medicoRepository.findAll();
	}
	
	public Medico obter(Integer id){
		return medicoRepository.findById(id).orElse(null);
	} 
}
