package br.infnet.edu.com.sistemaClinica.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.edu.com.sistemaClinica.model.domain.Paciente;
import br.infnet.edu.com.sistemaClinica.model.repository.IPacienteRepository;

@Service
public class PacienteService {
	@Autowired
	IPacienteRepository pacienteRepository;
	
	public void incluir(Paciente paciente) {
		pacienteRepository.save(paciente);
	}
	
	public void excluir(Integer id) {
		pacienteRepository.deleteById(id);
	}
	
	public Collection<Paciente> obterLista(){
		return (Collection<Paciente>) pacienteRepository.findAll();
	}
	
	public Paciente obter(Integer id){
		return pacienteRepository.findById(id).orElse(null);
	} 
}
