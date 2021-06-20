package br.com.zup.orangetalents.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.zup.orangetalents.desafio.model.VeiculoConsultaModel;
import br.com.zup.orangetalents.desafio.model.VeiculoModel;
import br.com.zup.orangetalents.desafio.repository.VeiculoRepository;
import br.com.zup.orangetalents.desafio.service.DadosVeiculoService;

@RestController
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository repository;
	@Autowired
	private DadosVeiculoService dadosVeiculo;
	
	@PostMapping(path = "/api/usuario/salvarveiculo")
	public ResponseEntity<VeiculoModel> salvarVeiculo(@RequestBody VeiculoConsultaModel veiculoConsulta) throws Exception {
		
		VeiculoModel veiculo;
		
		try{
			veiculo = dadosVeiculo.obtemDadosVeiculo(veiculoConsulta);
			veiculo.setIdUsuario(veiculoConsulta.getIdUsuario());
			repository.save(veiculo);
		}
	    catch(Exception ex){
	    	return new ResponseEntity(HttpStatus.BAD_REQUEST);
	    }
	
		return new ResponseEntity<>(repository.save(veiculo),HttpStatus.CREATED);
	}
}
