package br.infnet.edu.com.sistemaClinica.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.edu.com.sistemaClinica.model.domain.Agenda;

@Repository
public interface IAgendaRepository extends CrudRepository<Agenda, Integer>{
	
}
