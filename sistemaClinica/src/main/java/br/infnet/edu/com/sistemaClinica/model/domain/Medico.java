package br.infnet.edu.com.sistemaClinica.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMedico;
	private String crm;
	private String especialidade;
	@OneToMany(mappedBy = "medico",fetch = FetchType.LAZY)
	private List<Agenda> agendaMedico;
	
	public Medico() {
		
	}
	
	public Medico(String crm, String especialidade) {
		super();
		this.crm = crm;
		this.especialidade = especialidade;
	}
	
	
	public Integer getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public List<Agenda> getAgendaMedico() {
		return agendaMedico;
	}
	public void setAgendaMedico(List<Agenda> agendaMedico) {
		this.agendaMedico = agendaMedico;
	}

	@Override
	public String toString() {
		return "Medico [idMedico=" + idMedico + ", crm=" + crm + ", especialidade=" + especialidade + ", agendaMedico="
				+ agendaMedico + "]";
	}
	
	
	
	
}
