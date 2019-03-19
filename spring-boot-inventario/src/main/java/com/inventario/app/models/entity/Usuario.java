package com.inventario.app.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Long idUsuario;
	
	@Column(name = "contrasenia")
	private String contrasenia;

	@Column(name="id_rol")
	private String rol;
	
	@ManyToMany
	@JoinTable(name="ventas",joinColumns={@JoinColumn(name="id_usuario")},inverseJoinColumns= {@JoinColumn(name="id_producto")})
	
	private List<Venta>ventas;
	
	@OneToMany(mappedBy="usuario")
	private List<Rol>roles;
	
	public Usuario() {
		super();
	}

	public Usuario(Long id, String contrasenia, String rol, List<Venta> ventas, List<Rol> roles) {
		super();
		this.idUsuario = id;
		this.contrasenia = contrasenia;
		this.rol = rol;
		this.ventas = ventas;
		this.roles = roles;
	}

	public Long getId() {
		return idUsuario;
	}

	public void setId(Long id) {
		this.idUsuario = id;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
	
}
