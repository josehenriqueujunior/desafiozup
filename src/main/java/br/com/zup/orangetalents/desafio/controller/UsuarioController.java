package br.com.zup.orangetalents.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.orangetalents.desafio.model.UsuarioModel;
import br.com.zup.orangetalents.desafio.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping(path = "/api/usuario/{idUsuario}")
	public ResponseEntity<UsuarioModel> buscarUsuario(@PathVariable Integer idUsuario) {
		
		ResponseEntity<UsuarioModel> response = repository.findById(idUsuario)
				.map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
		
		if(response.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
			response = new ResponseEntity("Não Foi Encontrado o Usuário de Id: " + idUsuario, HttpStatus.NOT_FOUND);
		}
		
		return response;
	}
	
	@PostMapping(path = "/api/usuario/salvar")
	public ResponseEntity<UsuarioModel> salvarUsuario(@RequestBody UsuarioModel usuario) {
		
		try {
			repository.save(usuario);
		}
	    catch(Exception ex){
	    	return new ResponseEntity(HttpStatus.BAD_REQUEST);
	    }
		
		return new ResponseEntity<>(usuario, HttpStatus.CREATED);
	}

}
