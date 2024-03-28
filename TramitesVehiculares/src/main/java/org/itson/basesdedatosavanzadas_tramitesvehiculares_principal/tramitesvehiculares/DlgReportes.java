/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.tramitesvehiculares;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import java.util.ArrayList;
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
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion.Fecha;

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

    private List<List<String>> listaParaReporte;
    /**
     * Creates new form DlgVacio
     */
    public DlgReportes(java.awt.Dialog parent, boolean modal, PersonaDTO persona) {
        super(parent, modal);
        listaParaReporte = new ArrayList<>();
        personaBO = new PersonaBO();
        tramiteBO = new TramiteBO();
        this.persona = persona;
        initComponents();
        chkLicencias.setSelected(true);
        chkPlacas.setSelected(true);
        String nombre = "";
        if (persona.getApellido_materno() != null) {
            nombre = persona.getNombre() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno();
        } else {
            nombre = persona.getNombre() + " " + persona.getApellido_paterno();
        }

        lblPersona.setText(nombre);

        DatePickerSettings desdeSettings = new DatePickerSettings();
        DatePickerSettings hastaSettings = new DatePickerSettings();

        desdeSettings.setFormatForDatesCommonEra("yyyy-MM-dd");
        desdeSettings.setAllowKeyboardEditing(false);
        hastaSettings.setFormatForDatesCommonEra("yyyy-MM-dd");
        hastaSettings.setAllowKeyboardEditing(false);

        dateDesde.setSettings(desdeSettings);
        dateHasta.setSettings(hastaSettings);
        dateDesde.addDateChangeListener(new DateChangeListener() {
            @Override
            public void dateChanged(DateChangeEvent event) {
                consultar();
            }
        });
        dateHasta.addDateChangeListener(new DateChangeListener() {
            @Override
            public void dateChanged(DateChangeEvent event) {
                consultar();
            }
        });
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
        jLabel9 = new javax.swing.JLabel();
        btnLicencias1 = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul();
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
        chkLicencias = new javax.swing.JCheckBox();
        chkPlacas = new javax.swing.JCheckBox();
        lblPersona = new javax.swing.JLabel();
        btnLicencias = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul();

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, -1, -1));

        btnLicencias1.setForeground(new java.awt.Color(255, 255, 255));
        btnLicencias1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Licencias_Seleccionado.png"))); // NOI18N
        btnLicencias1.setText("  Licencias");
        btnLicencias1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLicencias1.setRadius(23);
        jPanel1.add(btnLicencias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 386, 148, 56));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 650));

        jPanel3.setBackground(new java.awt.Color(240, 252, 255));

        jLabel2.setText("Periodo");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N

        jLabel3.setText("Reportes");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        jLabel4.setText("Tipos de trámite");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N

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

        dateDesde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dateDesdeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dateDesdeMouseReleased(evt);
            }
        });
        dateDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dateDesdeKeyPressed(evt);
            }
        });

        jLabel5.setText("Desde:");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel6.setText("Hasta:");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        dateHasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dateHastaMouseReleased(evt);
            }
        });
        dateHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dateHastaKeyPressed(evt);
            }
        });

        chkLicencias.setText("Licencias");
        chkLicencias.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        chkLicencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                chkLicenciasMouseReleased(evt);
            }
        });
        chkLicencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLicenciasActionPerformed(evt);
            }
        });
        chkLicencias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chkLicenciasKeyPressed(evt);
            }
        });

        chkPlacas.setText("Placas");
        chkPlacas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        chkPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlacasActionPerformed(evt);
            }
        });
        chkPlacas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chkPlacasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                chkPlacasKeyReleased(evt);
            }
        });

        lblPersona.setText("Nombre Persona");
        lblPersona.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblPersona.setForeground(new java.awt.Color(156, 156, 156));

        btnLicencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Licencias_Seleccionado.png"))); // NOI18N
        btnLicencias.setText("Descargar Reporte");
        btnLicencias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLicencias.setForeground(new java.awt.Color(255, 255, 255));
        btnLicencias.setRadius(23);
        btnLicencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
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
                                .addGap(155, 155, 155)
                                .addComponent(chkLicencias, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(chkPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLicencias, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkLicencias)
                            .addComponent(chkPlacas))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(dateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLicencias, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 810, 650));

        pack();
        setLocationRelativeTo(null);
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

    private void chkPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlacasActionPerformed
//        limpiarTabla();
        consultar();
    }//GEN-LAST:event_chkPlacasActionPerformed

    private void chkLicenciasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkLicenciasMouseReleased
//        limpiarTabla();
//        consultar();
    }//GEN-LAST:event_chkLicenciasMouseReleased

    private void chkPlacasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chkPlacasKeyReleased
//        limpiarTabla();
//        consultar();
    }//GEN-LAST:event_chkPlacasKeyReleased

    private void chkPlacasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chkPlacasKeyPressed
//        limpiarTabla();
//        consultar();
    }//GEN-LAST:event_chkPlacasKeyPressed

    private void chkLicenciasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chkLicenciasKeyPressed
//        limpiarTabla();
//        consultar();
    }//GEN-LAST:event_chkLicenciasKeyPressed

    private void chkLicenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLicenciasActionPerformed
        consultar();
    }//GEN-LAST:event_chkLicenciasActionPerformed

    private void dateDesdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateDesdeKeyPressed
//        limpiarTabla();
//        consultar();
    }//GEN-LAST:event_dateDesdeKeyPressed

    private void dateHastaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateHastaKeyPressed
////        limpiarTabla();
////        consultar();
    }//GEN-LAST:event_dateHastaKeyPressed

    private void dateDesdeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateDesdeMouseReleased
//        limpiarTabla();
//        consultar();
    }//GEN-LAST:event_dateDesdeMouseReleased

    private void dateHastaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateHastaMouseReleased
//        limpiarTabla();
//        consultar();
    }//GEN-LAST:event_dateHastaMouseReleased

    private void dateDesdeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateDesdeMousePressed

    }//GEN-LAST:event_dateDesdeMousePressed

    private void btnLicenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicenciasActionPerformed
        PDFReportGenerator pdfGenerador = new PDFReportGenerator();
        String nombre = " ";
        if (persona.getApellido_materno() != null) {
            nombre = persona.getNombre() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno();
        } else {
            nombre = persona.getNombre() + " " + persona.getApellido_paterno();
        }
        
        PDFReportGenerator.generatePDFReport(listaParaReporte,nombre);
    }//GEN-LAST:event_btnLicenciasActionPerformed

    public void consultar() {
        try {
            List<TramiteDTO> listaTramites = tramiteBO.consultarTramitesPersona(persona);
            listaParaReporte= new  ArrayList<>();
            List<String> datos = new ArrayList<>();
                        datos.add("Tipo de trámite");
                        datos.add("Fecha de realización");
                        datos.add("costo");
            listaParaReporte.add(datos);
            
            modelo = (DefaultTableModel) tblTramites.getModel();
            modelo.setRowCount(0);

            for (TramiteDTO tramite : listaTramites) {
                boolean agregarTramite = false;
                if (chkLicencias.isSelected() && tramite instanceof LicenciaDTO) {
                    agregarTramite = true;
                } else if (chkPlacas.isSelected() && tramite instanceof PlacaDTO) {
                    agregarTramite = true;
                }

                if (agregarTramite) {
                    Fecha fechaTramite = tramite.getFecha_tramite();
                    boolean enRango = true;
                    if (!dateDesde.getText().isBlank()) {
                        enRango &= fechaTramite.fechaDesde(new Fecha(dateDesde.getText()));
                    }
                    if (!dateHasta.getText().isBlank()) {
                        enRango &= fechaTramite.fechaHasta(new Fecha(dateHasta.getText()));
                    }

                    if (enRango) {
                        String tipoTramite = (tramite instanceof PlacaDTO) ? "Placa" : "Licencia";
                        String fecha = fechaTramite.toString(); // Convertir la fecha a String
                        String costo = String.valueOf(tramite.getCosto()); // Convertir el costo a String
                        modelo.addRow(new Object[]{tipoTramite, fecha, costo});
                        
                        List<String> datosTramite = new ArrayList<>();
                        datosTramite.add(tipoTramite);
                        datosTramite.add(fecha);
                        datosTramite.add(costo);
                        listaParaReporte.add(datosTramite);
                    }
                }
            }

            
            
            tblTramites.setModel(modelo);
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(this, "No se puede acceder a las personas", "Error de consulta", JOptionPane.ERROR_MESSAGE);
        }
    }

//    public void consultar() {
//        try {
//            List<TramiteDTO> listaTramites = tramiteBO.consultarTramitesPersona(persona);
//            List<TramiteDTO> listaTramitesImpimir = new ArrayList<>();
//            Object[] tramitesFila = new Object[3];
//            modelo = (DefaultTableModel) tblTramites.getModel();
//
//            //Si solo se ha seleccionado a licencia
//            if (chkLicencias.isSelected() && !chkPlacas.isSelected()) {
//                for (TramiteDTO tramite : listaTramites) {
//                    if (tramite instanceof LicenciaDTO) {
//                        listaTramitesImpimir.add(tramite);
//                    }
//                }
//            } //Si solo se ha seleccinado placas
//            else if (!chkLicencias.isSelected() && chkPlacas.isSelected()) {
//                for (TramiteDTO tramite : listaTramites) {
//                    if (tramite instanceof PlacaDTO) {
//                        listaTramitesImpimir.add(tramite);
//                    }
//                }
//            } else if (chkLicencias.isSelected() && chkPlacas.isSelected()) {
//                listaTramitesImpimir = listaTramites;
//            } else if (chkLicencias.isSelected() && chkPlacas.isSelected()) {
//                listaTramitesImpimir = null;
//            }
//
////            //Si existe un desde y un hasta
////            if (!dateDesde.getText().isBlank() && !dateHasta.getText().isBlank()) {
////                for (TramiteDTO tramite : listaTramites) {
////                    if (tramite.getFecha_tramite().fechaEnRango(
////                            new Fecha(dateDesde.getText()),
////                            new Fecha(dateDesde.getText()))) {
////                        listaTramitesImpimir.add(tramite);
////
////                    }
////                }
////            } //Si solo se selecciona desde
////            else if (!dateDesde.getText().isBlank() && dateHasta.getText().isBlank()) {
////                for (TramiteDTO tramite : listaTramites) {
////                    if (tramite.getFecha_tramite().fechaDesde(new Fecha(dateDesde.getText()))) {
////                        listaTramitesImpimir.add(tramite);
////                    }
////                }
////            } //Si solo se selecciona hasta
////            else if (dateDesde.getText().isBlank() && !dateHasta.getText().isBlank()) {
////                for (TramiteDTO tramite : listaTramites) {
////                    if (tramite.getFecha_tramite().fechaHasta(new Fecha(dateHasta.getText()))) {
////                        listaTramitesImpimir.add(tramite);
////                    }
////                }
////            } //si no se selecciona ninguno
////            else if (dateDesde.getText().isBlank() && dateHasta.getText().isBlank()) {
////                for (TramiteDTO tramite : listaTramites) {
////                    listaTramitesImpimir = listaTramites;
////                }
////            }
//            modelo.setRowCount(0);
//            for (TramiteDTO tramite : listaTramitesImpimir) {
//
//                String tipoTramite = "";
//                if (tramite instanceof PlacaDTO) {
//                    tipoTramite = "Placa";
//                } else if (tramite instanceof LicenciaDTO) {
//                    tipoTramite = "Tramite";
//                } else {
//                    tipoTramite = "Desconocido";
//                }
//                tramitesFila[0] = tipoTramite;
//                tramitesFila[1] = tramite.getFecha_tramite();
//                tramitesFila[2] = tramite.getCosto();
//
//                modelo.addRow(tramitesFila);
//            }
//
//            tblTramites.setModel(modelo);
//        } catch (NegocioException e) {
//            JOptionPane.showMessageDialog(this, "No se puede acceder a las personas", "Error de consulta",
//                    JOptionPane.ERROR_MESSAGE);
//
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnConsultas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnInicio1;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul btnLicencias;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul btnLicencias1;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnPersonas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnPlacas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnReportes;
    private javax.swing.JCheckBox chkLicencias;
    private javax.swing.JCheckBox chkPlacas;
    private com.github.lgooddatepicker.components.DatePicker dateDesde;
    private com.github.lgooddatepicker.components.DatePicker dateHasta;
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
