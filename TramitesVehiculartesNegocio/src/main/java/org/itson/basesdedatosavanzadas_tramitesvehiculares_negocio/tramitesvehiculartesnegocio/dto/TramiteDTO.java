/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto;

import java.util.GregorianCalendar;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion.Fecha;


/**
 *
 * @author Hector Espinoza
 */
public class TramiteDTO {

    protected Long id_tramite;
    /**
     * Representa la fecha en la que se tramitó la licencia.
     */
    protected Fecha fecha_tramite;

    /**
     * Representa el costo asociado a la licencia.
     */
    protected Float costo;

    /**
     * Representa los datos de la persona asociada a la licencia en formato de
     * DTO (Data Transfer Object).
     */
    protected PersonaDTO personaDTO;

    public TramiteDTO() {
    }

    public TramiteDTO(Fecha fecha_tramite, Float costo, PersonaDTO personaDTO) {
        this.fecha_tramite = fecha_tramite;
        this.costo = costo;
        this.personaDTO = personaDTO;
    }

    public TramiteDTO(Long id_tramite, Fecha fecha_tramite, Float costo, PersonaDTO personaDTO) {
        this.id_tramite = id_tramite;
        this.fecha_tramite = fecha_tramite;
        this.costo = costo;
        this.personaDTO = personaDTO;
    }
    
    

    /**
     * Obtiene la fecha en la que se tramitó la licencia.
     *
     * @return La fecha en la que se tramitó la licencia.
     */
    public Fecha getFecha_tramite() {
        return fecha_tramite;
    }

    /**
     * Obtiene el costo asociado a la licencia.
     *
     * @return El costo asociado a la licencia.
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Obtiene los datos de la persona asociada a la licencia en formato de DTO
     * (Data Transfer Object).
     *
     * @return Los datos de la persona asociada a la licencia en formato de DTO.
     */
    public PersonaDTO getPersonaDTO() {
        return personaDTO;
    }

    
    public Long getId_tramite() {
        return id_tramite;
    }

    public void setId_tramite(Long id_tramite) {
        this.id_tramite = id_tramite;
    }

    public void setFecha_tramite(Fecha fecha_tramite) {
        this.fecha_tramite = fecha_tramite;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public void setPersonaDTO(PersonaDTO personaDTO) {
        this.personaDTO = personaDTO;
    }
    
    

}
