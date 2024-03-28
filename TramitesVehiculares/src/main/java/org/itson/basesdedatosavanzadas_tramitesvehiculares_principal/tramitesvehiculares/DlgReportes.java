/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.tramitesvehiculares;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.IPersonaBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.ITramiteBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.NegocioException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.PersonaBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.TramiteBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PlacaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.TramiteDTO;

/**
 *
 * @author Abe
 */
public class DlgReportes extends javax.swing.JDialog {

    private final IPersonaBO personaBO;
    private final ITramiteBO tramiteBO;
    DefaultTableModel modelo;
    private int campoSeleccionado;
    private PersonaDTO persona;

    /**
     * Creates new form DlgVacio
     */
    public DlgReportes(java.awt.Dialog parent, boolean modal, PersonaDTO persona) {
        super(parent, modal);
        personaBO = new PersonaBO();
        tramiteBO = new TramiteBO();
        this.persona = persona;
        initComponents();
        String nombre = "";
        if (persona.getApellido_materno() != null) {
            nombre = persona.getNombre() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno();
        } else {
            nombre = persona.getNombre() + " " + persona.getApellido_paterno();
        }

        lblPersona.setText(nombre);
        consultar();
        DatePickerSettings desdeSettings = new DatePickerSettings();
        DatePickerSettings hastaSettings = new DatePickerSettings();

        desdeSettings.setFormatForDatesCommonEra("yyyy-MM-dd");
        hastaSettings.setFormatForDatesCommonEra("yyyy-MM-dd");

        dateDesde.setSettings(desdeSettings);
        dateHasta.setSettings(hastaSettings);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTramites = new javax.swing.JTable();
        dateDesde = new com.github.lgooddatepicker.components.DatePicker();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateHasta = new com.github.lgooddatepicker.components.DatePicker();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        lblPersona = new javax.swing.JLabel();

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
        jLabel2.setText("Periodo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("Reportes");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setText("Tipos de trámite");

        tblTramites.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de trámite", "Fecha de realización", "Costo"
            }
        ));
        tblTramites.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTramitesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTramites);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Desde:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Hasta:");

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jCheckBox1.setText("Licencias");

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jCheckBox2.setText("Placas");

        lblPersona.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblPersona.setForeground(new java.awt.Color(156, 156, 156));
        lblPersona.setText("Nombre Persona");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)
                        .addComponent(lblPersona))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateHasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(dateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 810, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void tblTramitesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTramitesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTramitesMouseClicked

    public void limpiarTabla() {
        for (int i = 0; i < tblTramites.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void consultar() {
        try {
            List<TramiteDTO> listaTramites = tramiteBO.consultarTramitesPersona(persona);
            Object[] tramitesFila = new Object[3];
            modelo = (DefaultTableModel) tblTramites.getModel();

            for (TramiteDTO tramite : listaTramites) {
                String tipoTramite = "";
                if (tramite instanceof PlacaDTO) {
                    tipoTramite = "Placa";
                } else if (tramite instanceof LicenciaDTO) {
                    tipoTramite = "Tramite";
                } else {
                    tipoTramite = "Desconocido";
                }
                tramitesFila[0] = tipoTramite;
                tramitesFila[1] = tramite.getFecha_tramite();
                tramitesFila[2] = tramite.getCosto();

                modelo.addRow(tramitesFila);
            }

            tblTramites.setModel(modelo);
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(this, "No se puede acceder a las personas", "Error de consulta",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnConsultas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnInicio1;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul btnLicencias;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnPersonas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnPlacas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnReportes;
    private com.github.lgooddatepicker.components.DatePicker dateDesde;
    private com.github.lgooddatepicker.components.DatePicker dateHasta;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPersona;
    private javax.swing.JTable tblTramites;
    // End of variables declaration//GEN-END:variables
}
