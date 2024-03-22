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
    
    /**
     * Constructor que instancia un objeto de tipo TramiteBO
     */
    public TramiteBO() {
        IConexion conexion = new Conexion();
          tramite= new TramitesDAO(conexion);
    }
    
    /**
     * Método el cual crea una Licencia para una persona
     * @param rfcPersona rfc de la persona a la que se le desea realizar la rfc
     * @param anios años que se requeire la licencia
     * @return Objeto de LicenciaDTO
     */
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
