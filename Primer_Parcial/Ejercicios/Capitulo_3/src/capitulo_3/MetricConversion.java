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
public class MetricConversion {
    private Integer dato;
    
    public MetricConversion(Integer dato){
        this.dato=dato;
    }
    
    public  Double Conversion1(){
        return (getDato() * 2.54);
    } 
    
    public Double Conversion2(){
        return (getDato()*3.7854 );
    }

    /**
     * @return the dato
     */
    public Integer getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Integer dato) {
        this.dato = dato;
    }
    
}

