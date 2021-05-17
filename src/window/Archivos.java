
package window;

import airclass.AdultoMayor;
import airclass.MenorDeEdad;
import airclass.Persona;
import airclass.VecAsientos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Archivos extends javax.swing.JInternalFrame {


    public Archivos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonExaminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVuelos = new javax.swing.JTable();
        jTextFieldRutaFichero = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Archivos");
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));

        jButtonExaminar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonExaminar.setText("EXAMINAR");
        jButtonExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExaminarActionPerformed(evt);
            }
        });

        jTableVuelos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTableVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Pasaporte", "Nombre", "Apellido", "Genero", "Edad", "Destino", "Num Tiquete", "Membresia", "Puntos", "Costo", "Regimen", "Encargado", "Autorizado", "Estado"
            }
        ));
        jTableVuelos.setRowHeight(35);
        jScrollPane1.setViewportView(jTableVuelos);

        jTextFieldRutaFichero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldRutaFichero)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1176, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRutaFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void escribir(){
       //Creamos el objeto JFileChooser
        JFileChooser fc = new JFileChooser();

        //Abrimos la ventana, guardamos la opcion seleccionada por el usuario
        int seleccion = fc.showSaveDialog(this);

        //Si el usuario, pincha en aceptar
        if (seleccion == JFileChooser.APPROVE_OPTION) {

            //Seleccionamos el fichero
            File oos = fc.getSelectedFile();
            
            try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(oos, true))) {
                
                salida.writeObject(Menu.vueloNicaragua);
                salida.writeObject(Menu.vueloPanama);
                salida.close();

            } catch (IOException iOException) {
                System.out.println("Falla al escribir en archivo. \n" + iOException);
            } 

            JOptionPane.showMessageDialog(null, "Guardado Completado");
        }
    }    
    
    private void jButtonExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExaminarActionPerformed
        leer();
    }//GEN-LAST:event_jButtonExaminarActionPerformed
    
    public void leer(){
        //Creamos el objeto JFileChooser.
        JFileChooser fc = new JFileChooser();

        //Abrimos la ventana, guardamos la opcion seleccionada por el usuario.
        int seleccion = fc.showOpenDialog(this);

        //Si el usuario, pincha en aceptar.
        if (seleccion == JFileChooser.APPROVE_OPTION) {

            //Seleccionamos el fichero
            File ois = fc.getSelectedFile();

            //Ecribe la ruta del fichero seleccionado en el campo de texto
            jTextFieldRutaFichero.setText(ois.getAbsolutePath());

            try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ois))) {
               
                // Se asigna a variables tipo Array los Arrays dentro del archivo.
                VecAsientos vueloNic = (VecAsientos)entrada.readObject();
                VecAsientos vueloPan = (VecAsientos)entrada.readObject();
                
                // Llama al método que muestra lo que se leyó del archivo para cada vuelo.
                mostrarVuelo(vueloNic); 
                mostrarVuelo(vueloPan); 

                entrada.close();
            } catch (IOException iOException) {
                System.out.println("Error al leer el archivo");
            } catch (ClassNotFoundException classNotFoundException) {
                System.out.println("No se encontró el archivo");
            }
        }
    }
    
    private void mostrarVuelo (VecAsientos vuelo){
        
        DefaultTableModel model = (DefaultTableModel) jTableVuelos.getModel();

        for (int i = 0; i < vuelo.getCan() ; i++) {  
            Object matris[] = new Object[14];
            Persona persona = vuelo.mostrarPersona(i);

            if (persona == null) {

                model.addRow(matris);

            } else { // Muestra cada dato en un campo de la tabla
                matris[0] = persona.getNumPasaporte();
                matris[1] = persona.getNombre();
                matris[2] = persona.getApellido();
                matris[3] = persona.getGenero();
                matris[4] = persona.getEdad();
                matris[5] = persona.getDestino();
                matris[6] = persona.getNumTiquete();
                matris[7] = persona.getMembresiaTipo();
                matris[8] = persona.getMembresiaPts();
                matris[9] = persona.getCostoBoleto();

                if (persona instanceof AdultoMayor) { // Identifica si es una Persona de tipo Adulto Mayor.
                    matris[10] = ((AdultoMayor) persona).getRegimen();
                    matris[13] = "Ciudadano de Oro";
                } else if (persona instanceof MenorDeEdad) { // Identifica si es una Persona de tipo Menor de Edad.
                    matris[11] = ((MenorDeEdad) persona).getEncargado();
                    matris[12] = ((MenorDeEdad) persona).getAutorizado();
                    matris[13] = "Menor de Edad";
                } else {

                }
                model.addRow(matris);
            }
        }
        jTableVuelos.setModel(model);       
  
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExaminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVuelos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldRutaFichero;
    // End of variables declaration//GEN-END:variables
}
