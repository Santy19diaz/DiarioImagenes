package GUI;

import Logica.Metodos;
//import static Logica.Metodos.*;
import Logica.Nodo;
//import static Logica.Nodo.*;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author 19dia
 */

public class prueba extends javax.swing.JFrame {
    int id = 1;
    String directionTmp;//captar direction temporal de la imagen
    JFileChooser explorador = new JFileChooser();//explorador de archivos
    Nodo primero,ultimo,aux;
    

    public prueba() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabPanel = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        jLabelDate = new javax.swing.JLabel();
        FECHA = new javax.swing.JTextField();
        NOMBRE = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jButtonSerch = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jButtonGoToEnd = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jButtonGoToFirst = new javax.swing.JButton();
        jButtonDelate = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jPanelAD = new javax.swing.JPanel();
        jButtonChoise = new javax.swing.JButton();
        jTextFieldDate = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jTextFieldName = new javax.swing.JTextField();
        jLabelDate1 = new javax.swing.JLabel();
        jLabelName1 = new javax.swing.JLabel();
        previewLabel = new javax.swing.JLabel();
        jPanelBuscar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyImageDiary");
        setResizable(false);
        setSize(new java.awt.Dimension(478, 580));

        TabPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jPanelInicio.setMinimumSize(new java.awt.Dimension(100, 540));
        jPanelInicio.setPreferredSize(new java.awt.Dimension(498, 540));

        jLabelDate.setText("FECHA");

        FECHA.setEditable(false);

        NOMBRE.setEditable(false);

        jLabelName.setText("NOMBRE");

        jButtonSerch.setText("Buscar");
        jButtonSerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSerchActionPerformed(evt);
            }
        });

        jButtonNext.setText(">");

        jButtonGoToEnd.setText("Ir final");

        jLabelImage.setBackground(new java.awt.Color(0, 0, 0));
        jLabelImage.setText("IMAGE");

        jButtonBack.setText("<");

        jButtonGoToFirst.setText("Ir inico");
        jButtonGoToFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoToFirstActionPerformed(evt);
            }
        });

        jButtonDelate.setText("Borrar");

        jButtonNew.setText("Agregar");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSerch)
                            .addGroup(jPanelInicioLayout.createSequentialGroup()
                                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonGoToFirst)
                                    .addComponent(jButtonBack))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                                        .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonNext)
                                            .addComponent(jButtonGoToEnd))))))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInicioLayout.createSequentialGroup()
                                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelInicioLayout.createSequentialGroup()
                                .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDelate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNew)
                .addGap(30, 30, 30))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicioLayout.createSequentialGroup()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSerch)
                            .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInicioLayout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jButtonGoToEnd))
                            .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonNext)
                                .addComponent(jButtonBack)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jButtonGoToFirst)))
                .addGap(18, 18, 18)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonDelate))
                .addGap(20, 20, 20))
        );

        TabPanel.addTab("Diario", jPanelInicio);

        jPanelAD.setPreferredSize(new java.awt.Dimension(498, 540));

        jButtonChoise.setText("Seleccionar imagen");
        jButtonChoise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChoiseActionPerformed(evt);
            }
        });

        jTextFieldDate.setText("DD/MM/YY");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabelDate1.setText("Fecha de la imagen:");

        jLabelName1.setText("Nombre de imagen:");

        previewLabel.setBackground(new java.awt.Color(0, 0, 0));
        previewLabel.setText("PREVIEW");

        javax.swing.GroupLayout jPanelADLayout = new javax.swing.GroupLayout(jPanelAD);
        jPanelAD.setLayout(jPanelADLayout);
        jPanelADLayout.setHorizontalGroup(
            jPanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelADLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelADLayout.createSequentialGroup()
                        .addComponent(jButtonChoise)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar))
                    .addComponent(jLabelName1)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate1)
                    .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelADLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanelADLayout.setVerticalGroup(
            jPanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelADLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDate1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChoise)
                    .addComponent(jButtonGuardar))
                .addGap(62, 62, 62))
        );

        TabPanel.addTab("Agregar", jPanelAD);

        javax.swing.GroupLayout jPanelBuscarLayout = new javax.swing.GroupLayout(jPanelBuscar);
        jPanelBuscar.setLayout(jPanelBuscarLayout);
        jPanelBuscarLayout.setHorizontalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        jPanelBuscarLayout.setVerticalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        TabPanel.addTab("Buscar", jPanelBuscar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSerchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSerchActionPerformed
        TabPanel.setSelectedIndex(2);
        
    }//GEN-LAST:event_jButtonSerchActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        TabPanel.setSelectedIndex(1);

  
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonChoiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChoiseActionPerformed
        captarImagen();
        mostrarImagen(previewLabel);
        
    }//GEN-LAST:event_jButtonChoiseActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        Insertar(id,jTextFieldDate.getText(),jTextFieldName.getText(),directionTmp);
        previewLabel.setIcon(null);
        jTextFieldDate.setText("DD/MM/YY");
        jTextFieldName.setText("");
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonGoToFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoToFirstActionPerformed
        aux = primero;
        directionTmp = aux.getFoto();
        NOMBRE.setText(aux.getNombre());
        mostrarImagen(jLabelImage);
    }//GEN-LAST:event_jButtonGoToFirstActionPerformed

    public  void Insertar(int id, String fecha, String nombre,String foto){
        Nodo auxiliar = new Nodo(id,fecha,nombre,foto,null,null);
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
    public void eliminarDato(int id){//con eliminar el ID del nodo, se elimina toda la información
        Nodo auxiliar=primero;
        boolean ciclo = true;
        while(ciclo){
            if(id == auxiliar.getId()){
                auxiliar.getAnterior().setSiguiente(auxiliar.getAnterior());
                JOptionPane.showMessageDialog(null,"El Nodo se elimino!!!");
                ciclo = false;
            }else if (auxiliar.getSiguiente()==ultimo){
                JOptionPane.showMessageDialog(null,"El dato no existe!!!");
                ciclo = false;
            }else{
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
    public  void captarImagen(){//este es el mismo que vimos en clase, asi que será fácil de usar, solo lo agregas y elegimos la imagen a agregar
        try{
            File auxFile;
            explorador.addChoosableFileFilter(new FileNameExtensionFilter("imágenes","jpg","png","jpeg","gif"));
            explorador.showOpenDialog(null);
            auxFile = explorador.getSelectedFile();
            directionTmp = auxFile.getAbsolutePath();

        }catch(Exception ex){JOptionPane.showMessageDialog(null,"Error al abrir el archivo");}
    }

    public  JLabel mostrarImagen(JLabel fotoLabel){/*necesitamos crear un Jlabel donde iran las imágenes,
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FECHA;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JTabbedPane TabPanel;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonChoise;
    private javax.swing.JButton jButtonDelate;
    private javax.swing.JButton jButtonGoToEnd;
    private javax.swing.JButton jButtonGoToFirst;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonSerch;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDate1;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelName1;
    private javax.swing.JPanel jPanelAD;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JLabel previewLabel;
    // End of variables declaration//GEN-END:variables
}
