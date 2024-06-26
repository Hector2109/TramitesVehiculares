/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import java.util.List;
import javax.persistence.PersistenceException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.NegocioException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.AutomovilDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.TramiteDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PlacaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Automovil;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Licencia;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Placa;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Tramite;

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
     * @return licencia encontrada
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
     * Regresa una lista de licencias que le pertenecen a una persona
     * @param persona persona a la que se le buscaran las licencias
     * @return lista de licencias
     * @throws NegocioException en caso de algun error al momento de consultar
     */
    public List<Licencia> consultarLicenciasPersona(PersonaDTO personaDTO) throws PersistenciaException;
    
    /**
     * Método el cual es utilizado para verificar si un automovil ya no existe 
     * tomando en cuenta el numero de serie del objeto AutomovilDTO
     * @param automovilDTO automovil que se requere verificar que no existe
     * @return automovil encontrado
     */
    public Automovil obtenerAutomovil (AutomovilDTO automovilDTO);
    
    /**
     * Permite consultar una lista de placas que le pertenecen a una persona
     * @param personaDTO persona que se desea buscar
     * @return regresa la lista de las personas que tienen esa placa
     * @throws PersistenciaException en caso de error lanza una exception
     */
    public List<Placa> consultarPlacasPersona(PersonaDTO personaDTO) throws PersistenciaException;
    
    /**
     * Método el cual verifica la existencia de plcas
     * en base a su matricula
     * @param matricula matricula que se busca
     * @return Placa que contiene la matricula
     */
    public Placa obtenerPlaca(String matricula);
    
    /**
     * Método para crear la placa de un vehiculo nuevo
     * @param persona persona la cual realiza el tramite de placa
     * @param automovil automovil que se desea registrar
     * @param matricula matricula d la placa
     * @return Placa del nuevo vehiculo
     * @throws PersistenceException 
     */
    public Placa crearPlacaVehiculoNuevo (PersonaDTO persona, AutomovilDTO automovil, String matricula) throws PersistenciaException;
    
    
    /**
     * Método el cuál crea un automovil 
     * @param automovil Automovil que se desea crear
     * @return Automovil creado
     * @throws PersistenciaException 
     */
    public Automovil crearAutomovil (AutomovilDTO automovil) throws PersistenciaException;
    
    /**
     * Consulta los trámites de una persona
     * @param personaDTO persona para buscar los trámites
     * @return regresa la lista de tramties asociados a una persona
     * @throws PersistenciaException  lanza una excepcion en caso de error
     */
    public List<Tramite> consultarTramitesPersona(PersonaDTO personaDTO) throws PersistenciaException;
    
    /**
     * Consulta todos los trámites realizados
     * @return regresa la lista de todos los trámites realizados
     * @throws PersistenceException 
     */
    public List<Tramite> consultarTramitesTotales(String nombre)throws PersistenciaException;
    
    /**
     * Método para obtener la placa a través de un trámite
     * @param tramite trámite de la placa
     * @return placa obtenida
     * @throws PersistenciaException 
     */
    public Placa obtenerPlaca(Tramite tramite) throws PersistenciaException;
    
    /**
     * Método que se usa para obtener una licencia de un trámite
     * @param tramite trámite de la licencia
     * @return licencia encontrada
     * @throws PersistenciaException 
     */
     public Licencia obtenerLicencia(Tramite tramite) throws PersistenciaException;
     /**   
     * Obtiene un automovil basandose en la placa 
     * @param placa placa del automovila buscar
     * @return automovil encontrado
     * @throws PersistenciaException en caso de no encontrar ningún automovil 
     */
    public Automovil obtenerAutomovilPlaca (PlacaDTO placa) throws PersistenciaException;
    
    /**
     * Verifica que una placa este activa
     * @param placa que se desea saber si esta ativa
     * @return placa encontrada
     * @throws PersistenciaException en caso de no encontrar ninguna placa 
     */
    public Placa obtenerPlacaActiva(PlacaDTO placa) throws PersistenciaException;
    
    /**
     * Crea una placa para un automovil usado
     * @param placa la placa actual
     * @param automovil automovil que pertenecerá a la placa 
     * @param persona persona dueña dueña del automovil
     * @param matricula matricula de la nueva placa
     * @return Placa nueva generada
     * @throws PersistenciaException en caso de algún error 
     */
    public Placa placasAutomovilUsado (PlacaDTO placa, AutomovilDTO automovil, PersonaDTO persona, String matricula) throws PersistenciaException;
    
    /**
     * Método que sirve para desactivar las placas de un automovil
     * @param placa placa que se desea desactivar
     * @throws PersistenciaException en caso de no encontrar la placa
     */
    public void desactivarPlaca(PlacaDTO placa) throws PersistenciaException;
    
    /**
     * Método el cuál desactiva las licencias
     * que no se encuentrn vigentes según su la fecha actual
     * @throws PersistenciaException en caso de no encontrar licencias
     */
    public void desactivarLicenciaFechaActual() throws PersistenciaException;
}
