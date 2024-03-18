package br.infnet.edu.com.sistemaClinica.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.infnet.edu.com.sistemaClinica.model.domain.Endereco;

@SpringBootTest
public class EnderecoTests {
	private Endereco endereco;
	
	@BeforeEach
	void setUp() {
		endereco = new Endereco();
		endereco.setId(null);
		endereco.setCep(null);
		endereco.setLogradouro(null);
		endereco.setComplemento(null);
		endereco.setBairro(null);
		endereco.setLocalidade(null);
		endereco.setUf(null);
	}
	
	@Test
	void recuperacaoDados() {
		assertEquals(null, endereco.getId());
		assertEquals(null, endereco.getCep());
		assertEquals(null, endereco.getLogradouro());
		assertEquals(null, endereco.getComplemento());
		assertEquals(null, endereco.getBairro());
		assertEquals(null, endereco.getLocalidade());
		assertEquals(null, endereco.getUf());
	}
	
	@Test
	void testeToString() {
		System.out.println(endereco);
	}
	
	@Test
	void testeConstrutor() {
		endereco = new Endereco("78735-349");
		
		assertEquals("78735-349", endereco.getCep());
	}
}
