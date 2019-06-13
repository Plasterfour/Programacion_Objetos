/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Rectangle;

/**
 *
 * @author Francisco Gallegos
 */
public class GameObject {
    public double x,y;

    public GameObject(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Rectangle gteBounds(int width,int height){
        return new Rectangle((int)x, (int)y, width,height);
    }
    
}
