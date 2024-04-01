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
public class PlacaDTO extends TramiteDTO{

    public PlacaDTO() {
    }

    public PlacaDTO(String matricula, Fecha fecha_recepcion, Byte estado, Fecha fecha_emision) {
        this.matricula = matricula;
        this.fecha_recepcion = fecha_recepcion;
        this.estado = estado;
        super.fecha_tramite=fecha_emision;
    }

    public PlacaDTO(String matricula) {
        this.matricula = matricula;
    }
    
    

    
    
    /**
     * Representa la matricula de la placa
     */
    private String matricula;
    
    /**
     * Representa la fecha en que se hizo una plca para un vehiculo ya usado
     */
    private Fecha fecha_recepcion;
    
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
    public Fecha getFecha_recepcion() {
        return fecha_recepcion;
    }

    /**
     * Obtiene el esatdo de la placa
     * @return esttado de la placa
     */
    public Byte getEstado() {
        return estado;
    }

    /**
     * Establece la matricula de la placa
     * @param matricula matriocula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Establece la fecha en que so modifico o se asigno una nueva
     * placa a un vehiculo usado
     * @param fecha_recepcion fecha de modificación
     */
    public void setFecha_recepcion(Fecha fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    /**
     * Establece el estado de la placa
     * @param estado estado de la placa
     */
    public void setEstado(Byte estado) {
        this.estado = estado;
    }

    /**
     * Establece la fecha en que se realizo el trámite de placa
     * @param fecha_tramite 
     */
    @Override
    public void setFecha_tramite(Fecha fecha_tramite) {
        this.fecha_tramite = fecha_tramite;
    }

    /**
     * Establece el costo del tramite
     * @param costo costo
     */
    @Override
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * Establece que persona realiza el trámite
     * @param personaDTO 
     */
    @Override
    public void setPersonaDTO(PersonaDTO personaDTO) {
        this.personaDTO = personaDTO;
    }
    
    

    
    
    
}
