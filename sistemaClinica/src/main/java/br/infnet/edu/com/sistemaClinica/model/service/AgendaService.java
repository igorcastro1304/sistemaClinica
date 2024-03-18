package br.infnet.edu.com.sistemaClinica.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.edu.com.sistemaClinica.model.domain.Agenda;
import br.infnet.edu.com.sistemaClinica.model.repository.IAgendaRepository;

@Service
public class AgendaService {
	@Autowired
	IAgendaRepository agendaRepository;
	
	public void incluir(Agenda agenda) {
		agendaRepository.save(agenda);
	}
	
	public void excluir(Integer id) {
		agendaRepository.deleteById(id);
	}
	
	public Collection<Agenda> obterLista(){
		return (Collection<Agenda>) agendaRepository.findAll();
	}
	
	public Agenda obter(Integer id){
		return agendaRepository.findById(id).orElse(null);
	} 
}
