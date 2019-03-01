/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco Gallegos
 */
public abstract class Vehiculo {

	private String placa;
	private String noSerie;
	private String marca;
	private Integer modelo;
	private Double valorFactura;
	
	
	

	public Vehiculo(String placa, 
			String noSerie, 
			String marca, 
			Integer modelo, 
			Double valorFactura) {
		this.placa = placa;
		this.noSerie = noSerie;
		this.marca = marca;
		this.modelo = modelo;
		this.valorFactura = valorFactura;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNoSerie() {
		return noSerie;
	}

	public void setNoSerie(String noSerie) {
		this.noSerie = noSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	public Double getValorFactura() {
		return valorFactura;
	}

	public void setValorFactura(Double valorFactura) {
		this.valorFactura = valorFactura;
	}
	
	public abstract Double calcularTenencia(); 
	
	public Double calcularBaseGravable() {
		return this.modelo>=2009 ? 0.05 : 0.02;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vehiculo) {
			Vehiculo v = (Vehiculo)obj;
			return this.getPlaca() == v.getPlaca();
		}
		return false;
	}
}