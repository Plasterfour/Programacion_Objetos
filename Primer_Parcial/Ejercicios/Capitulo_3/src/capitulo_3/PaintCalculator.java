/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_3;

/**
 *
 * @author Francisco Gallegos
 */
public class PaintCalculator {

     public static final Integer PRICE=32; //constantes
	public static final Integer COVER=350;
	private Integer ancho;
	private Integer alto;
	private Integer largo;
	
	public PaintCalculator(Integer ancho,Integer alto, Integer largo) {
		this.alto=alto;
		this.ancho=ancho;
		this.largo=largo;
	}
	
	public void setAlto(Integer alto) {
		this.alto=alto;
	}
	
	public Integer getAlto() {
		return this.alto;
	}
	
	public void setLargo(Integer largo) {
		this.largo=largo;
	}
	
	public Integer getLargo() {
		return this.largo;
	}
	
	public void setAncho(Integer ancho) {
		this.ancho=ancho;
	}
	
	public Integer getAncho() {
		return this.ancho;
        }
	public Integer calcularArea() {
		return ((largo*alto)*2+(ancho*alto)*2);
	}
	
	public Integer numeroGalones() {
		return calcularArea()/COVER + calcularArea()%COVER>0?1:0;
	}
	public Integer costo() {
		return (numeroGalones()*PRICE);
	}
    
}
