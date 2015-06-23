package br.com.codEngeneering.desenvolvedor;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name="desenvolvedor")
public class Desenvolvedor {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="RG", nullable=false)
	private String rg;
	
	@Column(name="CPF", nullable=false)
	private String cpf;
	
	@Column(name="funcao", nullable=false)
	private String funcao;
	
	@Column(name="nivel", nullable=false)
	private EnumNivel nivel;
	
	@Transient
	private List<EnumNivel> niveis;
	
	@Transient
	private String username;
	
	@Transient
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EnumNivel getNivel() {
		return nivel;
	}

	public void setNivel(EnumNivel nivel) {
		this.nivel = nivel;
	}

	public List<EnumNivel> getNiveis() {
		return niveis;
	}

	public void setNiveis(List<EnumNivel> niveis) {
		this.niveis = niveis;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
