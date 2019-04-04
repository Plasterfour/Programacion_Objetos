/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import static javafx.util.Duration.seconds;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Francisco Gallegos
 */
public class MainFrame extends JFrame {
    WorkAreaPanel workPanel;
    JPanel panel_central;
    ArrayList<JTextField> textos = new ArrayList();
    Boolean tabla = false;
    Boolean suderror = false;
    Boolean generado = false;
    Integer[][] input = new Integer[9][9];
    int atras,casillas,cambio,limitecasillas;
    int ejecucion,ejecuciont,segundos,seconds;
    ArrayList<Integer> defecto = new ArrayList();
    Integer[] panel0 = {0,1,2,9,10,11,18,19,20};
    Integer[] panel1 = {3,4,5,12,13,14,21,22,23};
    Integer[] panel2 = {6,7,8,15,16,17,24,25,26};
    Integer[] panel3 = {27,28,29,36,37,38,45,46,47};
    Integer[] panel4= {30,31,32,39,40,41,48,49,50};
    Integer[] panel5 = {33,34,35,42,43,44,51,52,53};
    Integer[] panel6 = {54,55,56,63,64,65,72,73,74};
    Integer[] panel7 = {57,58,59,66,67,68,75,76,77};
    Integer[] panel8 = {60,61,62,69,70,71,78,79,80};
    
    public MainFrame(){
         super("Zudoku");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        float prop = (float) 1366/500;
        float tamf = screenSize.width / prop;
        int tamaño = (int) Math.round(tamf);
        float propx = (float) 1366/450;
        float ejex = screenSize.width / propx;
        int ejexf = (int) ejex;
        float propy = (float) 768/100;
        float ejey = screenSize.height / propy;
        int ejeyf = (int) ejey;
        setBounds(ejexf,ejeyf,tamaño,tamaño);
       super.setLocationRelativeTo(null);
        
        
         JPanel panel_central = new JPanel(new GridLayout(3,3,3,3));
        panel_central.setBackground(Color.black);
        add(panel_central,BorderLayout.CENTER);
        ArrayList<JPanel> paneles = new ArrayList();
        
        for(int i = 0;i<9;i++){
            JPanel panel = new JPanel(new GridLayout(3,3));
            panel.setBackground(Color.black);
            paneles.add(panel);
            panel_central.add(panel);
        }
        JButton generar = new JButton("Generar sudoku");
        for(int i = 0; i<81;i++){
            JTextField texto = new JTextField();
            final int id = i;
            texto.addKeyListener(new KeyListener (){

                @Override
                public void keyTyped(KeyEvent e) { Tecla (e,id); }

                @Override
                public void keyPressed(KeyEvent e) {}

                @Override
                public void keyReleased(KeyEvent e) {}
                
            });
            float proporcion = (float) 500/30;
            float tamañotexto = tamaño/proporcion;
            int tamañofinal = (int) tamañotexto;
            Font font1 = new Font("Arial", Font.PLAIN, tamañofinal);
            texto.setFont(font1);
            texto.setForeground(Color.BLUE);
            texto.setPreferredSize(new Dimension(50,50));
            texto.setHorizontalAlignment(SwingConstants.CENTER);
            texto.setBorder(BorderFactory.createLineBorder(Color.gray));
            textos.add(texto);
            if(Arrays.asList(panel0).contains(i)) paneles.get(0).add(texto);
            else if(Arrays.asList(panel1).contains(i)) paneles.get(1).add(texto);
            else if(Arrays.asList(panel2).contains(i)) paneles.get(2).add(texto);
            else if(Arrays.asList(panel3).contains(i)) paneles.get(3).add(texto);
            else if(Arrays.asList(panel4).contains(i)) paneles.get(4).add(texto);
            else if(Arrays.asList(panel5).contains(i)) paneles.get(5).add(texto);
            else if(Arrays.asList(panel6).contains(i)) paneles.get(6).add(texto);
            else if(Arrays.asList(panel7).contains(i)) paneles.get(7).add(texto);
            else if(Arrays.asList(panel8).contains(i)) paneles.get(8).add(texto);
        }
        
        
        JPanel panel_botones = new JPanel(new GridLayout(2,3,3,3));
        add(panel_botones,BorderLayout.SOUTH);
        panel_botones.add(generar);
        
        
        
        
        
        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        
    }
    private void Tecla(KeyEvent e, int id) {
        
        char letra = e.getKeyChar();
        int number = Character.getNumericValue(letra);
        
        if(number > 0 && number < 10){
            if(textos.get(id).getText().length() == 1) e.consume(); //Para no escribir números con más de una cifra
            else Comp(); //Se ha introducido el valor correcto
        }
        else if (letra != KeyEvent.VK_BACK_SPACE) e.consume(); //No se ha introducido el valor correcto
        else Comp(); //Se ha pulsado tecla retroceso
    }
    
    
    private void Comp(){ //Esta función permite comprobar cada vez que se le llama si se ha introducido un dato incorrecto
        
        Runnable r = new Runnable() {
            
            Boolean correcto = true;
            
            @Override
            public void run() {
                try {
                    Thread.sleep(10); //Este sleep sirve para manejar un extraño error de concurrencia
                } catch (InterruptedException ex) {
                    //Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                suderror = false;
                for(int x = 0; x < 81; x++){
                    if(textos.get(x).getText().equals("")){
                        input[x/9][x%9] = 0;
                        correcto = false;
                    }
                    else input[x/9][x%9]=Integer.parseInt(textos.get(x).getText());
                }
                for(int a = 0;a<81;a++){
                    Boolean error = false;
                    int x = a/9;
                    int y = a%9;
                    if(input[x][y]!=0){
                      for(int i =0;i<9;i++){
                        if(input[x][y] == input[x][i] && y!=i){
                            if(!defecto.contains(a)){
                                textos.get(a).setBackground(Color.LIGHT_GRAY);
                                correcto = false;
                                error = true;
                                suderror = true;
                            }
                        }
                        if(input[x][y] == input[i][y] && x !=i){
                            if(!defecto.contains(a)){
                                textos.get(a).setBackground(Color.LIGHT_GRAY);
                                correcto = false;
                                error = true;
                                suderror = true;
                            }
                        }
                    }

                    while(x%3!=0)x--;
                    while(y%3!=0)y--;

                        for(int i =x;i<x+3;i++){
                            for (int j = y;j<y+3;j++){
                                if((i!=a/9)&&(j!=a%9)){
                                    if(input[a/9][a%9] == input[i][j]){
                                        if(!defecto.contains(a)){
                                            textos.get(a).setBackground(Color.LIGHT_GRAY);
                                            correcto = false;
                                            error = true;
                                            suderror = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(!error) textos.get(a).setBackground(Color.WHITE);
                }
                if(correcto){
                    //Sudoku resuelto
                    generado = false;
                    int min = seconds/60;
                    int sec = seconds%60;
                    ejecuciont = 0;
                    for (int x = 0; x < 81; x++) input[x/9][x%9] = 0;
                    JOptionPane.showMessageDialog(null, 
                            "¡Enhorabuena! Ha resuelto el sudoku"
                                    + "\nen "+min+" minutos y "+sec+" segundos.",
                            "Resuelto",JOptionPane.INFORMATION_MESSAGE);
                    
                    
                    
                }
            }
        };
        Thread thread = new Thread(r);
        thread.start();
    }
    
    
}
