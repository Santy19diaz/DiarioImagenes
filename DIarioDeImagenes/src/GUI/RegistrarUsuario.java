package GUI;

import Persistencia.Usuarios;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author 19dia
 */
public class RegistrarUsuario extends javax.swing.JFrame {
    Usuarios sesion;
    /**
     * Creates new form InicioSecion
     */
    public RegistrarUsuario() {
        initComponents();
    }

     void guardarUsuario() {
        sesion = new Usuarios(txtId.getText(), txtPass.getText(),txtCorreo.getText());
    }

    void guardarDatosArchivo() {

        File archivo = new File("Usuarios.txt");
        if (!archivo.exists()) {
            try {
                FileWriter escribir = new FileWriter("Usuarios.txt");
                escribir.write(sesion.id + "," + sesion.contra + "," +sesion.correo +"\n");
                escribir.flush();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                FileWriter escribir = new FileWriter("Usuarios.txt", true);
                escribir.write(sesion.id + "," + sesion.contra + "," +sesion.correo +"\n");
                escribir.flush();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    

    void borrarUsuario(String id, String pass,String correo) {
        File archivo = new File("Usuarios.txt");
        File auxiliar = new File("Auxiliar.txt");

        try {
            FileReader leer = new FileReader(archivo);
            BufferedReader br = new BufferedReader(leer);
            FileWriter escribir = new FileWriter(auxiliar);

            String linea;
            boolean encontrado = false;
            while ((linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                String usuarioId = st.nextToken();
                String usuarioPass = st.nextToken();
                String usuarioCorreo = st.nextToken();
                if (usuarioId.equals(id) && usuarioPass.equals(pass) && usuarioCorreo.equals(correo)) {
                    encontrado = true;
                } else {
                    escribir.write(linea + "\n");
                }
            }

            br.close();
            escribir.close();

            if (encontrado) {
                archivo.delete();
                
                auxiliar.renameTo(archivo);

                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
        } catch (IOException ex) {
            Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        accesoBt = new javax.swing.JButton();
        agregarBt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SIGN-UP");
        setBackground(new java.awt.Color(137, 209, 250));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 103, 78, -1));

        jLabel2.setText("Correo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 71, -1));

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 290, -1));

        accesoBt.setBackground(new java.awt.Color(0, 204, 204));
        accesoBt.setForeground(new java.awt.Color(255, 255, 255));
        accesoBt.setText("Registrar");
        accesoBt.setToolTipText("");
        accesoBt.setIconTextGap(2);
        accesoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accesoBtActionPerformed(evt);
            }
        });
        getContentPane().add(accesoBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 140, 50));

        agregarBt.setBackground(new java.awt.Color(102, 204, 255));
        agregarBt.setForeground(new java.awt.Color(255, 255, 255));
        agregarBt.setText("Cancelar");
        agregarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtActionPerformed(evt);
            }
        });
        getContentPane().add(agregarBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 140, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registar Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 18, 515, 54));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("maximo 9 caracteres.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 124, -1));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("solo letras.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 157, 14));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 620, 10));

        jLabel6.setText("Contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 71, -1));

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 290, -1));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("maximo 9 caracteres.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 124, -1));

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 290, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        int key = evt.getKeyChar();
        boolean dec = key >= 48 && key <= 57;
        if (dec) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void accesoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accesoBtActionPerformed
        String valid = txtCorreo.getText();
        if (!(valid.contains("@") || valid.contains(".com"))) {
            JOptionPane.showMessageDialog(null, "Ingrese un correo valido");
        } else {
            guardarUsuario();
            guardarDatosArchivo();
            JOptionPane.showMessageDialog(null, "Usuario registado con exito");
            InicioSesion is = new InicioSesion();
            is.setVisible(true);
            is.setLocationRelativeTo(null);
            dispose();
        }

    }//GEN-LAST:event_accesoBtActionPerformed

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void agregarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtActionPerformed
        dispose();
    }//GEN-LAST:event_agregarBtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accesoBt;
    private javax.swing.JButton agregarBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables

}
