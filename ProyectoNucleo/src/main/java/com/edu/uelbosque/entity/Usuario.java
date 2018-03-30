package com.edu.uelbosque.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String contraseña;
	
	public Usuario() {
		
	}
	public Usuario(Integer id) {
		this.id = id;
	}
	public Usuario(String nombre, String contraseña){
		this.nombre = nombre;
		this.contraseña = contraseña;
	}
	public Usuario(Integer id, String nombre, String contraseña) {
		this.id = id;
		this.nombre = nombre;
		this.contraseña = contraseña;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	

}
