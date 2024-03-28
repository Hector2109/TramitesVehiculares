/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.tramitesvehiculares;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.IPersonaBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.ITramiteBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.NegocioException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.PersonaBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.TramiteBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.ButtonColumn;

/**
 *
 * @author Abe
 */
public class DlgConsultasPersonas extends javax.swing.JDialog {

    private final IPersonaBO personaBO;
    private final ITramiteBO tramiteBO;
    DefaultTableModel modelo;

    /**
     * Creates new form DlgVacio
     */
    public DlgConsultasPersonas(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        personaBO = new PersonaBO();
        tramiteBO = new TramiteBO();
        initComponents();
        consultar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInicio1 = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        btnPersonas = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        btnPlacas = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        btnConsultas = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        btnReportes = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        btnLicencias = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(130, 206, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio.png"))); // NOI18N
        btnInicio1.setText("  Inicio       ");
        btnInicio1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInicio1.setRadius(23);
        btnInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 158, 148, 56));

        btnPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personas.png"))); // NOI18N
        btnPersonas.setText(" Personas");
        btnPersonas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPersonas.setRadius(23);
        btnPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonasActionPerformed(evt);
            }
        });
        jPanel1.add(btnPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 234, 148, 56));

        btnPlacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Placas.png"))); // NOI18N
        btnPlacas.setText("  Placas     ");
        btnPlacas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPlacas.setRadius(23);
        btnPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacasActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 310, 148, 56));

        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Consultas.png"))); // NOI18N
        btnConsultas.setText("  Consultas");
        btnConsultas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConsultas.setRadius(23);
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 462, 148, 56));

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reportes.png"))); // NOI18N
        btnReportes.setText("  Reportes");
        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReportes.setRadius(23);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 538, 148, 56));

        btnLicencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Licencias_Seleccionado.png"))); // NOI18N
        btnLicencias.setText("  Licencias");
        btnLicencias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLicencias.setRadius(23);
        jPanel1.add(btnLicencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 386, 148, 56));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 650));

        jPanel3.setBackground(new java.awt.Color(240, 252, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Nombre(s)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("Consultas");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setText("Año nacimiento");

        txtRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRFCActionPerformed(evt);
            }
        });
        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRFCKeyReleased(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioActionPerformed(evt);
            }
        });
        txtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnioKeyReleased(evt);
            }
        });

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "RFC", "Fecha de nacimiento", ""
            }
        ));
        tblPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersonas);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel7.setText("RFC");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(jLabel2))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 810, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRFCActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioActionPerformed

    private void tblPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPersonasMouseClicked

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if (txtNombre.getText().isBlank()) {
            limpiarTabla();
            consultar();
        } else {
            limpiarTabla();
            consultarSimilarNombre();

        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtRFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyReleased
        if (txtRFC.getText().isBlank()) {
            limpiarTabla();
            consultar();
        } else {
            limpiarTabla();
            consultarSimilarRFC();

        }
    }//GEN-LAST:event_txtRFCKeyReleased

    private void txtAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyReleased
        if (txtAnio.getText().isBlank()) {
            limpiarTabla();
            consultar();
        } else {
            limpiarTabla();
            consultarSimilarAnio();

        }
    }//GEN-LAST:event_txtAnioKeyReleased

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlacasActionPerformed

    private void btnPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonasActionPerformed

    }//GEN-LAST:event_btnPersonasActionPerformed

    private void btnInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicio1ActionPerformed

    public void limpiarTabla() {
        for (int i = 0; i < tblPersonas.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void consultar() {
        // Obtener la lista de socios
        List<PersonaDTO> listaPersonas;
        try {
            listaPersonas = personaBO.consultar();
                    
            modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return column == getColumnCount() - 1;
                }
            };

            modelo.addColumn("Nombre");
            modelo.addColumn("RFC");
            modelo.addColumn("Fecha nacimiento");
            modelo.addColumn("");

            for (PersonaDTO persona : listaPersonas) {
                String nombre = "";
                if (persona.getApellido_materno() != null) {
                    nombre = persona.getNombre() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno();
                } else {
                    nombre = persona.getNombre() + " " + persona.getApellido_paterno();
                }
                Object[] fila = {
                    nombre,
                    persona.getRfc(),
                    persona.getFecha_nacimiento(),
                    "Seleccionar"};
                modelo.addRow(fila);
            }

            tblPersonas.setModel(modelo);

            ButtonColumn buttonColumn = new ButtonColumn("Seleccionar", (e) -> {
                int fila = tblPersonas.convertRowIndexToModel(tblPersonas.getSelectedRow());
                PersonaDTO personaSeleccionada = listaPersonas.get(fila);
                DlgConsultarHistorial pantallaHistorial = new DlgConsultarHistorial(this, false, personaSeleccionada);
                pantallaHistorial.setVisible(true);
//                PantallaCuenta pantallaCuenta = new PantallaCuenta(parent, true, conexion, cuenta);
//                pantallaCuenta.setVisible(true);
//                llenarTabla();
            });
            tblPersonas.getColumnModel().getColumn(tblPersonas.getColumnCount() - 1).setCellRenderer(buttonColumn);
            tblPersonas.getColumnModel().getColumn(tblPersonas.getColumnCount() - 1).setCellEditor(buttonColumn);
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(this, "Error al consultar la información de las personas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void consultarSimilarNombre() {
        // Obtener la lista de socios
        List<PersonaDTO> listaPersonas;
        try {

            listaPersonas = personaBO.consultarPersonasSimilar(txtNombre.getText());
            modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return column == getColumnCount() - 1;
                }
            };

            modelo.addColumn("Nombre");
            modelo.addColumn("RFC");
            modelo.addColumn("Fecha nacimiento");
            modelo.addColumn("");

            for (PersonaDTO persona : listaPersonas) {
                String nombre = "";
                if (persona.getApellido_materno() != null) {
                    nombre = persona.getNombre() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno();
                } else {
                    nombre = persona.getNombre() + " " + persona.getApellido_paterno();
                }
                Object[] fila = {
                    nombre,
                    persona.getRfc(),
                    persona.getFecha_nacimiento(),
                    "Seleccionar"};
                modelo.addRow(fila);
            }

            tblPersonas.setModel(modelo);

            ButtonColumn buttonColumn = new ButtonColumn("Seleccionar", (e) -> {
                int fila = tblPersonas.convertRowIndexToModel(tblPersonas.getSelectedRow());
                PersonaDTO personaSeleccionada = listaPersonas.get(fila);
                DlgConsultarHistorial pantallaHistorial = new DlgConsultarHistorial(this, false, personaSeleccionada);
                pantallaHistorial.setVisible(true);
//                PantallaCuenta pantallaCuenta = new PantallaCuenta(parent, true, conexion, cuenta);
//                pantallaCuenta.setVisible(true);
//                llenarTabla();
            });
            tblPersonas.getColumnModel().getColumn(tblPersonas.getColumnCount() - 1).setCellRenderer(buttonColumn);
            tblPersonas.getColumnModel().getColumn(tblPersonas.getColumnCount() - 1).setCellEditor(buttonColumn);
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(this, "Error al consultar la información de las personas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void consultarSimilarRFC() {
        // Obtener la lista de socios
        List<PersonaDTO> listaPersonas;
        try {

            listaPersonas = personaBO.consultarPersonasSimilarRFC(txtRFC.getText());
            modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return column == getColumnCount() - 1; // Solo la última columna es editable
                }
            };

            modelo.addColumn("Nombre");
            modelo.addColumn("RFC");
            modelo.addColumn("Fecha nacimiento");
            modelo.addColumn("");

            for (PersonaDTO persona : listaPersonas) {
                String nombre = "";
                if (persona.getApellido_materno() != null) {
                    nombre = persona.getNombre() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno();
                } else {
                    nombre = persona.getNombre() + " " + persona.getApellido_paterno();
                }
                Object[] fila = {
                    nombre,
                    persona.getRfc(),
                    persona.getFecha_nacimiento(),
                    "Seleccionar"};
                modelo.addRow(fila);
            }

            tblPersonas.setModel(modelo);

            ButtonColumn buttonColumn = new ButtonColumn("Seleccionar", (e) -> {
                int fila = tblPersonas.convertRowIndexToModel(tblPersonas.getSelectedRow());
                PersonaDTO personaSeleccionada = listaPersonas.get(fila);
                DlgConsultarHistorial pantallaHistorial = new DlgConsultarHistorial(this, false, personaSeleccionada);
                pantallaHistorial.setVisible(true);
//                PantallaCuenta pantallaCuenta = new PantallaCuenta(parent, true, conexion, cuenta);
//                pantallaCuenta.setVisible(true);
//                llenarTabla();
            });
            tblPersonas.getColumnModel().getColumn(tblPersonas.getColumnCount() - 1).setCellRenderer(buttonColumn);
            tblPersonas.getColumnModel().getColumn(tblPersonas.getColumnCount() - 1).setCellEditor(buttonColumn);
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(this, "Error al consultar la información de las personas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void consultarSimilarAnio() {
        // Obtener la lista de socios
        final List<PersonaDTO> listaPersonas;
        try {

            listaPersonas = personaBO.consultarPersonasAnio(txtAnio.getText());
            modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return column == getColumnCount() - 1; // Solo la última columna es editable
                }
            };

            modelo.addColumn("Nombre");
            modelo.addColumn("RFC");
            modelo.addColumn("Fecha nacimiento");
            modelo.addColumn("");

            for (PersonaDTO persona : listaPersonas) {
                String nombre = "";
                if (persona.getApellido_materno() != null) {
                    nombre = persona.getNombre() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno();
                } else {
                    nombre = persona.getNombre() + " " + persona.getApellido_paterno();
                }
                Object[] fila = {
                    nombre,
                    persona.getRfc(),
                    persona.getFecha_nacimiento(),
                    "Seleccionar"};
                modelo.addRow(fila);
            }

            tblPersonas.setModel(modelo);

            ButtonColumn buttonColumn = new ButtonColumn("Seleccionar", (e) -> {
                int fila = tblPersonas.convertRowIndexToModel(tblPersonas.getSelectedRow());
                PersonaDTO personaSeleccionada = listaPersonas.get(fila);
                DlgConsultarHistorial pantallaHistorial = new DlgConsultarHistorial(this, false, personaSeleccionada);
                pantallaHistorial.setVisible(true);
//                PantallaCuenta pantallaCuenta = new PantallaCuenta(parent, true, conexion, cuenta);
//                pantallaCuenta.setVisible(true);
//                llenarTabla();
            });
            tblPersonas.getColumnModel().getColumn(tblPersonas.getColumnCount() - 1).setCellRenderer(buttonColumn);
            tblPersonas.getColumnModel().getColumn(tblPersonas.getColumnCount() - 1).setCellEditor(buttonColumn);
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(this, "Error al consultar la información de las personas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnConsultas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnInicio1;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul btnLicencias;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnPersonas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnPlacas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnReportes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
