package com.inventario.app.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Rol {
	
	@Id
	@Column(name="id_rol")
	private Long id_rol;
	@Column(name="nombre_rol")
	private String nombre_rol;
	
	 @ManyToOne
	 @JoinColumn(name="id_usuario", nullable=false)
	 private Usuario usuario;
	
	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rol(Long id_rol, String nombre_rol) {
		super();
		this.id_rol = id_rol;
		this.nombre_rol = nombre_rol;
	}
	public Long getId_rol() {
		return id_rol;
	}
	public void setId_rol(Long id_rol) {
		this.id_rol = id_rol;
	}
	public String getNombre_rol() {
		return nombre_rol;
	}
	public void setNombre_rol(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}
	
	
}
