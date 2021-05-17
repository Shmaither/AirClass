package window;

import airclass.AdultoMayor;
import airclass.MenorDeEdad;
import airclass.Persona;
import javax.swing.table.DefaultTableModel;

import static window.Menu.vueloNicaragua;

public class ConsultarVueloNic extends javax.swing.JInternalFrame {

    public ConsultarVueloNic() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVueloNic = new javax.swing.JTable();
        jButtonGenerar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Vuelo Nicaragua");
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VUELO NICARAGUA");

        jTableVueloNic.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTableVueloNic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Pasaporte", "Nombre", "Apellido", "Genero", "Edad", "Destino", "Num Tiquete", "Membresia", "Puntos", "Costo", "Regimen", "Encargado", "Autorizado", "Estado"
            }
        ));
        jTableVueloNic.setRowHeight(35);
        jScrollPane1.setViewportView(jTableVueloNic);

        jButtonGenerar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonGenerar.setText("GENERAR");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(442, 442, 442))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTableVueloNic.getModel();

        for (int i = 0; i < 21; i++) {
            Object matris[] = new Object[14];
            Persona persona = vueloNicaragua.mostrarPersona(i);
      

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
        jTableVueloNic.setModel(model);

    }//GEN-LAST:event_jButtonGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVueloNic;
    // End of variables declaration//GEN-END:variables
}
