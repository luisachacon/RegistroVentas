package com.inventario.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.inventario.app.models.entity.Usuario;

@Repository
public class UsuarioDaoImpl implements IUsuarioDao {

	@PersistenceContext 
	private EntityManager em;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Usuario").getResultList();
	}

}
