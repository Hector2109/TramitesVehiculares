/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto;

import java.util.GregorianCalendar;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion.Fecha;


/**
 *
 * @author Abe
 */
public class LicenciaDTO extends TramiteDTO{
    private String numero_licencia;
    
    private Fecha vigencia;
    
    private byte estado;

    public LicenciaDTO(
            String numero_licencia, 
            Fecha vigencia, 
            byte estado,
            Float costo) {
        this.numero_licencia = numero_licencia;
        this.vigencia = vigencia;
        this.estado = estado;
        super.costo = costo;
        
    }

    /**
     * Constructor por default
     */
    public LicenciaDTO() {
    }
    
   
    
    /**
     * Regresa el valor de la licencia
     * @return valor de la licencia
     */
    public String getNumero_licencia() {
        return numero_licencia;
    }
    
    

    /**
     * Regresa el valor de la vigencia
     * @return valor de la vigencia
     */
    public Fecha getVigencia() {
        return vigencia;
    }

    /**
     * Regresa el estado 
     * @return valor del estado
     */
    public byte getEstado() {
        return estado;
    }

    /**
     * Establece el número de licencia de la persona
     * @param numero_licencia número de licencia
     */
    public void setNumero_licencia(String numero_licencia) {
        this.numero_licencia = numero_licencia;
    }

    /**
     * Establece la fecha de vigencia de la licencia
     * @param vigencia fecha de vigencia
     */
    public void setVigencia(Fecha vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Establece el estado de la licencia
     * @param estado estado
     */
    public void setEstado(byte estado) {
        this.estado = estado;
    }
    
    
    
}
