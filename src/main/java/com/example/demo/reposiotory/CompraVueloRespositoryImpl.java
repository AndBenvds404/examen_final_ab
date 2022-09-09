package com.example.demo.reposiotory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CompraPasaje;

@Repository
@Transactional
public class CompraVueloRespositoryImpl implements ICompraVueloRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertarCompra(CompraPasaje cp) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cp);
	}
	
}
