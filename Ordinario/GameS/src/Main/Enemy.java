/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import classes.EntityA;
import classes.EntityB;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

/**
 *
 * @author Francisco Gallegos
 */
public class Enemy extends GameObject implements EntityB{
    Random r=new Random();
    private Textures tex;
    private int speed=r.nextInt(5)+1;
    private Game game;
    private Controller c;

    public Enemy(double x, double y,Textures tex,Controller c,Game game) {
        super(x,y);
        this.tex=tex;
        this.c=c;
        this.game=game;
    }
    
    public void tick(){
        y+=speed;
        if(y>(Game.HEIGHT*Game.SCALE)){
            speed=r.nextInt(5)+2;
            x=r.nextInt(640);
            y=-9;
        }
        
        for(int i=0;i<game.ea.size();i++){
            EntityA tempEmpt=game.ea.get(i);
            if(Physics.Collision(this, tempEmpt)){
            c.removeEntity(this);
        }
        }
    }
    
    public void render(Graphics g){
        g.drawImage(tex.enemy, (int)x, (int)y, null);
    }

   
    @Override
    public double getX() {
return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public Rectangle getBounds() {
return new Rectangle((int)x, (int)y,48 ,58);  
        }
    
    
    

}
