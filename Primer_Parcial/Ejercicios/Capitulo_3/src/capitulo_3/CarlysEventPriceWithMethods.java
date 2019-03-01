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
public class CarlysEventPriceWithMethods {
     private Integer Invitados;
    public CarlysEventPriceWithMethods(Integer Invitados ){
        this.Invitados=Invitados;
    }
    
    public Integer CanInvitados(){
        return getInvitados()*35;
    }
    
    public String ToString(){
        if(getInvitados()>=50){
            return String.format("Verdadero");
        }else{
            return String.format("Falso");
        }
    }

    /**
     * @return the Invitados
     */
    public Integer getInvitados() {
        return Invitados;
    }

    /**
     * @param Invitados the Invitados to set
     */
    public void setInvitados(Integer Invitados) {
        this.Invitados = Invitados;
    }
}

