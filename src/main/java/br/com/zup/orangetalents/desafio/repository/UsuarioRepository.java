package br.com.zup.orangetalents.desafio.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.zup.orangetalents.desafio.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
