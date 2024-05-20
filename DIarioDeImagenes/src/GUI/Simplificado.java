package GUI;

import Logica.Nodo;
import Logica.Metodos;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author 19dia
 */
public class Simplificado extends javax.swing.JFrame {
    RegistrarUsuario ru = new RegistrarUsuario();
    String nomb = "";
    String directionTmp;//captar direction temporal de la imagen
    Nodo primero = Metodos.primero, ultimo = Metodos.ultimo, aux;

    public Simplificado() throws IOException {
        initComponents();
        ru.guardarLista(nomb);
        
//        botonAgregar.setIcon(setIcono("/iconos/add.png", botonAgregar));
//        botonEditar.setIcon(setIcono("/iconos/edit.png", botonEditar));
//        botonOrdenar.setIcon(setIcono("/iconos/check.png", botonOrdenar));
//        botonBuscar.setIcon(setIcono("/iconos/buscar.png", botonBuscar));
//        botonEliminar.setIcon(setIcono("/iconos/borrar.png", botonEliminar));
        botonIzquierda.setIcon(setIcono("/iconos/left.png", botonIzquierda));
        botonInicio.setIcon(setIcono("/iconos/first.png", botonInicio));
        botonDerecha.setIcon(setIcono("/iconos/right.png", botonDerecha));
        botonFinal.setIcon(setIcono("/iconos/last.png", botonFinal));
        botonGuardar.setIcon(setIcono("/iconos/save-file.png", botonGuardar));
//        botonDiario.setIcon(setIcono("/iconos/left-arrow.png", botonDiario));

    }

    public void etiquetaNombreVariable(String nombre) {
        this.etiquetaNombreVariable.setText(nombre);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabPanel = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        botonDerecha = new javax.swing.JButton();
        botonFinal = new javax.swing.JButton();
        etiquetaImagen = new javax.swing.JLabel();
        botonIzquierda = new javax.swing.JButton();
        botonOrdenar = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
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
        jLabelEmpty = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        etiquetaDescripcionVariable = new javax.swing.JTextArea();
        botonEditar = new javax.swing.JButton();
        botonInicio = new javax.swing.JButton();
        jPanelTitle = new javax.swing.JPanel();
        jPanelAD = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        jPanelTitleA = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyImageDiary");
        setResizable(false);
        setSize(new java.awt.Dimension(478, 580));

        TabPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jPanelInicio.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInicio.setMinimumSize(new java.awt.Dimension(100, 540));
        jPanelInicio.setPreferredSize(new java.awt.Dimension(498, 540));
        jPanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonDerecha.setBackground(new java.awt.Color(255, 255, 255));
        botonDerecha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonDerecha.setBorder(null);
        botonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechaActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 300, 65, 65));

        botonFinal.setBackground(new java.awt.Color(255, 255, 255));
        botonFinal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonFinal.setBorder(null);
        botonFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 390, 80, 80));

        etiquetaImagen.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaImagen.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelInicio.add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 720, 480));

        botonIzquierda.setBackground(new java.awt.Color(255, 255, 255));
        botonIzquierda.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonIzquierda.setBorder(null);
        botonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdaActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 65, 65));

        botonOrdenar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonOrdenar.setBorder(null);
        botonOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, 95, 95));

        jLabelTitle.setBackground(new java.awt.Color(51, 204, 255));
        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Diario de Imágenes");
        jPanelInicio.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 2, 1290, 100));

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaNombre.setText("Nombre:");
        jPanelInicio.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        etiquetaFecha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaFecha.setText("Fecha:");
        jPanelInicio.add(etiquetaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        etiquetaEmoticon.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaEmoticon.setText("Emoticón:");
        jPanelInicio.add(etiquetaEmoticon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        etiquetaDescripcion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaDescripcion.setText("Descripción:");
        jPanelInicio.add(etiquetaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        etiquetaFechaVariable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaFechaVariable.setForeground(new java.awt.Color(102, 102, 102));
        jPanelInicio.add(etiquetaFechaVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 140, 30));

        etiquetaNombreVariable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaNombreVariable.setForeground(new java.awt.Color(102, 102, 102));
        jPanelInicio.add(etiquetaNombreVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, 30));

        etiquetaEmoticonVariable.setBackground(new java.awt.Color(102, 102, 102));
        etiquetaEmoticonVariable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaEmoticonVariable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelInicio.add(etiquetaEmoticonVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 45, 30));

        botonAgregar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonAgregar.setBorder(null);
        botonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 660, 95, 95));

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonBuscar.setBorder(null);
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 660, 95, 95));

        botonEliminar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar.setBorder(null);
        botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 660, 95, 95));

        jLabelEmpty.setBackground(new java.awt.Color(204, 204, 204));
        jLabelEmpty.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelEmpty.setForeground(new java.awt.Color(204, 204, 204));
        jLabelEmpty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmpty.setText("Galería vacía");
        jPanelInicio.add(jLabelEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 720, 480));

        etiquetaDescripcionVariable.setEditable(false);
        etiquetaDescripcionVariable.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaDescripcionVariable.setColumns(0);
        etiquetaDescripcionVariable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaDescripcionVariable.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDescripcionVariable.setRows(5);
        etiquetaDescripcionVariable.setBorder(null);
        jScrollPane3.setViewportView(etiquetaDescripcionVariable);

        jPanelInicio.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 260, 190));

        botonEditar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEditar.setBorder(null);
        botonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 95, 95));

        botonInicio.setBackground(new java.awt.Color(255, 255, 255));
        botonInicio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonInicio.setBorder(null);
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 80, 80));

        jPanelTitle.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelInicio.add(jPanelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 100));

        TabPanel.addTab("Diario", jPanelInicio);

        jPanelAD.setPreferredSize(new java.awt.Dimension(498, 540));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaNombre1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaNombre1.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaNombre1.setText("Nombre:");
        jPanel2.add(etiquetaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        etiquetaFecha1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaFecha1.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaFecha1.setText("Fecha:");
        jPanel2.add(etiquetaFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        etiquetaEmoticon1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaEmoticon1.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaEmoticon1.setText("Emoticón:");
        jPanel2.add(etiquetaEmoticon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        etiquetaDescripcion1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaDescripcion1.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaDescripcion1.setText("Descripción:");
        jPanel2.add(etiquetaDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        botonSeleccionarImagen.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonSeleccionarImagen.setText("Seleccionar imagen");
        botonSeleccionarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarImagenActionPerformed(evt);
            }
        });
        jPanel2.add(botonSeleccionarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        etiquetaPreviewImage.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaPreviewImage.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaPreviewImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaPreviewImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(etiquetaPreviewImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 720, 480));

        botonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        botonGuardar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonGuardar.setBorder(null);
        botonGuardar.setLabel("");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 680, 80, 80));

        textoNombre.setBackground(new java.awt.Color(255, 255, 255));
        textoNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(204, 204, 204));
        textoNombre.setText("Ingrese el nombre de la imágen");
        textoNombre.setBorder(null);
        textoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoNombreMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textoNombreMousePressed(evt);
            }
        });
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        jPanel2.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 360, -1));

        textoEmoticon.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel2.add(textoEmoticon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 45, -1));

        botonDiario.setBackground(new java.awt.Color(255, 255, 255));
        botonDiario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonDiario.setBorder(null);
        botonDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDiarioActionPerformed(evt);
            }
        });
        jPanel2.add(botonDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, 80, 80));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Seleccione una imagen");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 720, 480));

        textoDescripcion.setColumns(1);
        textoDescripcion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textoDescripcion.setRows(5);
        jScrollPane2.setViewportView(textoDescripcion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 370, 200));

        formatedFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/M/yy"))));
        formatedFecha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel2.add(formatedFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 360, -1));

        jPanelTitleA.setBackground(new java.awt.Color(51, 204, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar Imagen");

        javax.swing.GroupLayout jPanelTitleALayout = new javax.swing.GroupLayout(jPanelTitleA);
        jPanelTitleA.setLayout(jPanelTitleALayout);
        jPanelTitleALayout.setHorizontalGroup(
            jPanelTitleALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleALayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelTitleALayout.setVerticalGroup(
            jPanelTitleALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitleALayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanelTitleA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 360, 10));

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
            .addComponent(TabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDiarioActionPerformed
        TabPanel.setSelectedIndex(0); //Moverse a la pestaña "Diario"
    }//GEN-LAST:event_botonDiarioActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if ((textoNombre.getText().equals("")) && (etiquetaPreviewImage.getIcon() == null)) {
            JOptionPane.showMessageDialog(null, "Ingrese al menos una imagen y un nombre");
        } else if (etiquetaPreviewImage.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "Agregue una imagen");
        } else if (textoNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Agregue un nombre");
        } else {

            Metodos.Insertar(textoNombre.getText(), formatedFecha.getText(), textoEmoticon.getText(), textoDescripcion.getText(), directionTmp);
            etiquetaPreviewImage.setIcon(null);
            textoNombre.setText("");
            formatedFecha.setText("");
            textoEmoticon.setText("");
            textoDescripcion.setText("");
            //Metodos.escribirEnArchivo(nomb);
            //Mostrar la última imagen ingresada:
            aux = Metodos.ultimo;
            mostrarDatos();

        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonSeleccionarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarImagenActionPerformed
        Metodos.captarImagen();
        Metodos.mostrarImagen(etiquetaPreviewImage);
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

    private void botonFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalActionPerformed
        if (aux == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        } else {
            aux = ultimo;
            mostrarDatos();
        }
    }//GEN-LAST:event_botonFinalActionPerformed

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

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        if (aux == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        } else {
            aux = primero;
            mostrarDatos();
        }
    }//GEN-LAST:event_botonInicioActionPerformed

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoNombreMousePressed
        if (textoNombre.getText().equals("Ingrese el nombre de la imágen")) {
            textoNombre.setText("");
            textoNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_textoNombreMousePressed

    private void textoNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreMouseClicked

    public Icon setIcono(String url, JButton bt) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = bt.getWidth();
        int alto = bt.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));

        return icono;
    }

    void mostrarDatos() {
        directionTmp = aux.getFoto();
        etiquetaNombreVariable.setText(aux.getNombre());
        etiquetaFechaVariable.setText(aux.getFecha());
        etiquetaEmoticonVariable.setText(aux.getEmoticon());
        etiquetaDescripcionVariable.setText(aux.getDescripcion());
        Metodos.mostrarImagen(etiquetaImagen);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabPanel;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonDiario;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonFinal;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonInicio;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.JButton botonOrdenar;
    private javax.swing.JButton botonSeleccionarImagen;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaDescripcion1;
    private javax.swing.JTextArea etiquetaDescripcionVariable;
    private javax.swing.JLabel etiquetaEmoticon;
    private javax.swing.JLabel etiquetaEmoticon1;
    private javax.swing.JLabel etiquetaEmoticonVariable;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaFecha1;
    private javax.swing.JLabel etiquetaFechaVariable;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNombre1;
    private javax.swing.JLabel etiquetaNombreVariable;
    private javax.swing.JLabel etiquetaPreviewImage;
    private javax.swing.JFormattedTextField formatedFecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelEmpty;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAD;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JPanel jPanelTitleA;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea textoDescripcion;
    private javax.swing.JTextField textoEmoticon;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
