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
public class BirdSighting {
    
    private String birdSpecies;
    private int numberSeen;
    private int numerDay;
	
	public BirdSighting(){
            this.birdSpecies="Robin";
            this.numberSeen=3;
            this.numerDay=1;
	}
	
	public BirdSighting(String birdSpecies, int numberSeen, int numerDay){
            this.birdSpecies=birdSpecies;
            this.numberSeen=numberSeen;
            this.numerDay=numerDay;
	}
	
	public String getBirdSpecies() {
            return birdSpecies;
	}
        
	public void setBirdSpecies(String birdSpecies) {
		this.birdSpecies = birdSpecies;
	}
	public int getNumberSeen() {
		return numberSeen;
	}
	public void setNumberSeen(int numberSeen) {
		this.numberSeen = numberSeen;
	}
	public int getNumerDay() {
		return numerDay;
	}
	public void setNumerDay(int numerDay) {
		this.numerDay = numerDay;
	}
}
