package br.com.codEngeneering.user;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.codEngeneering.desenvolvedor.Desenvolvedor;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="username", nullable=false)
	private String username;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="type", nullable=false)
	private int type;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="user_id")
	private Desenvolvedor dev;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Desenvolvedor getDev() {
		return dev;
	}

	public void setDev(Desenvolvedor dev) {
		this.dev = dev;
	}
	
}
