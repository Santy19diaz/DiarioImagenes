package GUI;

import com.formdev.flatlaf.FlatLightLaf;
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
public class InicioSesion extends javax.swing.JFrame {

    Simplificado s = new Simplificado();
    
    public boolean apro;

    /**
     * Creates new form InicioSecion
     */
    public InicioSesion() {
        initComponents();
    }

    void leerArchivo() {
        String linea;
        boolean bandera = false;
        try {
            FileReader leer = new FileReader("Usuarios.txt");
            BufferedReader br = new BufferedReader(leer);
            try {
                while ((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    if (txtId.getText().equals(st.nextToken()) && txtPass.getText().equals(st.nextToken())) {
                        bandera = true;
                        break;
                    }
                }
                br.close();

                if (bandera == true) {
                    apro = true;
                } else {
                    JOptionPane.showMessageDialog(null, "usuario no encontrado");
                    apro=false;
                    txtId.setText("");
                    txtPass.setText("");

                }
            } catch (IOException ex) {
                Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void borrarUsuario(String id, String pass) {
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
                if (usuarioId.equals(id) && usuarioPass.equals(pass)) {
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
                apro = true;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                apro = false;
            }
        } catch (IOException ex) {
            Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtId = new javax.swing.JTextField();
        accesoBt = new javax.swing.JButton();
        agregarBt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(137, 209, 250));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 103, 78, -1));

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 155, 71, -1));

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 150, 279, -1));

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 98, 279, -1));

        accesoBt.setBackground(new java.awt.Color(0, 204, 204));
        accesoBt.setForeground(new java.awt.Color(255, 255, 255));
        accesoBt.setText("Acceder");
        accesoBt.setToolTipText("");
        accesoBt.setIconTextGap(2);
        accesoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accesoBtActionPerformed(evt);
            }
        });
        getContentPane().add(accesoBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 130, -1));

        agregarBt.setBackground(new java.awt.Color(102, 204, 255));
        agregarBt.setForeground(new java.awt.Color(255, 255, 255));
        agregarBt.setText("Nuevo Usuario");
        agregarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtActionPerformed(evt);
            }
        });
        getContentPane().add(agregarBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 130, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOG IN.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 18, 515, 54));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("maximo  caracteres.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 182, 124, -1));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("solo letras.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 130, 157, 14));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 620, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        int key = evt.getKeyChar();
        boolean dec = key >= 48 && key <= 57;
        if (dec) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped

        if (txtPass.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPassKeyTyped

    private void accesoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accesoBtActionPerformed
        if (txtId.getText().equals("") || txtPass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios");
            txtId.setText("");
            txtPass.setText("");
        } else {
            leerArchivo();
            if (apro == true) {
                s.setVisible(true);
                s.setLocationRelativeTo(null);
                dispose();
            } else {
                txtId.setText("");
                txtPass.setText("");
            }

        }
    }//GEN-LAST:event_accesoBtActionPerformed

    private void agregarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtActionPerformed
        RegistrarUsuario ru = new RegistrarUsuario();
        ru.setVisible(true);
        ru.setLocationRelativeTo(null);
    }//GEN-LAST:event_agregarBtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accesoBt;
    private javax.swing.JButton agregarBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables

}
