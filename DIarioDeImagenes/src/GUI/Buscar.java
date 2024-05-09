
package GUI;

import Logica.Metodos;
import Logica.Nodo;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JOptionPane;

/**
 *
 * @author emmanuelalcala
 */
public class Buscar extends javax.swing.JFrame {
    private Simplificado simplificado;
    
    public Buscar(Simplificado simplificado) {
        initComponents();
        setLocationRelativeTo(null); //Centrar la ventana
        this.simplificado = simplificado;
        botonBuscar.setIcon(setIcono("/iconos/magnifying-glass.png", botonBuscar));
    }
    
     public Icon setIcono(String url, JButton bt) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = bt.getWidth();
        int alto = bt.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));

        return icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFieldBuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Nombre de la imagen:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        textFieldBuscar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(textFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 270, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        botonBuscar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonBuscar.setBorder(null);
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        setVisible(false); // Con esto la ventana "Eliminar" deja de ser visible
        
        if(textFieldBuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
            return;
        } 
        String nombre = textFieldBuscar.getText();
        Nodo nodo = Metodos.buscar(nombre);
        
        if(nodo == null) { //No encontrado
            JOptionPane.showMessageDialog(null, "No encontrado");
            return;
        }
        
        simplificado.aux = nodo;
        simplificado.mostrarDatos();
    }//GEN-LAST:event_botonBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
