/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.tramitesvehiculares;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.ITramiteBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.NegocioException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.TramiteBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.AutomovilDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PlacaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Abe
 */
public class DlgAutomovilNuevo extends javax.swing.JDialog {

    private static final Logger LOG = Logger.getLogger(DlgAutomovilNuevo.class.getName());
    

    private PersonaDTO personaDTO;
    private final ITramiteBO tramiteBO;
    /**
     * Creates new form DlgVacio
     */
    public DlgAutomovilNuevo(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        tramiteBO = new TramiteBO();
//        if(licenciaDTO!=null){
//            
//        }
        initComponents();
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
        btnLicencias = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLinea = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtLicencia = new javax.swing.JTextField();
        btnRealizarTramite = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul();
        btnBuscarLicencia = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul();

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

        btnPlacas.setBackground(new java.awt.Color(62, 117, 225));
        btnPlacas.setForeground(new java.awt.Color(255, 255, 255));
        btnPlacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Placas_Seleccionado.png"))); // NOI18N
        btnPlacas.setText("  Placas     ");
        btnPlacas.setColor(new java.awt.Color(62, 117, 225));
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

        btnLicencias.setBackground(new java.awt.Color(255, 255, 255));
        btnLicencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Licencias.png"))); // NOI18N
        btnLicencias.setText("  Licencias");
        btnLicencias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLicencias.setRadius(23);
        btnLicencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicenciasActionPerformed(evt);
            }
        });
        jPanel1.add(btnLicencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 386, 148, 56));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 650));

        jPanel2.setBackground(new java.awt.Color(240, 252, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("Placas automóvil nuevo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Color");

        txtNumSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumSerieActionPerformed(evt);
            }
        });
        txtNumSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumSerieKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setText("Numero de serie");

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel5.setText("Marca");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel7.setText("Modelo");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel8.setText("Línea");

        txtLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLineaActionPerformed(evt);
            }
        });
        txtLinea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLineaKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel10.setText("RFC Persona");

        txtLicencia.setEditable(false);
        txtLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenciaActionPerformed(evt);
            }
        });
        txtLicencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLicenciaKeyTyped(evt);
            }
        });

        btnRealizarTramite.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarTramite.setText("Realizar trámite");
        btnRealizarTramite.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRealizarTramite.setRadius(23);
        btnRealizarTramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarTramiteActionPerformed(evt);
            }
        });

        btnBuscarLicencia.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarLicencia.setText("Buscar");
        btnBuscarLicencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarLicencia.setRadius(18);
        btnBuscarLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLicenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(44, 44, 44))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(btnBuscarLicencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(95, 95, 95))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(btnRealizarTramite, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnRealizarTramite, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 810, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio1ActionPerformed
        DlgPrincipal DP = new DlgPrincipal();
        dispose();
        DP.setVisible(true);
    }//GEN-LAST:event_btnInicio1ActionPerformed

    private void btnPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonasActionPerformed


    }//GEN-LAST:event_btnPersonasActionPerformed

    private void btnPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacasActionPerformed
        DlgMenuPlacasCondicion MPC = new DlgMenuPlacasCondicion(this, false);
        dispose();
        MPC.setVisible(true);
    }//GEN-LAST:event_btnPlacasActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        DlgConsultasPersonas CP = new DlgConsultasPersonas(this, false);
        dispose();
        CP.setVisible(true);
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        DlgReportes RP = new DlgReportes(this, false);
        dispose();
        RP.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLineaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLineaActionPerformed

    private void txtLineaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLineaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLineaKeyTyped

    private void txtLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenciaActionPerformed

    private void txtLicenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLicenciaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenciaKeyTyped

    private void txtNumSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumSerieKeyTyped

    }//GEN-LAST:event_txtNumSerieKeyTyped

    private void txtNumSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumSerieActionPerformed

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorKeyTyped

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void btnRealizarTramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarTramiteActionPerformed
        if (camposVacios()){
            AutomovilDTO autoNuevo = new AutomovilDTO();
            autoNuevo.setColor(txtColor.getText());
            autoNuevo.setLinea(txtLinea.getText());
            autoNuevo.setNumero_serie(txtNumSerie.getText());
            autoNuevo.setModelo(txtModelo.getText());
            autoNuevo.setMarca(txtMarca.getText());
            
            if (personaDTO!=null){
                
                try {
                    PlacaDTO placa = tramiteBO.placaAutomovilNuevo(autoNuevo, personaDTO);
                    
                    DlgPlacaRegistrada dlgPlaca = new DlgPlacaRegistrada(placa, personaDTO, autoNuevo);
                } catch (NegocioException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage(), ex.getCause().getMessage(), JOptionPane.ERROR_MESSAGE);
                } catch (PersistenciaException ex) {
                    Logger.getLogger(DlgAutomovilNuevo.class.getName()).log(Level.SEVERE, "Error al crear el automovil y generar las placas", ex);
                }
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Seleccione una persona", "Error: No se ha seleccionado a ninguna persona", JOptionPane.WARNING_MESSAGE);
            }
            
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Favor de llenar todos los campos", "Campos vacios", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRealizarTramiteActionPerformed

    private void btnBuscarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLicenciaActionPerformed
        DlgBuscarLicencia BL = new DlgBuscarLicencia(this, true);
        BL.setVisible(true);
        this.personaDTO = BL.getPersonaDTO();
        if(personaDTO!=null){
            txtLicencia.setText(personaDTO.getRfc());
        }
        BL.dispose();
    }//GEN-LAST:event_btnBuscarLicenciaActionPerformed

    private void btnLicenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicenciasActionPerformed
       DlgRegistrarLicencia RL = new DlgRegistrarLicencia(this, true);
        dispose();
        RL.setVisible(true);
    }//GEN-LAST:event_btnLicenciasActionPerformed

    public void setPersonaDTO(PersonaDTO personaDTO) {
        this.personaDTO = personaDTO;
    }
    
    public boolean camposVacios(){
        if (txtLicencia.getText().isBlank()){
            return false;
        }else if (txtLinea.getText().isBlank()){
            return false;
        }else if (txtNumSerie.getText().isBlank()){
            return false;
        }else if (txtModelo.getText().isBlank()){
            return false;
        }else if (txtMarca.getText().isBlank()){
            return false;
        }else if (txtColor.getText().isBlank()){
            return false;
        }
        return true;
    }

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul btnBuscarLicencia;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnConsultas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnInicio1;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul btnLicencias;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnPersonas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnPlacas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul btnRealizarTramite;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnReportes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtLicencia;
    private javax.swing.JTextField txtLinea;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNumSerie;
    // End of variables declaration//GEN-END:variables
}
