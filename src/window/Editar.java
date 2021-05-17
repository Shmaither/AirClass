
package window;

import airclass.AdultoMayor;
import airclass.MenorDeEdad;
import airclass.Persona;
import static window.Menu.vueloNicaragua;
import static window.Menu.vueloPanama;

public class Editar extends javax.swing.JInternalFrame {
    
    private String pasaporteStr;
        
    public Editar() {
        initComponents();
        limpiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldAgEncargado = new javax.swing.JTextField();
        jRadioButtonAgSI = new javax.swing.JRadioButton();
        jRadioButtonAgNO = new javax.swing.JRadioButton();
        jRadioButtonAgCCSS = new javax.swing.JRadioButton();
        jRadioButtonAgMagisterio = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabelAdvertencia = new javax.swing.JLabel();
        jTextFieldNumPas = new javax.swing.JTextField();
        botonConsultaBuscar = new javax.swing.JButton();
        jLabelConNumPas = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelCosto = new javax.swing.JLabel();
        jLEdad = new javax.swing.JLabel();
        jLabelDestino = new javax.swing.JLabel();
        jLDestino = new javax.swing.JLabel();
        jLabelTiquete = new javax.swing.JLabel();
        jLNumTiquete = new javax.swing.JLabel();
        jLabelEncargado = new javax.swing.JLabel();
        jLCosto = new javax.swing.JLabel();
        jLabelAutorizacion = new javax.swing.JLabel();
        jLabelRegimen = new javax.swing.JLabel();
        jTextFieldEdNombre = new javax.swing.JTextField();
        jTextFieldEdApellido = new javax.swing.JTextField();
        jRadioButtonEdM = new javax.swing.JRadioButton();
        jRadioButtonEdF = new javax.swing.JRadioButton();
        jTextFieldEdEncargado = new javax.swing.JTextField();
        jRadioButtonEdSI = new javax.swing.JRadioButton();
        jRadioButtonEdNO = new javax.swing.JRadioButton();
        jRadioButtonEdCCSS = new javax.swing.JRadioButton();
        jRadioButtonEdMagisterio = new javax.swing.JRadioButton();
        btnEdGuardar = new javax.swing.JButton();

        jTextFieldAgEncargado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jRadioButtonAgSI.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonAgSI.setSelected(true);
        jRadioButtonAgSI.setText("SI");
        jRadioButtonAgSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAgSIActionPerformed(evt);
            }
        });

        jRadioButtonAgNO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonAgNO.setText("NO");
        jRadioButtonAgNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAgNOActionPerformed(evt);
            }
        });

        jRadioButtonAgCCSS.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonAgCCSS.setSelected(true);
        jRadioButtonAgCCSS.setText("CCSS");
        jRadioButtonAgCCSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAgCCSSActionPerformed(evt);
            }
        });

        jRadioButtonAgMagisterio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonAgMagisterio.setText("MAGISTERIO ");
        jRadioButtonAgMagisterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAgMagisterioActionPerformed(evt);
            }
        });

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Editar Pasajero");
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabelAdvertencia.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdvertencia.setText("Advertencia");
        jLabelAdvertencia.setToolTipText("");
        jLabelAdvertencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jTextFieldNumPas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        botonConsultaBuscar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonConsultaBuscar.setText("BUSCAR");
        botonConsultaBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
        botonConsultaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultaBuscarActionPerformed(evt);
            }
        });

        jLabelConNumPas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelConNumPas.setText("NUM. PASAPORTE");

        jLabelNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombre.setText("NOMBRE");

        jLabelApellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelApellido.setText("APELLIDO");

        jLabelEdad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelEdad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEdad.setText("EDAD");

        jLabelGenero.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelGenero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelGenero.setText("GENERO");

        jLabelCosto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelCosto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCosto.setText("COSTO");

        jLEdad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLEdad.setForeground(new java.awt.Color(0, 153, 153));
        jLEdad.setOpaque(true);

        jLabelDestino.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelDestino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDestino.setText("DESTINO");

        jLDestino.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLDestino.setForeground(new java.awt.Color(0, 153, 153));
        jLDestino.setOpaque(true);

        jLabelTiquete.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelTiquete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTiquete.setText("NUM. TIQUETE");

        jLNumTiquete.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLNumTiquete.setForeground(new java.awt.Color(0, 153, 153));
        jLNumTiquete.setOpaque(true);

        jLabelEncargado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelEncargado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEncargado.setText("ENCARGADO");

        jLCosto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLCosto.setForeground(new java.awt.Color(0, 153, 153));
        jLCosto.setOpaque(true);

        jLabelAutorizacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelAutorizacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelAutorizacion.setText("AUTORIZACION");

        jLabelRegimen.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelRegimen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelRegimen.setText("REGIMEN");

        jTextFieldEdNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jTextFieldEdApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        buttonGroup1.add(jRadioButtonEdM);
        jRadioButtonEdM.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonEdM.setText("M");

        buttonGroup1.add(jRadioButtonEdF);
        jRadioButtonEdF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonEdF.setText(" F");

        jTextFieldEdEncargado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextFieldEdEncargado.setOpaque(false);

        buttonGroup3.add(jRadioButtonEdSI);
        jRadioButtonEdSI.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonEdSI.setText("SI");

        buttonGroup3.add(jRadioButtonEdNO);
        jRadioButtonEdNO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonEdNO.setText("NO");

        buttonGroup2.add(jRadioButtonEdCCSS);
        jRadioButtonEdCCSS.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonEdCCSS.setText("CCSS");

        buttonGroup2.add(jRadioButtonEdMagisterio);
        jRadioButtonEdMagisterio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButtonEdMagisterio.setText("MAGISTERIO ");

        btnEdGuardar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnEdGuardar.setText("GUARDAR");
        btnEdGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
        btnEdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNumPas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelConNumPas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonConsultaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButtonEdF)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButtonEdM))
                                            .addComponent(jTextFieldEdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEdApellido))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTiquete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNumTiquete, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonEdCCSS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonEdMagisterio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonEdSI)
                                .addGap(28, 28, 28)
                                .addComponent(jRadioButtonEdNO))
                            .addComponent(jTextFieldEdEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabelAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldEdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEdApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButtonEdF)
                                .addComponent(jRadioButtonEdM)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
                            .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTiquete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonEdCCSS)
                                    .addComponent(jRadioButtonEdMagisterio)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNumTiquete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldEdEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonEdNO)
                                    .addComponent(jRadioButtonEdSI)))
                            .addComponent(jLabelEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabelAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelConNumPas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonConsultaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNumPas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnEdGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabelAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarMensaje(String mensaje){
        this.jLabelAdvertencia.setVisible(true);
        this.jLabelAdvertencia.setText(mensaje);
    }    
 
    public void limpiarCampos(){

        this.jLEdad.setText("");
        this.jLDestino.setText("");
        this.jLNumTiquete.setText("");
        this.jLCosto.setText("");
        
        this.jTextFieldEdNombre.setText("");
        this.jTextFieldEdApellido.setText("");
        this.jTextFieldEdEncargado.setText("");
        this.jRadioButtonEdCCSS.setEnabled(false);
        this.jRadioButtonEdMagisterio.setEnabled(false);
        this.jTextFieldEdEncargado.setEnabled(false);
        this.jRadioButtonEdSI.setEnabled(false);
        this.jRadioButtonEdNO.setEnabled(false);
        
        this.jLabelAdvertencia.setVisible(false);
    }        
    
    private void botonConsultaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultaBuscarActionPerformed
        
        pasaporteStr = jTextFieldNumPas.getText().trim();
        Persona personaConsultaNic = vueloNicaragua.consultaPasajero(pasaporteStr); 
        Persona personaConsultaPan = vueloPanama.consultaPasajero(pasaporteStr);
        limpiarCampos();
        
        if ("".equals(pasaporteStr)) {    
            mostrarMensaje("Debe ingresar un ID valido");
        }else if (personaConsultaNic == null && personaConsultaPan == null){
            limpiarCampos();
            mostrarMensaje("Persona no encontrada");
        }else{

            if (personaConsultaNic != null) {
                consultaVuelo(personaConsultaNic);
            }else if (personaConsultaPan != null){
                consultaVuelo(personaConsultaPan);
            }   
        } 
    }//GEN-LAST:event_botonConsultaBuscarActionPerformed
    
    // Método de consultas modificado para esta clase específica.
    public void consultaVuelo(Persona consulta) {
        limpiarCampos();
                    
        this.jTextFieldEdNombre.setText(consulta.getNombre());
        this.jTextFieldEdApellido.setText(consulta.getApellido());
        if (consulta.getGeneroC() == 'F'){
            jRadioButtonEdF.setSelected(true);         
        }else{  
            jRadioButtonEdM.setSelected(true);
        }
        String edadStr = Integer.toString(consulta.getEdad()); 
        this.jLEdad.setText(edadStr);
        this.jLDestino.setText(consulta.getDestino());
        this.jLNumTiquete.setText(consulta.getNumTiquete());
        String costoStr = "$" + Double.toString(consulta.getCostoBoleto());
        this.jLCosto.setText(costoStr);
                    
        if (consulta.getEdad() > 65 ){
            AdultoMayor adulto = (AdultoMayor)consulta;
            this.jRadioButtonEdCCSS.setEnabled(true);
            this.jRadioButtonEdMagisterio.setEnabled(true);
            
            if ("CCSS".equals(adulto.getRegimen())){
                
                jRadioButtonEdCCSS.setSelected(true);         
            }else{  
                jRadioButtonEdMagisterio.setSelected(true);
            } 
            mostrarMensaje("Ciudadano de Oro");
        }
                    
        if (consulta.getEdad() > 0 && consulta.getEdad() < 14 ){
            MenorDeEdad menor = (MenorDeEdad)consulta;
            
            this.jTextFieldEdEncargado.setEnabled(true);
            this.jRadioButtonEdSI.setEnabled(true);
            this.jRadioButtonEdNO.setEnabled(true);
            
            jTextFieldEdEncargado.setText(menor.getEncargado());
            
            if ("SI".equals(menor.getAutorizado())){
                jRadioButtonEdSI.setSelected(true);         
            }else{  
                jRadioButtonEdNO.setSelected(true);
            } 
            mostrarMensaje("Menor de Edad");
        } 
       
    }    
    
    private void jRadioButtonAgSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAgSIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAgSIActionPerformed

    private void jRadioButtonAgNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAgNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAgNOActionPerformed

    private void jRadioButtonAgCCSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAgCCSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAgCCSSActionPerformed

    private void jRadioButtonAgMagisterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAgMagisterioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAgMagisterioActionPerformed

    private void btnEdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdGuardarActionPerformed
        Persona personaConsultaNic = vueloNicaragua.consultaPasajero(pasaporteStr); 
        Persona personaConsultaPan = vueloPanama.consultaPasajero(pasaporteStr);
        if(personaConsultaNic != null){        
            editarCampos(personaConsultaNic);
            mostrarMensaje("Datos Guardados");
        }
        
        if (personaConsultaPan != null){
           editarCampos(personaConsultaPan); 
           mostrarMensaje("Datos Guardados");
        }
    }//GEN-LAST:event_btnEdGuardarActionPerformed

    public void editarCampos(Persona vuelo){

        String nombre = jTextFieldEdNombre.getText().trim();
        String apellido = jTextFieldEdApellido.getText().trim();
        char genero = jRadioButtonEdF.isSelected() ? 'F' : 'M';

        vuelo.setNombre(nombre);
        vuelo.setApellido(apellido);
        vuelo.setGenero(genero);
        
        if (vuelo.getEdad() > 65) {
            String regimen = jRadioButtonEdCCSS.isSelected() ? "CCSS" : "Mag. Nacional";
            AdultoMayor adulto = (AdultoMayor) vuelo;
            adulto.setRegimen(regimen);
        }
        
        
        if (vuelo.getEdad() > 0 && vuelo.getEdad() < 14) {
            String encargado = jTextFieldEdEncargado.getText().trim();
            String autorizado = jRadioButtonEdSI.isSelected() ? "SI" : "NO";
            MenorDeEdad menor = (MenorDeEdad) vuelo;
            menor.setEncargado(encargado);
            menor.setAutorizado(autorizado);
        }
        limpiarCampos(); 
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConsultaBuscar;
    private javax.swing.JButton btnEdGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLCosto;
    private javax.swing.JLabel jLDestino;
    private javax.swing.JLabel jLEdad;
    private javax.swing.JLabel jLNumTiquete;
    private javax.swing.JLabel jLabelAdvertencia;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelAutorizacion;
    private javax.swing.JLabel jLabelConNumPas;
    private javax.swing.JLabel jLabelCosto;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelEncargado;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRegimen;
    private javax.swing.JLabel jLabelTiquete;
    private javax.swing.JRadioButton jRadioButtonAgCCSS;
    private javax.swing.JRadioButton jRadioButtonAgMagisterio;
    private javax.swing.JRadioButton jRadioButtonAgNO;
    private javax.swing.JRadioButton jRadioButtonAgSI;
    private javax.swing.JRadioButton jRadioButtonEdCCSS;
    private javax.swing.JRadioButton jRadioButtonEdF;
    private javax.swing.JRadioButton jRadioButtonEdM;
    private javax.swing.JRadioButton jRadioButtonEdMagisterio;
    private javax.swing.JRadioButton jRadioButtonEdNO;
    private javax.swing.JRadioButton jRadioButtonEdSI;
    private javax.swing.JTextField jTextFieldAgEncargado;
    private javax.swing.JTextField jTextFieldEdApellido;
    private javax.swing.JTextField jTextFieldEdEncargado;
    private javax.swing.JTextField jTextFieldEdNombre;
    private javax.swing.JTextField jTextFieldNumPas;
    // End of variables declaration//GEN-END:variables
}
