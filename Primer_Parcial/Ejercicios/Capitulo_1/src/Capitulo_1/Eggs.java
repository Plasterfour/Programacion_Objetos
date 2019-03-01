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
public class Eggs {
public static Integer DOCENA=12;
public static Double DOCENAC=3.25;
public static Double UNO=0.45;
private Integer Eggs;

public Eggs(Integer Eggs){
    this.Eggs=Eggs;
}

public int calcularDocena(){
    return (Eggs/DOCENA);
}
public int calcularIndividual(){
    return (Eggs%DOCENA);
}
public double costo(){
    return ((calcularDocena()*DOCENAC)+(calcularDocena()*UNO));
}


    /**
     * @return the DOCENA
     */
    public static Integer getDOCENA() {
        return DOCENA;
    }

    /**
     * @param aDOCENA the DOCENA to set
     */
    public static void setDOCENA(Integer aDOCENA) {
        DOCENA = aDOCENA;
    }

    /**
     * @return the DOCENAC
     */
    public static Double getDOCENAC() {
        return DOCENAC;
    }

    /**
     * @param aDOCENAC the DOCENAC to set
     */
    public static void setDOCENAC(Double aDOCENAC) {
        DOCENAC = aDOCENAC;
    }

    /**
     * @return the UNO
     */
    public static Double getUNO() {
        return UNO;
    }

    /**
     * @param aUNO the UNO to set
     */
    public static void setUNO(Double aUNO) {
        UNO = aUNO;
    }

    /**
     * @return the Eggs
     */
    public Integer getEggs() {
        return Eggs;
    }

    /**
     * @param Eggs the Eggs to set
     */
    public void setEggs(Integer Eggs) {
        this.Eggs = Eggs;
    }
   
}
