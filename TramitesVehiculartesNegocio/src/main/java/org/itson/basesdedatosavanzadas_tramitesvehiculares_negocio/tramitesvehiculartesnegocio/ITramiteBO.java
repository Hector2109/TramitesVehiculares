package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Licencia;

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
     * @return pbjeto de instancia Licencia- 
     */
    public LicenciaDTO buscarLicencia (PersonaDTO persona) throws NegocioException;
}
