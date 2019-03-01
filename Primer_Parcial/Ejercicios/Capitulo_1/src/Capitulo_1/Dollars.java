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
public class Dollars {
    public static final Integer VEINTE=20;
    public static final Integer DIEZ=10;
    public static final Integer CINCO=5;
    public static final Integer UNO=1;
    private Integer Dollar;

    public Dollars(Integer Dollar){
    this.Dollar=Dollar;
}
    public String ToString (){
        return String.format("20´s =%d  10's =%d 5´s =%d 1´s "
                + "=%d",Dollar/VEINTE,Dollar/DIEZ,Dollar/CINCO,Dollar/UNO);
    }

  
}