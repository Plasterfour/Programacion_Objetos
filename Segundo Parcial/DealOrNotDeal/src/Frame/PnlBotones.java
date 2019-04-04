/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Francisco Gallegos
 */
public class PnlBotones extends JPanel{
    JButton boton[];
    public PnlBotones() {
        super.setBackground(Color.red);
        super.setSize(600,600);
        
        boton=new JButton[22];
        Border line = new LineBorder(Color.YELLOW);
        Border margin = new EmptyBorder(1, 1, 1, 1);
        Border compound = new CompoundBorder(line, margin);
        
        for(int i=1;i<=21;i++){
            boton[i]=new JButton("Maletin "+i);
            boton[i].setPreferredSize(new Dimension(130,50));
            boton[i].setForeground(Color.WHITE);
            boton[i].setBackground(Color.BLACK);
            boton[i].setBorder(compound);
             super.add(boton[i],BorderLayout.CENTER);
        }
        
       
      
        
       
    }
    
}
