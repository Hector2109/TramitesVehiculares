/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.tramitesvehiculares;

/**
 *
 * @author Abe
 */
public class DlgMenuPlacasCondicion extends javax.swing.JDialog {

    /**
     * Creates new form DlgVacio
     */
    public DlgMenuPlacasCondicion(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
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
        btnConsultas = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        btnReportes = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        jLabel9 = new javax.swing.JLabel();
        btnPlacas = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul();
        btnLicencias = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonIcono1 = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonIcono();
        btnAutoNuevo = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonIcono();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(130, 206, 238));

        btnInicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio.png"))); // NOI18N
        btnInicio1.setText("  Inicio       ");
        btnInicio1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInicio1.setRadius(23);
        btnInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio1ActionPerformed(evt);
            }
        });

        btnPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personas.png"))); // NOI18N
        btnPersonas.setText(" Personas");
        btnPersonas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPersonas.setRadius(23);
        btnPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonasActionPerformed(evt);
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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        btnPlacas.setForeground(new java.awt.Color(255, 255, 255));
        btnPlacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Placas_Seleccionado.png"))); // NOI18N
        btnPlacas.setText("  Placas   ");
        btnPlacas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPlacas.setRadius(23);

        btnLicencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Licencias.png"))); // NOI18N
        btnLicencias.setText("  Licencias");
        btnLicencias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLicencias.setRadius(23);
        btnLicencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLicencias, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(btnInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addGap(74, 74, 74)
                .addComponent(btnInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnLicencias, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 650));

        jPanel2.setBackground(new java.awt.Color(240, 252, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 106, -1, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("Seleccione según corresponda");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 49, -1, 70));

        botonIcono1.setBackground(new java.awt.Color(162, 233, 255));
        botonIcono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AutoAntiguo.png"))); // NOI18N
        botonIcono1.setText("Modificar placas");
        botonIcono1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        botonIcono1.setRadius(50);
        botonIcono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIcono1ActionPerformed(evt);
            }
        });
        jPanel2.add(botonIcono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 158, 315, 354));

        btnAutoNuevo.setBackground(new java.awt.Color(162, 233, 255));
        btnAutoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AutoNuevo.png"))); // NOI18N
        btnAutoNuevo.setText("Registrar Automóvil");
        btnAutoNuevo.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnAutoNuevo.setRadius(50);
        btnAutoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAutoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 315, 354));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 810, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicio1ActionPerformed

    private void btnPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonasActionPerformed


    }//GEN-LAST:event_btnPersonasActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void botonIcono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIcono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIcono1ActionPerformed

    private void btnAutoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoNuevoActionPerformed
        DlgAutomovilNuevo AN = new DlgAutomovilNuevo(this, false);
        this.dispose();
        AN.setVisible(true);
    }//GEN-LAST:event_btnAutoNuevoActionPerformed

    private void btnLicenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLicenciasActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonIcono botonIcono1;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonIcono btnAutoNuevo;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnConsultas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnInicio1;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnLicencias;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnPersonas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul btnPlacas;
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonBlanco btnReportes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
