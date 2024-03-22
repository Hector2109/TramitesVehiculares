/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto;

import java.util.GregorianCalendar;


/**
 *
 * @author Abe
 */
public class LicenciaDTO extends TramiteDTO{
    private String numero_licencia;
    
    private GregorianCalendar vigencia;
    
    private byte estado;

    public LicenciaDTO(String numero_licencia, GregorianCalendar vigencia, byte estado) {
        this.numero_licencia = numero_licencia;
        this.vigencia = vigencia;
        this.estado = estado;
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
    public GregorianCalendar getVigencia() {
        return vigencia;
    }

    /**
     * Regresa el estado 
     * @return valor del estado
     */
    public byte getEstado() {
        return estado;
    }
    
    
}
