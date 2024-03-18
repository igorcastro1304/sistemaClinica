
package br.infnet.edu.com.sistemaClinica.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.edu.com.sistemaClinica.clients.IEnderecoClient;
import br.infnet.edu.com.sistemaClinica.model.domain.Endereco;
import br.infnet.edu.com.sistemaClinica.model.repository.IEnderecoRepository;

@Service
public class EnderecoService {
	@Autowired
	private IEnderecoRepository enderecoRepository;
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco obterPorCep(String cep) {
		return enderecoClient.obterPorCep(cep);
	}
	
	public void incluir(Endereco endereco) {		
		enderecoRepository.save(endereco);
	}
	
	public void excluir(Integer id) {
		enderecoRepository.deleteById(id);
	}
	
	public Collection<Endereco> obterLista(){
		return (Collection<Endereco>) enderecoRepository.findAll();
	}
	
	public Endereco obter(Integer id){
		return enderecoRepository.findById(id).orElse(null);
	}
}
