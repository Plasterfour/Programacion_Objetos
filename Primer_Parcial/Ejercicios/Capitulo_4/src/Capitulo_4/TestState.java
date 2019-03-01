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
public class TestState {
    
    private String CiudadP;
    private String nombre;
    private String pob;
    private String capital;
    private String Nomb;
    private Integer num;
    
    public TestState(String nombre, Integer num, String Nomb, String pob, String capital, String CiudadP) {
        this.nombre = nombre;
        this.num = num;
        this.Nomb = Nomb;
        this.pob = pob;
        this.capital = capital;
        this.CiudadP = CiudadP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getNomb() {
        return Nomb;
    }

    public void setNomb(String Nomb) {
        this.Nomb = Nomb;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCiudadP() {
        return CiudadP;
    }

    public void setCiudadP(String CiudadP) {
        this.CiudadP = CiudadP;
    }
  
    private class City{

        public City(String nombre, String pob) {
            
        } 
    }
}
