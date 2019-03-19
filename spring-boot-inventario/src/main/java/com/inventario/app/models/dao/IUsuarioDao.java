package com.inventario.app.models.dao;

import java.util.List;

import com.inventario.app.models.entity.Usuario;

public interface IUsuarioDao {
	
	public List<Usuario>findAll();

}
