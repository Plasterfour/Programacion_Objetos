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
public class Salary {
    private Integer hora;
    private Integer extra;
    private Integer salario;
    
    public Salary( Integer hora,Integer extra,Integer salario){
        this.hora=hora;
        this.extra=extra;
        this.salario=salario;
    }
    
    public Integer HoraRegular(){
        return getSalario()*getHora();
    }
    public Double hrSalario(){
        return (getHora()+getExtra())*1.5;
    }

    /**
     * @return the hora
     */
    public Integer getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Integer hora) {
        this.hora = hora;
    }

    /**
     * @return the extra
     */
    public Integer getExtra() {
        return extra;
    }

    /**
     * @param extra the extra to set
     */
    public void setExtra(Integer extra) {
        this.extra = extra;
    }

    /**
     * @return the salario
     */
    public Integer getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Integer salario) {
        this.salario = salario;
    }
    
}

