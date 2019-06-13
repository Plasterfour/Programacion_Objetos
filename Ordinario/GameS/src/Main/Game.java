/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import classes.EntityA;
import classes.EntityB;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.Clock;
import java.util.LinkedList;
import javax.swing.JFrame;

/**
 *
 * @author Francisco Gallegos
 */
public class Game extends Canvas implements Runnable{
private static final long serialVersionUID=1L;
public static final int WIDTH=230;
public static final int HEIGHT=356;
public static final int SCALE=2;

private boolean running=false;
private Thread thread;
private BufferedImage image=new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

private BufferedImage spriteSheet2=null;
private BufferedImage backgound=null;
private BufferedImage ast=null;

private Player p;
private Controller c;
private Textures tex;

private int enemy_count=30;
private int enemy_killed=0;

public LinkedList<EntityA> ea;
public LinkedList<EntityB> eb;

public static int HEALTH=120;

public Fin fin;


    public static void main(String[] args) {
        
        
        Game game=new Game();
        Fin fin=new Fin();
             
        game.setPreferredSize(new Dimension(230*2,356*2));
        game.setMaximumSize(new Dimension(230*2,356*2));
        game.setMinimumSize(new Dimension(230*2,356*2));
        JFrame padre=new JFrame("");
        padre.add(fin);
        padre.add(game);
        padre.pack();
        padre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        padre.setResizable(false);
        padre.setLocationRelativeTo(null);
        padre.setVisible(true);
        game.start();
        
    }

public void init(){
    requestFocus();
    BufferedImageLoader loader=new BufferedImageLoader();
    try{
        spriteSheet2=loader.loBufferedImage("/sprite_sheet2 (1).png");
        backgound=loader.loBufferedImage("/Space.gif");
        ast=loader.loBufferedImage("/ast2.png");
    }catch(IOException e){
        e.printStackTrace();
    }
    
    tex=new Textures(this);
    
    c=new Controller(tex,this);
    p=new Player(200, 570,tex,this,c);
    ea=c.getEntityA();
    eb=c.getEntityB();
    
    this.addKeyListener(new KeyImput(this));
    c.createEnemy(enemy_count);
}

synchronized void start(){
    if(running)
        return;
    running=true;
    thread=new Thread(this);
    thread.start();
}

private synchronized void stop(){
    if(!running)
        return;
    running=false;
    try {
        thread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.exit(1);
}

public void run (){
    init();
    long lastTime=System.nanoTime();
    final double amountOfTicks=60.0;
    double ns=1000000000/amountOfTicks;
    double delta=0;
    int updates=0;
    int frames=0;
    long timer=System.currentTimeMillis();
    while(running){
        long now =System.nanoTime();
        delta+=(now-lastTime)/ns;
        lastTime=now;
        if(delta>=1){
            tick();
            updates++;
            delta--;
        }
        render();
        frames++;
        if(System.currentTimeMillis()-timer>1000){
            timer+=1000;
            System.out.println(updates+" Ticks,Fps "+frames);
            updates=0;
            frames=0;
        }
    }
    stop();
}

    private void tick(){
        p.tick();
        c.tick();
        
    }
    int x=100;
    int y=100;
    
    private void render(){
        BufferStrategy bs=this.getBufferStrategy();
        if(bs==null){
            createBufferStrategy(3);
            return;
        }
        Graphics g=bs.getDrawGraphics();
        //////////////////
        g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
        g.fillRect(0, 0, 800, 800);
        
        g.drawImage(backgound, 0, 0, null);
        
        
        p.render(g);
        c.render(g);
       
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(5, 5, 120, 30);
        
        g.setColor(Color.blue);
        g.fillRect(5, 5, HEALTH, 30);
        
        g.setColor(Color.WHITE);
        g.drawRect(5, 5, 120, 30);
        //////////////////
        g.dispose();
        bs.show();
    }
    public void keyPressed(KeyEvent e){
        int key=e.getKeyCode();
        
        if(key==KeyEvent.VK_RIGHT){
            p.setVelX(5);
        }else if(key==KeyEvent.VK_LEFT){
            p.setVelX(-5);
        }else if(key==KeyEvent.VK_DOWN){
            p.setVelY(5);
        }else if(key==KeyEvent.VK_UP){
            p.setVelY(-5);
        
        }
    }
    public void KeyReleased(KeyEvent e){
        int key=e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT){
            p.setVelX(0);
        }else if(key==KeyEvent.VK_LEFT){
            p.setVelX(0);
        }else if(key==KeyEvent.VK_DOWN){
            p.setVelY(0);
        }else if(key==KeyEvent.VK_UP){
            p.setVelY(0 );
        }
    }
   

    public BufferedImage getSpriteSheet2() {
        return spriteSheet2;
    }

    public void setSpriteSheet2(BufferedImage spriteSheet2) {
        this.spriteSheet2 = spriteSheet2;
    }

    public BufferedImage getAst() {
        return ast;
    }

    public void setAst(BufferedImage ast) {
        this.ast = ast;
    }

    public int getEnemy_count() {
        return enemy_count;
    } 

    public void setEnemy_count(int enemy_count) {
        this.enemy_count = enemy_count;
    }

    public int getEnemy_killed() {
        return enemy_killed;
    }

    public void setEnemy_killed(int enemy_killed) {
        this.enemy_killed = enemy_killed;
    }
    
    

  
    
    
}
