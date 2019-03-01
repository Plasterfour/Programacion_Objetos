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
public class Billing {
    static final double TAX = 0.8;
    double price = 23.50;
    int num = 1;
    
    public void solucion(){
        double totalPlusTax = price + (price* TAX);
        System.out.println("Total computeBilling para un album: "+ totalPlusTax);
    
    
        double subtotalPlusTax = (price*num);
        double totalPlusTax2 = subtotalPlusTax+(subtotalPlusTax*TAX);
        System.out.println("Total computeBilling para un album: "+ totalPlusTax2);
    
         double subtotalPlusTax3 = (price*num);
         double totalPlusTax3 = subtotalPlusTax+(subtotalPlusTax*TAX);
         System.out.println("Total computeBill para un Album: "+totalPlusTax3);
    }
    
}