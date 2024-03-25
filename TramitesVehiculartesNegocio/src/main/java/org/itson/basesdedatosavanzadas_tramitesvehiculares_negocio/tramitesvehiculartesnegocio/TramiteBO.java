package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.AutomovilDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PlacaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.Conexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.IConexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.TramitesDAO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion.Fecha;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Automovil;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Licencia;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Placa;

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

    /**
     * Método el cual regresa una licencia activa de una persona
     *
     * @param persona persona la cual se verifica si tiene una licencia activa
     * @return pbjeto de instancia Licencia-
     */
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

    /**
     * Método el cual crea un automovil
     *
     * @param automovilDTO automovil que se usará para transportar los datos
     * @return automovilDTO si este se creo de forma exitosa
     * @throws NegocioException en caso de error
     * @throws PersistenceException en caso de algún error al momento de
     * registrar el automovil
     */
    @Override
    public AutomovilDTO crearAutomovil(AutomovilDTO automovilDTO) throws NegocioException, PersistenceException {
        if (ValidacionNegocio.validacionAutomovil(automovilDTO)) {
            Automovil automovil = tramite.obtenerAutomovil(automovilDTO);

            if (automovil != null) {

                automovilDTO.setColor(automovil.getColor());
                automovilDTO.setLinea(automovil.getLinea());
                automovilDTO.setMarca(automovil.getMarca());
                automovilDTO.setNumero_serie(automovil.getNumero_serie());
                automovilDTO.setModelo(automovil.getModelo());
                return automovilDTO;

            } else {
                throw new PersistenceException("Error: Ha ocurrido un error al querer registrar al automovil");
            }
        } else {
            throw new NegocioException("Error: Verifique bein los datos proporcionados");
        }
    }

    @Override
    public PlacaDTO placaAutomovilNuevo(AutomovilDTO automovilNuevo, PersonaDTO persona) throws PersistenceException, NegocioException {

        try {
            crearAutomovil(automovilNuevo);

            Placa placa;
            String matricula = generarMatricula();
            do {
                placa = tramite.obtenerPlaca(matricula);
                if (placa != null) {
                    matricula = generarMatricula();
                }

            } while (placa != null);

            try {
                placa = tramite.crearPlacaVehiculoNuevo(persona, automovilNuevo, matricula);

                PlacaDTO placaDTO = new PlacaDTO();

                placaDTO.setCosto(placa.getCosto());
                placaDTO.setEstado(placa.getEstado());
                placaDTO.setMatricula(matricula);

                return placaDTO;
            } catch (PersistenceException e) {
                
                throw new PersistenceException (e.getMessage());
            }

        } catch (NegocioException ex) {
            Logger.getLogger(TramiteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException (ex.getMessage());  
        }
    }

    /**
     * Método que nos ayuda a generar una matricula poara placa
     *
     * @return
     */
    @Override
    public String generarMatricula() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";

        StringBuilder sbLetras = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            char letra = letras.charAt(random.nextInt(letras.length()));
            sbLetras.append(letra);
        }

        StringBuilder sbNumeros = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char numero = numeros.charAt(random.nextInt(numeros.length()));
            sbNumeros.append(numero);
        }

        return sbLetras.toString() + "-" + sbNumeros.toString();
    }

}
