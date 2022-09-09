package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Vuelo;
import com.example.demo.service.IVueloService;

@SpringBootApplication
public class ExamenFinalAbApplication  implements CommandLineRunner {

	@Autowired
	IVueloService VueloService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamenFinalAbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	 List<Vuelo> listavuelo =	this.VueloService.buscarVuelos("Quito", "Loja", "25/12/2022");
	 
	 for(Vuelo v: listavuelo) {
		 System.out.println(v);
	 }
	 
	}

}
