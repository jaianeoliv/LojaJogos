package com.generation.lojagames.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O atributo usuario é obrigatório.")
	@Size(min = 5, max = 25, message = "O atributo usuario precisa conter entre 5 e 25 caracteres")
	private String usuario;
	
	@NotNull(message = "O atributo nome é obrigatório.")
	@Size(min = 10, max = 50, message = "O atributo nome precisa contter entre 10 e 50 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo senha é obrigatório.")
	@Size(min = 8, max = 30, message = "O atributo senha precisa conter entre 8 a 30 caracteres")
	private String senha;
	
	private String foto;
	
	@Column(name = "data_de_nascimento")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
