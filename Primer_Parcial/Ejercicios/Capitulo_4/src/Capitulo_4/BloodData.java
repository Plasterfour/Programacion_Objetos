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
public class BloodData {
    private String bloodType;
	private char factorRH;
	
	
	public BloodData(){
		this.bloodType="O";
		this.factorRH='+';
	}
	
	public BloodData(String bloodType,char factorRH){
		this.bloodType=bloodType;
		this.factorRH=factorRH;
	}
	
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public char getFactorRH() {
		return factorRH;
	}
	public void setFactorRH(char factorRH) {
		this.factorRH = factorRH;
	}
}
