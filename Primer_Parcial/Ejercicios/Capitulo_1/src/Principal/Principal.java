/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Capitulo_1.CarlysEventPrice;
import Capitulo_1.DogBoarding;
import Capitulo_1.Dollars;
import Capitulo_1.Eggs;
import Capitulo_1.Ejercicio1;
import Capitulo_1.Ejercicio2;
import Capitulo_1.Ejercicio3;
import Capitulo_1.FahrenheitToCelsius;
import Capitulo_1.InchesToFeet;
import Capitulo_1.MilesToFeet;
import Capitulo_1.SammysRentalPrice;
import java.util.Scanner;

/**
 *
 * @author Francisco Gallegos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1
         Ejercicio1 ex=new Ejercicio1();
        System.out.println("Problema 1:\n");
        System.out.println("A="+ex.PA(3,7,2));
        System.out.println("B="+ex.PB(18,3,4));
        System.out.println("C="+ex.PC(9,3,12,4));
        System.out.println("D="+ex.PD(15,2));
        System.out.println("E="+ex.PE(14,3));
        System.out.println("F="+ex.PF(29,10));
        System.out.println("G="+ex.PG(14,2));
        System.out.println("H="+ex.PH(15,2));
        System.out.println("I="+ex.PI(31,7));
        System.out.println("J="+ex.PJ(6,4,1));
        System.out.println("K="+ex.PK(5,6,3));
        System.out.println("L="+ex.PL(25,3,2));
        System.out.println("M="+ex.PM(13,15));
        
        //Ejercicio 2
         Ejercicio2 ex2=new Ejercicio2();
        System.out.println("Problema 2:\n");
        System.out.println(ex2.IsBA(5,8));
        System.out.println(ex2.IsBB(4,9));
        System.out.println(ex2.IsBC(3,4));
        System.out.println(ex2.IsBD(12,12));
        System.out.println(ex2.IsBE(3,4,8));
        System.out.println(ex2.IsBF(7,9,2));
        System.out.println(ex2.IsBG(5,5));
        System.out.println(ex2.IsBH(15,3,5));
        System.out.println(ex2.IsBI(9,9));
        System.out.println(ex2.IsBJ(3,5,2,16));
        
        //ejercicio 3
         Ejercicio3 Ex3=new Ejercicio3();
        System.out.println("Ejercicio 3:\n");
        System.out.println(Ex3.A());
        System.out.println(Ex3.B());
        System.out.println(Ex3.C());
        System.out.println(Ex3.D());
        System.out.println(Ex3.E());
        System.out.println(Ex3.F());
        System.out.println(Ex3.G());
        System.out.println(Ex3.H());
        System.out.println(Ex3.I());
        
        //MilesToFeet
         Scanner t=new Scanner(System.in);
         Double Millas;
        MilesToFeet ex4=new MilesToFeet(8.5);
        System.out.println("La distancia a la casa de mi tio es de "+ex4.getMillas()+" Millas o "+ex4.Conversion()+" Pies");
        System.out.println("Valor en Pies: ");
        Millas= t.nextDouble();
        System.out.println("La distancia a la casa de mi tio es de "+Millas+" Millas o "+ex4.Conversion()+" Pies");

        //ProjectedSales
        Scanner ps=new Scanner(System.in);
        final Double incremento=0.10;
        Double norte;
        Double sur;
        System.out.println("Norte:");
        norte=ps.nextDouble();
        System.out.println("Sur:");
        sur=ps.nextDouble();
        
        System.out.println("ventas para la diviosn del norte:"+(norte*incremento+norte));
        System.out.println("ventas para la diviosn del norte:"+(sur*incremento+sur));
        
        //InchesToFeet
         Scanner sc= new Scanner(System.in);
        Integer Pies;
        InchesToFeet inft=new InchesToFeet(86);
        System.out.println("Tiene "+inft.conversionfeet()+" ft y "+inft.conversioninches()+" in");
        System.out.println("Valor en Pies:");
        Pies= sc.nextInt();
        System.out.println("Tiene "+Pies+"ft con "+inft.conversioninches()+" in");
    
        //Eggs
        Eggs eg=new Eggs(27);
      eg.costo();
        System.out.println("Usted Odenó "+eg.getEggs()+" huevos.Eso es "+eg.calcularDocena()+" docenas a $"
                +eg.getDOCENAC()+" por docena y "+eg.calcularIndividual()+" huevos sueltos a $"+eg.getUNO()+
                " con u totla de $"+eg.costo());
        //DogBooarding
        DogBoarding DB=new DogBoarding(23,5);
        System.out.println(DB.Costodia());
        
        //Dollars
        Dollars Dl=new Dollars(55);
        System.out.println("Ejercicio 10: ");
        System.out.println(Dl.ToString());
        
        //FahrenheitToCelsius
        FahrenheitToCelsius Fc=new FahrenheitToCelsius(55);
        System.out.println(Fc.Conversion());
        
        //CarlysEventPrice
        CarlysEventPrice Ce= new CarlysEventPrice(10);
        System.out.println("Carly’s makes the food that makes it a party" );
       //Invitados= c.nextInt();
        System.out.println("Numero de invitados: "+Ce.getInvitados()+", precio por invitados: $35, precio total: "+Ce.ToString());
        
        System.out.println("Evento Grande: "+Ce.ToString());
        
        // SammysRentalPrice
        SammysRentalPrice Sr=new SammysRentalPrice(61);
        System.out.println(Sr.Costo());
        
    }
}
