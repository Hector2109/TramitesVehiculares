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

    public Fecha getFecha_tramite() {
        return fecha_tramite;
    }

    public void setFecha_tramite(Fecha fecha_tramite) {
        this.fecha_tramite = fecha_tramite;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public PersonaDTO getPersonaDTO() {
        return personaDTO;
    }

    public void setPersonaDTO(PersonaDTO personaDTO) {
        this.personaDTO = personaDTO;
    }

    public long getId_persona() {
        return id_persona;
    }

    public void setId_persona(long id_persona) {
        this.id_persona = id_persona;
    }
    
    
}
