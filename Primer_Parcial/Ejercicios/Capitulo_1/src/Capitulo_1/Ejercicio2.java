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
public class Ejercicio2 {
    private Integer A;
    private Integer B;
    private Integer C;
    private Integer D;
    
    public String IsBA(Integer A,Integer B){
         if (A<B) {
        return String.format("A=%b",true);
         }else{
        return String.format("A=%b",false);
        }
                }
    public String IsBB(Integer A,Integer B){
         if (A<=B) {
        return String.format("B=%b",true);
         }else{
        return String.format("B=%b",false);
        }
                }
    public String IsBC(Integer A,Integer B){
         if (A==B) {
        return String.format("C=%b",true);
         }else{
        return String.format("C=%b",false);
        }
         
                }
    public String IsBD(Integer A,Integer B){
         if (A>=B) {
        return String.format("D=%b",true);
         }else{
        return String.format("D=%b",false);
        }
                }
    public String IsBE(Integer A,Integer B,Integer C){
         if (A+B==C) {
        return String.format("E=%b",true);
         }else{
        return String.format("E=%b",false);
        }
                }
    public String IsBF(Integer A,Integer B,Integer C){
         if (A<B-C) {
        return String.format("F=%b",true);
         }else{
        return String.format("F=%b",false);
        }
                }
    public String IsBG(Integer A,Integer B){
         if (A!=B) {
        return String.format("G=%b",true);
         }else{
        return String.format("G=%b",false);
        }
                }
    public String IsBH(Integer A,Integer B,Integer C){
         if (A!=B*C) {
        return String.format("H=%b",true);
         }else{
        return String.format("H=%b",false);
        }
                }
    public String IsBI(Integer A,Integer B){
         if (A!=-B) {
        return String.format("I=%b",true);
         }else{
        return String.format("I=%b",false);
        }
                }
    public String IsBJ(Integer A,Integer B,Integer C,Integer D){
         if (A+B*C==D) {
        return String.format("J=%b",true);
         }else{
        return String.format("J=%b",false);
        }
                }
}
