
// **************************************************************************************************************************************************
// UNIVERSIDAD ESTATAL A DISTANCIA
// ESCUELA DE CIENCIAS EXACTAS Y NATURALES
// CARRERA INGENIERIA INFORMATICA
// CATETRAS TECNOLOGIA DE SISTEMAS

// PROGRAMACIÓN INTERMEDIA_00824
// PROYECTO FINAL
// ESTUDIANTE: SHMAITER JOSE MORALES RIZO
// CEDULA: 0207020436

// GRUPO #3
// PROFESOR: JOSE MANUEL SALAZAR HERRERA
// PRIMER CUATRIMESTRE 2020
// **************************************************************************************************************************************************

package window;

import airclass.Persona;
import airclass.VecAsientos;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {

   

    // Método principal desde donde se comienza a correr toda la apliación.
    public static void main(String args[]) {
       
        // Estiliza la apariencia de los marcos.
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Menu menu = new Menu();  
                menu.setVisible(true);   
            }
        });
    }
    
    // Arrays de vuelos que almacenan las personas.
    public static VecAsientos vueloNicaragua = new VecAsientos();
    public static VecAsientos vueloPanama = new VecAsientos();   
    public static ArrayList <Persona> baseDeDatos = new ArrayList<Persona>();
    
    // Constructor del menú.
    public Menu() {
        
        initComponents();
        
        setTitle("AirClass Airline");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        menuBarra = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();
        menuAgregar = new javax.swing.JMenu();
        agregarPasajero = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        editarPasajero = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        consultarPasajero = new javax.swing.JMenuItem();
        consultarVuelo = new javax.swing.JMenu();
        consultarVueloNic = new javax.swing.JMenuItem();
        consultarVueloPan = new javax.swing.JMenuItem();
        jMenuItemMembresia = new javax.swing.JMenuItem();
        jMenuTerminar = new javax.swing.JMenu();
        jMenuItemCerrarVuelos = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setPreferredSize(new java.awt.Dimension(1200, 700));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuBarra.setPreferredSize(new java.awt.Dimension(58, 50));

        jMenuArchivo.setText("Archivo");
        jMenuArchivo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jMenuItemAbrir.setText("Abrir");
        jMenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemAbrir);

        jMenuItemGuardar.setText("Guardar");
        jMenuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemGuardar);

        jMenuItemAcercaDe.setText("Acerca de");
        jMenuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemAcercaDe);

        menuBarra.add(jMenuArchivo);

        menuAgregar.setText("Agregar");
        menuAgregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        menuAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuAgregar.setIconTextGap(5);
        menuAgregar.setPreferredSize(new java.awt.Dimension(70, 19));

        agregarPasajero.setText("Pasajero");
        agregarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPasajeroActionPerformed(evt);
            }
        });
        menuAgregar.add(agregarPasajero);

        menuBarra.add(menuAgregar);

        menuEditar.setText("Editar");
        menuEditar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        menuEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEditar.setIconTextGap(5);
        menuEditar.setMinimumSize(new java.awt.Dimension(70, 19));
        menuEditar.setPreferredSize(new java.awt.Dimension(50, 19));

        editarPasajero.setText("Pasajero");
        editarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPasajeroActionPerformed(evt);
            }
        });
        menuEditar.add(editarPasajero);

        menuBarra.add(menuEditar);

        menuConsultar.setText("Consultar");
        menuConsultar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        menuConsultar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuConsultar.setIconTextGap(5);
        menuConsultar.setPreferredSize(new java.awt.Dimension(80, 19));

        consultarPasajero.setText("Pasajero");
        consultarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarPasajeroActionPerformed(evt);
            }
        });
        menuConsultar.add(consultarPasajero);

        consultarVuelo.setText("Vuelo");

        consultarVueloNic.setText("Nicaragua");
        consultarVueloNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarVueloNicActionPerformed(evt);
            }
        });
        consultarVuelo.add(consultarVueloNic);

        consultarVueloPan.setText("Panama");
        consultarVueloPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarVueloPanActionPerformed(evt);
            }
        });
        consultarVuelo.add(consultarVueloPan);

        menuConsultar.add(consultarVuelo);

        jMenuItemMembresia.setText("Membresia");
        jMenuItemMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMembresiaActionPerformed(evt);
            }
        });
        menuConsultar.add(jMenuItemMembresia);

        menuBarra.add(menuConsultar);

        jMenuTerminar.setText("Terminar");
        jMenuTerminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jMenuItemCerrarVuelos.setText("Cerrar Vuelos");
        jMenuItemCerrarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarVuelosActionPerformed(evt);
            }
        });
        jMenuTerminar.add(jMenuItemCerrarVuelos);

        menuBarra.add(jMenuTerminar);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Botones de la barra de menú en la ventana inicial, desde la cual se llama a las demas subventanas o JInternal Frames.
    private void consultarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPasajeroActionPerformed
        this.escritorio.removeAll();
        this.escritorio.repaint();
        ConsultarPasajero consultaP = new ConsultarPasajero();
        this.escritorio.add(consultaP);
        consultaP.show(); 
    }//GEN-LAST:event_consultarPasajeroActionPerformed

    private void agregarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPasajeroActionPerformed
        this.escritorio.removeAll();
        this.escritorio.repaint();
        AgregarPasajero pasajero = new AgregarPasajero();
        this.escritorio.add(pasajero);
        try {
            pasajero.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        pasajero.show();     
    }//GEN-LAST:event_agregarPasajeroActionPerformed

    private void editarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPasajeroActionPerformed
        this.escritorio.removeAll();
        this.escritorio.repaint();
        Editar editar = new Editar();
        this.escritorio.add(editar);
        editar.show(); 
    }//GEN-LAST:event_editarPasajeroActionPerformed

    private void consultarVueloNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarVueloNicActionPerformed
        this.escritorio.removeAll();
        this.escritorio.repaint();
        ConsultarVueloNic vueloNic = new ConsultarVueloNic();
        this.escritorio.add(vueloNic);
        vueloNic.show(); 
    }//GEN-LAST:event_consultarVueloNicActionPerformed

    private void consultarVueloPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarVueloPanActionPerformed
        this.escritorio.removeAll();
        this.escritorio.repaint();
        ConsultarVueloPan vueloPan = new ConsultarVueloPan();
        this.escritorio.add(vueloPan);
        vueloPan.show(); 
    }//GEN-LAST:event_consultarVueloPanActionPerformed

    private void jMenuItemMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMembresiaActionPerformed
        this.escritorio.removeAll();
        this.escritorio.repaint();
        Membresia membresia = new Membresia();
        this.escritorio.add(membresia);
        membresia.show();
    }//GEN-LAST:event_jMenuItemMembresiaActionPerformed
    
    // Llama al metodo que invoca al filechooeser dentro de la clase Archivos
    private void jMenuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarActionPerformed
        Archivos guardar = new Archivos();
        guardar.escribir(); 
    }//GEN-LAST:event_jMenuItemGuardarActionPerformed
    
    // Abre ventana donde se llamara el archivo a mostrar dentro de una un area de texto.
    private void jMenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirActionPerformed
        this.escritorio.removeAll();
        this.escritorio.repaint();
        Archivos arch = new Archivos();
        this.escritorio.add(arch);
        arch.show();
    }//GEN-LAST:event_jMenuItemAbrirActionPerformed
    
    // Información sobre el autor.
    private void jMenuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaDeActionPerformed
        JOptionPane.showMessageDialog(null,
                " UNIVERSIDAD ESTATAL A DISTANCIA\n" +
                " ESCUELA DE CIENCIAS EXACTAS Y NATURALES\n" +
                " CARRERA INGENIERIA INFORMATICA\n" +
                " CATETRAS TECNOLOGIA DE SISTEMAS\n" +
                "\n" +
                " PROGRAMACIÓN INTERMEDIA_00824\n" +
                " PROYECTO FINAL\n" +
                " ESTUDIANTE: SHMAITER JOSE MORALES RIZO\n" +
                " CEDULA: 0207020436\n" +
                "\n" +
                " GRUPO #3\n" +
                " PROFESOR: JOSE MANUEL SALAZAR HERRERA\n" +
                " PRIMER CUATRIMESTRE 2020");
    }//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

    private void jMenuItemCerrarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarVuelosActionPerformed

        System.out.println("nicaragua: " +vueloNicaragua.getCan() + " panama: " + vueloPanama.getCan());

        if (vueloNicaragua.getCan() != 0) {
            for (int i = 0; i < vueloNicaragua.getCan(); i++) {
                baseDeDatos.add(vueloNicaragua.mostrarPersona(i));
            }
            vueloNicaragua.limpiarVector();
        }

        if (vueloPanama.getCan() != 0) {
            for (int i = 0; i < vueloPanama.getCan(); i++) {
                baseDeDatos.add(vueloPanama.mostrarPersona(i));
            }
            vueloPanama.limpiarVector();
        }

        JOptionPane.showMessageDialog(null, "Vuelo Completado");
    }//GEN-LAST:event_jMenuItemCerrarVuelosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregarPasajero;
    private javax.swing.JMenuItem consultarPasajero;
    private javax.swing.JMenu consultarVuelo;
    private javax.swing.JMenuItem consultarVueloNic;
    private javax.swing.JMenuItem consultarVueloPan;
    private javax.swing.JMenuItem editarPasajero;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemCerrarVuelos;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemMembresia;
    private javax.swing.JMenu jMenuTerminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAgregar;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenu menuEditar;
    // End of variables declaration//GEN-END:variables
}
