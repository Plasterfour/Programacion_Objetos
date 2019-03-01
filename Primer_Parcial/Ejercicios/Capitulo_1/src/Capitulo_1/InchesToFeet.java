/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_1;

/**
 *
 * @author Francisco Gallegos
 */
public class InchesToFeet {
    public static final Integer inches=12;
    private Integer pies;
   public InchesToFeet(Integer pies){
       this.pies=pies;
   }
   public Integer conversionfeet(){
      return (pies/inches);
   }
   
 public Integer conversioninches(){
      return (pies%inches);
   }
}
