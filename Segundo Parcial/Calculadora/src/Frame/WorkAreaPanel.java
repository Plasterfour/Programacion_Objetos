/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Francisco Gallegos
 */
public class WorkAreaPanel extends JPanel {
    JPanel pnlpanelPrincipal;
    JTextField jtxCaja;
    JButton boton[];
    
    public WorkAreaPanel(){
         super.setBackground(Color.WHITE);
         super.setSize(450,500);
    
        jtxCaja =new JTextField();
        jtxCaja.setFont(new Font("Arial",10,50));
        jtxCaja.setBackground(Color.white);
        //jtxCaja.setBorder(BorderFactory.createCompoundBorder( raisedbevel, loweredbevel)); 
        jtxCaja.setBorder(BorderFactory.createMatteBorder(25,20,20,20,Color.RED));
        
        super.add(jtxCaja,BorderLayout.NORTH);
        
        boton= new JButton[20];
        boton[0]=new JButton("CE");
        boton[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+" ");
            }
        });
        
        boton[1]=new JButton("A");
        boton[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"A");
            }
        });
                
        boton[2]=new JButton("B");
        boton[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"B");
            }
        });
        
        boton[3]=new JButton("%");
        boton[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"%");
            }
        });
        
        boton[4]=new JButton("C");
        boton[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"C");
            }
        });
        
        boton[5]=new JButton("D");
        boton[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"D");
            }
        });
        
        boton[6]=new JButton("E");
        boton[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"E");
            }
        });
        
        boton[7]=new JButton("*");
        boton[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"*");
            }
        });
        
        boton[8]=new JButton("F");
        boton[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"F");
            }
        });
        
        boton[9]=new JButton("G");
        boton[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"G");
            }
        });
        
        boton[10]=new JButton("W");
        boton[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"W");
            }
        });
        
        boton[11]=new JButton("-");
        boton[11].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"-");
            }
        });
        
        boton[12]=new JButton("X");
        boton[12].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"X");
            }
        });
        
        boton[13]=new JButton("Y");
        boton[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"Y");
            }
        });
        
        boton[14]=new JButton("Z");
        boton[14].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"Z");
            }
        });
        
        boton[15]=new JButton("=");
        
        
        boton[16]=new JButton("^");
        boton[16].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"^");
            }
        });
        
        boton[17]=new JButton("(");
        boton[17].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"(");
            }
        });
        
        boton[18]=new JButton(")");
        boton[18].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+")");
            }
        });
        
        
        boton[19]=new JButton("+");
        boton[19].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jtxCaja.setText(jtxCaja.getText()+"+");
            }
        });
        
        for(int i=0;i<=19;i++){           
            super.add(boton[i]);
           boton[i].setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.gray));
           boton[i].setBackground(Color.lightGray);
           boton[i].setFont(new Font("Berlin Sans FB Demi",10,20));
        } 

        
        
        
    }
    
}
