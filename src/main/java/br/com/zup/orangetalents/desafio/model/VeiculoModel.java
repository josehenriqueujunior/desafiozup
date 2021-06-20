package br.com.zup.orangetalents.desafio.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

	@Entity(name = "veiculo")
	public class VeiculoModel {
		
		@Id
		@GeneratedValue
		private Integer idVeiculo;
		@Column(nullable = false ,length = 1)
		@JsonProperty("TipoVeiculo")
		private Integer tipoVeiculo;
		@Column(nullable = false, length = 255)
		@JsonProperty("Marca")
		private String marca;
		@Column(nullable = false, length = 255)
		@JsonProperty("Modelo")
		private String modelo;
		@Column(nullable = false, length = 4)
		@JsonProperty("AnoModelo")
		private Integer anoModelo;
		@Column(nullable = false, length = 50)
		@JsonProperty("Combustivel")
		private String combustivel;
		@Column(nullable = false)
		@JsonProperty("Valor")
		private String valor;
		@Column(nullable = false)
		private Integer idUsuario;
		@Transient
		private boolean habiltaRodizio;
		
		public Integer getTipoVeiculo() {
			return tipoVeiculo;
		}
		
		public void setTipoVeiculo(Integer tipoVeiculo) {
			this.tipoVeiculo = tipoVeiculo;
		}
		
		public String getMarca() {
			return marca;
		}
		
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		public String getModelo() {
			return modelo;
		}
		
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public String getCombustivel() {
			return combustivel;
		}
		
		public void setCombustivel(String combustivel) {
			this.combustivel = combustivel;
		}

		public String getValor() {
			return valor;
		}

		public void setValor(String valor) {
			this.valor = valor;
		}

		public Integer getIdUsuario() {
			return idUsuario;
		}

		public void setIdUsuario(Integer idUsuario) {
			this.idUsuario = idUsuario;
		}

		public Integer getAnoModelo() {
			return anoModelo;
		}

		public void setAnoModelo(Integer anoModelo) {
			this.anoModelo = anoModelo;
		}

		public boolean HabiltaRodizio() {
			boolean retornoMetodo = false;
			
			int diaSemana = Calendar.DAY_OF_WEEK;
			
			if((this.anoModelo.toString().endsWith("0") || this.anoModelo.toString().endsWith("1")) && diaSemana == 1)
				retornoMetodo = true;
			else if((this.anoModelo.toString().endsWith("2") || this.anoModelo.toString().endsWith("3")) && diaSemana == 2)
				retornoMetodo = true;
			else if((this.anoModelo.toString().endsWith("4") || this.anoModelo.toString().endsWith("5"))  && diaSemana == 3)
				retornoMetodo = true;
			else if((this.anoModelo.toString().endsWith("6") || this.anoModelo.toString().endsWith("7"))  && diaSemana == 4)
				retornoMetodo = true;
			else if((this.anoModelo.toString().endsWith("8") || this.anoModelo.toString().endsWith("9"))  && diaSemana == 5)
				retornoMetodo = true;
			
			return retornoMetodo;
		}
	}
