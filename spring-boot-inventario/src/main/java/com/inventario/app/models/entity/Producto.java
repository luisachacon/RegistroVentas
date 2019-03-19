package com.inventario.app.models.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
	@Column(name="id_product")
	@Id
	private Long idProducto;
	
	private String nombre;
	private int cantidad;
	private int preciomax;
	private int preciomin;
	
	@ManyToMany(mappedBy="productos")
	private List<Usuario>usuarios;
	
	@OneToMany(mappedBy="productos")
	private List<Venta>ventas;
	
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public List<Venta> getVentas() {
		return ventas;
	}
	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(Long id, String nombre, int cantidad, int preciomax, int preciomin) {
		super();
		this.idProducto = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.preciomax = preciomax;
		this.preciomin = preciomin;
	}
	public Long getId() {
		return idProducto;
	}
	public void setId(Long id) {
		this.idProducto = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPreciomax() {
		return preciomax;
	}
	public void setPreciomax(int preciomax) {
		this.preciomax = preciomax;
	}
	public int getPreciomin() {
		return preciomin;
	}
	public void setPreciomin(int preciomin) {
		this.preciomin = preciomin;
	}
	
	
}
