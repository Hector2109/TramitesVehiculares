/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;


import javax.persistence.PersistenceException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Licencia;

/**
 *
 * @author Abe
 */
public interface ITramitesDAO {
    /**
     * Metodo para realizar tramite de licencia
     * @param personaDTO
     * @param anios
     * @return
     * @throws PersistenceException 
     */
    public Licencia realizarTramiteLicencia(PersonaDTO personaDTO, int anios) throws PersistenceException;
    

    
}
