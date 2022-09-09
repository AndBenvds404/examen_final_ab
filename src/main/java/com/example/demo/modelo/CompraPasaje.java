package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="compra_pasaje")
public class CompraPasaje {
	
	@Id
	@Column(name="copa_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "copa_id_seq")
	@SequenceGenerator(name = "copa_id_seq", sequenceName = "copa_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name="copa_numero")
	private String numero;
	
	@Column(name="copa_asientos_comprados")
	private Integer asientosComprados;
	
	@Column(name="copa_estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "copa_vuel_id")
	private Vuelo vuelo;

	@ManyToOne
	@JoinColumn(name = "copa_clie_id")
	private Cliente cliente;

}
