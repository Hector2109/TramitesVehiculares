/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto;

import java.util.Date;

/**
 *
 * @author Hector Espinoza
 */
public class TramiteDTO {
    
    private Date fecha_tramite;

    private Float costo; 
    
    private PersonaDTO personaDTO;

    public Date getFecha_tramite() {
        return fecha_tramite;
    }

    public Float getCosto() {
        return costo;
    }

    public PersonaDTO getPersonaDTO() {
        return personaDTO;
    }
    
}
