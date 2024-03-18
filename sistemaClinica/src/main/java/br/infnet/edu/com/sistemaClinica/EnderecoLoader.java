package br.infnet.edu.com.sistemaClinica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.infnet.edu.com.sistemaClinica.model.domain.Endereco;
import br.infnet.edu.com.sistemaClinica.model.service.EnderecoService;

@Component
public class EnderecoLoader implements ApplicationRunner {

	@Autowired
	private EnderecoService enderecoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco a1 = enderecoService.obterPorCep("78735349");
		Endereco a2 = enderecoService.obterPorCep("78735129");
		Endereco a3 = enderecoService.obterPorCep("78700200");
		Endereco a4 = enderecoService.obterPorCep("20010020");
		
		enderecoService.incluir(a1);
		enderecoService.incluir(a2);
		enderecoService.excluir(1);
		enderecoService.incluir(a3);
		enderecoService.incluir(a4);
		
		System.out.println(enderecoService.obter(2));
		
		System.out.println(enderecoService.obterLista());
		
	}

}
