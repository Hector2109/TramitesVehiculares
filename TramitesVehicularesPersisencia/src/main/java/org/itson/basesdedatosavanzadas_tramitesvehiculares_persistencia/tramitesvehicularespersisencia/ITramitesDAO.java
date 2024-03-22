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
     *
     * @param personaDTO objeto de PersonaDTO
     * @param anios años que se desea la licencia
     * @return Licencia generada
     * @throws PersistenceException en caso de no poder persistir la licencia
     */
    public Licencia realizarTramiteLicencia(PersonaDTO personaDTO, int anios, String numeroLicencia) throws PersistenceException;

    /**
     * Método para buscar si una licenciaxiste a través de su número
     * @param numeroLicencia número de licencia
     * @return La licencia si encuentra
     */
    public Licencia buscarLicenciaNumero (String numeroLicencia)throws PersistenceException;
    
    /**
     * Método que busca una licencia activa consultando los datos de una persona DTO
     * @param persona persona DTO
     * @return 
     */
    public Licencia buscarLicenciaActiva (PersonaDTO persona);
}
