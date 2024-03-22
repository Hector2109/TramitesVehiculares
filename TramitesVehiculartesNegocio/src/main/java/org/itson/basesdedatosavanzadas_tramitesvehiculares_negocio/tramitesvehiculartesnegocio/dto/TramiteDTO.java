/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto;

import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.Fecha;

/**
 *
 * @author Hector Espinoza
 */
public class TramiteDTO {

    /**
     * Representa la fecha en la que se tramitó la licencia.
     */
    private Fecha fecha_tramite;

    /**
     * Representa el costo asociado a la licencia.
     */
    private Float costo;

    /**
     * Representa los datos de la persona asociada a la licencia en formato de
     * DTO (Data Transfer Object).
     */
    private PersonaDTO personaDTO;

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

}
