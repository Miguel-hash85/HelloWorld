/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * This is Swing Window implementation of the view tier
 * @author Miguel Sanchez
 */
public class SwingImplementation extends JFrame implements View{
    
    /**
     * This method shows the greeting
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        JOptionPane.showMessageDialog(rootPane, greeting);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
