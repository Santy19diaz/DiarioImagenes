package GUI;

import Logica.Nodo;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 19dia
 */
public class Simplificado extends javax.swing.JFrame {

    String directionTmp;//captar direction temporal de la imagen
    JFileChooser explorador = new JFileChooser();//explorador de archivos
    Nodo primero, ultimo, aux;

    public Simplificado() {
        initComponents();
        botonAgregar.setIcon(setIcono("/iconos/add.png", botonAgregar));
        botonEditar.setIcon(setIcono("/iconos/edit.png",botonEditar));
        botonOrdenar.setIcon(setIcono("/iconos/check.png", botonOrdenar));
        botonBuscar.setIcon(setIcono("/iconos/buscar.png", botonBuscar));
        botonEliminar.setIcon(setIcono("/iconos/borrar.png", botonEliminar));

    }

    public void etiquetaNombreVariable(String nombre) {
        this.etiquetaNombreVariable.setText(nombre);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDate = new javax.swing.JLabel();
        FECHA = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
        jButtonSerch = new javax.swing.JButton();
        jButtonDelate = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabelName1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldDate = new javax.swing.JTextField();
        jButtonChoise = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        previewLabel = new javax.swing.JLabel();
        jLabelImage1 = new javax.swing.JLabel();
        etiquetaNombreVariable1 = new javax.swing.JLabel();
        etiquetaFechaVariable1 = new javax.swing.JLabel();
        etiquetaEmoticonVariable1 = new javax.swing.JLabel();
        etiquetaDescripcionVariable1 = new javax.swing.JLabel();
        TabPanel = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        botonDerecha = new javax.swing.JButton();
        BotonFinal = new javax.swing.JButton();
        etiquetaImagen = new javax.swing.JLabel();
        botonIzquierda = new javax.swing.JButton();
        botonOrdenar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaEmoticon = new javax.swing.JLabel();
        etiquetaDescripcion = new javax.swing.JLabel();
        etiquetaFechaVariable = new javax.swing.JLabel();
        etiquetaNombreVariable = new javax.swing.JLabel();
        etiquetaEmoticonVariable = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        etiquetaDescripcionVariable = new javax.swing.JTextArea();
        botonEditar = new javax.swing.JButton();
        BotonInicio = new javax.swing.JButton();
        jPanelAD = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        etiquetaNombre1 = new javax.swing.JLabel();
        etiquetaFecha1 = new javax.swing.JLabel();
        etiquetaEmoticon1 = new javax.swing.JLabel();
        etiquetaDescripcion1 = new javax.swing.JLabel();
        botonSeleccionarImagen = new javax.swing.JButton();
        etiquetaPreviewImage = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        textoNombre = new javax.swing.JTextField();
        textoEmoticon = new javax.swing.JTextField();
        botonDiario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoDescripcion = new javax.swing.JTextArea();
        formatedFecha = new javax.swing.JFormattedTextField();

        jLabelDate.setText("FECHA");

        FECHA.setEditable(false);

        jLabelName.setText("NOMBRE");

        NOMBRE.setEditable(false);

        jButtonSerch.setText("Buscar");
        jButtonSerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSerchActionPerformed(evt);
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

        jLabelName1.setText("Nombre de imagen:");

        jTextFieldDate.setText("DD/MM/YY");

        jButtonChoise.setText("Seleccionar imagen");
        jButtonChoise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChoiseActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        previewLabel.setBackground(new java.awt.Color(0, 0, 0));
        previewLabel.setText("PREVIEW");

        jLabelImage1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelImage1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage1.setText("Galería Vacía");
        jLabelImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiquetaNombreVariable1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaNombreVariable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        etiquetaFechaVariable1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaFechaVariable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        etiquetaEmoticonVariable1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaEmoticonVariable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        etiquetaDescripcionVariable1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaDescripcionVariable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyImageDiary");
        setResizable(false);
        setSize(new java.awt.Dimension(478, 580));

        TabPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jPanelInicio.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInicio.setMinimumSize(new java.awt.Dimension(100, 540));
        jPanelInicio.setPreferredSize(new java.awt.Dimension(498, 540));
        jPanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonDerecha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonDerecha.setText(">");
        botonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechaActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, -1, -1));

        BotonFinal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BotonFinal.setText(">>");
        BotonFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalActionPerformed(evt);
            }
        });
        jPanelInicio.add(BotonFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 490, 70, -1));

        etiquetaImagen.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaImagen.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelInicio.add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 410, 410));

        botonIzquierda.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonIzquierda.setText("<");
        botonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdaActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        botonOrdenar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonOrdenar.setBorder(null);
        botonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 95, 95));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Diario de Imágenes");
        jPanelInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaNombre.setText("Nombre:");
        jPanelInicio.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        etiquetaFecha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaFecha.setText("Fecha:");
        jPanelInicio.add(etiquetaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        etiquetaEmoticon.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaEmoticon.setText("Emoticón:");
        jPanelInicio.add(etiquetaEmoticon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        etiquetaDescripcion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaDescripcion.setText("Descripción:");
        jPanelInicio.add(etiquetaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        etiquetaFechaVariable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaFechaVariable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInicio.add(etiquetaFechaVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 140, 30));

        etiquetaNombreVariable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaNombreVariable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInicio.add(etiquetaNombreVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 210, 30));

        etiquetaEmoticonVariable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaEmoticonVariable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInicio.add(etiquetaEmoticonVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 45, 30));

        botonAgregar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonAgregar.setBorder(null);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, 95, 95));

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonBuscar.setBorder(null);
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 640, 95, 95));

        botonEliminar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar.setBorder(null);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 640, 95, 95));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel15.setText("Galería vacía");
        jPanelInicio.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        etiquetaDescripcionVariable.setEditable(false);
        etiquetaDescripcionVariable.setColumns(0);
        etiquetaDescripcionVariable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaDescripcionVariable.setRows(5);
        jScrollPane3.setViewportView(etiquetaDescripcionVariable);

        jPanelInicio.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 310, 190));

        botonEditar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEditar.setBorder(null);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 95, 95));

        BotonInicio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BotonInicio.setText("<<");
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });
        jPanelInicio.add(BotonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 70, -1));

        TabPanel.addTab("Diario", jPanelInicio);

        jPanelAD.setPreferredSize(new java.awt.Dimension(498, 540));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("Agregar Imagen");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 280, -1));

        etiquetaNombre1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaNombre1.setText("Nombre:");
        jPanel2.add(etiquetaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        etiquetaFecha1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaFecha1.setText("Fecha (d/m/yy):");
        jPanel2.add(etiquetaFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        etiquetaEmoticon1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaEmoticon1.setText("Emoticón:");
        jPanel2.add(etiquetaEmoticon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        etiquetaDescripcion1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaDescripcion1.setText("Descripción:");
        jPanel2.add(etiquetaDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        botonSeleccionarImagen.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonSeleccionarImagen.setText("Seleccionar imagen");
        botonSeleccionarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarImagenActionPerformed(evt);
            }
        });
        jPanel2.add(botonSeleccionarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, -1));

        etiquetaPreviewImage.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaPreviewImage.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaPreviewImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaPreviewImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(etiquetaPreviewImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 410, 410));

        botonGuardar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 640, -1, -1));

        textoNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        jPanel2.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 210, -1));

        textoEmoticon.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textoEmoticon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEmoticonActionPerformed(evt);
            }
        });
        jPanel2.add(textoEmoticon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 45, -1));

        botonDiario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonDiario.setText("Diario");
        botonDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDiarioActionPerformed(evt);
            }
        });
        jPanel2.add(botonDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, 120, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Seleccione una imagen");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, -1, -1));

        textoDescripcion.setColumns(1);
        textoDescripcion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textoDescripcion.setRows(5);
        jScrollPane2.setViewportView(textoDescripcion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 310, 190));

        formatedFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/M/yy"))));
        formatedFecha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        formatedFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatedFechaActionPerformed(evt);
            }
        });
        jPanel2.add(formatedFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 140, -1));

        javax.swing.GroupLayout jPanelADLayout = new javax.swing.GroupLayout(jPanelAD);
        jPanelAD.setLayout(jPanelADLayout);
        jPanelADLayout.setHorizontalGroup(
            jPanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelADLayout.setVerticalGroup(
            jPanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TabPanel.addTab("Agregar", jPanelAD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
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


    }//GEN-LAST:event_jButtonChoiseActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void botonDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDiarioActionPerformed
        TabPanel.setSelectedIndex(0); //Moverse a la pestaña "Diario"
    }//GEN-LAST:event_botonDiarioActionPerformed

    private void textoEmoticonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEmoticonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEmoticonActionPerformed

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed

    }//GEN-LAST:event_textoNombreActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if ((textoNombre.getText().equals("")) && (etiquetaPreviewImage.getIcon() == null)) {
            JOptionPane.showMessageDialog(null, "Ingrese al menos una imagen y un nombre");
        } else if (etiquetaPreviewImage.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "Agregue una imagen");
        } else if (textoNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Agregue un nombre");
        } else {
            Nodo nodo = primero;
            if (nodo != null) {
                //Búsqueda """binaria""" (secuencial)
                while (true) {
                    if (nodo.getNombre().equals(textoNombre.getText())) { //Si sí lo encuentra
                        JOptionPane.showMessageDialog(null, "Ingrese un nombre diferente");
                        return;
                    }
                    if (nodo == ultimo) { //Si no lo encuentra
                        break;
                    }
                    nodo = nodo.getSiguiente();
                }
            }
            Insertar(textoNombre.getText(), formatedFecha.getText(), textoEmoticon.getText(), textoDescripcion.getText(), directionTmp);
            etiquetaPreviewImage.setIcon(null);
            textoNombre.setText("");
            formatedFecha.setText("");
            textoEmoticon.setText("");
            textoDescripcion.setText("");

            //Mostrar la última imagen ingresada:
            aux = ultimo;
            mostrarDatos();

        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonSeleccionarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarImagenActionPerformed
        captarImagen();
        mostrarImagen(etiquetaPreviewImage);
    }//GEN-LAST:event_botonSeleccionarImagenActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (!etiquetaNombreVariable.getText().equals("")) {
            Eliminar eliminar = new Eliminar(this);
            eliminar.setVisible(true);
            eliminar.setTitle("Eliminar"); // Establecer el título
            eliminar.setDefaultCloseOperation(Eliminar.DISPOSE_ON_CLOSE); //Con esto, al darle clic a la "x" se cierra solo esa ventana
            eliminar.setResizable(false); // Evita que la ventana sea redimensionable
        } else {
            JOptionPane.showMessageDialog(null, "Primero añada una imagen");
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if (!etiquetaNombreVariable.getText().equals("")) {
            Buscar buscar = new Buscar(this);
            buscar.setVisible(true);
            buscar.setTitle("Buscar"); // Establecer el título
            buscar.setDefaultCloseOperation(Buscar.DISPOSE_ON_CLOSE); //Con esto, al darle clic a la "x" se cierra solo esa ventana
            buscar.setResizable(false); // Evita que la ventana sea redimensionable
        } else {
            JOptionPane.showMessageDialog(null, "Primero añada una imagen");
        }

    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        TabPanel.setSelectedIndex(1); //Moverse a la pestaña "Agregar"
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenarActionPerformed
        ordenarPorFecha();
        JOptionPane.showMessageDialog(null, "Lista");
    }//GEN-LAST:event_botonOrdenarActionPerformed

    private void botonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIzquierdaActionPerformed
        if (aux == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        } else {
            aux = aux.getAnterior();
            mostrarDatos();
        }
    }//GEN-LAST:event_botonIzquierdaActionPerformed

    private void BotonFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinalActionPerformed
        if (aux == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        } else {
            aux = ultimo;
            mostrarDatos();
        }
    }//GEN-LAST:event_BotonFinalActionPerformed

    private void botonDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDerechaActionPerformed
        if (aux == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        } else {
            aux = aux.getSiguiente();
            mostrarDatos();
        }
    }//GEN-LAST:event_botonDerechaActionPerformed

    public void ordenarPorFecha() {
        if (primero != null) {
            primero.sort(primero);
        }
    }

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        if (!etiquetaNombreVariable.getText().equals("")) {
            Editar editar = new Editar(aux, this);

            editar.setTitle("Editar"); // Establecer el título
            editar.setDefaultCloseOperation(Buscar.DISPOSE_ON_CLOSE); //Con esto, al darle clic a la "x" se cierra solo esa ventana
            editar.setResizable(false); // Evita que la ventana sea redimensionable
            editar.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Primero añada una imagen");
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        if (aux == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        } else {
            aux = primero;
            mostrarDatos();
        }
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void formatedFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatedFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatedFechaActionPerformed

    public void Insertar(String nombre, String fecha, String emoticon, String descripcion, String foto) {
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

    public void eliminarDato(String nombre) {//con eliminar el nombre del nodo, se elimina toda la información
        Nodo auxiliar = buscar(nombre);
        if (auxiliar == null) {
            JOptionPane.showMessageDialog(null, "El dato no existe");
            return;
        }

        if (nombre.equals(auxiliar.getNombre())) {
            if (auxiliar == primero && auxiliar == ultimo) { //Caso en el que solo hay un elemento y se elimina
                primero = null;
                ultimo = null;
                auxiliar = null;
                aux = null;

                //Vaciar los textField:
                etiquetaImagen.setIcon(null);
                etiquetaNombreVariable.setText("");
                etiquetaFechaVariable.setText("");
                etiquetaEmoticonVariable.setText("");
                etiquetaDescripcionVariable.setText("");

            } else if (auxiliar == primero) { // Caso en que se elimina el primer elemento:
                primero = auxiliar.getSiguiente();
                auxiliar.getAnterior().setSiguiente(auxiliar.getSiguiente());
                auxiliar.getSiguiente().setAnterior(auxiliar.getAnterior());
                aux = auxiliar.getSiguiente();
                mostrarDatos();
            } else if (auxiliar == ultimo) { // Caso en que se elimina el último elemento:
                ultimo = auxiliar.getAnterior();
                auxiliar.getAnterior().setSiguiente(auxiliar.getSiguiente());
                auxiliar.getSiguiente().setAnterior(auxiliar.getAnterior());
                aux = auxiliar.getSiguiente();
                mostrarDatos();
            } else {
                auxiliar.getAnterior().setSiguiente(auxiliar.getSiguiente());
                auxiliar.getSiguiente().setAnterior(auxiliar.getAnterior());
                aux = auxiliar.getSiguiente();
                mostrarDatos();
            }

            JOptionPane.showMessageDialog(null, "El nodo se eliminó");

        }
    }

    public void captarImagen() {//este es el mismo que vimos en clase, asi que será fácil de usar, solo lo agregas y elegimos la imagen a agregar
        try {
            File auxFile;
            explorador.addChoosableFileFilter(new FileNameExtensionFilter("imágenes", "jpg", "png", "jpeg", "gif"));
            explorador.showOpenDialog(null);
            auxFile = explorador.getSelectedFile();
            directionTmp = auxFile.getAbsolutePath();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }
    }
    
    public Icon setIcono(String url, JButton bt){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = bt.getWidth();
        int alto = bt.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho,alto,Image.SCALE_DEFAULT));
        
        return icono;
    }

    public JLabel mostrarImagen(JLabel fotoLabel) {/*necesitamos crear un Jlabel donde iran las imágenes,
                                                    debemos pasar ese Jlabel como parámetro para que cambie la imagen*/
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

    public Nodo buscar(String nombre) {
        Nodo nodo = primero;

        //Búsqueda """binaria""" (secuencial)
        while (true) {
            if (nodo.getNombre().equals(nombre)) { //Si sí lo encuentra
                return nodo;
            }
            if (nodo == ultimo) { //Si no lo encuentra
                return null;
            }
            nodo = nodo.getSiguiente();
        }
    }

    void mostrarDatos() {
        directionTmp = aux.getFoto();
        etiquetaNombreVariable.setText(aux.getNombre());
        etiquetaFechaVariable.setText(aux.getFecha());
        etiquetaEmoticonVariable.setText(aux.getEmoticon());
        etiquetaDescripcionVariable.setText(aux.getDescripcion());
        mostrarImagen(etiquetaImagen);

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFinal;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JTextField FECHA;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JTabbedPane TabPanel;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonDiario;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.JButton botonOrdenar;
    private javax.swing.JButton botonSeleccionarImagen;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaDescripcion1;
    private javax.swing.JTextArea etiquetaDescripcionVariable;
    private javax.swing.JLabel etiquetaDescripcionVariable1;
    private javax.swing.JLabel etiquetaEmoticon;
    private javax.swing.JLabel etiquetaEmoticon1;
    private javax.swing.JLabel etiquetaEmoticonVariable;
    private javax.swing.JLabel etiquetaEmoticonVariable1;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaFecha1;
    private javax.swing.JLabel etiquetaFechaVariable;
    private javax.swing.JLabel etiquetaFechaVariable1;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNombre1;
    private javax.swing.JLabel etiquetaNombreVariable;
    private javax.swing.JLabel etiquetaNombreVariable1;
    private javax.swing.JLabel etiquetaPreviewImage;
    private javax.swing.JFormattedTextField formatedFecha;
    private javax.swing.JButton jButtonChoise;
    private javax.swing.JButton jButtonDelate;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSerch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelImage1;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelName1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAD;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JTextArea textoDescripcion;
    private javax.swing.JTextField textoEmoticon;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
