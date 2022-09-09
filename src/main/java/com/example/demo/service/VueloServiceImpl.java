package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vuelo;
import com.example.demo.reposiotory.IVueloRepository;
@Service
public class VueloServiceImpl implements IVueloService{
	
	@Autowired
	private IVueloRepository VueloRepository;
	
	@Override
	public List<Vuelo> buscarVuelos(String origen, String destino, String fechaVuelo) {
		// TODO Auto-generated method stub
		return this.VueloRepository.buscarVuelos(origen, destino, fechaVuelo);
	}

	@Override
	public Vuelo cantAsientos(String numero) {
		// TODO Auto-generated method stub
		return this.VueloRepository.cantAasientos(numero);
	}
	
	@Override
	public void actualizarAsientos(Vuelo v) {
		// TODO Auto-generated method stub
		this.VueloRepository.actualizarAsientos(v);
	}

}
