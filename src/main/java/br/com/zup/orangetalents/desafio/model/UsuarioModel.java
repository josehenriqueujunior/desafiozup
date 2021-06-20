package br.com.zup.orangetalents.desafio.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name = "usuario")
public class UsuarioModel {
	
	@Id
	@GeneratedValue
	private Integer idUsuario;
	@Column(nullable = false, length = 255)
	private String nome;
	@Column(nullable = false, length = 11, unique = true)
	private Long cpf;
	@Column(nullable = false, length = 255, unique = true)
	private String email;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(nullable = false)
	private Date dataNascimento;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<VeiculoModel> veiculos;
		
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public List<VeiculoModel> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(List<VeiculoModel> veiculos) {
		this.veiculos = veiculos;
	}
}
