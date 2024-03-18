package br.infnet.edu.com.sistemaClinica.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.edu.com.sistemaClinica.model.domain.Agenda;
import br.infnet.edu.com.sistemaClinica.model.domain.Medico;
import br.infnet.edu.com.sistemaClinica.model.service.AgendaService;
import br.infnet.edu.com.sistemaClinica.model.service.MedicoService;

@RestController
@RequestMapping("/api/Medico")
public class MedicoController {

	@Autowired
	private MedicoService medicoService;
	@Autowired
	private AgendaService agendaService;
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Medico endereco) {
		medicoService.incluir(endereco);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		medicoService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Medico> obterLista(){
		return medicoService.obterLista();
	}
	
	@GetMapping(value = "/{id}/listar")
	public Medico obter(@PathVariable Integer id){
		return medicoService.obter(id);
	}
	
	@GetMapping(value = "{id}/agenda")
	public Collection<Agenda> obterAgenda(@PathVariable Integer id) {
		return agendaService.obterLista();
	}
}
