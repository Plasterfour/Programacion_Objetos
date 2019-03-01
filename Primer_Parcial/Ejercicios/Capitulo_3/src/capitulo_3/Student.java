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
public class Student {
    private Integer id;
    private Integer puntos;
    private static  Integer creditos=3;
    
    public Student(Integer id,Integer puntos){
        this.id=id;
        this.puntos=puntos;
    }
    
    
    public String ToString (){
        return String.format("Promedio : "+ getPuntos()/getCreditos());
    } 

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the puntos
     */
    public Integer getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    /**
     * @return the creditos
     */
    public static Integer getCreditos() {
        return creditos;
    }

    /**
     * @param aCreditos the creditos to set
     */
    public static void setCreditos(Integer aCreditos) {
        creditos = aCreditos;
    }
}
