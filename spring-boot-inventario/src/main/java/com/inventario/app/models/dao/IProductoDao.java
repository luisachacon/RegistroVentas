package com.inventario.app.models.dao;

import java.util.List;

import com.inventario.app.models.entity.Producto;

public interface IProductoDao {

	public List<Producto>findAll();
}
