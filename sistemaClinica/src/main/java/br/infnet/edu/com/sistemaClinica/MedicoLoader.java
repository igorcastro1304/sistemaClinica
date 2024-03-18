package br.infnet.edu.com.sistemaClinica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.infnet.edu.com.sistemaClinica.model.domain.Medico;
import br.infnet.edu.com.sistemaClinica.model.service.MedicoService;

@Component
public class MedicoLoader implements ApplicationRunner {
	
	@Autowired
	private MedicoService medicoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Medico m1 = new Medico();
		m1.setCrm("2184-1/MT");
		m1.setEspecialidade("Cardiologista");
		medicoService.incluir(m1);
		
		Medico m2 = new Medico();
		m2.setCrm("1304-1/MT");
		m2.setEspecialidade("Cardiologista");
		medicoService.incluir(m2);
		
		Medico m3 = new Medico();
		m3.setCrm("1652-1/MT");
		m3.setEspecialidade("Cirurgião");
		medicoService.incluir(m3);
		
		Medico m4 = new Medico();
		m4.setCrm("1589-1/MT");
		m4.setEspecialidade("Neurologista");
		medicoService.incluir(m4);
		
		medicoService.excluir(1);
		
		System.out.println(medicoService.obter(2));
		
		System.out.println(medicoService.obterLista());
		
	}
	
}
