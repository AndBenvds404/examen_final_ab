package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Vuelo;

public interface IVueloService {

	public List<Vuelo> buscarVuelos(String origen, String destino, String fechaVuelo);
	public Vuelo cantAsientos(String numero);
	public void actualizarAsientos(Vuelo v);
	
}
