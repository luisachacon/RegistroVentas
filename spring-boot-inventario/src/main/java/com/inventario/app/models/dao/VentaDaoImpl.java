package com.inventario.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.inventario.app.models.entity.Venta;

@Repository
public class VentaDaoImpl implements IVentaDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Venta> findAll() {
		// TODO Auto-generated method stub
		return  em.createQuery("from Venta").getResultList();
	}

	
}
