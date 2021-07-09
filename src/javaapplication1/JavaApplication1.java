/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Athenda
 */
public class JavaApplication1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                    
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException e) {
           e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
           e.printStackTrace();
        }
        catch (InstantiationException e) {
           e.printStackTrace();
        }
        catch (IllegalAccessException e) {
           e.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {           
            public void run() {
                Login loginWindow = new Login();
                loginWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                loginWindow.setVisible(true);
            }
        });
        
    }

}
