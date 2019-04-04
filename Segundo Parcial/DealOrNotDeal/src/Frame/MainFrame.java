/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Francisco Gallegos
 */
public class MainFrame extends JFrame{
    private PnlBotones pnlBotones; 
    private JPanel pnlDerecha;
    private JPanel pnlIzquierdo;
    private JPanel pnlInf;
    private JLabel lblIzq1;
    private JLabel lblIzq2;
    private JLabel lblIzq3;
    private JLabel lblIzq4;
    private JLabel lblIzq5;
    private JLabel lblIzq6;
    private JLabel lblIzq7;
    private JLabel lblIzq8;
    private JLabel lblIzq9;
    private JLabel lblIzq10;
    
    private JLabel lblDer1;
    private JLabel lblDer2;
    private JLabel lblDer3;
    private JLabel lblDer4;
    private JLabel lblDer5;
    private JLabel lblDer6;
    private JLabel lblDer7;
    private JLabel lblDer8;
    private JLabel lblDer9;
    private JLabel lblDer10;
        
    public MainFrame(){
        super("Deal Or Not Deal");
        super.setSize(750,600);
        //super.setResizable(false);
        //super.setLayout(new Layout());
        super.setLocationRelativeTo(null);
        
        pnlBotones=new PnlBotones();
        
        super.add(pnlBotones,BorderLayout.CENTER);
        
        pnlDerecha=new JPanel();
        pnlDerecha.getBorder();
        pnlDerecha.setBackground(Color.LIGHT_GRAY);
        pnlDerecha.setPreferredSize(new Dimension(150,600));
        super.add(pnlDerecha,BorderLayout.EAST);
        
        pnlIzquierdo=new JPanel();
        pnlIzquierdo.setBackground(Color.LIGHT_GRAY);
        pnlIzquierdo.setPreferredSize(new Dimension(150,600));
        super.add(pnlIzquierdo,BorderLayout.WEST);
        
        pnlInf=new JPanel();
        pnlInf.setBackground(Color.yellow);
        pnlInf.setPreferredSize(new Dimension(1500,600));
        pnlBotones.add(pnlInf,BorderLayout.CENTER);
        
        lblIzq1=new JLabel("                    $10");
        pnlIzquierdo.add(lblIzq1);
        
        lblIzq2=new JLabel("                    $20");
        pnlIzquierdo.add(lblIzq2);
        
        lblIzq3=new JLabel("                    $50");
        pnlIzquierdo.add(lblIzq3);
        
        lblIzq4=new JLabel("                    $75");
        pnlIzquierdo.add(lblIzq4);
        
        lblIzq5=new JLabel("                    $100");
        pnlIzquierdo.add(lblIzq5);
        
        lblIzq6=new JLabel("                    $200");
        pnlIzquierdo.add(lblIzq6);
        
        lblIzq7=new JLabel("                    $500");
        pnlIzquierdo.add(lblIzq7);
        
        lblIzq8=new JLabel("                    $750");
        pnlIzquierdo.add(lblIzq8);
        
        lblIzq9=new JLabel("                    $1,000");
        pnlIzquierdo.add(lblIzq9);
       
        lblIzq10=new JLabel("                    $2,000");
        pnlIzquierdo.add(lblIzq10);
        
        
        lblDer1=new JLabel("                    $5,000");
        pnlDerecha.add(lblDer1);
        
        lblDer2=new JLabel("                    $7,500");
        pnlDerecha.add(lblDer2);
        
        lblDer3=new JLabel("                    $10000");
        pnlDerecha.add(lblDer3);
      
        lblDer4=new JLabel("                    $20,000");
        pnlDerecha.add(lblDer4);
        
        lblDer5=new JLabel("                    $50,000");
        pnlDerecha.add(lblDer5);
        
        lblDer6=new JLabel("                    $75,000");
        pnlDerecha.add(lblDer6);
        
        lblDer7=new JLabel("                    $100,000");
        pnlDerecha.add(lblDer7);
        
        lblDer8=new JLabel("                    $500,000");
        pnlDerecha.add(lblDer8);
        
        lblDer9=new JLabel("                     $7500,000");
        pnlDerecha.add(lblDer9);
        
        lblDer10=new JLabel("                    $1,000,000");
        pnlDerecha.add(lblDer10);
        
        pnlIzquierdo.setLayout(new GridLayout(10,0));
        pnlDerecha.setLayout(new GridLayout(10,0));
        

        
        
        
        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}
