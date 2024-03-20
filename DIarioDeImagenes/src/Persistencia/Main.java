/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Persistencia;

import GUI.Simplificado;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.UIManager;

/**
 *
 * @author 19dia
 */
public class Main {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        Simplificado simple = new Simplificado();
        simple.setVisible(true);
        simple.setLocationRelativeTo(null);

        
    }
    
}
