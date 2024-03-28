package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.AutomovilDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PlacaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;
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

            Fecha vigencia = new Fecha(
                    String.valueOf(licencia.getVigencia().get(Calendar.YEAR)) + "-"
                    + String.valueOf(licencia.getVigencia().get(Calendar.MONTH) + 1) + "-"
                    + String.valueOf(licencia.getVigencia().get(Calendar.DAY_OF_MONTH)));
            LicenciaDTO licenciaDTO2 = new LicenciaDTO(
                    licencia.getNumero_licencia(),
                    vigencia,
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
            Fecha vigencia = new Fecha(
                    String.valueOf(licencia.getVigencia().get(Calendar.YEAR)) + "-"
                    + String.valueOf(licencia.getVigencia().get(Calendar.MONTH) + 1) + "-"
                    + String.valueOf(licencia.getVigencia().get(Calendar.DAY_OF_MONTH)));
            LicenciaDTO licenciaDTO = new LicenciaDTO(
                    licencia.getNumero_licencia(),
                    vigencia,
                    licencia.getEstado(),
                    licencia.getCosto()
            );
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
    public AutomovilDTO crearAutomovil(AutomovilDTO automovilDTO) throws NegocioException, PersistenciaException {
        //if (ValidacionNegocio.validacionAutomovil(automovilDTO)) {
        Automovil automovil = tramite.obtenerAutomovil(automovilDTO);

        if (automovil == null) {
            automovil = tramite.crearAutomovil(automovilDTO);
            automovilDTO.setColor(automovil.getColor());
            automovilDTO.setLinea(automovil.getLinea());
            automovilDTO.setMarca(automovil.getMarca());
            automovilDTO.setNumero_serie(automovil.getNumero_serie());
            automovilDTO.setModelo(automovil.getModelo());
            return automovilDTO;

        } else {
            throw new PersistenciaException("Error: Ha ocurrido un error al querer registrar al automovil");

        }
        // } else {
        //  throw new NegocioException("Error: Verifique bein los datos proporcionados");
        //}
    }

    @Override
    public PlacaDTO placaAutomovilNuevo(AutomovilDTO automovilNuevo, PersonaDTO persona) throws PersistenciaException, NegocioException {

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

            placa = tramite.crearPlacaVehiculoNuevo(persona, automovilNuevo, matricula);

            PlacaDTO placaDTO = new PlacaDTO();

            placaDTO.setCosto(placa.getCosto());
            placaDTO.setEstado(placa.getEstado());
            placaDTO.setMatricula(matricula);

            return placaDTO;

        } catch (NegocioException ex) {
            Logger.getLogger(TramiteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException(ex.getMessage());
        }
    }

    /**
     * Método que nos ayuda a generar una matricula poara placa
     *
     * @return matricula que se genero
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

    /**
     * Regresa una lista de licencias que le pertenecen a una persona
     *
     * @param persona persona a la que se le buscaran las licencias
     * @return lista de licencias
     * @throws NegocioException en caso de algun error al momento de consultar
     */
    @Override
    public List<LicenciaDTO> consultarLicenciasPersona(PersonaDTO persona) throws NegocioException {
        List<LicenciaDTO> licenciasDTO;
        licenciasDTO = new ArrayList<>();
        try {
            List<Licencia> licencias = tramite.consultarLicenciasPersona(persona);

            for (Licencia licencia : licencias) {
                Fecha vigencia = new Fecha(
                        String.valueOf(licencia.getVigencia().get(Calendar.YEAR)) + "-"
                        + String.valueOf(licencia.getVigencia().get(Calendar.MONTH) + 1) + "-"
                        + String.valueOf(licencia.getVigencia().get(Calendar.DAY_OF_MONTH)));
                licenciasDTO.add(new LicenciaDTO(
                        licencia.getNumero_licencia(),
                        vigencia,
                        licencia.getEstado(),
                        licencia.getCosto()));
            }

        } catch (PersistenciaException ex) {
            Logger.getLogger(TramiteBO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return licenciasDTO;
    }

    /**
     * Método para consultar placas de una persona
     *
     * @param persona persona a la que se buscarán las placas
     * @return regresa la lista de placas
     * @throws NegocioException en caso de error
     */
    @Override
    public List<PlacaDTO> consultarPlacasPersona(PersonaDTO persona) throws NegocioException {
        List<PlacaDTO> placasDTO;
        placasDTO = new ArrayList<>();
        try {
            List<Placa> placas = tramite.consultarPlacasPersona(persona);

            for (Placa placa : placas) {
                Fecha emision = new Fecha(
                        String.valueOf(placa.getFecha_tramite().get(Calendar.YEAR)) + "-"
                        + String.valueOf(placa.getFecha_tramite().get(Calendar.MONTH) + 1) + "-"
                        + String.valueOf(placa.getFecha_tramite().get(Calendar.DAY_OF_MONTH)));
                Fecha recepcion = new Fecha(
                        String.valueOf(placa.getFecha_recepcion().get(Calendar.YEAR)) + "-"
                        + String.valueOf(placa.getFecha_recepcion().get(Calendar.MONTH) + 1) + "-"
                        + String.valueOf(placa.getFecha_recepcion().get(Calendar.DAY_OF_MONTH)));

                placasDTO.add(new PlacaDTO(
                        placa.getMatricula(),
                        recepcion,
                        placa.getEstado(),
                        emision));
            }

        } catch (PersistenciaException ex) {
            Logger.getLogger(TramiteBO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return placasDTO;
    }

     /**
     * Método usado para obtener el automovil por medio de una placa
     * @param placa placa del automovil
     * @return automovil encontrado
     * @throws NegocioException en caso de no encontrarlo
     */
    @Override
    public AutomovilDTO obtenerAutomovilPlaca(PlacaDTO placa) throws NegocioException {

        try {
            Automovil automovil = tramite.obtenerAutomovilPlaca(placa);

            AutomovilDTO automovilDTO = new AutomovilDTO();

            automovilDTO.setColor(automovil.getColor());
            automovilDTO.setLinea(automovil.getLinea());
            automovilDTO.setMarca(automovil.getMarca());
            automovilDTO.setModelo(automovil.getModelo());
            automovilDTO.setNumero_serie(automovil.getNumero_serie());

            return automovilDTO;

        } catch (PersistenciaException ex) {
            Logger.getLogger(TramiteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException("No se encontro ningún automovil con esas placas");
        }

    }

    /**
     * Método para verificar si una placa es activa
     * @param placa placa que se evaluara
     * @return se regresa la placa si esta activa,null en caso contrario
     * @throws NegocioException  en caso de no encontrar la placa
     */
    @Override
    public PlacaDTO obtenerPlacaActiva(PlacaDTO placaDTO) throws NegocioException {
        try {
            Placa placa = tramite.obtenerPlacaActiva(placaDTO);

            if (placa != null) {

                placaDTO.setMatricula(placa.getMatricula());
                placaDTO.setEstado(placa.getEstado());
            } else {
                throw new NegocioException ("La placa no esta activa");
            }
            return placaDTO;
        } catch (PersistenciaException ex) {
            Logger.getLogger(TramiteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException("No se encontro ninguna placa activa");
        }
    }

    /**
     * Método el cual es usado para generar una placa nueva
     * para un automovil el cual ya tiene una
     * @param placa placa actual
     * @param automovil automovil al que se le quiere asignar la placa
     * @param persona persona la cual es deuaña del automovil
     * @return placa generada
     * @throws NegocioException en caso de no poder generar la placa 
     */
    @Override
    public PlacaDTO crearPlacaAutoUsado(PlacaDTO placaDTO, AutomovilDTO automovil, PersonaDTO persona) throws NegocioException {
        
        Placa placaEntity;
            String matricula = generarMatricula();
            do {
                placaEntity = tramite.obtenerPlaca(matricula);
                if (placaEntity != null) {
                    matricula = generarMatricula();
                }

            } while (placaEntity != null);
        
        try {
            placaEntity = tramite.placasAutomovilUsado(placaDTO, automovil, persona, matricula);
            
            placaDTO.setCosto(placaEntity.getCosto());
            placaDTO.setEstado(placaEntity.getEstado());
            placaDTO.setMatricula(matricula);
            placaDTO.setFecha_recepcion((Fecha) placaEntity.getFecha_recepcion());
            placaDTO.setFecha_tramite((Fecha) placaEntity.getFecha_tramite());
            return placaDTO;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException ("Ha ocurrido un error al querer generar una nueva placa");
        }
        
    }
    


}
