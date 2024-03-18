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

import br.infnet.edu.com.sistemaClinica.model.domain.Endereco;
import br.infnet.edu.com.sistemaClinica.model.service.EnderecoService;

@RestController
@RequestMapping("/api/Endereco")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Endereco endereco) {
		enderecoService.incluir(endereco);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		enderecoService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Endereco> obterLista(){
		return enderecoService.obterLista();
	}
	
	@GetMapping(value = "/{id}/listar")
	public Endereco obter(@PathVariable Integer id){
		return enderecoService.obter(id);
	}
	
	
}