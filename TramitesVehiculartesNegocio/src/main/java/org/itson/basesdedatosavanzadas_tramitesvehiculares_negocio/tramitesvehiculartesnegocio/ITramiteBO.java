package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import java.util.List;
import javax.persistence.PersistenceException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.AutomovilDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PlacaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.TramiteDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
public interface ITramiteBO {
    
    /**
     * Método el cual crea una Licencia para una persona
     * @param rfcPersona rfc de la persona a la que se le desea realizar la rfc
     * @param anios años que se requeire la licencia
     * @return Objeto de LicenciaDTO
     */
    public LicenciaDTO generarLicencia(PersonaDTO rfcPersona, int anios)throws NegocioException;
    
    /**
     * Método que genera un número de licencia
     * @return retorna el número de licencia
     */
    public String generarNumeroLicencia();
    
    /**
     * Método el cual regresa una licencia activa de una persona
     * @param persona persona la cual se verifica si tiene una licencia 
     * activa
     * @return objeto de instancia Licencia- 
     */
    public LicenciaDTO buscarLicencia (PersonaDTO persona) throws NegocioException;
    
    /**
     * Regresa una lista de licencias que le pertenecen a una persona
     * @param persona persona a la que se le buscaran las licencias
     * @return lista de licencias
     * @throws NegocioException en caso de algun error al momento de consultar
     */
    public List<LicenciaDTO> consultarLicenciasPersona(PersonaDTO persona) throws NegocioException;
    
    /**
     * Método el cual crea un automovil
     * @param automovilDTO automovil que se  usará para transportar los datos
     * @return automovilDTO si este se creo de forma exitosa
     * @throws NegocioException en caso de error
     * @throws PersistenceException en caso de algún error al momento de registrar el automovil
     */
    public AutomovilDTO crearAutomovil (AutomovilDTO automovilDTO) throws NegocioException, PersistenciaException;
    
    /**
     * Método para consultar placas de una persona
     * @param persona persona a la que se buscarán las placas
     * @return regresa la lista de placas
     * @throws NegocioException en caso de error
     */
    public List<PlacaDTO> consultarPlacasPersona(PersonaDTO persona) throws NegocioException;
    
    
    /**
     * Método el cual crea una placa para un automovil nuevo
     * @param automovilNuevo automovil nuevo que se desea registrar
     * @return Placa del automovil  nuevo
     * @throws PersistenceException  
     */
    public PlacaDTO placaAutomovilNuevo (AutomovilDTO automovilNuevo, PersonaDTO persona) throws PersistenciaException, NegocioException;

    /**
     * Método que genera una matricula para las placas
     * @return matrioula generada
     */
    public String generarMatricula ();
    


    /**
     * Método para consultar trámites asociados a una persona
     * @param personaDTO persona de la que se desea buscar trámites
     * @return regresa las listas de trámites
     * @throws NegocioException lanza excepcion en caso de error
     */
    public List<TramiteDTO> consultarTramitesPersona(PersonaDTO personaDTO) throws NegocioException;

    public List<TramiteDTO> consultarTramiteTotal(String nombre) throws NegocioException;
  
  /**
     * Método usado para obtener el automovil por medio de una placa
     * @param placa placa del automovil
     * @return automovil encontrado
     * @throws NegocioException en caso de no encontrarlo
     */
    public AutomovilDTO obtenerAutomovilPlaca (PlacaDTO placa) throws NegocioException;
    
    /**
     * Método para verificar si una placa es activa
     * @param placa placa que se evaluara
     * @return se regresa la placa si esta activa,null en caso contrario
     * @throws NegocioException  en caso de no encontrar la placa
     */
    public PlacaDTO obtenerPlacaActiva (PlacaDTO placa) throws NegocioException;


    /**
     * Método el cual es usado para generar una placa nueva
     * para un automovil el cual ya tiene una
     * @param placa placa actual
     * @param automovil automovil al que se le quiere asignar la placa
     * @param persona persona la cual es deuaña del automovil
     * @return placa generada
     * @throws NegocioException en caso de no poder generar la placa 
     */
    public PlacaDTO crearPlacaAutoUsado (PlacaDTO placa, AutomovilDTO automovil, PersonaDTO persona) throws NegocioException;

}
