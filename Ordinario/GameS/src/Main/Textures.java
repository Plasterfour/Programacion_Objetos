/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.image.BufferedImage;



/**
 *
 * @author Francisco Gallegos
 */
public class Textures {
    public BufferedImage player,enemy;
    private SpriteSheet ss,ss2;

    public Textures(Game game) {
         ss=new SpriteSheet(game.getSpriteSheet2());
         ss2=new SpriteSheet(game.getAst());
        getTextures();
    
    }
    private void getTextures(){
        player=ss.grabImage(1, 1, 32, 32);
        enemy=ss2.grabImage(1,1,49 , 55);
    } 
    
}
