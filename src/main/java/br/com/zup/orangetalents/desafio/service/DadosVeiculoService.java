package br.com.zup.orangetalents.desafio.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import br.com.zup.orangetalents.desafio.model.VeiculoConsultaModel;
import br.com.zup.orangetalents.desafio.model.VeiculoModel;

@Service
public class DadosVeiculoService {
	public VeiculoModel obtemDadosVeiculo(VeiculoConsultaModel veiculoConsulta) {
		RestTemplate restTemplate = new RestTemplate();
	    
		String urlApi = "http://parallelum.com.br/fipe/api/v1";
		String tipoVeiculo = veiculoConsulta.getTipoVeiculo();
		Integer codigoMarca = veiculoConsulta.getCodigoMarca();
		Integer codigoModelo = veiculoConsulta.getCodigoModelo();
		Integer codigoCombustivel = veiculoConsulta.getCodigoCombustivel();
		Integer ano = veiculoConsulta.getAnoModelo();
		
		String urlConsulta = urlApi +  "/"+ tipoVeiculo + "/marcas/" + codigoMarca + "/modelos/" + codigoModelo + "/anos/" + ano + "-" + codigoCombustivel;
		
        return restTemplate.getForObject(urlConsulta, VeiculoModel.class);
	}
}
