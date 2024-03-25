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
public class PlacaDTO extends TramiteDTO{
    
    /**
     * Representa la matricula de la placa
     */
    private String matricula;
    
    /**
     * Representa la fecha en que se hizo una plca para un vehiculo ya usado
     */
    private GregorianCalendar fecha_recepcion;
    
    /**
     * Representa el estado de la placa
     */
    private Byte estado;

    /**
     * Se obtiene la matricula de la placa
     * @return matricula de placa
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Obtiene la fecha en que se solicito la placa
     * para un auto usado
     * @return fecha de solicitud de placa
     */
    public GregorianCalendar getFecha_recepcion() {
        return fecha_recepcion;
    }

    /**
     * Obtiene el esatdo de la placa
     * @return esttado de la placa
     */
    public Byte getEstado() {
        return estado;
    }

    
    
    
}
