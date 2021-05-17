
package window;

import airclass.AdultoMayor;
import airclass.MenorDeEdad;
import airclass.Persona;
import airclass.VecAsientos;
import java.awt.Color;
import javax.swing.JOptionPane;

public class AgregarPasajero extends javax.swing.JInternalFrame {

    public AgregarPasajero() {
        initComponents();
        limpiarCampos();    
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanelPersona1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnAgLimpiar = new javax.swing.JButton();
        jPanelAdulto = new javax.swing.JPanel();
        jRadioButtonAgF = new javax.swing.JRadioButton();
        jTextFieldAgNombre = new javax.swing.JTextField();
        jComboBoxNumAsiento = new javax.swing.JComboBox<>();
        jRadioButtonAgNic = new javax.swing.JRadioButton();
        jLabelAgNombre = new javax.swing.JLabel();
        jLabelAgNumAsiento = new javax.swing.JLabel();
        jRadioButtonAgPan = new javax.swing.JRadioButton();
        jSpinnerEdad = new javax.swing.JSpinner();
        jTextFieldAgApellido = new javax.swing.JTextField();
        jLabelAgEdad = new javax.swing.JLabel();
        jLabelAgDestino = new javax.swing.JLabel();
        jLabelAgApellido = new javax.swing.JLabel();
        jLabelAgGenero = new javax.swing.JLabel();
        jRadioButtonAgM = new javax.swing.JRadioButton();
        jLabelAgPasaporte = new javax.swing.JLabel();
        jTextFieldAgPasaporte = new javax.swing.JTextField();
        jLabelAgMembresia = new javax.swing.JLabel();
        jComboBoxMembresia = new javax.swing.JComboBox<>();
        panelRegimen = new javax.swing.JPanel();
        jLabelAgRegPension = new javax.swing.JLabel();
        jRadioButtonAgMagisterio = new javax.swing.JRadioButton();
        jRadioButtonAgCCSS = new javax.swing.JRadioButton();
        btnAgAceptar = new javax.swing.JButton();
        btnAgCancelar = new javax.swing.JButton();
        jLabelAdvertencia = new javax.swing.JLabel();
        panelEncargado = new javax.swing.JPanel();
        jLabelAgAutorizado = new javax.swing.JLabel();
        jTextFieldAgEncargado = new javax.swing.JTextField();
        jLabelAgEncargado = new javax.swing.JLabel();
        jRadioButtonAgNO = new javax.swing.JRadioButton();
        jRadioButtonAgSI = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Agregar Pasajero");
        setPreferredSize(new java.awt.Dimension(1200, 700));

        javax.swing.GroupLayout jPanelPersona1Layout = new javax.swing.GroupLayout(jPanelPersona1);
        jPanelPersona1.setLayout(jPanelPersona1Layout);
        jPanelPersona1Layout.setHorizontalGroup(
            jPanelPersona1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelPersona1Layout.setVerticalGroup(
            jPanelPersona1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        btnAgLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAgLimpiar.setText("LIMPIAR");
        btnAgLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
        btnAgLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgLimpiarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonAgF);
        jRadioButtonAgF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonAgF.setText(" F");

        jTextFieldAgNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jComboBoxNumAsiento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jComboBoxNumAsiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBoxNumAsiento.setSelectedItem(null);

        buttonGroup2.add(jRadioButtonAgNic);
        jRadioButtonAgNic.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonAgNic.setText("NICARAGUA");

        jLabelAgNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelAgNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAgNombre.setText("NOMBRE");

        jLabelAgNumAsiento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelAgNumAsiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAgNumAsiento.setText("NUM. ASIENTO");

        buttonGroup2.add(jRadioButtonAgPan);
        jRadioButtonAgPan.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonAgPan.setText("PANAMA");

        jSpinnerEdad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jSpinnerEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 150, 1));
        jSpinnerEdad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerEdadStateChanged(evt);
            }
        });

        jTextFieldAgApellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabelAgEdad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelAgEdad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAgEdad.setText("EDAD");

        jLabelAgDestino.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelAgDestino.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAgDestino.setText("DESTINO");

        jLabelAgApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelAgApellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAgApellido.setText("APELLIDO");

        jLabelAgGenero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelAgGenero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAgGenero.setText("GENERO");

        buttonGroup1.add(jRadioButtonAgM);
        jRadioButtonAgM.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonAgM.setText("M");

        jLabelAgPasaporte.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelAgPasaporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAgPasaporte.setText("NUM. PASAPORTE");
        jLabelAgPasaporte.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTextFieldAgPasaporte.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabelAgMembresia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelAgMembresia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAgMembresia.setText("MEMBRESÍA");

        jComboBoxMembresia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jComboBoxMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIN MEMBRESIA", "PLATINUM", "PREMIUM" }));
        jComboBoxMembresia.setSelectedItem(null);

        javax.swing.GroupLayout jPanelAdultoLayout = new javax.swing.GroupLayout(jPanelAdulto);
        jPanelAdulto.setLayout(jPanelAdultoLayout);
        jPanelAdultoLayout.setHorizontalGroup(
            jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdultoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdultoLayout.createSequentialGroup()
                        .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAgPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelAdultoLayout.createSequentialGroup()
                                .addComponent(jLabelAgNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAdultoLayout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(jRadioButtonAgF)
                                        .addGap(24, 24, 24)
                                        .addComponent(jRadioButtonAgM)
                                        .addGap(0, 58, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdultoLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldAgNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldAgPasaporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdultoLayout.createSequentialGroup()
                        .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAgNumAsiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelAdultoLayout.createSequentialGroup()
                                .addComponent(jLabelAgGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(33, 33, 33)
                        .addComponent(jComboBoxNumAsiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41)))
                .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdultoLayout.createSequentialGroup()
                        .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelAgDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAgApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAdultoLayout.createSequentialGroup()
                                .addComponent(jRadioButtonAgNic)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonAgPan))
                            .addComponent(jTextFieldAgApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAdultoLayout.createSequentialGroup()
                        .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAgEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAgMembresia))
                        .addGap(46, 46, 46)
                        .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxMembresia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanelAdultoLayout.setVerticalGroup(
            jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdultoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdultoLayout.createSequentialGroup()
                        .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAgNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAgApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAgPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAdultoLayout.createSequentialGroup()
                        .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAgNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAgApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAgPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAgDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonAgNic)
                            .addComponent(jRadioButtonAgPan))))
                .addGap(22, 22, 22)
                .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAgGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonAgF)
                    .addComponent(jRadioButtonAgM)
                    .addComponent(jLabelAgEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAgMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAdultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAgNumAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxNumAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabelAgRegPension.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelAgRegPension.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAgRegPension.setText("REGIMEN PENSION");

        buttonGroup3.add(jRadioButtonAgMagisterio);
        jRadioButtonAgMagisterio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonAgMagisterio.setText("MAGISTERIO ");

        buttonGroup3.add(jRadioButtonAgCCSS);
        jRadioButtonAgCCSS.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonAgCCSS.setText("CCSS");

        javax.swing.GroupLayout panelRegimenLayout = new javax.swing.GroupLayout(panelRegimen);
        panelRegimen.setLayout(panelRegimenLayout);
        panelRegimenLayout.setHorizontalGroup(
            panelRegimenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegimenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegimenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAgRegPension, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRegimenLayout.createSequentialGroup()
                        .addComponent(jRadioButtonAgCCSS)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonAgMagisterio)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRegimenLayout.setVerticalGroup(
            panelRegimenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegimenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAgRegPension, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegimenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonAgCCSS)
                    .addComponent(jRadioButtonAgMagisterio))
                .addContainerGap())
        );

        btnAgAceptar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAgAceptar.setText("REGISTRAR");
        btnAgAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
        btnAgAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgAceptarActionPerformed(evt);
            }
        });

        btnAgCancelar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAgCancelar.setText("SALIR");
        btnAgCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
        btnAgCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgCancelarActionPerformed(evt);
            }
        });

        jLabelAdvertencia.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdvertencia.setText("Advertencia");
        jLabelAdvertencia.setToolTipText("");
        jLabelAdvertencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jLabelAgAutorizado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelAgAutorizado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAgAutorizado.setText("AUTORIZADO");
        jLabelAgAutorizado.setInheritsPopupMenu(false);

        jTextFieldAgEncargado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabelAgEncargado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelAgEncargado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAgEncargado.setText("ENCARGADO");
        jLabelAgEncargado.setInheritsPopupMenu(false);

        buttonGroup4.add(jRadioButtonAgNO);
        jRadioButtonAgNO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonAgNO.setText("NO");

        buttonGroup4.add(jRadioButtonAgSI);
        jRadioButtonAgSI.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonAgSI.setText("SI");

        javax.swing.GroupLayout panelEncargadoLayout = new javax.swing.GroupLayout(panelEncargado);
        panelEncargado.setLayout(panelEncargadoLayout);
        panelEncargadoLayout.setHorizontalGroup(
            panelEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncargadoLayout.createSequentialGroup()
                .addGroup(panelEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAgEncargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAgAutorizado, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(panelEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAgEncargado)
                    .addGroup(panelEncargadoLayout.createSequentialGroup()
                        .addComponent(jRadioButtonAgSI)
                        .addGap(28, 28, 28)
                        .addComponent(jRadioButtonAgNO)
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEncargadoLayout.setVerticalGroup(
            panelEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncargadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAgEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAgEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAgAutorizado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonAgSI)
                    .addComponent(jRadioButtonAgNO))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnAgAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnAgLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnAgCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jPanelAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(286, 286, 286)
                        .addComponent(panelEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanelPersona1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(540, 540, 540))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAgCancelarActionPerformed

    private void btnAgAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgAceptarActionPerformed
        
        try{    
            String id = jTextFieldAgPasaporte.getText().trim();
            int edad = Integer.parseInt(jSpinnerEdad.getValue().toString());
            
            if(valida(edad) && validaId(id)){ // si no pasa esta validación de espacios en blanco y formato de pasaporte no se ingresa ningún pasajero
     
                int destino = jRadioButtonAgNic.isSelected() ? 1 : 2;
                
                switch(destino){
                    case 1:{        
                        escogeVuelo(Menu.vueloNicaragua, destino, edad);
                        break;   
                    }
                    case 2:{   
                        escogeVuelo(Menu.vueloPanama, destino, edad);                         
                        break;
                    }
                } 
            }else {
                if (!valida(edad)){
                    mostrarMensaje("Faltan datos por ingresar");
                } else if (!validaId(id)){
                    mostrarMensaje("[Pasaporte Error de Formato] [Ingrese solo numeros. Longitud 9 dígitos]");
                }            
            }

        } catch (Exception error){
            JOptionPane.showMessageDialog(null, "Se presento un error" + error);
        }
    }//GEN-LAST:event_btnAgAceptarActionPerformed

    public void limpiarCampos(){
        this.jTextFieldAgNombre.setText("");
        this.jTextFieldAgApellido.setText("");
        this.jTextFieldAgPasaporte.setText("");
        this.jTextFieldAgEncargado.setText("");
        this.jSpinnerEdad.setValue(0);
        this.jLabelAdvertencia.setVisible(false);
        this.jComboBoxNumAsiento.setSelectedIndex(0);
        this.jComboBoxMembresia.setSelectedIndex(0);
        panelRegimen.setVisible(false);
        panelEncargado.setVisible(false);
    } // vuelve los campos de cajas de texto y mensajes en blanco.
    
    public void mostrarMensaje(String mensaje){
        this.jLabelAdvertencia.setVisible(true);
        this.jLabelAdvertencia.setText(mensaje);
    } // genera mensajes de advertencia cuando se incumple una validación.   
     
    public void cambioEdad(){
        int edad = Integer.parseInt(jSpinnerEdad.getValue().toString());

        panelRegimen.setVisible(false);
        panelEncargado.setVisible(false);
        
        if (edad > 65){
            panelRegimen.setVisible(true);
        }else if(edad >= 0 && edad < 14){
            panelEncargado.setVisible(true);
        }       
    } // valida dependiendo de la edad del pasajero si muestra los campos extra para completar los datos de dichas clases.
    
    public void escogeVuelo (VecAsientos vuelo, int destino, int edad){
        
        String nombre = jTextFieldAgNombre.getText().trim();
        String apellido = jTextFieldAgApellido.getText().trim();
        
        char genero = jRadioButtonAgF.isSelected() ? 'F' : 'M';

        String numPasaporte = jTextFieldAgPasaporte.getText().trim();

        
        int numAsiento = Integer.parseInt(jComboBoxNumAsiento.getSelectedItem().toString());
        String membresiaTipo = jComboBoxMembresia.getSelectedItem().toString();
        int membresiaPts = membresia();
        String regimen = jRadioButtonAgCCSS.isSelected() ? "CCSS" : "Magisterio Nacional";
        String encargado = jTextFieldAgEncargado.getText().trim();
        String autorizado = jRadioButtonAgSI.isSelected() ? "SI" : "NO";
        
        if (vuelo.verificadorAsiento(numAsiento) == null && vuelo.consultaPasajero(numPasaporte) == null) {
            if (edad > 65) {
                cambioEdad();
                vuelo.agregar(new AdultoMayor(nombre, apellido, edad, genero, numPasaporte, destino, numAsiento, membresiaTipo, membresiaPts, regimen));
                mostrarMensaje("Registro Completado");

            } else if (edad > 0 && edad < 14) {
                cambioEdad();
                vuelo.agregar(new MenorDeEdad(nombre, apellido, edad, genero, numPasaporte, destino, numAsiento, membresiaTipo, membresiaPts, encargado, autorizado));
                mostrarMensaje("Registro Completado");

            } else {
                vuelo.agregar(new Persona(nombre, apellido, edad, genero, numPasaporte, destino, numAsiento, membresiaTipo, membresiaPts));
                mostrarMensaje("Registro Completado");
            }
            
            String puntosInt = Integer.toString(vuelo.consultaPasajero(numPasaporte).getMembresiaPts()); // Se toma el vector del vuelo escogido y el metodo de consultas por pasajero para asignar sus puntos específicos.
            
            mostrarPuntosAsignados();
            
            limpiarCampos();
        } else {
            if (vuelo.verificadorAsiento(numAsiento) != null) {
                mostrarMensaje("Asiento Ocupado");
            } else if (vuelo.consultaPasajero(numPasaporte) != null) {
                mostrarMensaje("Num. Pasaporte ya fue ingresado");
            }
        }
    } // Dependiendo del destino guarda los datos en el vuelo respectivo.
    
    // Muestra los puntos asignados solo para este vuelo.
    private void mostrarPuntosAsignados(){
        int puntos = 0;
        if (jComboBoxMembresia.getSelectedItem() == "PLATINUM") {
            
            JOptionPane.showMessageDialog(null, "Obtuvo 100 pts acumulables");
            
        } else if (jComboBoxMembresia.getSelectedItem() == "PREMIUM") {

            JOptionPane.showMessageDialog(null, "Obtuvo 200 pts acumulables");
        } else {
            
        }
    }

    // Asigna los puntos dependiendo de la membresía seleccionada.
    private int membresia(){
        int puntos = 0;
        if (jComboBoxMembresia.getSelectedItem() == "PLATINUM"){
            
            puntos = 100;
            if (sumaPuntos() > 0){
                puntos += sumaPuntos();
            }
            
        }else if (jComboBoxMembresia.getSelectedItem() == "PREMIUM"){
            
            puntos = 200;
            if (sumaPuntos() > 0){
                puntos += sumaPuntos();
            }            
            
        } else{
            puntos = 0; // En caso de que no tenga membresía.
        }

        return puntos;
    }
    
    // Suma los puntos existentes si tiene alguna cuenta PLATINUM o PREMIUM
    private int sumaPuntos(){
        int pts = 0;
        
        for (Persona pasajero : Menu.baseDeDatos) {
            if (pasajero.getNumPasaporte().equals(jTextFieldAgPasaporte.getText().trim())){
                pts = pasajero.getMembresiaPts(); // Dejará asignado a la variable los últimos puntos que tuvo ese pasajero.
            }
        }
        return pts; // Retorna los puntos que mantuvo guardados en el último vuelo.
    }
    
    private void jSpinnerEdadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerEdadStateChanged
        cambioEdad();
    }//GEN-LAST:event_jSpinnerEdadStateChanged

    private void btnAgLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnAgLimpiarActionPerformed

    private boolean validaId(String id) {
        return id.matches("^[0-9]{9}$"); 
    } // Establece el formato para el numero de pasaporte.
    
    private boolean valida(int edad){ 
        boolean error = true;
        
        jLabelAgNombre.setForeground(Color.black);
        if(jTextFieldAgNombre.getText().isEmpty()){
            error = false;
            jLabelAgNombre.setForeground(Color.red);           
        }
        
        //validacion para cajas de texto
        jLabelAgApellido.setForeground(Color.black);
        if(jTextFieldAgApellido.getText().isEmpty()){
            error = false;
            jLabelAgApellido.setForeground(Color.red);           
        }
            
        jLabelAgPasaporte.setForeground(Color.black);
        if(jTextFieldAgPasaporte.getText().isEmpty()){
            error = false;
            jLabelAgPasaporte.setForeground(Color.red);           
        }
             
        //validacion para radio botones
        jLabelAgGenero.setForeground(Color.black);
        if(!jRadioButtonAgF.isSelected() && !jRadioButtonAgM.isSelected()){
            error = false;
            jLabelAgGenero.setForeground(Color.red);
        }
        
        jLabelAgDestino.setForeground(Color.black);
        if(!jRadioButtonAgNic.isSelected() && !jRadioButtonAgPan.isSelected()){
            error = false;
            jLabelAgDestino.setForeground(Color.red);
        }   
        
        // validacion combobox
        jLabelAgNumAsiento.setForeground(Color.black);
        if(jComboBoxNumAsiento.getSelectedIndex() == 0){
            error = false;
            jLabelAgNumAsiento.setForeground(Color.red);
        }
        
        if (edad > 65){
            jLabelAgRegPension.setForeground(Color.black);
            if(!jRadioButtonAgCCSS.isSelected() && !jRadioButtonAgMagisterio.isSelected()){
                error = false;
                jLabelAgRegPension.setForeground(Color.red);
            }            
        }
        
        if (edad > 0 && edad < 14){ 
            jLabelAgAutorizado.setForeground(Color.black);
            if(!jRadioButtonAgSI.isSelected() && !jRadioButtonAgNO.isSelected()){
                error = false;
                jLabelAgAutorizado.setForeground(Color.red);
            }           

            jLabelAgEncargado.setForeground(Color.black);
            if(jTextFieldAgEncargado.getText().isEmpty()){
                error = false;
                jLabelAgEncargado.setForeground(Color.red);           
            }            
        }  
        return error;
    } // valida no dejar espacios en blanco cuando se agrega un pasajero.
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgAceptar;
    private javax.swing.JButton btnAgCancelar;
    private javax.swing.JButton btnAgLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> jComboBoxMembresia;
    private javax.swing.JComboBox<String> jComboBoxNumAsiento;
    private javax.swing.JLabel jLabelAdvertencia;
    private javax.swing.JLabel jLabelAgApellido;
    private javax.swing.JLabel jLabelAgAutorizado;
    private javax.swing.JLabel jLabelAgDestino;
    private javax.swing.JLabel jLabelAgEdad;
    private javax.swing.JLabel jLabelAgEncargado;
    private javax.swing.JLabel jLabelAgGenero;
    private javax.swing.JLabel jLabelAgMembresia;
    private javax.swing.JLabel jLabelAgNombre;
    private javax.swing.JLabel jLabelAgNumAsiento;
    private javax.swing.JLabel jLabelAgPasaporte;
    private javax.swing.JLabel jLabelAgRegPension;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAdulto;
    private javax.swing.JPanel jPanelPersona1;
    private javax.swing.JRadioButton jRadioButtonAgCCSS;
    private javax.swing.JRadioButton jRadioButtonAgF;
    private javax.swing.JRadioButton jRadioButtonAgM;
    private javax.swing.JRadioButton jRadioButtonAgMagisterio;
    private javax.swing.JRadioButton jRadioButtonAgNO;
    private javax.swing.JRadioButton jRadioButtonAgNic;
    private javax.swing.JRadioButton jRadioButtonAgPan;
    private javax.swing.JRadioButton jRadioButtonAgSI;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerEdad;
    private javax.swing.JTextField jTextFieldAgApellido;
    private javax.swing.JTextField jTextFieldAgEncargado;
    private javax.swing.JTextField jTextFieldAgNombre;
    private javax.swing.JTextField jTextFieldAgPasaporte;
    private javax.swing.JPanel panelEncargado;
    private javax.swing.JPanel panelRegimen;
    // End of variables declaration//GEN-END:variables


}
