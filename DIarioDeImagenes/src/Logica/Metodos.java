package Logica;

import java.awt.Image;
import java.io.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Metodos {
    static String directionTmp; // captar direction temporal de la imagen
    static JFileChooser explorador = new JFileChooser(); // explorador de archivos
    public static Nodo primero, ultimo;

    public static void Insertar(String nombre, String fecha, String emoticon, String descripcion, String foto) {
        Nodo auxiliar = new Nodo(nombre, fecha, emoticon, descripcion, foto, null, null);
        if (ultimo == null) {
            // Caso especial: la lista está vacía
            ultimo = auxiliar;
            primero = auxiliar;
            primero.setAnterior(ultimo);
            ultimo.setSiguiente(primero);
        } else {
            // Caso general: agregar al final de la lista
            auxiliar.setSiguiente(primero);
            auxiliar.setAnterior(ultimo);
            ultimo.setSiguiente(auxiliar);
            primero.setAnterior(auxiliar);
            ultimo = auxiliar;
        }
    }

    public static void eliminarDato(String nombre) { // con eliminar el Nombre del nodo, se elimina toda la información
        Nodo auxiliar = buscar(nombre);
        if (auxiliar == null) {
            JOptionPane.showMessageDialog(null, "El dato no existe");
            return;
        }

        if (nombre.equals(auxiliar.getNombre())) {
            if (auxiliar == primero && auxiliar == ultimo) { // Caso en el que solo hay un elemento y se elimina
                primero = null;
                ultimo = null;
                auxiliar = null;

            } else if (auxiliar == primero) { // Caso en que se elimina el primer elemento:
                primero = auxiliar.getSiguiente();
                auxiliar.getAnterior().setSiguiente(auxiliar.getSiguiente());
                auxiliar.getSiguiente().setAnterior(auxiliar.getAnterior());

            } else if (auxiliar == ultimo) { // Caso en que se elimina el último elemento:
                ultimo = auxiliar.getAnterior();
                auxiliar.getAnterior().setSiguiente(auxiliar.getSiguiente());
                auxiliar.getSiguiente().setAnterior(auxiliar.getAnterior());

            } else {
                auxiliar.getAnterior().setSiguiente(auxiliar.getSiguiente());
                auxiliar.getSiguiente().setAnterior(auxiliar.getAnterior());
            }

            JOptionPane.showMessageDialog(null, "El nodo se eliminó");
        }
    }

    public static Nodo buscar(String nombre) {
        Nodo nodo = primero;
        // Búsqueda secuencial
        while (true) {
            if (nodo.getNombre().equals(nombre)) { // Si sí lo encuentra
                return nodo;
            }
            if (nodo == ultimo) { // Si no lo encuentra
                return null;
            }
            nodo = nodo.getSiguiente();
        }
    }

    public static void captarImagen() { // este es el mismo que vimos en clase, así que será fácil de usar, solo lo agregas y elegimos la imagen a agregar
        try {
            File auxFile;
            explorador.setCurrentDirectory(new File("."));
            explorador.setDialogTitle("Subir imagen");
            explorador.addChoosableFileFilter(new FileNameExtensionFilter("imágenes", "jpg", "png", "jpeg", "gif"));
            explorador.showOpenDialog(null);
            auxFile = explorador.getSelectedFile();
            directionTmp = auxFile.getAbsolutePath();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }
    }

    public static JLabel mostrarImagen(JLabel fotoLabel) { /* necesitamos crear un Jlabel donde irán las imágenes, debemos pasar ese Jlabel como parámetro para que cambie la imagen */
        try {
            ImageIcon foto;
            foto = new ImageIcon(directionTmp);
            Icon icono;
            icono = new ImageIcon(foto.getImage().getScaledInstance(fotoLabel.getWidth(), fotoLabel.getHeight(), Image.SCALE_DEFAULT));
            fotoLabel.setIcon(icono);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }
        return fotoLabel;
    }

    public static void escribirEnArchivo(String nombreArchivo) {
        if (primero == null) {
            System.out.println("La lista está vacía");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            Nodo actual = primero;
            do {
                writer.write(actual.getNombre() + "," + actual.getFecha() + "," + actual.getEmoticon() + "," + actual.getDescripcion() + "," + actual.getFoto());
                writer.newLine();
                actual = actual.getSiguiente();
            } while (actual != primero);
        } catch (IOException e) {
            e.printStackTrace();
        }
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