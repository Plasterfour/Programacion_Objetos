/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nubia;

import javax.swing.UIManager;

/**
 *
 * @author Francisco Gallegos
 */
public class Nubia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception ex){
        }
       new Main();
    }
       
    
}
