package br.com.SpringBoot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="usuario")
public class Usuario_Model {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Size(min=3, max = 20, message= "o Usuário deve conter entre 3 à 20 caracteres")
private String usuario;
@Email
private String email;
private String senha;


public Usuario_Model() {
	super();
}

public Usuario_Model(String usuario, String senha) {
	super();
	this.usuario = usuario;
	this.senha = senha;
}

public Usuario_Model(String usuario, String email, String senha) {
	super();
	this.usuario = usuario;
	this.email = email;
	this.senha = senha;
}

public Usuario_Model(long id, String usuario, String email, String senha) {
	super();
	this.id = id;
	this.usuario = usuario;
	this.email = email;
	this.senha = senha;
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getusuario() {
	return usuario;
}
public void setusuario(String usuario) {
	this.usuario = usuario;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}

}
