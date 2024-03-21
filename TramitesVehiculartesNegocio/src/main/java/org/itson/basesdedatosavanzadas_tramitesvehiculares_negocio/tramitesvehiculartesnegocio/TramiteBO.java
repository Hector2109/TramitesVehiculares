package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.Conexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.IConexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.TramitesDAO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Licencia;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
public class TramiteBO implements ITramiteBO{
    private TramitesDAO tramite;
    
    public TramiteBO() {
        IConexion conexion = new Conexion();
          tramite= new TramitesDAO(conexion);
    }
    
    @Override
    public LicenciaDTO generarLicencia(PersonaDTO persona, int anios) {
         Licencia licencia = tramite.realizarTramiteLicencia(persona, anios);
         
         LicenciaDTO licenciaDTO = new LicenciaDTO(
                 licencia.getNumero_licencia(), 
                 licencia.getVigencia(), 
                 licencia.getEstado());
         return licenciaDTO;
    }

    
    
}
