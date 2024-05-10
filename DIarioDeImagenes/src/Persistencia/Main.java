package Persistencia;

import GUI.InicioSesion;
import GUI.Simplificado;
import com.formdev.flatlaf.*;

import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        InicioSesion iS = new InicioSesion();
        iS.setVisible(true);
        iS.setLocationRelativeTo(null);
    }
    
}
