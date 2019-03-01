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
public class MilesToFeet {
    private static Integer Pies=5280;
    private Double Millas;
    
    public MilesToFeet(Double Millas){
        this.Millas=Millas;
    }
    public Double Conversion(){
     return  getMillas()*Pies;
    }

    /**
     * @return the Pies
     */
    public static Integer getPies() {
        return Pies;
    }

    /**
     * @param aPies the Pies to set
     */
    public static void setPies(Integer aPies) {
        Pies = aPies;
    }

    /**
     * @return the Millas
     */
    public Double getMillas() {
        return Millas;
    }

    /**
     * @param Millas the Millas to set
     */
    public void setMillas(Double Millas) {
        this.Millas = Millas;
    }

   
}