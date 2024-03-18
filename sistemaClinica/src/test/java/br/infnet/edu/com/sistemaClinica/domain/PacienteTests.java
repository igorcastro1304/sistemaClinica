package br.infnet.edu.com.sistemaClinica.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.infnet.edu.com.sistemaClinica.model.domain.Paciente;

@SpringBootTest
public class PacienteTests {
	private Paciente paciente;
	
	@BeforeEach
	void setUp() {
		paciente = new Paciente();
		paciente.setIdPaciente(null);
		paciente.setCpf(null);
		paciente.setNome(null);
		paciente.setEndereco(null);
	}
	
	@Test
	void recuperacaoDados() {
		assertEquals(null, paciente.getIdPaciente());
		assertEquals(null, paciente.getCpf());
		assertEquals(null, paciente.getNome());
		assertEquals(null, paciente.getEndereco());
	}
	
	@Test
	void testeToString() {
		System.out.println(paciente);
	}
	
}
