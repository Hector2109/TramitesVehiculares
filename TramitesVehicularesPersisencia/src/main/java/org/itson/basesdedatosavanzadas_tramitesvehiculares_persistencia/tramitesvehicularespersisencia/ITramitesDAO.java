/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import javax.persistence.PersistenceException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.AutomovilDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PlacaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Automovil;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Licencia;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Placa;

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
    
    
    /**
     * Método usado para desactivar una licencia
     * @param licenciaDTO Licencia que se desea desactiar
     * @return Licencia desactivada
     * @throws PersistenceException en caso de no encontrar la iicencia
     */
    public void desactivarLicencia(LicenciaDTO licenciaDTO) throws PersistenceException;
    
    /**
     * Método el cual es utilizado para verificar si un automovil ya no existe 
     * tomando en cuenta el numero de serie del objeto AutomovilDTO
     * @param automovilDTO automovil que se requere verificar que no existe
     * @return automovil encontrado
     */
    public Automovil obtenerAutomovil (AutomovilDTO automovilDTO);
    
    /**
     * Método el cual verifica la existencia de plcas
     * en base a su matricula
     * @param matricula matricula que se busca
     * @return Placa que contiene la matricula
     */
    public Placa obtenerPlaca(String matricula);
    
    
    public Placa crearPlacaVehiculoNuevo (PlacaDTO placa, PersonaDTO persona, AutomovilDTO automovil, String matricula) throws PersistenceException;
}
