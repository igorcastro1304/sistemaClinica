package br.infnet.edu.com.sistemaClinica.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.infnet.edu.com.sistemaClinica.model.domain.Medico;
import br.infnet.edu.com.sistemaClinica.model.service.MedicoService;

@SpringBootTest
public class MedicoServiceTests {
	
	@Autowired
	private MedicoService medicoService;
	
	private Medico medico;
	
	private final String CRM = "1234-5/MT";
	private final String ESPECIALIDADE = "Cardiologista";
	
	@BeforeEach
	void setUp() {
		medico = new Medico(CRM, ESPECIALIDADE);
	}
	
	@Test
	void testeInclusao() {
		medicoService.incluir(medico);
		assertEquals(medico, medicoService.obter(1));
	}
	
	@Test
	void testeExclusao() {
		testeInclusao();
		
		medicoService.excluir(1);
		
		assertEquals(null, medicoService.obter(1));
	}
	
	@Test
	void testeRecuperacaoGeral() {
		testeInclusao();
		
		assertTrue(medicoService.obterLista().contains(medico));
	}
	
}