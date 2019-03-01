/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_4;

/**
 *
 * @author Francisco Gallegos
 */
public class Circle {
    static final double PI=Math.PI;
	
	private double radio;
	private double diametro;
	private double area;
	
	public Circle(){
		this.radio=1;
		this.diametro=2*radio;
		this.area=PI*(radio*radio);
		
	}
	
	public double getradio() {
		return radio;
	}
	public void setradio(double radio) {
		
		this.diametro=2*radio;
		this.area=PI*(radio*radio);
		this.radio = radio;
	}

	

	public void setArea(double area) {
		this.area = area;
        }
}