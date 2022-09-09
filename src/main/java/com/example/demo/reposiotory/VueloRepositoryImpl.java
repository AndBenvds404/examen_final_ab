package com.example.demo.reposiotory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vuelo;
@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public List<Vuelo> buscarVuelos(String origen, String destino, String fechaVuelo) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery = this.entityManager.createQuery("SELECT v FROM Vuelo v WHERE v.origen=: origen AND v.destino=: destino AND v.fechaVuelo=:fechaVuelo AND v.estado='D' " , Vuelo.class);
		myQuery.setParameter("origen", origen);
		myQuery.setParameter("destino",destino);
		myQuery.setParameter("fechaVuelo", fechaVuelo);
		
		return myQuery.getResultList();
	}
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizarAsientos(Vuelo v) {
		// TODO Auto-generated method stub
		this.entityManager.merge(v);
		
	}
	@Override
	public Vuelo cantAasientos(String numero) {
		// TODO Auto-generated method stub
		TypedQuery< Vuelo> myQuery = this.entityManager.createQuery("Select v FROM Vuelo v WHERE v.numero=:numero",Vuelo.class);
		myQuery.setParameter("numero", numero);
				return myQuery.getSingleResult();
	}

}
