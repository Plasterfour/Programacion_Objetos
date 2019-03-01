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
public class TestBread {
     public TestBread(String type, int calories){
		this.calories=calories;
		this.type=type;
	}
	
	public final static String MOTTO="The staff of life";
	private String type;
	private int calories;
	private String message;

	
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}


	public String getMessage() {
		return MOTTO;
	}
    
}
