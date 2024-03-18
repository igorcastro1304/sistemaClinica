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
import br.infnet.edu.com.sistemaClinica.model.service.AgendaService;

@RestController
@RequestMapping("/api/Agenda")
public class AgendaController {
	@Autowired
	private AgendaService agendaService;
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Agenda agenda) {
		agendaService.incluir(agenda);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		agendaService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Agenda> obterLista(){
		return agendaService.obterLista();
	}
	
	@GetMapping(value = "/{id}/listar")
	public Agenda obter(@PathVariable Integer id){
		return agendaService.obter(id);
	}
}
