package Logica;

import java.awt.Image;
import java.io.File;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Metodos {
    String direccionTmp;//captar direccion temporar de la imagen
    JFileChooser explorador = new JFileChooser();//explorador de archivos
    static Nodo primero,ultimo;
    public static void Insertar(int id, String fecha, String nombre){
        Nodo auxiliar = new Nodo(id,fecha,nombre,null,null);
        if(ultimo==null){

            ultimo = auxiliar;
            primero = auxiliar;
            primero.setAnterior(ultimo);
            ultimo.setSiguiente(primero);

        }else{
            ultimo.setSiguiente(auxiliar);
            primero.setAnterior(auxiliar);
            auxiliar.setAnterior(ultimo);
            auxiliar.setSiguiente(primero);
            ultimo = auxiliar;
        }

    }

    void captarImagen(){
        try{
            File auxFile;
            explorador.addChoosableFileFilter(new FileNameExtensionFilter("imagenes","jpg","png","jpeg","gif"));
            explorador.showOpenDialog(null);
            auxFile = explorador.getSelectedFile();
            direccionTmp = auxFile.getAbsolutePath();

        }catch(Exception ex){JOptionPane.showMessageDialog(null,"Error al abrir el archivo");}
    }

    public JLabel mostrarImagen(JLabel fotoLabel){
        try{
            ImageIcon foto;
            foto = new ImageIcon(direccionTmp);
            Icon icono;
            icono = new ImageIcon(foto.getImage().getScaledInstance(fotoLabel.getWidth(),fotoLabel.getHeight(),Image.SCALE_DEFAULT));
            fotoLabel.setIcon(icono);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al abrir el archivo");
        }
        return fotoLabel;
    }
}
