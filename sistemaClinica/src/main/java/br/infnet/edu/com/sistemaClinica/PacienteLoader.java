package br.infnet.edu.com.sistemaClinica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.infnet.edu.com.sistemaClinica.model.domain.Paciente;
import br.infnet.edu.com.sistemaClinica.model.service.EnderecoService;
import br.infnet.edu.com.sistemaClinica.model.service.PacienteService;

@Component
public class PacienteLoader implements ApplicationRunner {
	
	@Autowired
	private PacienteService pacienteService;
	@Autowired
	private EnderecoService enderecoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Paciente p1 = new Paciente(enderecoService.obter(2));
		pacienteService.incluir(p1);
		
		Paciente p2 = new Paciente();
		p2.setCpf("000.111.222-33");
		p2.setNome("Beltrano Araujo");
		p2.setEndereco(enderecoService.obter(3));
		pacienteService.incluir(p2);
		
		Paciente p3 = new Paciente();
		p3.setCpf("911.202.641-70");
		p3.setNome("Anna Beatriz Carneato");
		p3.setEndereco(enderecoService.obter(4));
		pacienteService.incluir(p3);
		
		pacienteService.excluir(2);
		
		System.out.println(pacienteService.obter(3));
		System.out.println(pacienteService.obterLista());
		
		
	}
	
}
