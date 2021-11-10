package com.example.lavadero.lavadero.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Usuario {
     private String nombre;
     private String apellido;
     private String mail;
     private String password ;
     
     
	public Usuario() {
		
		// TODO Auto-generated constructor stub
	}


	public Usuario(String nombre, String apellido, String mail, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.password = password;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
     
     
}
