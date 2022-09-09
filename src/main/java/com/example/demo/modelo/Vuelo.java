package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="vuelo")
public class Vuelo {

	@Id
	@Column(name = "vuel_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vuel_id_seq")
	@SequenceGenerator(name = "vuel_id_seq", sequenceName = "vuel_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "vuel_numero")
	private String numero;
	
	@Column(name = "vuel_origen")
	private String origen;
	
	@Column(name = "vuel_destino")
	private String destino;
	
	@Column(name = "vuel_fecha_vuelo")
	private String fechaVuelo;
	
	@Column(name = "vuel_asientos_disponibles")
	private Integer asientosDisponibles;
	
	@Column(name = "vuel_valor_asiento")
	private BigDecimal valorAsiento;
	
	@Column(name = "vuel_estado")
	private String estado;
	
	
	@ManyToOne()
	@JoinColumn(name="vuel_avio_id")
	private Avion avion;

	@OneToMany(mappedBy = "vuelo" )
	private List<CompraPasaje> compraPasaje;

	
	
	
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", numero=" + numero + ", origen=" + origen + ", destino=" + destino
				+ ", fechaVuelo=" + fechaVuelo + ", asientosDisponibles=" + asientosDisponibles + ", valorAsiento="
				+ valorAsiento + ", estado=" + estado + ", avion=" + avion + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Integer getAsientosDisponibles() {
		return asientosDisponibles;
	}

	public void setAsientosDisponibles(Integer asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}

	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public List<CompraPasaje> getCompraPasaje() {
		return compraPasaje;
	}

	public void setCompraPasaje(List<CompraPasaje> compraPasaje) {
		this.compraPasaje = compraPasaje;
	}
	
	
	
	
}
