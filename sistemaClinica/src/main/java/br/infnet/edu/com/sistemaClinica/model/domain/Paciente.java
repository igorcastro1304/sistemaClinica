package br.infnet.edu.com.sistemaClinica.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPaciente;
	private String cpf;
	private String nome;
	@Transient
	private Endereco endereco;
	
	
	public Paciente() {
		this.setEndereco(new Endereco());
	}
	
	public Paciente(Endereco endereco) {
		super();
		this.setCpf("012.234.567-89");
		this.setNome("Fulano da Silva");
		this.setEndereco(endereco);
		
	}
	
	
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "[Paciente: " + idPaciente + " - " + cpf + " - " + nome + " - " + endereco;
	}
	
}
