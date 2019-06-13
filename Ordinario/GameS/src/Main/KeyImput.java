/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Francisco Gallegos
 */
public class KeyImput extends KeyAdapter{
    Game game;

    public KeyImput(Game game) {
        this.game = game;
    }
    
    public void keyPressed(KeyEvent e){
        game.keyPressed(e);
    }
       
    public void keyReleased(KeyEvent e){
        game.KeyReleased(e);
    }
    
}
