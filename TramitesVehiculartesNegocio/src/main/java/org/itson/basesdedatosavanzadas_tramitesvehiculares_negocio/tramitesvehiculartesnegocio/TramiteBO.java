package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.Conexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.IConexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.TramitesDAO;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
public class TramiteBO implements ITramiteBO{

    public TramiteBO() {
        IConexion conexion = new Conexion();
        TramitesDAO  tramite= new TramitesDAO(conexion);
    }
    
    @Override
    public LicenciaDTO generarLicencia(PersonaDTO persona, int anios) {
        
        
        return null;
        
        
        
    }

    
    
}
