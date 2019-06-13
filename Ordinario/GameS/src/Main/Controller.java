/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import classes.EntityA;
import classes.EntityB;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;


/**
 *
 * @author Francisco Gallegos
 */
public class Controller {
    private LinkedList<EntityA> ea=new LinkedList<EntityA>();
    private LinkedList<EntityB> eb=new LinkedList<EntityB>();

    EntityA enta;
    EntityB entb;
    Textures tex;
    Random r=new Random();
    private Game game;
    
    public Controller(Textures tex,Game game) {
        this.tex = tex;
        this.game=game;
        for(int i=0;i<20;i++){
        
        }
    }
    
    public void createEnemy(int enemy_count){
        for(int i=0;i<enemy_count;i++){
            addEntity(new Enemy(r.nextInt(460-32), -10, tex,this,game));
        }
    }
    
    
    
    
    public void tick(){
        for(int i=0;i<ea.size();i++){
            enta=ea.get(i);
            
            enta.tick();
        }
        
           for(int i=0;i<eb.size();i++){
            entb=eb.get(i);
            
            entb.tick();
        }
     
     
    }
    
   public void render (Graphics g){
      for(int i=0;i<ea.size();i++){
            enta=ea.get(i);
            
            enta.render(g);
        }
      
        for(int i=0;i<eb.size();i++){
            entb=eb.get(i);
            
            entb.render(g);
        }
      
   }
   
   public void addEntity(EntityA block){
       ea.add(block);
   }
   public void addEntity(EntityB block){
       eb.add(block);
   }
   
    public void removeEntity(EntityA block){
       ea.remove(block);
   }
    public void removeEntity(EntityB block){
       eb.remove(block);
   }

    public LinkedList<EntityA> getEntityA() {
        return ea;
    }

    public void setEa(LinkedList<EntityA> ea) {
        this.ea = ea;
    }

    public LinkedList<EntityB> getEntityB() {
        return eb;
    }

    public void setEb(LinkedList<EntityB> eb) {
        this.eb = eb;
    }

    

  
    
    
    
    
}
