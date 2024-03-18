package br.infnet.edu.com.sistemaClinica.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.infnet.edu.com.sistemaClinica.model.domain.Medico;

@SpringBootTest
public class MedicoTests {
	private Medico medico;
	
	@BeforeEach
	void setUp() {
		medico = new Medico();
		medico.setIdMedico(null);
		medico.setCrm(null);
		medico.setEspecialidade(null);
		medico.setAgendaMedico(null);
	}
	
	@Test
	void recuperacaoDados() {
		assertEquals(null, medico.getIdMedico());
		assertEquals(null, medico.getCrm());
		assertEquals(null, medico.getEspecialidade());
		assertEquals(null, medico.getAgendaMedico());
	}
	
	@Test
	void testeToString() {
		System.out.println(medico);
	}
	
	@Test
	void testeConstrutor() {
		medico = new Medico("1234-5/MT", "Cardiologista");
		
		assertEquals("1234-5/MT", medico.getCrm());
		assertEquals("Cardiologista", medico.getEspecialidade());
	}
	
}
