package com.inventario.app.models.dao;

import java.util.List;
import com.inventario.app.models.entity.Venta;

public interface IVentaDao {
	public List<Venta>findAll();
}
