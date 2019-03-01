/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Capitulo_4.Billing;
import Capitulo_4.BirdSighting;
import Capitulo_4.BloodData;
import Capitulo_4.Circle;
import Capitulo_4.FormLetterWriter;
import Capitulo_4.MathTest;
import Capitulo_4.TestBread;
import Capitulo_4.TestState;

/**
 *
 * @author Francisco Gallegos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FORMLETTERWRITTER
         FormLetterWriter form = new FormLetterWriter();
         form.displaySalutation("Francisco");
         form.displaySalutation("Francisco", "GP");
        
        //Billing 
         Billing bil = new Billing();
         bil.solucion();
                
        // BirdSighting
        BirdSighting bs = new BirdSighting();
        System.out.println("Especie: "+bs.getBirdSpecies());
        System.out.println("Numero de vistas: "+bs.getNumberSeen());
        System.out.println("Numero de dias: "+bs.getNumerDay());
                
        //BloodData
        BloodData bd = new BloodData();
        System.out.println("Tipo de sangre: "+bd.getBloodType());
        System.out.println("RH: "+bd.getFactorRH());
        
        //TestBread
        TestBread tb1= new TestBread("garlic", 50);
        TestBread tb2= new TestBread("candy", 300);
        System.out.println(tb1.getType());
        System.out.println(tb1.getCalories());
        System.out.println(tb1.getMessage());
        System.out.println(tb2.getType());
	System.out.println(tb2.getCalories());
        System.out.println(tb1.getMessage());
        
        //Circle
        Circle circulo = new Circle();
	circulo.setradio(2.5);
	System.out.println("Radio del circulo es: "+circulo.getradio());
	
        //MathTest
         MathTest mat = new MathTest();
                mat.mate();
        
        //TestState
         TestState st = new TestState("OAXACA", 2, "JUAREZ", "OAXACA", "OAXACA", "OAXACA");
         st.getCapital();
         st.getCiudadP();
         st.getPob();
                
    }
    
}
