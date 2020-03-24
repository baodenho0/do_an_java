/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class MessageHelper {
    public void Error(javax.swing.JFrame mainFrame,String description){
        JOptionPane.showMessageDialog (mainFrame, description,"Error", JOptionPane.ERROR_MESSAGE);
    }
}
