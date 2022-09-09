package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Vuelo;
import com.example.demo.service.IVueloService;

@Controller
@RequestMapping("/vuelos")
public class VuelosController {

	
	@Autowired
	private IVueloService VueloService;
	
	@GetMapping("/mostrar/{origen}/{destino}/{fecha}")
	public String mostrarVuelos(@PathVariable String origen, @PathVariable String destino, @PathVariable String fecha,Model modelo ) {
		
		List<Vuelo> listaVuelo =  this.VueloService.buscarVuelos(origen, destino, fecha);
		modelo.addAttribute("vuelo",listaVuelo );
		return"vistaListaVuelos";
	}
	
	@GetMapping("/buscar")
	public String buscarVuelos() {
		
		return "vistaBuscarVuelos";
	}


}
