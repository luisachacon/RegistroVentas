package com.inventario.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventas")
public class Venta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_venta")
	private Long idVenta;
	
	@Column(name="fecha_venta")
	private Date fechaVenta;
	
	@Column(name="total_venta")
	private int totalVenta;
	
	
	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(Long idVenta, Date fechaVenta, int totalVenta) {
		super();
		this.idVenta = idVenta;
		this.fechaVenta = fechaVenta;
		this.totalVenta = totalVenta;
	}

	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public int getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(int totalVenta) {
		this.totalVenta = totalVenta;
	}
	
	
	
}
