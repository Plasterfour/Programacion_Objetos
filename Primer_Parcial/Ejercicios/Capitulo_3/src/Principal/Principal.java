/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import capitulo_3.ArithmeticMethods;
import capitulo_3.BankAccount;
import capitulo_3.CarlysEventPriceWithMethods;
import capitulo_3.GasPrice;
import capitulo_3.Insurance;
import capitulo_3.Interest;
import capitulo_3.MetricConversion;
import capitulo_3.PaintCalculator;
import capitulo_3.Porcentajes;
import capitulo_3.Salary;
import capitulo_3.SammysRentalPrice;
import capitulo_3.Student;
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
        //ArithmeticMethods
         Integer A;
        Integer B;
        Scanner an=new Scanner(System.in);
        ArithmeticMethods Am= new ArithmeticMethods();
        ArithmeticMethods2 Am2=new ArithmeticMethods2();
        
        Am.DisplayNumber10();
        Am.DisplayNumber100();
        Am.DisplayNumber1000();
        
        A= an.nextInt();
        B= an.nextInt();
        Am2.DisplayNumber10_2();
        Am2.DisplayNumber100_2();
        Am2.DisplayNumber1000_2();
        
        //Porcentajes
         Scanner p=new Scanner(System.in);
        Double Ap;
        Double Bp;
        Porcentajes Po=new Porcentajes(2.0,5.0);
        Porcentajes Pe=new Porcentajes(2.0,5.0);
       Po.computePercent();
       Po.setA(5.0);
       Po.setB(2.0);
       Po.computePercent();
       
       Ap= p.nextDouble();
       Bp= p.nextDouble();
       Pe.computePercent();
       
       //GasPrice
        String Galones;
        Scanner sc=new Scanner(System.in);
        GasPrice gp=new GasPrice(100);
        Galones=sc.nextLine();
        System.out.println("si el gas es de $ "+Galones+" por barril, entonces el precio en la bomba debe estar entre $"+ gp.Range()+" y $ "+gp.Range());
       
        //MetricConversion
        MetricConversion mc=new MetricConversion(5);
        System.out.println("Hay "+mc.Conversion1()+" Centrimetros en "+mc.getDato()+" Pulgadas.");
        System.out.println("Hay "+mc.Conversion2()+" Litros en "+mc.getDato()+" Galones.");
        
        // PaintCalculator
        PaintCalculator x = new PaintCalculator(15,20,10);
	    x.costo();
            System.out.println("Ejercicio 7");
	System.out.println("El costo es de ="+x.calcularArea());
        
        //Insurance
         Insurance in=new Insurance(1985, 2019);
        System.out.println("Tienes "+in.edad()+" y pagarias $"+in.seguro());
    
        //Salary
         Salary sa=new Salary(40,2,50);
        System.out.println("Tarifa de pago por hora: "+sa.getSalario());
        System.out.println("Tarifa de pago por horas reculares: "+sa.HoraRegular());
        System.out.println("Tarifa de pago por horas extra: "+sa.hrSalario());

        //Interest
        Interest inte=new Interest(100);
        System.out.println("El interes durante un año es de: $"+inte.Intereses());
        
        //Student 
        Student st=new Student(1421,10);
        System.out.println(st.ToString());
        System.out.println("ID: "+st.getId());
        System.out.println("Horas de credito: "+st.getCreditos());
        System.out.println("Puntos:"+st.getPuntos());
        
        //BankAccount
        BankAccount bn=new BankAccount (14254,3000,"Paco");
        System.out.println(bn.explainAccountPolicy());
        System.out.println(bn.getAccountNumber());
        System.out.println(bn.getName());
        System.out.println(bn.getAccountBalance());
        System.out.println(bn.deductMonthlyFee());
        
        //PaintCalculator
        PaintCalculator pc = new PaintCalculator(15,20,10);
	    pc.costo();
            System.out.println("Ejercicio 7");
	System.out.println("El costo es de ="+pc.calcularArea());
        
        //CarlysEventPriceWithMethods
         CarlysEventPriceWithMethods cew= new CarlysEventPriceWithMethods(10);
        System.out.println("Numero de invitados: "+cew.getInvitados());
           
           System.out.println("Carly’s makes the food that makes it a party" );
      
        System.out.println("Numero de invitados: "+cew.getInvitados()+", precio por invitados: $35, precio total: "+cew.getInvitados()*35);
        System.out.println("Evento Grande: "+cew.ToString());
        
        // SammysRentalPrice
         SammysRentalPrice Sr=new SammysRentalPrice(61);
        System.out.println(Sr.Costo());
    
    }
    
}
