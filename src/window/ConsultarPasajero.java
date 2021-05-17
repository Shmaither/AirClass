
package window;

import airclass.AdultoMayor;
import airclass.MenorDeEdad;
import airclass.Persona;
import static window.Menu.vueloNicaragua;
import static window.Menu.vueloPanama;

public class ConsultarPasajero extends javax.swing.JInternalFrame {

    
    public ConsultarPasajero() {
        initComponents();
        limpiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        botonConsultaBuscar = new javax.swing.JButton();
        jLabelConNumPas = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNumPas = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelCosto = new javax.swing.JLabel();
        jLabelDestino = new javax.swing.JLabel();
        jLabelTiquete = new javax.swing.JLabel();
        jLabelEncargado = new javax.swing.JLabel();
        jLabelAutorizacion = new javax.swing.JLabel();
        jLabelRegimen = new javax.swing.JLabel();
        jLabelAdvertencia = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLGenero = new javax.swing.JLabel();
        jLRegimen = new javax.swing.JLabel();
        jLEdad = new javax.swing.JLabel();
        jLDestino = new javax.swing.JLabel();
        jLNumTiquete = new javax.swing.JLabel();
        jLCosto = new javax.swing.JLabel();
        jLAutorizacion = new javax.swing.JLabel();
        jLEncargado = new javax.swing.JLabel();
        jLabelMembresiaPts = new javax.swing.JLabel();
        jLMembresiaPts = new javax.swing.JLabel();
        jLabelMembresiaTipo = new javax.swing.JLabel();
        jLMembresiaTipo = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consulta Pasajero");
        setPreferredSize(new java.awt.Dimension(1200, 700));

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

        jTextFieldNumPas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

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

        jLabelDestino.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelDestino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDestino.setText("DESTINO");

        jLabelTiquete.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelTiquete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTiquete.setText("NUM. TIQUETE");

        jLabelEncargado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelEncargado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEncargado.setText("ENCARGADO");

        jLabelAutorizacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelAutorizacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelAutorizacion.setText("AUTORIZACION");

        jLabelRegimen.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelRegimen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelRegimen.setText("REGIMEN");

        jLabelAdvertencia.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdvertencia.setText("Advertencia");
        jLabelAdvertencia.setToolTipText("");
        jLabelAdvertencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jLApellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLApellido.setForeground(new java.awt.Color(0, 153, 153));
        jLApellido.setOpaque(true);

        jLNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(0, 153, 153));
        jLNombre.setOpaque(true);

        jLGenero.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLGenero.setForeground(new java.awt.Color(0, 153, 153));
        jLGenero.setOpaque(true);

        jLRegimen.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLRegimen.setForeground(new java.awt.Color(0, 153, 153));
        jLRegimen.setOpaque(true);

        jLEdad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLEdad.setForeground(new java.awt.Color(0, 153, 153));
        jLEdad.setOpaque(true);

        jLDestino.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLDestino.setForeground(new java.awt.Color(0, 153, 153));
        jLDestino.setOpaque(true);

        jLNumTiquete.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLNumTiquete.setForeground(new java.awt.Color(0, 153, 153));
        jLNumTiquete.setOpaque(true);

        jLCosto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLCosto.setForeground(new java.awt.Color(0, 153, 153));
        jLCosto.setOpaque(true);

        jLAutorizacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLAutorizacion.setForeground(new java.awt.Color(0, 153, 153));
        jLAutorizacion.setOpaque(true);

        jLEncargado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLEncargado.setForeground(new java.awt.Color(0, 153, 153));
        jLEncargado.setOpaque(true);

        jLabelMembresiaPts.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelMembresiaPts.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMembresiaPts.setText("PTS. ACUMULADOS");

        jLMembresiaPts.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLMembresiaPts.setForeground(new java.awt.Color(0, 153, 153));
        jLMembresiaPts.setOpaque(true);

        jLabelMembresiaTipo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelMembresiaTipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMembresiaTipo.setText("MEMBRESÍA");

        jLMembresiaTipo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLMembresiaTipo.setForeground(new java.awt.Color(0, 153, 153));
        jLMembresiaTipo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabelAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNumPas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelConNumPas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonConsultaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelTiquete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLNumTiquete, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabelMembresiaTipo)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLMembresiaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabelMembresiaPts)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLMembresiaPts, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabelConNumPas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonConsultaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNumPas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMembresiaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLMembresiaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLMembresiaPts, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMembresiaPts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTiquete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNumTiquete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabelAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)))
                .addComponent(jLabelAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultaBuscarActionPerformed
        
        String pasaporteStr = jTextFieldNumPas.getText().trim();
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
    
    // Carga las etiquetas jLabel con los métodos getters de las respectivas clases de personas.
    public void consultaVuelo(Persona consulta) {
        limpiarCampos();
                    
        jLNombre.setText(consulta.getNombre());
        this.jLApellido.setText(consulta.getApellido());
        this.jLGenero.setText(consulta.getGenero());
        String edadStr = Integer.toString(consulta.getEdad()); 
        this.jLEdad.setText(edadStr);
        this.jLDestino.setText(consulta.getDestino());
        this.jLNumTiquete.setText(consulta.getNumTiquete());
        String costoStr = "$" + Double.toString(consulta.getCostoBoleto());
        this.jLCosto.setText(costoStr);
                    
        if (consulta.getEdad() > 65 ){
            AdultoMayor adulto = (AdultoMayor)consulta;
            jLRegimen.setText(adulto.getRegimen());
            mostrarMensaje("Ciudadano de Oro");
        }
                    
        if (consulta.getEdad() > 0 && consulta.getEdad() < 14 ){
            MenorDeEdad menor = (MenorDeEdad)consulta;
            jLEncargado.setText(menor.getEncargado());
            jLAutorizacion.setText(menor.getAutorizado());
        } 
        this.jLMembresiaTipo.setText(consulta.getMembresiaTipo());   // Agrega nuevas variables dentro de consulta pasajero
        String puntosInt = Integer.toString(consulta.getMembresiaPts());
        this.jLMembresiaPts.setText(puntosInt);
        mostrarEtiquetas(); // Hace visibles todos los campos con la información que previamente se cargó.
    }

    public void mostrarEtiquetas (){
        this.jLNombre.setVisible(true);
        this.jLApellido.setVisible(true);
        this.jLGenero.setVisible(true);
        this.jLEdad.setVisible(true);
        this.jLDestino.setVisible(true);
        this.jLNumTiquete.setVisible(true);
        this.jLCosto.setVisible(true);
        this.jLRegimen.setVisible(true);        
        this.jLEncargado.setVisible(true);
        this.jLAutorizacion.setVisible(true);

    }
    
    public void mostrarMensaje(String mensaje){
        this.jLabelAdvertencia.setVisible(true);
        this.jLabelAdvertencia.setText(mensaje);
    }    
 
    public void limpiarCampos(){
        this.jLNombre.setText("");
        this.jLApellido.setText("");
        this.jLGenero.setText("");
        this.jLEdad.setText("");
        this.jLDestino.setText("");
        this.jLNumTiquete.setText("");
        this.jLCosto.setText("");
        this.jLRegimen.setText("");      
        this.jLEncargado.setText("");
        this.jLAutorizacion.setText("");
        this.jLabelAdvertencia.setVisible(false);
    }     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConsultaBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLAutorizacion;
    private javax.swing.JLabel jLCosto;
    private javax.swing.JLabel jLDestino;
    private javax.swing.JLabel jLEdad;
    private javax.swing.JLabel jLEncargado;
    private javax.swing.JLabel jLGenero;
    private javax.swing.JLabel jLMembresiaPts;
    private javax.swing.JLabel jLMembresiaTipo;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNumTiquete;
    private javax.swing.JLabel jLRegimen;
    private javax.swing.JLabel jLabelAdvertencia;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelAutorizacion;
    private javax.swing.JLabel jLabelConNumPas;
    private javax.swing.JLabel jLabelCosto;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelEncargado;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelMembresiaPts;
    private javax.swing.JLabel jLabelMembresiaTipo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRegimen;
    private javax.swing.JLabel jLabelTiquete;
    private javax.swing.JTextField jTextFieldNumPas;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables


}
