package br.infnet.edu.com.sistemaClinica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.infnet.edu.com.sistemaClinica.model.domain.Agenda;
import br.infnet.edu.com.sistemaClinica.model.service.AgendaService;

@Component
public class AgendaLoader implements ApplicationRunner {
	
	@Autowired
	private AgendaService agendaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Agenda a1 = new Agenda();
		a1.setData("13/04/2024");
		a1.setHoraInicial("12:00");
		a1.setHoraFinal("19:00");
		agendaService.incluir(a1);
		
		Agenda a2 = new Agenda();
		a2.setData("27/03/2024");
		a2.setHoraInicial("12:00");
		a2.setHoraFinal("21:00");
		agendaService.incluir(a2);
		
		Agenda a3 = new Agenda();
		a3.setData("26/05/2024");
		a3.setHoraInicial("06:00");
		a3.setHoraFinal("20:00");
		agendaService.incluir(a3);
		
		agendaService.excluir(2);
		
		System.out.println(agendaService.obter(1));
		
		System.out.println(agendaService.obterLista());
		
		
	}
	
}
