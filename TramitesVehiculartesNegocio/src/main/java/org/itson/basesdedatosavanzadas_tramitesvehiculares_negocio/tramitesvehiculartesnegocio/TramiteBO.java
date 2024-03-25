package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import java.util.Random;
import javax.persistence.PersistenceException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.Conexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.IConexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.TramitesDAO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion.Fecha;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Licencia;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
public class TramiteBO implements ITramiteBO {

    private TramitesDAO tramite;

    /**
     * Constructor que instancia un objeto de tipo TramiteBO
     */
    public TramiteBO() {
        IConexion conexion = new Conexion();
        tramite = new TramitesDAO(conexion);
    }

    /**
     * Método el cual crea una Licencia para una persona
     *
     * @param rfcPersona rfc de la persona a la que se le desea realizar la rfc
     * @param anios años que se requeire la licencia
     * @return Objeto de LicenciaDTO
     */
    @Override
    public LicenciaDTO generarLicencia(PersonaDTO persona, int anios) throws NegocioException {
        Fecha fechaActual = new Fecha();
        if (fechaActual.calcularDiferenciaAnios((Fecha) persona.getFecha_nacimiento()) >= 18) {

            LicenciaDTO licenciaDTO1 = buscarLicencia(persona);
            
            if (licenciaDTO1 != null) {
                tramite.desactivarLicencia(licenciaDTO1);
            }
            Licencia licencia;
            String numeroLicencia = generarNumeroLicencia();
            do {
                licencia = tramite.buscarLicenciaNumero(numeroLicencia);
                if (licencia != null) {
                    numeroLicencia = generarNumeroLicencia();
                }

            } while (licencia != null);

            licencia = tramite.realizarTramiteLicencia(persona, anios, numeroLicencia);

            LicenciaDTO licenciaDTO2 = new LicenciaDTO(
                    licencia.getNumero_licencia(),
                    licencia.getVigencia(),
                    licencia.getEstado(),
                    licencia.getCosto());
            return licenciaDTO2;

        } else {
            throw new NegocioException("ERROR: La persona seleccionada no es mayor de edad");
        }
    }

    /**
     * Método que genera un número de licencia
     *
     * @return retorna el número de licencia
     */
    @Override
    public String generarNumeroLicencia() {
        Random random = new Random();
        StringBuilder numeroLicencia = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            int digito = random.nextInt(10);
            numeroLicencia.append(digito);
        }

        return numeroLicencia.toString();
    }

    @Override
    public LicenciaDTO buscarLicencia(PersonaDTO persona) throws NegocioException {

        Licencia licencia = null;
        licencia = tramite.buscarLicenciaActiva(persona);
        if (licencia != null) {
            LicenciaDTO licenciaDTO = new LicenciaDTO(
                    licencia.getNumero_licencia(),
                    licencia.getVigencia(),
                    licencia.getEstado(),
                    licencia.getCosto());
            return licenciaDTO;
            
        } else {
            return null;
        }
        
    }

}
