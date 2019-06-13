/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import classes.EntityA;
import classes.EntityB;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javafx.scene.media.MediaPlayer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Gallegos
 */
public class Player extends GameObject implements EntityA{
    
    private double velX=0;
    private double velY=0;

    private BufferedImage player;
    private Textures tex;
    private Fin fin;
    private JFrame f;
    
    private Game game;
    Controller controller;
    
    

    public Player(double x, double y,Textures tex,Game game,Controller controller) {
      
        super(x,y);
       this.controller=controller;
       this.game=game;
       this.tex=tex;
       this.fin=new Fin();
       
    }
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        if(x<=0){
            x=0;
        }if(x>=460-32){
            x=460-32;
        }if(y<0){
            y=0;
        }if(y>712-32){
            y=712-32;
        }
        
     for(int i=0;i<game.eb.size();i++){
         EntityB tempEnt=game.eb.get(i);
         
         if(Physics.Collision( this, tempEnt)){
             controller.removeEntity(tempEnt);
             //Game.HEALTH-=10; 
             if(Game.HEALTH==0){
                 JFrame f=new JFrame();
                 f.setSize(600,340);
                 f.setLocationRelativeTo(null);
                 f.add(fin);
                 f.setVisible(true);
             }
         }
     }
        
        
    }
    
    public void render(Graphics g){
        g.drawImage(tex.player, (int) x, (int) y, null);
         //g.drawImage(player,(int)x,(int)y,null);
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

    public double getVelX() {
        return velX;
    }

    public void setVelX(double velX) {
        this.velX = velX;
    }

    public double getVelY() {
        return velY;
    }

    public void setVelY(double velY) {
        this.velY = velY;
    }

   

    @Override
    public Rectangle getBounds() {
return new Rectangle((int)x, (int)y,32,32 );  
    }

    
    
    
    
}
