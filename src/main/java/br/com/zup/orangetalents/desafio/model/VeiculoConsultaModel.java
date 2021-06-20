package br.com.zup.orangetalents.desafio.model;

public class VeiculoConsultaModel {
	
	private String tipoVeiculo;
	private Integer codigoMarca;
	private Integer codigoModelo;
	private Integer anoModelo;
	private Integer codigoCombustivel;
	private Integer idUsuario;
	
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public Integer getCodigoMarca() {
		return codigoMarca;
	}
	public void setCodigoMarca(Integer codigoMarca) {
		this.codigoMarca = codigoMarca;
	}
	public Integer getCodigoModelo() {
		return codigoModelo;
	}
	public void setCodigoModelo(Integer codigoModelo) {
		this.codigoModelo = codigoModelo;
	}
	public Integer getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}
	public Integer getCodigoCombustivel() {
		return codigoCombustivel;
	}
	public void setCodigoCombustivel(Integer codigoCombustivel) {
		this.codigoCombustivel = codigoCombustivel;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
}
