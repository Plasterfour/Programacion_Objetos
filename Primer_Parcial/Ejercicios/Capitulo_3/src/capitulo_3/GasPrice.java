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
public class GasPrice {
    private Integer pricePerBarrel;
    private double R1;
    private double R2;
    
    public GasPrice(Integer pricePerBarrel){
        this.pricePerBarrel=pricePerBarrel;
        
    }
    public Double Range(){
        return ((pricePerBarrel-100)/10)*0.4+3.5;
    }
    
    public Double Range2(){
        return ((pricePerBarrel-100)/10)*0.4+4;
    }
}

