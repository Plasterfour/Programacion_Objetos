/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nubia;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Francisco Gallegos
 */
public class Main extends JFrame{
    private Log l;
    private Clientes cl;
    private DetallesCliente dc;
    private Productos pr;
    private UltimoFrame uf;
    public Main(){
        super.setSize(380,300);
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());
        
        Log l =new Log();
        Clientes cl=new Clientes();
        DetallesCliente dc=new DetallesCliente();
        Productos pr=new Productos();
        UltimoFrame uf=new UltimoFrame();
        
        super.add(uf);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}
