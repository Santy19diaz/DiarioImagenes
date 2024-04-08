package GUI;

import Logica.Nodo;
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

public class Simplificado extends javax.swing.JFrame {
    
    String directionTmp;//captar direction temporal de la imagen
    JFileChooser explorador = new JFileChooser();//explorador de archivos
    Nodo primero,ultimo,aux;
    
    
    public Simplificado() {
        initComponents();
        
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
        jLabelDate1 = new javax.swing.JLabel();
        jButtonChoise = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        previewLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelImage1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        etiquetaNombreVariable1 = new javax.swing.JLabel();
        etiquetaFechaVariable1 = new javax.swing.JLabel();
        etiquetaEmoticonVariable1 = new javax.swing.JLabel();
        etiquetaDescripcionVariable1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        botonAgregar1 = new javax.swing.JButton();
        botonEliminar2 = new javax.swing.JButton();
        botonBuscar1 = new javax.swing.JButton();
        botonEliminar3 = new javax.swing.JButton();
        botonAgregar3 = new javax.swing.JButton();
        botonBuscar4 = new javax.swing.JButton();
        botonEliminar8 = new javax.swing.JButton();
        botonAgregar4 = new javax.swing.JButton();
        botonEliminar9 = new javax.swing.JButton();
        botonBuscar2 = new javax.swing.JButton();
        botonEliminar14 = new javax.swing.JButton();
        botonAgregar7 = new javax.swing.JButton();
        botonAgregar8 = new javax.swing.JButton();
        botonBuscar8 = new javax.swing.JButton();
        botonEliminar16 = new javax.swing.JButton();
        botonEliminar17 = new javax.swing.JButton();
        botonEliminar10 = new javax.swing.JButton();
        botonBuscar5 = new javax.swing.JButton();
        botonEliminar11 = new javax.swing.JButton();
        botonAgregar5 = new javax.swing.JButton();
        botonEliminar12 = new javax.swing.JButton();
        botonBuscar6 = new javax.swing.JButton();
        botonEliminar13 = new javax.swing.JButton();
        botonAgregar6 = new javax.swing.JButton();
        TabPanel = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        botonDerecha = new javax.swing.JButton();
        BotonFinal = new javax.swing.JButton();
        etiquetaImagen = new javax.swing.JLabel();
        botonIzquierda = new javax.swing.JButton();
        BotonInicio = new javax.swing.JButton();
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
        textoFecha = new javax.swing.JTextField();
        textoEmoticon = new javax.swing.JTextField();
        botonDiario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoDescripcion = new javax.swing.JTextArea();

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

        jLabelDate1.setText("Fecha de la imagen:");

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

        jLabel3.setText("jLabel3");

        jLabelImage1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelImage1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage1.setText("Galería Vacía");
        jLabelImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        etiquetaNombreVariable1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaNombreVariable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        etiquetaFechaVariable1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaFechaVariable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        etiquetaEmoticonVariable1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaEmoticonVariable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        etiquetaDescripcionVariable1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaDescripcionVariable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        botonAgregar1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonAgregar1.setText("Agregar");
        botonAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregar1ActionPerformed(evt);
            }
        });

        botonEliminar2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar2.setText("Ordenar");
        botonEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar2ActionPerformed(evt);
            }
        });

        botonBuscar1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonBuscar1.setText("Buscar");
        botonBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscar1ActionPerformed(evt);
            }
        });

        botonEliminar3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar3.setText("Eliminar");
        botonEliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar3ActionPerformed(evt);
            }
        });

        botonAgregar3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonAgregar3.setText("Agregar");
        botonAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregar3ActionPerformed(evt);
            }
        });

        botonBuscar4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonBuscar4.setText("Buscar");
        botonBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscar4ActionPerformed(evt);
            }
        });

        botonEliminar8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar8.setText("Ordenar");
        botonEliminar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar8ActionPerformed(evt);
            }
        });

        botonAgregar4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonAgregar4.setText("Agregar");
        botonAgregar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregar4ActionPerformed(evt);
            }
        });

        botonEliminar9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar9.setText("Eliminar");
        botonEliminar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar9ActionPerformed(evt);
            }
        });

        botonBuscar2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonBuscar2.setText("Buscar");
        botonBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscar2ActionPerformed(evt);
            }
        });

        botonEliminar14.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar14.setText("Ordenar");
        botonEliminar14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar14ActionPerformed(evt);
            }
        });

        botonAgregar7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonAgregar7.setText("Agregar");
        botonAgregar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregar7ActionPerformed(evt);
            }
        });

        botonAgregar8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonAgregar8.setText("Agregar");
        botonAgregar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregar8ActionPerformed(evt);
            }
        });

        botonBuscar8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonBuscar8.setText("Buscar");
        botonBuscar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscar8ActionPerformed(evt);
            }
        });

        botonEliminar16.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar16.setText("Ordenar");
        botonEliminar16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar16ActionPerformed(evt);
            }
        });

        botonEliminar17.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar17.setText("Eliminar");
        botonEliminar17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar17ActionPerformed(evt);
            }
        });

        botonEliminar10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar10.setText("Ordenar");
        botonEliminar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar10ActionPerformed(evt);
            }
        });

        botonBuscar5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonBuscar5.setText("Buscar");
        botonBuscar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscar5ActionPerformed(evt);
            }
        });

        botonEliminar11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar11.setText("Eliminar");
        botonEliminar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar11ActionPerformed(evt);
            }
        });

        botonAgregar5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonAgregar5.setText("Agregar");
        botonAgregar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregar5ActionPerformed(evt);
            }
        });

        botonEliminar12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar12.setText("Ordenar");
        botonEliminar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar12ActionPerformed(evt);
            }
        });

        botonBuscar6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonBuscar6.setText("Buscar");
        botonBuscar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscar6ActionPerformed(evt);
            }
        });

        botonEliminar13.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar13.setText("Eliminar");
        botonEliminar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar13ActionPerformed(evt);
            }
        });

        botonAgregar6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonAgregar6.setText("Agregar");
        botonAgregar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregar6ActionPerformed(evt);
            }
        });

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

        BotonInicio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BotonInicio.setText("<<");
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });
        jPanelInicio.add(BotonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 70, -1));

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
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, -1, -1));

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 660, 120, -1));

        botonEliminar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 660, -1, -1));

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
        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        jPanelInicio.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 660, 120, -1));

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
        etiquetaFecha1.setText("Fecha:");
        jPanel2.add(etiquetaFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

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
        jPanel2.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 660, -1, -1));

        textoNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        jPanel2.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 210, -1));

        textoFecha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFechaActionPerformed(evt);
            }
        });
        jPanel2.add(textoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 140, -1));

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

        javax.swing.GroupLayout jPanelADLayout = new javax.swing.GroupLayout(jPanelAD);
        jPanelAD.setLayout(jPanelADLayout);
        jPanelADLayout.setHorizontalGroup(
            jPanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelADLayout.setVerticalGroup(
            jPanelADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
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
            .addComponent(TabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
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

    private void botonEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar2ActionPerformed

    private void botonBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscar1ActionPerformed

    private void botonEliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar3ActionPerformed

    private void botonAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregar1ActionPerformed

    private void botonBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscar2ActionPerformed

    private void botonAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregar3ActionPerformed

    private void botonEliminar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar8ActionPerformed

    private void botonBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscar4ActionPerformed

    private void botonEliminar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar9ActionPerformed

    private void botonAgregar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregar4ActionPerformed

    private void botonEliminar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar10ActionPerformed

    private void botonBuscar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscar5ActionPerformed

    private void botonEliminar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar11ActionPerformed

    private void botonAgregar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregar5ActionPerformed

    private void botonEliminar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar12ActionPerformed

    private void botonBuscar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscar6ActionPerformed

    private void botonEliminar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar13ActionPerformed

    private void botonAgregar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregar6ActionPerformed

    private void botonEliminar14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar14ActionPerformed

    private void botonAgregar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregar7ActionPerformed

    private void botonEliminar16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar16ActionPerformed

    private void botonBuscar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscar8ActionPerformed

    private void botonEliminar17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar17ActionPerformed

    private void botonAgregar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregar8ActionPerformed

    private void botonDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDiarioActionPerformed
        TabPanel.setSelectedIndex(0); //Moverse a la pestaña "Diario"
    }//GEN-LAST:event_botonDiarioActionPerformed

    private void textoEmoticonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEmoticonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEmoticonActionPerformed

    private void textoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFechaActionPerformed

    }//GEN-LAST:event_textoFechaActionPerformed

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed

    }//GEN-LAST:event_textoNombreActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if((textoNombre.getText().equals("")) && (etiquetaPreviewImage.getIcon() == null)) {
            JOptionPane.showMessageDialog(null, "Ingrese una imagen y un nombre");
        } else if(etiquetaPreviewImage.getIcon() == null){
            JOptionPane.showMessageDialog(null, "Agregue una imagen");
        } else if(textoNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Agregue un nombre");
        } else {
            Nodo nodo = primero;
            if(nodo != null) {
                //Búsqueda """binaria""" (secuencial)
                while(true) {
                    if(nodo.getNombre().equals(textoNombre.getText())) { //Si sí lo encuentra
                        JOptionPane.showMessageDialog(null, "Ingrese un nombre diferente");
                        return;
                    }
                    if(nodo == ultimo) { //Si no lo encuentra
                        Insertar(textoNombre.getText(), textoFecha.getText(), textoEmoticon.getText(), textoDescripcion.getText(), directionTmp);
                        etiquetaPreviewImage.setIcon(null);
                        textoNombre.setText("");
                        textoFecha.setText("");
                        textoEmoticon.setText("");
                        textoDescripcion.setText("");

                        //Mostrar la última imagen ingresada:
                        aux = ultimo;
                        mostrarDatos();
                        return;
                    }
                    nodo = nodo.getSiguiente();
                }
            } else {
                Insertar(textoNombre.getText(), textoFecha.getText(), textoEmoticon.getText(), textoDescripcion.getText(), directionTmp);
                etiquetaPreviewImage.setIcon(null);
                textoNombre.setText("");
                textoFecha.setText("");
                textoEmoticon.setText("");
                textoDescripcion.setText("");

                //Mostrar la última imagen ingresada:
                aux = ultimo;
                mostrarDatos();
            }
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonSeleccionarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarImagenActionPerformed
        captarImagen();
        mostrarImagen(etiquetaPreviewImage);
    }//GEN-LAST:event_botonSeleccionarImagenActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if(!etiquetaNombreVariable.getText().equals("")) {
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
        if(!etiquetaNombreVariable.getText().equals("")) {
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

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        if (aux == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        } else {
            aux = primero;
            mostrarDatos();
        }
    }//GEN-LAST:event_BotonInicioActionPerformed

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

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        if(!etiquetaNombreVariable.getText().equals("")){
            Editar editar = new Editar(aux, this);
        
            editar.setTitle("Editar"); // Establecer el título
            editar.setDefaultCloseOperation(Buscar.DISPOSE_ON_CLOSE); //Con esto, al darle clic a la "x" se cierra solo esa ventana
            editar.setResizable(false); // Evita que la ventana sea redimensionable
            editar.setVisible(true);
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Primero añada una imagen");
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    public void Insertar(String nombre, String fecha, String emoticon, String descripcion, String foto) {
        Nodo auxiliar = new Nodo(nombre, fecha, emoticon, descripcion, foto, null, null);
        if (ultimo == null) {

            ultimo = auxiliar;
            primero = auxiliar;
            primero.setAnterior(ultimo);
            ultimo.setSiguiente(primero);

        } else {
            ultimo.setSiguiente(auxiliar);
            primero.setAnterior(auxiliar);
            auxiliar.setAnterior(ultimo);
            auxiliar.setSiguiente(primero);
            ultimo = auxiliar;
        }

    }

    public void eliminarDato(String nombre) {//con eliminar el nombre del nodo, se elimina toda la información
        Nodo auxiliar = buscar(nombre);
        if(auxiliar == null) {
            JOptionPane.showMessageDialog(null, "El dato no existe");
            return;
        }
        
        if (nombre.equals(auxiliar.getNombre())) {
            if(auxiliar == primero && auxiliar == ultimo) { //Caso en el que solo hay un elemento y se elimina
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
                
            } else if(auxiliar == primero) { // Caso en que se elimina el primer elemento:
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
        while(true) {
            if(nodo.getNombre().equals(nombre)) { //Si sí lo encuentra
                return nodo;
            }
            if(nodo == ultimo) { //Si no lo encuentra
                return null;
            }
            nodo = nodo.getSiguiente();
        }
    }
    
    void mostrarDatos(){
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
    private javax.swing.JButton botonAgregar1;
    private javax.swing.JButton botonAgregar3;
    private javax.swing.JButton botonAgregar4;
    private javax.swing.JButton botonAgregar5;
    private javax.swing.JButton botonAgregar6;
    private javax.swing.JButton botonAgregar7;
    private javax.swing.JButton botonAgregar8;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonBuscar1;
    private javax.swing.JButton botonBuscar2;
    private javax.swing.JButton botonBuscar4;
    private javax.swing.JButton botonBuscar5;
    private javax.swing.JButton botonBuscar6;
    private javax.swing.JButton botonBuscar8;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonDiario;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonEliminar10;
    private javax.swing.JButton botonEliminar11;
    private javax.swing.JButton botonEliminar12;
    private javax.swing.JButton botonEliminar13;
    private javax.swing.JButton botonEliminar14;
    private javax.swing.JButton botonEliminar16;
    private javax.swing.JButton botonEliminar17;
    private javax.swing.JButton botonEliminar2;
    private javax.swing.JButton botonEliminar3;
    private javax.swing.JButton botonEliminar8;
    private javax.swing.JButton botonEliminar9;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonIzquierda;
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
    private javax.swing.JButton jButtonChoise;
    private javax.swing.JButton jButtonDelate;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSerch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDate1;
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
    private javax.swing.JTextField textoFecha;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
