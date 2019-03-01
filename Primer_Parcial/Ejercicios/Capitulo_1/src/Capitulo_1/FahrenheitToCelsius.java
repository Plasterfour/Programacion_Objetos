/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_1;

/**
 *
 * @author Francisco Gallegos
 */
public class FahrenheitToCelsius {
    private Integer Fahrenheit;
    
    
    public FahrenheitToCelsius(Integer Fahrenheit){
        this.Fahrenheit=Fahrenheit;
    }
    
    public Double Conversion(){
       return ((Fahrenheit-32)*0.5555);
    }

    /**
     * @return the Fahrenheit
     */
    public Integer getFahrenheit() {
        return Fahrenheit;
    }

    /**
     * @param Fahrenheit the Fahrenheit to set
     */
    public void setFahrenheit(Integer Fahrenheit) {
        this.Fahrenheit = Fahrenheit;
    }

}
