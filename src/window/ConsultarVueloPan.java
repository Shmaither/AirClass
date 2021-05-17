
package window;

import airclass.AdultoMayor;
import airclass.MenorDeEdad;
import airclass.Persona;
import javax.swing.table.DefaultTableModel;
import static window.Menu.vueloPanama;

public class ConsultarVueloPan extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarVueloPan
     */
    public ConsultarVueloPan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVueloPan = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Vuelo Panama");
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VUELO PANAMA");

        jButtonGenerar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonGenerar.setText("GENERAR");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });

        jTableVueloPan.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTableVueloPan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Pasaporte", "Nombre", "Apellido", "Genero", "Edad", "Destino", "Num Tiquete", "Mebresia", "Puntos", "Costo", "Regimen", "Encargado", "Autorizado", "Estado"
            }
        ));
        jTableVueloPan.setRowHeight(35);
        jScrollPane1.setViewportView(jTableVueloPan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(497, 497, 497)
                        .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(475, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jScrollPane1)
                    .addGap(20, 20, 20)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(166, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTableVueloPan.getModel();

        for (int i = 0; i < 21; i++) {
            Object matris[] = new Object[14];
            Persona persona = vueloPanama.mostrarPersona(i);

            if (persona == null) {
                model.addRow(matris);
                
            } else { // Muestra cada dato en un campo de la tabla
                matris [0] = persona.getNumPasaporte();
                matris [1] = persona.getNombre();
                matris [2] = persona.getApellido();
                matris [3] = persona.getGenero();
                matris [4] = persona.getEdad();
                matris [5] = persona.getDestino();
                matris [6] = persona.getNumTiquete();
                matris [7] = persona.getMembresiaTipo();
                matris [8] = persona.getMembresiaPts();                 
                matris [9] = persona.getCostoBoleto();

                if (persona instanceof AdultoMayor) { // Identifica si es una Persona de tipo Adulto Mayor.
                    matris[10] = ((AdultoMayor) persona).getRegimen();
                    matris[13] = "Ciudadano de Oro";
                } else if (persona instanceof MenorDeEdad) { // Identifica si es una Persona de tipo Menor de Edad.
                    matris [11] = ((MenorDeEdad) persona).getEncargado();
                    matris [12] = ((MenorDeEdad) persona).getAutorizado();
                    matris [13] = "Menor de Edad";
                } else {

                }
                model.addRow(matris);
            }
        }
        jTableVueloPan.setModel(model);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGenerarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVueloPan;
    // End of variables declaration//GEN-END:variables
}
