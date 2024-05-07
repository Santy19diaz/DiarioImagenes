package GUI;

import Logica.Nodo;
import Logica.Metodos;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author 19dia
 */
public class Simplificado extends javax.swing.JFrame {

    String directionTmp;//captar direction temporal de la imagen
    Nodo primero = Metodos.primero, ultimo = Metodos.ultimo, aux;

    public Simplificado() {
        initComponents();
        botonAgregar.setIcon(setIcono("/iconos/add.png", botonAgregar));
        botonEditar.setIcon(setIcono("/iconos/edit.png", botonEditar));
        botonOrdenar.setIcon(setIcono("/iconos/check.png", botonOrdenar));
        botonBuscar.setIcon(setIcono("/iconos/buscar.png", botonBuscar));
        botonEliminar.setIcon(setIcono("/iconos/borrar.png", botonEliminar));
        botonDiario.setIcon(setIcono("/iconos/left-arrow.png", botonDiario));
        botonGuardar.setIcon(setIcono("/iconos/save-file.png", botonGuardar));
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
        BotonFinal = new javax.swing.JButton();
        etiquetaImagen = new javax.swing.JLabel();
        botonIzquierda = new javax.swing.JButton();
        botonOrdenar = new javax.swing.JButton();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

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
        botonDerecha.setForeground(new java.awt.Color(51, 51, 51));
        botonDerecha.setText(">");
        botonDerecha.setBorder(null);
        botonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechaActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 310, -1, -1));

        BotonFinal.setBackground(new java.awt.Color(255, 255, 255));
        BotonFinal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BotonFinal.setForeground(new java.awt.Color(51, 51, 51));
        BotonFinal.setText(">>");
        BotonFinal.setBorder(null);
        BotonFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalActionPerformed(evt);
            }
        });

        jPanelInicio.add(BotonFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 370, 70, -1));
        etiquetaImagen.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaImagen.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelInicio.add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 500, 390));

        botonIzquierda.setBackground(new java.awt.Color(255, 255, 255));
        botonIzquierda.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonIzquierda.setForeground(new java.awt.Color(51, 51, 51));
        botonIzquierda.setText("<");
        botonIzquierda.setBorder(null);
        botonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdaActionPerformed(evt);
            }
        });

        jPanelInicio.add(botonIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        botonOrdenar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonOrdenar.setBorder(null);
        botonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, 95, 95));

        etiquetaDescripcion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaDescripcion.setText("Descripción");
        jPanelInicio.add(etiquetaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        etiquetaFechaVariable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanelInicio.add(etiquetaFechaVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, 30));

        etiquetaNombreVariable.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaNombreVariable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaNombreVariable.setForeground(new java.awt.Color(51, 51, 51));
        jPanelInicio.add(etiquetaNombreVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 310, 30));

        etiquetaEmoticonVariable.setBackground(new java.awt.Color(204, 255, 255));
        etiquetaEmoticonVariable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaEmoticonVariable.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaEmoticonVariable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInicio.add(etiquetaEmoticonVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 510, 40, 40));
        botonAgregar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonAgregar.setBorder(null);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 95, 95));

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonBuscar.setBorder(null);
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 95, 95));

        botonEliminar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar.setBorder(null);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 620, 95, 95));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Galería vacía");
        jPanelInicio.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 158, 500, 390));

        etiquetaDescripcionVariable.setEditable(false);
        etiquetaDescripcionVariable.setColumns(0);
        etiquetaDescripcionVariable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaDescripcionVariable.setRows(5);
        jScrollPane3.setViewportView(etiquetaDescripcionVariable);

        jPanelInicio.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 360, 180));

        botonEditar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEditar.setBorder(null);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        jPanelInicio.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 95, 95));

        BotonInicio.setBackground(new java.awt.Color(255, 255, 255));
        BotonInicio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BotonInicio.setForeground(new java.awt.Color(51, 51, 51));
        BotonInicio.setText("<<");
        BotonInicio.setBorder(null);
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        jPanelInicio.add(BotonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 70, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Diario de Imágenes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jLabel1)
                .addContainerGap(559, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelInicio.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 130));


        TabPanel.addTab("Diario", jPanelInicio);

        jPanelAD.setPreferredSize(new java.awt.Dimension(498, 540));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar Imagen");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 280, -1));

        etiquetaNombre1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        etiquetaNombre1.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaNombre1.setText("Nombre");
        jPanel2.add(etiquetaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        etiquetaFecha1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaFecha1.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaFecha1.setText("Fecha");
        jPanel2.add(etiquetaFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        etiquetaEmoticon1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaEmoticon1.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaEmoticon1.setText("Emoticón:");
        jPanel2.add(etiquetaEmoticon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        etiquetaDescripcion1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaDescripcion1.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaDescripcion1.setText("Descripción:");
        jPanel2.add(etiquetaDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        botonSeleccionarImagen.setBackground(new java.awt.Color(255, 255, 255));
        botonSeleccionarImagen.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonSeleccionarImagen.setForeground(new java.awt.Color(51, 51, 51));
        botonSeleccionarImagen.setText("Seleccionar imagen");
        botonSeleccionarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarImagenActionPerformed(evt);
            }
        });
        jPanel2.add(botonSeleccionarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));
        etiquetaPreviewImage.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaPreviewImage.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaPreviewImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaPreviewImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(etiquetaPreviewImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 410, 410));

        botonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        botonGuardar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonGuardar.setBorder(null);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 650, 80, 80));

        textoNombre.setBackground(new java.awt.Color(255, 255, 255));
        textoNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(204, 204, 204));
        textoNombre.setText("Ingrese el nombre de la imágen");
        textoNombre.setBorder(null);
        textoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textoNombreMousePressed(evt);
            }
        });
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        jPanel2.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 360, -1));

        textoEmoticon.setBackground(new java.awt.Color(255, 255, 255));
        textoEmoticon.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel2.add(textoEmoticon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 45, -1));

        botonDiario.setBackground(new java.awt.Color(255, 255, 255));
        botonDiario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/left-arrow.png"))); // NOI18N
        botonDiario.setBorder(null);
        botonDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDiarioActionPerformed(evt);
            }
        });
        jPanel2.add(botonDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 80, 80));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Seleccione una imagen");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, -1, -1));

        textoDescripcion.setColumns(1);
        textoDescripcion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textoDescripcion.setRows(5);
        jScrollPane2.setViewportView(textoDescripcion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 310, 190));

        formatedFecha.setBackground(new java.awt.Color(255, 255, 255));
        formatedFecha.setBorder(null);
        formatedFecha.setForeground(new java.awt.Color(204, 204, 204));
        formatedFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/M/yy"))));
        formatedFecha.setText("(dd/mm/yy)");
        formatedFecha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        formatedFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formatedFechaMousePressed(evt);
            }
        });
        jPanel2.add(formatedFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 140, 30));

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1240, 140));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, 10));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 310, 10));

        javax.swing.GroupLayout jPanelADLayout = new javax.swing.GroupLayout(jPanelAD);
        jPanelAD.setLayout(jPanelADLayout);
        jPanelADLayout.setHorizontalGroup(
            jPanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelADLayout.setVerticalGroup(
            jPanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

        );

        TabPanel.addTab("Agregar", jPanelAD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
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
        } else if (textoNombre.getText().equals("") || textoNombre.getText().equals("Ingrese el nombre de la imágen")) {

            JOptionPane.showMessageDialog(null, "Agregue un nombre");
        } else {

            Metodos.Insertar(textoNombre.getText(), formatedFecha.getText(), textoEmoticon.getText(), textoDescripcion.getText(), directionTmp);
            etiquetaPreviewImage.setIcon(null);
            textoNombre.setText("");
            formatedFecha.setText("");
            textoEmoticon.setText("");
            textoDescripcion.setText("");

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

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoNombreMousePressed
        if(textoNombre.getText().equals("Ingrese el nombre de la imágen")){
            textoNombre.setText("");
            textoNombre.setForeground(Color.black);
        }
        
        if(formatedFecha.getText().isEmpty()){
            formatedFecha.setText("(dd/mm/yy)");
            formatedFecha.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_textoNombreMousePressed

    private void formatedFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formatedFechaMousePressed
        if(textoNombre.getText().isEmpty()){
            textoNombre.setText("Ingrese el nombre de la imágen");
            textoNombre.setForeground(Color.LIGHT_GRAY);
        }
        
        if(formatedFecha.getText().equals("(dd/mm/yy")){
            formatedFecha.setText("");
            formatedFecha.setForeground(Color.black);
        }
    }//GEN-LAST:event_formatedFechaMousePressed
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
    private javax.swing.JButton BotonFinal;
    private javax.swing.JButton BotonInicio;
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
    private javax.swing.JLabel etiquetaEmoticon1;
    private javax.swing.JLabel etiquetaEmoticonVariable;
    private javax.swing.JLabel etiquetaFecha1;
    private javax.swing.JLabel etiquetaFechaVariable;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaNombre1;
    private javax.swing.JLabel etiquetaNombreVariable;
    private javax.swing.JLabel etiquetaPreviewImage;
    private javax.swing.JFormattedTextField formatedFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAD;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea textoDescripcion;
    private javax.swing.JTextField textoEmoticon;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
