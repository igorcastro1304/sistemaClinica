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

import br.infnet.edu.com.sistemaClinica.model.domain.Paciente;
import br.infnet.edu.com.sistemaClinica.model.service.PacienteService;

@RestController
@RequestMapping("/api/Paciente")
public class PacienteController {
	@Autowired
	private PacienteService pacienteService;
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Paciente paciente) {
		pacienteService.incluir(paciente);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		pacienteService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Paciente> obterLista(){
		return pacienteService.obterLista();
	}
	
	@GetMapping(value = "/{id}/listar")
	public Paciente obter(@PathVariable Integer id){
		return pacienteService.obter(id);
	}
}
