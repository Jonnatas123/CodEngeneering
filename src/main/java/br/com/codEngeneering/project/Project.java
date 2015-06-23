package br.com.codEngeneering.project;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import br.com.codEngeneering.desenvolvedor.Desenvolvedor;

@Data
@Entity
@Table(name="project")
public class Project {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="descricao", nullable=true)
	private String descricao;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="PROJETO_TEM_DESENVOLVEDORES", joinColumns={@JoinColumn(name="PROJETO_ID", referencedColumnName="id")}, 
	inverseJoinColumns={@JoinColumn(name="DESENVOLVEDOR_ID", referencedColumnName="id")})
	private List<Desenvolvedor> desenvolvedores;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Desenvolvedor> getDesenvolvedores() {
		return desenvolvedores;
	}

	public void setDesenvolvedores(List<Desenvolvedor> desenvolvedores) {
		this.desenvolvedores = desenvolvedores;
	}

}