
package GUI;

import Logica.Nodo;
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
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFieldBuscar = new javax.swing.JTextField();
        jButtonSerch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Nombre de la imagen:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        textFieldBuscar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(textFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 270, -1));

        jButtonSerch.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButtonSerch.setText("Buscar");
        jButtonSerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSerchActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSerch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonSerchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSerchActionPerformed
        if(textFieldBuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
            return;
        } 
        Nodo nodo = simplificado.primero;
        String nombre = textFieldBuscar.getText();
        Boolean encontrado = false;
        
        //Búsqueda """binaria""" (secuencial)
        while(true) {
            if(nodo.getNombre().equals(nombre)) { //Si sí lo encuentra
                encontrado = true;
                break;
            }
            if(nodo == simplificado.ultimo) { //Si no lo encuentra
                break;
            }
            nodo = nodo.getSiguiente();
        }
        
        if(!encontrado) {
            JOptionPane.showMessageDialog(null, "No encontrado");
            return;
        }
        
        simplificado.aux = nodo;
        simplificado.mostrarDatos();
    }//GEN-LAST:event_jButtonSerchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSerch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
