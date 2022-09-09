package com.example.demo.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vuelo;

@Service
public class ComprarPasajeServiceImpl  implements IComprarPasajeService{

	@Autowired
	private IVueloService vueloService;
	
	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void Reservar(Integer cantidadAsientosReservar, String cedula, String numero) {
		// TODO Auto-generated method stub
		
		Vuelo v= this.vueloService.cantAsientos(numero);
		Integer cantAsientosDis=0  ;
		Integer asientosFinales=0;
		
		if ( v.getAsientosDisponibles() > cantidadAsientosReservar ) {
			 cantAsientosDis =  v.getAsientosDisponibles();
			 asientosFinales = cantAsientosDis-cantidadAsientosReservar;
			v.setAsientosDisponibles(asientosFinales);
			v.setEstado("RES");
			
			this.vueloService.actualizarAsientos(v);
			
		}
	}
	
}
