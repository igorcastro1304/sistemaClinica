package br.infnet.edu.com.sistemaClinica.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.edu.com.sistemaClinica.model.domain.Endereco;

@Repository
public interface IEnderecoRepository extends CrudRepository<Endereco, Integer>{

}
