package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;

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
    public LicenciaDTO generarLicencia(PersonaDTO rfcPersona, int anios) throws NegocioException;
    
}
