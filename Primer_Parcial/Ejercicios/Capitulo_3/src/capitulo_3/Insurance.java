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
public class Insurance {
    private Integer nacimiento;
    private Integer actual;


    public Insurance(Integer nacimiento,Integer actual){
        this.actual=actual;
        this.nacimiento=nacimiento;
    }
    
    public Integer edad (){
        return getActual()-getNacimiento();
    }
    public Integer seguro(){
        return (((edad())/10)+15)*20;
    }

    /**
     * @return the nacimiento
     */
    public Integer getNacimiento() {
        return nacimiento;
    }

    /**
     * @param nacimiento the nacimiento to set
     */
    public void setNacimiento(Integer nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * @return the actual
     */
    public Integer getActual() {
        return actual;
    }

    /**
     * @param actual the actual to set
     */
    public void setActual(Integer actual) {
        this.actual = actual;
    }
   
}