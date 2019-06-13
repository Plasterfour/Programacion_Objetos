/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import classes.EntityA;
import classes.EntityB;
import java.util.LinkedList;

/**
 *
 * @author Francisco Gallegos
 */
public class Physics {
    public static boolean Collision(EntityA enta,EntityB entb){
        
            if(enta.getBounds().intersects(entb.getBounds())){
                return true;
            }
        
        return false;
    }
    
    public static boolean Collision(EntityB entb,EntityA enta){
        
            if(entb.getBounds().intersects(enta.getBounds())){
                return true;
            }
        
        return false;
    }
}
