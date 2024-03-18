package br.infnet.edu.com.sistemaClinica.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.infnet.edu.com.sistemaClinica.model.domain.Agenda;

@SpringBootTest
public class AgendaTests {
	private Agenda agenda;
	
	@BeforeEach
	void setUp() {
		agenda = new Agenda();
		agenda.setIdAgenda(null);
		agenda.setData(null);
		agenda.setHoraInicial(null);
		agenda.setHoraFinal(null);
		agenda.setMedico(null);
	}
	
	@Test
	void recuperacaoDados() {
		assertEquals(null, agenda.getIdAgenda());
		assertEquals(null, agenda.getData());
		assertEquals(null, agenda.getHoraInicial());
		assertEquals(null, agenda.getHoraFinal());
		assertEquals(null, agenda.getMedico());
	}
	
	@Test
	void testeToString() {
		System.out.println(agenda);
	}
	
	@Test
	void testeConstrutor() {
		agenda = new Agenda("13/04/2024");
		
		assertEquals("13/04/2024", agenda.getData());
	}
}
