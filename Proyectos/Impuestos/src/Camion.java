/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco Gallegos
 */
public class Camion extends Carga {
	private Integer ejes;
	public Camion(String placa, String noSerie, String marca, Integer modelo, Double valorFactura, Integer toneladas,
			Boolean publico,Integer ejes) {
		super(placa, noSerie, marca, modelo, valorFactura, toneladas, publico);
		this.setEjes(ejes);
		
	}
	public Integer getEjes() {
		return ejes;
	}
	public void setEjes(Integer ejes) {
		this.ejes = ejes;
	}
	@Override
	public Double calcularBaseGravable() {
		return super.calcularBaseGravable()*(1+(ejes*0.01));
	}
}