package com.inventario.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.inventario.app.models.entity.Rol;

@Repository
public class RolDaoImpl implements IRolDao {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Rol").getResultList();
	}
}
