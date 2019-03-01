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
public class ArithmeticMethods {
    private static Integer A=15;
    private static Integer B=30;
    private Integer Res;
   
    public void DisplayNumber10(){
        setRes((Integer) getA() + getB() + 10);
        System.out.println("Number10: "+getRes());
    }
    
     public void DisplayNumber100(){
        setRes((Integer) getA() + getB() + 100);
        System.out.println("Number100: "+getRes());
    }
      public void DisplayNumber1000(){
        setRes((Integer) getA() + getB() + 1000);
        System.out.println("Number1000: "+getRes());
    }

    /**
     * @return the A
     */
    public static Integer getA() {
        return A;
    }

    /**
     * @param aA the A to set
     */
    public static void setA(Integer A) {
        A = A;
    }

    /**
     * @return the B
     */
    public static Integer getB() {
        return B;
    }

    /**
     * @param aB the B to set
     */
    public static void setB(Integer aB) {
        B = aB;
    }

    /**
     * @return the Res
     */
    public Integer getRes() {
        return Res;
    }

    /**
     * @param Res the Res to set
     */
    public void setRes(Integer Res) {
        this.Res = Res;
    }
      
    
}

