/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Francisco Gallegos
 */
public class WorkAreaPanel extends JPanel{
    private JPanel pnlpanelPrincipal;
    private JTextField jtxCaja;
    
    public WorkAreaPanel(){
        JTextField jtxCaja=new JTextField();
        
        super.add(jtxCaja);
        
    }
    
}
