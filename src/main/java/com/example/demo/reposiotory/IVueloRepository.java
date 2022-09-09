package com.example.demo.reposiotory;

import java.util.List;

import com.example.demo.modelo.Vuelo;

public interface IVueloRepository {
	public List<Vuelo> buscarVuelos(String origen, String destino, String fechaVuelo);
	public void actualizarAsientos(Vuelo v);
	public Vuelo cantAasientos(String numero);
}
