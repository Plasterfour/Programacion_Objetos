/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco Gallegos
 */
public class Taxi extends Pasajero{
	private Integer aniosConcesion;
	public Taxi(String placa, 
			String noSerie, 
			String marca, 
			Integer modelo, 
			Double valorFactura, 
			Integer noPasajeros, Integer aniosConcesion) {
		super(placa, noSerie, marca, modelo, valorFactura, noPasajeros);
		this.setAniosConcesion(aniosConcesion);
		// TODO Auto-generated constructor stub
	}
	public Integer getAniosConcesion() {
		return aniosConcesion;
	}
	public void setAniosConcesion(Integer aniosConcesion) {
		this.aniosConcesion = aniosConcesion;
	}
	
	@Override
	public Double calcularTenencia() {
		return super.calcularTenencia()*(1+this.getNoPasajeros()/10);
	}	
}