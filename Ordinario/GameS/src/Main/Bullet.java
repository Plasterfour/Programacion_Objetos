/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Francisco Gallegos
 */
public class Bullet {
    private double x;
    private double y;
    
    BufferedImage image;

    public Bullet(double x, double y,Game game) {
        this.x = x;
        this.y = y;
        SpriteSheet ss=new SpriteSheet(game.getSpriteSheet2());
        image=ss.grabImage(1, 1, 4,26);
    }
    
    public void tick(){
        y-=2;
    }
    public void draw(Graphics g){
        g.drawImage(image,(int)x,(int)y,null);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
    
       
}
