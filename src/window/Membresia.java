
package window;

import airclass.Persona;
import javax.swing.JOptionPane;
import static window.Menu.vueloNicaragua;
import static window.Menu.vueloPanama;

public class Membresia extends javax.swing.JInternalFrame {

    private String pasaporteStr;    
    private Persona personaConsultaNic;
    private Persona personaConsultaPan;
    
    public Membresia() {

        initComponents();
        limpiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelMembresiaTipo = new javax.swing.JLabel();
        jLMembresiaTipo = new javax.swing.JLabel();
        jLabelMembresiaPts = new javax.swing.JLabel();
        jLMembresiaPts = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jLabelNumPasaporte = new javax.swing.JLabel();
        jTextFieldNumPas = new javax.swing.JTextField();
        jLabelAdvertencia = new javax.swing.JLabel();
        jButtonCanjearPts1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Membresia");
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabelMembresiaTipo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelMembresiaTipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMembresiaTipo.setText("MEMBRESÍA");

        jLMembresiaTipo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLMembresiaTipo.setForeground(new java.awt.Color(0, 153, 153));
        jLMembresiaTipo.setOpaque(true);

        jLabelMembresiaPts.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelMembresiaPts.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMembresiaPts.setText("PTS. ACUMULADOS");

        jLMembresiaPts.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLMembresiaPts.setForeground(new java.awt.Color(0, 153, 153));
        jLMembresiaPts.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        jButtonBuscar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabelNumPasaporte.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelNumPasaporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNumPasaporte.setText("NUM. PASAPORTE");

        jTextFieldNumPas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabelAdvertencia.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdvertencia.setText("Advertencia");
        jLabelAdvertencia.setToolTipText("");
        jLabelAdvertencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jButtonCanjearPts1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonCanjearPts1.setText("CANJEAR");
        jButtonCanjearPts1.setEnabled(false);
        jButtonCanjearPts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanjearPts1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelMembresiaTipo)
                                .addGap(18, 18, 18)
                                .addComponent(jLMembresiaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNumPasaporte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNumPas, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelMembresiaPts)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLMembresiaPts, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCanjearPts1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabelAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNumPasaporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNumPas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMembresiaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMembresiaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLMembresiaPts, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMembresiaPts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCanjearPts1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(jLabelAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        this.pasaporteStr = jTextFieldNumPas.getText().trim();
        personaConsultaNic = vueloNicaragua.consultaPasajero(pasaporteStr); 
        personaConsultaPan = vueloPanama.consultaPasajero(pasaporteStr);

        limpiarCampos();
        
        if ("".equals(pasaporteStr)) {    
            mostrarMensaje("Debe ingresar un ID valido");
        }else if (personaConsultaNic == null && personaConsultaPan == null){
            limpiarCampos();
            mostrarMensaje("Persona no encontrada");
        }else{

            if (personaConsultaNic != null) {
                consultaMembresia(personaConsultaNic);
                jButtonCanjearPts1.setEnabled(true);
            {              
        }  
            }else if (personaConsultaPan != null){
                 consultaMembresia(personaConsultaPan);
                 jButtonCanjearPts1.setEnabled(true);
            } 
        }     
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    
    // Canjea los puntos si 
    private void jButtonCanjearPts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanjearPts1ActionPerformed
       
        this.pasaporteStr = jTextFieldNumPas.getText().trim();
        personaConsultaNic = vueloNicaragua.consultaPasajero(pasaporteStr); 
        personaConsultaPan = vueloPanama.consultaPasajero(pasaporteStr);        
        int pts = Integer.parseInt(jLMembresiaPts.getText());
        
       
        if (personaConsultaNic != null) {
            if (pts >= 500) {

                personaConsultaNic.setMembresiaPts(0);
                personaConsultaNic.modificaCostoMembresia();
                JOptionPane.showMessageDialog(null, "Puntos Canjeados con éxito");

            } else {
                String faltante = "";
                faltante += (500 - pts);
                mostrarMensaje("No tiene suficientes puntos. " + "Faltan: " + faltante + " pts");
            }
            
        } else if (personaConsultaPan != null) {
            if (pts >= 400) {

                personaConsultaPan.setMembresiaPts(0);
                personaConsultaPan.modificaCostoMembresia();
                JOptionPane.showMessageDialog(null, "Puntos Canjeados con éxito");

            } else {
                String faltante = "";
                faltante += (400 - pts);
                mostrarMensaje("No tiene suficientes puntos. " + "Faltan: " + faltante + " pts");
            }
        }  
        
    }//GEN-LAST:event_jButtonCanjearPts1ActionPerformed
   
    // Consulta la mebresia
    private void consultaMembresia(Persona consulta){
        
        this.jLMembresiaTipo.setText(consulta.getMembresiaTipo());   // Agrega nuevas variables dentro de consulta pasajero
        String puntosInt = Integer.toString(consulta.getMembresiaPts());
        this.jLMembresiaPts.setText(puntosInt);

    }
    
    // Activa las advertencias.
    public void mostrarMensaje(String mensaje){
        this.jLabelAdvertencia.setVisible(true);
        this.jLabelAdvertencia.setText(mensaje);
    }    
    
    // Limpia los campos donde se escribe y se muestran los datos.
    public void limpiarCampos(){
        this.jLMembresiaTipo.setText("");
        this.jLMembresiaPts.setText("");
        this.jLabelAdvertencia.setVisible(false);
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCanjearPts1;
    private javax.swing.JLabel jLMembresiaPts;
    private javax.swing.JLabel jLMembresiaTipo;
    private javax.swing.JLabel jLabelAdvertencia;
    private javax.swing.JLabel jLabelMembresiaPts;
    private javax.swing.JLabel jLabelMembresiaTipo;
    private javax.swing.JLabel jLabelNumPasaporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNumPas;
    // End of variables declaration//GEN-END:variables
}
