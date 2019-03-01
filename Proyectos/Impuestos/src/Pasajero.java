/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco Gallegos
 */
public abstract class Pasajero extends Vehiculo {
	private Integer noPasajeros;
	public Pasajero(String placa, 
			String noSerie, 
			String marca,
			Integer modelo, 
			Double valorFactura,
			Integer noPasajeros) {
		super(placa,noSerie,marca,modelo,valorFactura);
		this.setNoPasajeros(noPasajeros);
	}
	
	
	public Integer getNoPasajeros() {
		return noPasajeros;
	}
	public void setNoPasajeros(Integer noPasajeros) {
		this.noPasajeros = noPasajeros;
	}


	public Double calcularTenencia() {
		// TODO Auto-generated method stub
		return this.getValorFactura()*calcularBaseGravable();
	}

		
}