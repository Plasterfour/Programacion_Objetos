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
public class MathTest {
    
     public void mate(){
        double ma=Math.sqrt(37);
	double mb1=Math.sin(300);
	double mb2=Math.cos(300);
        double mc1=Math.ceil(22.8);
	double mc2=Math.floor(22.8);
        double mc3=Math.round(22.8);	
	double me = (Math.random() * 20) ;
		
	System.out.println("a: "+ma);
        System.out.println("b1: "+mb1);
	System.out.println("b2: "+mb2);
        System.out.println("c1: "+mc1);
	System.out.println("c2: "+mc2);
        System.out.println("c3: "+mc3);
	System.out.println("e: "+me);
    }
}
