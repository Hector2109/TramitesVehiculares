/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.tramitesvehiculares;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.IPersonaBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.ITramiteBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.NegocioException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.PersonaBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.TramiteBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;

/**
 *
 * @author Abe
 */
public class DlgBuscarLicencia extends javax.swing.JDialog {

    private static final Logger LOG = Logger.getLogger(DlgBuscarLicencia.class.getName());

    private final IPersonaBO personaBO;
    private final ITramiteBO tramiteBO;
    private LicenciaDTO licenciaDTO;
    DefaultTableModel modelo;

    /**
     * Creates new form DlgBuscarLicencia
     */
    public DlgBuscarLicencia(java.awt.Dialog parent, boolean modal) {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnBuscar = new org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(240, 252, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Nombre(s)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("Buscar licencia");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setText("Año nacimiento");

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setText("RFC");

        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar licencia");
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setRadius(23);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330))))
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
                .addGap(35, 35, 35)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRFCActionPerformed

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        if (txtRFC.getText().isBlank()) {
            limpiarTabla();
            consultar();
        } else {
            limpiarTabla();
            consultarSimilarRFC();

        }
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().isBlank()) {
            limpiarTabla();
            consultar();
        } else {
            limpiarTabla();
            consultarSimilar();

        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioActionPerformed

    private void txtAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyReleased
        if (txtAnio.getText().isBlank()) {
            limpiarTabla();
            consultar();
        } else {
            limpiarTabla();
            consultarAnio();

        }
    }//GEN-LAST:event_txtAnioKeyReleased

    public void limpiarTabla() {
        for (int i = 0; i < tblPersonas.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void consultar() {
        try {
            List<PersonaDTO> listaPersonas = personaBO.consultarPersonasLicenciaActiva();
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
            Logger.getLogger(DlgBuscarLicencia.class.getName()).log(Level.SEVERE, null, e);
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
    private void tblPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPersonasMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        int fila = tblPersonas.getSelectedRow();
        String rfc = tblPersonas.getValueAt(fila, 1).toString();
        PersonaDTO personaSeleccionada = null;
        try {
            personaSeleccionada = personaBO.consultarPersona(rfc);
        } catch (NegocioException ex) {
            Logger.getLogger(DlgBuscarLicencia.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (fila < 0) {

        } else {
            try {
                LicenciaDTO licencia = tramiteBO.buscarLicencia(personaSeleccionada);
                setLicenciaDTO(licencia);
                
            } catch (NegocioException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de busqueda", JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }

        }
        this.setVisible(false);
    }//GEN-LAST:event_btnBuscarActionPerformed

    public LicenciaDTO getLicenciaDTO() {
        return licenciaDTO;
    }

    public void setLicenciaDTO(LicenciaDTO licenciaDTO) {
        this.licenciaDTO = licenciaDTO;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.Elementos.BotonAzul btnBuscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}