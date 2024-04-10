package Logica;

import java.awt.Image;
import java.io.File;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Metodos {
    static String directionTmp;//captar direction temporal de la imagen
    static JFileChooser explorador = new JFileChooser();//explorador de archivos
    static Nodo primero,ultimo;
   
    public static void Insertar(String nombre, String fecha, String emoticon, String descripcion, String foto){
        Nodo auxiliar = new Nodo(nombre,fecha, emoticon, descripcion, foto,null,null);
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
    public void eliminarDato(String nombre){//con eliminar el Nombre del nodo, se elimina toda la información
        Nodo auxiliar=primero;
        boolean ciclo = true;
        while(ciclo){
            if(nombre == auxiliar.getNombre()){
                auxiliar.getAnterior().setSiguiente(auxiliar.getAnterior());
                JOptionPane.showMessageDialog(null,"El Nodo se eliminó!");
                ciclo = false;
            }else if (auxiliar.getSiguiente()==ultimo){
                JOptionPane.showMessageDialog(null,"El dato no existe!");
                ciclo = false;
            }else{
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
    public static void captarImagen(){//este es el mismo que vimos en clase, asi que será fácil de usar, solo lo agregas y elegimos la imagen a agregar
        try{
            File auxFile;
            explorador.addChoosableFileFilter(new FileNameExtensionFilter("imágenes","jpg","png","jpeg","gif"));
            explorador.showOpenDialog(null);
            auxFile = explorador.getSelectedFile();
            directionTmp = auxFile.getAbsolutePath();

        }catch(Exception ex){JOptionPane.showMessageDialog(null,"Error al abrir el archivo");}
    }

    public static JLabel mostrarImagen(JLabel fotoLabel){/*necesitamos crear un Jlabel donde iran las imágenes,
                                                    debemos pasar ese Jlabel como parámetro para que cambie la imagen*/
        try{
            ImageIcon foto;
            foto = new ImageIcon(directionTmp);
            Icon icono;
            icono = new ImageIcon(foto.getImage().getScaledInstance(fotoLabel.getWidth(),fotoLabel.getHeight(),Image.SCALE_DEFAULT));
            fotoLabel.setIcon(icono);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al abrir el archivo");
        }
        return fotoLabel;
    }
    
    

    public static String getDirectionTmp() {
        return directionTmp;
    }

    public static void setDirectionTmp(String directionTmp) {
        Metodos.directionTmp = directionTmp;
    }

    public static JFileChooser getExplorador() {
        return explorador;
    }

    public static void setExplorador(JFileChooser explorador) {
        Metodos.explorador = explorador;
    }

    public static Nodo getPrimero() {
        return primero;
    }

    public static void setPrimero(Nodo primero) {
        Metodos.primero = primero;
    }

    public static Nodo getUltimo() {
        return ultimo;
    }

    public static void setUltimo(Nodo ultimo) {
        Metodos.ultimo = ultimo;
    }
    
    
}
