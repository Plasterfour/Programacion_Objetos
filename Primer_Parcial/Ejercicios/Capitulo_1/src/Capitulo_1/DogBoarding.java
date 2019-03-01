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
public class DogBoarding {
    private static Double centavos=0.50;
    private Integer libra;
    private Integer dia;


    public DogBoarding(Integer libra,Integer dia){
    this.libra=libra;
    this.dia=dia;

    }
    
    public Double Costo(){
        return getLibra()*getCentavos();
    }
    public Double Costodia(){
        return Costo()*getDia();
    }

    /**
     * @return the centavos
     */
    public static Double getCentavos() {
        return centavos;
    }

    /**
     * @param aCentavos the centavos to set
     */
    public static void setCentavos(Double aCentavos) {
        centavos = aCentavos;
    }

    /**
     * @return the libra
     */
    public Integer getLibra() {
        return libra;
    }

    /**
     * @param libra the libra to set
     */
    public void setLibra(Integer libra) {
        this.libra = libra;
    }

    /**
     * @return the dia
     */
    public Integer getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(Integer dia) {
        this.dia = dia;
    }
    
}
