 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.tramitesvehiculares;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.IPersonaBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.ITramiteBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.NegocioException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.PersonaBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.TramiteBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.TramiteDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.IConexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion.Fecha;

/**
 *
 * @author Abe
 */
public class DlgRegistrarLicencia extends javax.swing.JDialog {

    private static final Logger LOG = Logger.getLogger(DlgRegistrarLicencia.class.getName());

    private final IPersonaBO personaBO;
    private final ITramiteBO tramiteBO;
    private int anio;
    DefaultTableModel modelo;


    /**
     * Creates new form RegistrarLicencia2
     */
    public DlgRegistrarLicencia(java.awt.Dialog parent, boolean modal, IConexion conexion) {
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

        btnGroupAnio = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnInicio1 = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        btnPersonas = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        btnPlacas = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        btnConsultas = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        btnReportes = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        btnLicencias = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        rdbtn1 = new javax.swing.JRadioButton();
        rdbtn2 = new javax.swing.JRadioButton();
        rdbtn3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btnRealizarTramite = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(130, 206, 238));

        btnInicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio.png"))); // NOI18N
        btnInicio1.setText("  Inicio       ");
        btnInicio1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInicio1.setRadius(23);

        btnPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personas.png"))); // NOI18N
        btnPersonas.setText(" Personas");
        btnPersonas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPersonas.setRadius(23);
        btnPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonasActionPerformed(evt);
            }
        });

        btnPlacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Placas.png"))); // NOI18N
        btnPlacas.setText("  Placas     ");
        btnPlacas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPlacas.setRadius(23);
        btnPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacasActionPerformed(evt);
            }
        });

        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Consultas.png"))); // NOI18N
        btnConsultas.setText("  Consultas");
        btnConsultas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConsultas.setRadius(23);
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reportes.png"))); // NOI18N
        btnReportes.setText("  Reportes");
        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReportes.setRadius(23);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnLicencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Licencias_Seleccionado.png"))); // NOI18N
        btnLicencias.setText("  Licencias");
        btnLicencias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLicencias.setRadius(23);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLicencias, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(btnInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnLicencias, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 650));

        jPanel2.setBackground(new java.awt.Color(240, 252, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Nombre(s)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("Licencia");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setText("Año nacimiento");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel5.setText("Años de vigencia");

        txtRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRFCActionPerformed(evt);
            }
        });
        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
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
                "Nombre", "RFC", "Fecha de nacimiento"
            }
        ));
        tblPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersonas);

        btnGroupAnio.add(rdbtn1);
        rdbtn1.setText("1");
        rdbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtn1ActionPerformed(evt);
            }
        });

        btnGroupAnio.add(rdbtn2);
        rdbtn2.setText("2");
        rdbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtn2ActionPerformed(evt);
            }
        });

        btnGroupAnio.add(rdbtn3);
        rdbtn3.setText("3");
        rdbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtn3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setText("RFC");

        btnRealizarTramite.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarTramite.setText("Realizar trámite");
        btnRealizarTramite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRealizarTramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarTramiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(240, 240, 240)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(297, 297, 297)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnRealizarTramite, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(rdbtn1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdbtn2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdbtn3)))))
                            .addGap(219, 219, 219))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(jLabel2))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtn1)
                    .addComponent(rdbtn2)
                    .addComponent(rdbtn3))
                .addGap(18, 18, 18)
                .addComponent(btnRealizarTramite, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 810, 650));

        pack();
        setLocationRelativeTo(null);
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

    private void rdbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtn2ActionPerformed
        anio = 2;
    }//GEN-LAST:event_rdbtn2ActionPerformed

    private void rdbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtn3ActionPerformed
        anio = 3;
    }//GEN-LAST:event_rdbtn3ActionPerformed

    private void rdbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtn1ActionPerformed
        anio = 1;
    }//GEN-LAST:event_rdbtn1ActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().isBlank()) {
            limpiarTabla();
            consultar();
        } else {
            limpiarTabla();
            consultarSimilar();

        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        if (txtRFC.getText().isBlank()) {
            limpiarTabla();
            consultar();
        } else {
            limpiarTabla();
            consultarSimilarRFC();

        }
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyReleased
        if (txtAnio.getText().isBlank()) {
            limpiarTabla();
            consultar();
        } else {
            limpiarTabla();
            consultarAnio();

        }
    }//GEN-LAST:event_txtAnioKeyReleased

    private void btnPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonasActionPerformed
        PersonaBO personaBO = new PersonaBO();
        personaBO.insercionMasiva();
        consultar();
    }//GEN-LAST:event_btnPersonasActionPerformed

    private void btnPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlacasActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnRealizarTramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarTramiteActionPerformed
        int fila = tblPersonas.getSelectedRow();
        String rfc = tblPersonas.getValueAt(fila, 1).toString();
        PersonaDTO personaSeleccionada = null;
        try {
            personaSeleccionada = personaBO.consultarPersona(rfc);
        } catch (NegocioException ex) {
            Logger.getLogger(DlgRegistrarLicencia.class.getName()).log(Level.SEVERE, "No hay persona con ese rfc "+rfc,ex);
            
        }

        if (fila < 0) {
            
        } else{
            if (anio != 1 && anio != 2 && anio != 3) {
                JOptionPane.showMessageDialog(this, "Selecciona año de vigencia", "Año de vigencia", JOptionPane.WARNING_MESSAGE);
            } else {

                try {
                    tramiteBO.generarLicencia(personaSeleccionada, anio);
                    LicenciaDTO licencia = tramiteBO.buscarLicencia(personaSeleccionada);
                    DlgLicenciaRegistrada LR = new DlgLicenciaRegistrada(this, true, licencia);
                    LR.setVisible(true);

                } catch (NegocioException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de tramite" + ex.getCause(), JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_btnRealizarTramiteActionPerformed

    public void limpiarTabla() {
        for (int i = 0; i < tblPersonas.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void consultar() {

        try {
            List<PersonaDTO> listaPersonas = personaBO.consultar();
            Object[] personaFila = new Object[3];
            modelo = (DefaultTableModel) tblPersonas.getModel();
            for (PersonaDTO persona : listaPersonas) {
                if (persona.getApellido_materno() != null) {
                    personaFila[0] = persona.getNombre() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno();
                } else {
                    personaFila[0] = persona.getNombre() + " " + persona.getApellido_paterno();
                }
                personaFila[1] = persona.getRfc();
                personaFila[2] = persona.getFecha_nacimiento();

                modelo.addRow(personaFila);
            }

            tblPersonas.setModel(modelo);
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(this, "No se puede acceder a las personas", "Error de consulta",
                    JOptionPane.ERROR_MESSAGE);
            
        }

    }

    private void consultarSimilar() {
        try {
            List<PersonaDTO> listaPersonas = personaBO.consultarPersonasSimilar(txtNombre.getText());
            Object[] personaFila = new Object[3];
            modelo = (DefaultTableModel) tblPersonas.getModel();
            for (PersonaDTO persona : listaPersonas) {
                if (persona.getApellido_materno() != null) {
                    personaFila[0] = persona.getNombre() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno();
                } else {
                    personaFila[0] = persona.getNombre() + " " + persona.getApellido_paterno();
                }
                personaFila[1] = persona.getRfc();
                personaFila[2] = persona.getFecha_nacimiento();

                modelo.addRow(personaFila);
            }

            tblPersonas.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se puede acceder a las personas", "Error de consulta",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void consultarSimilarRFC() {
        try {
            List<PersonaDTO> listaPersonas = personaBO.consultarPersonasSimilarRFC(txtRFC.getText());
            Object[] personaFila = new Object[3];
            modelo = (DefaultTableModel) tblPersonas.getModel();
            for (PersonaDTO persona : listaPersonas) {
                if (persona.getApellido_materno() != null) {
                    personaFila[0] = persona.getNombre() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno();
                } else {
                    personaFila[0] = persona.getNombre() + " " + persona.getApellido_paterno();
                }
                personaFila[1] = persona.getRfc();
                personaFila[2] = persona.getFecha_nacimiento();

                modelo.addRow(personaFila);
            }

            tblPersonas.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se puede acceder a las personas", "Error de consulta",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Consulta u na lista de personas mediante año
     */
    private void consultarAnio() {
        try {
            List<PersonaDTO> listaPersonas = personaBO.consultarPersonasAnio(txtAnio.getText());
            Object[] personaFila = new Object[3];
            modelo = (DefaultTableModel) tblPersonas.getModel();
            for (PersonaDTO persona : listaPersonas) {
                if (persona.getApellido_materno() != null) {
                    personaFila[0] = persona.getNombre() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno();
                } else {
                    personaFila[0] = persona.getNombre() + " " + persona.getApellido_paterno();
                }
                personaFila[1] = persona.getRfc();
                personaFila[2] = persona.getFecha_nacimiento();

                modelo.addRow(personaFila);
            }

            tblPersonas.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se puede acceder a las personas", "Error de consulta",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnConsultas;
    private javax.swing.ButtonGroup btnGroupAnio;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnInicio1;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul btnLicencias;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnPersonas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnPlacas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul btnRealizarTramite;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbtn1;
    private javax.swing.JRadioButton rdbtn2;
    private javax.swing.JRadioButton rdbtn3;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
