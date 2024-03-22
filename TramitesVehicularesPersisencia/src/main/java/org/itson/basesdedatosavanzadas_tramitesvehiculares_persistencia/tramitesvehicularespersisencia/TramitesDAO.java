package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion.Fecha;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Licencia;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Persona;

/**
 *
 * @author Abe
 */
public class TramitesDAO implements ITramitesDAO {

    private IConexion conexion;
    private PersonasDAO personasDAO;
    static final Logger logger = Logger.getLogger(PersonasDAO.class.getName());

    /**
     * Construuctor que recibe un objeto d conexión para lograr acceder a la BD
     *
     * @param conexion conexión
     */
    public TramitesDAO(IConexion conexion) {
        this.conexion = conexion;
        personasDAO = new PersonasDAO(this.conexion);
    }

    /**
     * Metodo para realizar tramite de licencia
     *
     * @param personaDTO objeto de PersonaDTO
     * @param anios años que se desea la licencia
     * @return Licencia generada
     * @throws PersistenceException en caso de no poder persistir la licencia
     */
    @Override
    public Licencia realizarTramiteLicencia(PersonaDTO personaDTO, int anios, String numeroLicencia) throws PersistenceException {

        Persona persona = new Persona();
        try {
            persona = personasDAO.consultarPersona(personaDTO.getRfc());

            Licencia licencia = new Licencia();
            licencia.setPersona(persona);
            Fecha fechaTramite = new Fecha();
            licencia.setFecha_tramite(fechaTramite);
            Fecha fecha_vigencia = new Fecha();
            fecha_vigencia.add(Calendar.YEAR, anios);
            licencia.setNumero_licencia(numeroLicencia);
            licencia.setEstado(Byte.valueOf("1"));

            if (anios == 1) {

                licencia.setVigencia(fecha_vigencia);
                if (persona.getDiscapacidad().equals("DISCAPACITADO")) {
                    licencia.setCosto(200.0F);
                } else {
                    licencia.setCosto(600.0F);
                }

            } else if (anios == 2) {

                licencia.setPersona(persona);
                licencia.setVigencia(fecha_vigencia);
                if (persona.getDiscapacidad().equals("DISCAPACITADO")) {
                    licencia.setCosto(500.0F);
                } else {
                    licencia.setCosto(900.0F);
                }

            } else if (anios == 3) {

                licencia.setPersona(persona);
                licencia.setVigencia(fecha_vigencia);
                if (persona.getDiscapacidad().equals("DISCAPACITADO")) {
                    licencia.setCosto(700.0F);
                } else {
                    licencia.setCosto(1100.0F);
                }
            }

            EntityManager em = conexion.crearConexion();
            em.getTransaction().begin();
            em.persist(licencia);
            em.getTransaction().commit();
            em.close();

            return licencia;

        } catch (PersistenciaException ex) {
            Logger.getLogger(TramitesDAO.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            throw new PersistenceException("No se ha podido realizar el registro de licencia");
        }

    }

    /**
     * Método para buscar si una licenciaxiste a través de su número
     *
     * @param numeroLicencia número de licencia
     * @return La licencia si encuentra
     */
    @Override
    public Licencia buscarLicenciaNumero(String numeroLicencia) {

        EntityManager entityManager = this.conexion.crearConexion();

        Licencia licencia;

        String jpqlQuery = """
                           SELECT l FROM Licencia l
                           WHERE l.numero_licencia = :numero_licencia
                           """;
        TypedQuery<Licencia> query = entityManager.createQuery(jpqlQuery, Licencia.class);
        query.setParameter("numero_licencia", numeroLicencia);
        try {
            licencia = query.getSingleResult();
            entityManager.close();
        } catch (PersistenceException ex) {
            return null;
        }

        return licencia;
    }

    @Override
    public Licencia buscarLicenciaActiva(PersonaDTO persona) {

        EntityManager entityManager = this.conexion.crearConexion();
        Licencia licencia;
        String jpqlQuery = """
                   SELECT l FROM Licencia l
                   JOIN l.persona p
                   WHERE p.rfc = :rfc
                   AND l.estado = 1
                   """;
        TypedQuery<Licencia> query = entityManager.createQuery(jpqlQuery, Licencia.class);
        query.setParameter("rfc", persona.getRfc());
        try {
            licencia = query.getSingleResult();
        } catch (PersistenceException ex) {
            licencia = null;
        } finally {
            entityManager.close();
        }
        return licencia;
    }
}
