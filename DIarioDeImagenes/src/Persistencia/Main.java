package Persistencia;

import GUI.Simplificado;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        Simplificado simple = new Simplificado();
        simple.setVisible(true);
        simple.setLocationRelativeTo(null);

    }
    
}
