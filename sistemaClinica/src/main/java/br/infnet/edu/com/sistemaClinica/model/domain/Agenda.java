package br.infnet.edu.com.sistemaClinica.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAgenda;
	private String data;
	private String horaInicial;
	private String horaFinal;
	@ManyToOne
	@JoinColumn(name = "idMedico")
	@JsonIgnore
	private Medico medico;

	
	public Agenda() {
		
	}
	
	public Agenda(String data) {
		super();
		this.data = data;
	}
	
	
	public Integer getIdAgenda() {
		return idAgenda;
	}
	public void setIdAgenda(Integer idAgenda) {
		this.idAgenda = idAgenda;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

	public String getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	@Override
	public String toString() {
		return "Agenda: [Data Inicial = " + data + " " + horaInicial + "\nMédico: " + medico + "]" ;
	}
	
	
	
}
