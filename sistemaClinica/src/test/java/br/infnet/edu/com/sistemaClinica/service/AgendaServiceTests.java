package br.infnet.edu.com.sistemaClinica.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.infnet.edu.com.sistemaClinica.model.domain.Agenda;
import br.infnet.edu.com.sistemaClinica.model.service.AgendaService;

@SpringBootTest
public class AgendaServiceTests {
	
	@Autowired
	private AgendaService agendaService;
	
	private Agenda agenda;
	
	private final String DATA = "13/04/2024";
	
	@BeforeEach
	void setUp() {
		agenda = new Agenda(DATA);
	}
	
	@Test
	void testeInclusao() {
		agendaService.incluir(agenda);
		assertEquals(agenda, agendaService.obter(1));
	}
	
	@Test
	void testeExclusao() {
		testeInclusao();
		
		agendaService.excluir(1);
		
		assertEquals(null, agendaService.obter(1));
	}
	
	@Test
	void testeRecuperacaoGeral() {
		testeInclusao();
		
		assertTrue(agendaService.obterLista().contains(agenda));
	}
	
}