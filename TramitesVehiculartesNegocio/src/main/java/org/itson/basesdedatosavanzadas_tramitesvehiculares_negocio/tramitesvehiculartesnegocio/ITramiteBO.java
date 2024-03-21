package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
public interface ITramiteBO {
    
    public LicenciaDTO generarLicencia(PersonaDTO rfcPersona, int anios);
    
}
