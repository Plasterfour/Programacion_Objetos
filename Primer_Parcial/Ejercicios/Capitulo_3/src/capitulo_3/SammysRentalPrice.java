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
public class SammysRentalPrice {
    private Integer Min;
    public static final Integer CostHr=40;
    
    
    public SammysRentalPrice(Integer Min){
        this.Min=Min;
    }
    
    public Integer Costo(){
        return ((Min/60)*CostHr)+(Min/CostHr);
        
    }
    
}
