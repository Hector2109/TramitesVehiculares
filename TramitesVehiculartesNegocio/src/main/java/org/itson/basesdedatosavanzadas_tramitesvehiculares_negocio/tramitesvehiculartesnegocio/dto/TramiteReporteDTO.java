/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto;

import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion.Fecha;

/**
 *
 * @author Abe
 */
public class TramiteReporteDTO{
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
    
    protected long id_persona;

    /**
     * Obtiene la fecha en la que se tramitó la licencia.
     * @return La fecha de tramitación de la licencia.
     */
    public Fecha getFecha_tramite() {
        return fecha_tramite;
    }

    /**
     * Establece la fecha en la que se tramitó la licencia.
     * @param fecha_tramite La fecha de tramitación de la licencia.
     */
    public void setFecha_tramite(Fecha fecha_tramite) {
        this.fecha_tramite = fecha_tramite;
    }

    /**
     * Obtiene el costo asociado a la licencia.
     * @return El costo de la licencia.
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Establece el costo asociado a la licencia.
     * @param costo El costo de la licencia.
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * Obtiene el DTO que representa a la persona asociada a la licencia.
     * @return El DTO que contiene los datos de la persona.
     */
    public PersonaDTO getPersonaDTO() {
        return personaDTO;
    }

    /**
     * Establece el DTO que representa a la persona asociada a la licencia.
     * @param personaDTO El DTO que contiene los datos de la persona.
     */
    public void setPersonaDTO(PersonaDTO personaDTO) {
        this.personaDTO = personaDTO;
    }

    /**
     * Obtiene el ID de la persona asociada a la licencia.
     * @return El ID de la persona.
     */
    public long getId_persona() {
        return id_persona;
    }

    /**
     * Establece el ID de la persona asociada a la licencia.
     * @param id_persona El ID de la persona.
     */
    public void setId_persona(long id_persona) {
        this.id_persona = id_persona;
    }
    
    
}
