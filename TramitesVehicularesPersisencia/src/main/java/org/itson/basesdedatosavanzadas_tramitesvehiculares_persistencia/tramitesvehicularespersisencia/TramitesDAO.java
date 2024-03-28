package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.AutomovilDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.LicenciaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion.Fecha;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PlacaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.TramiteDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Automovil;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Licencia;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Persona;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Placa;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Tramite;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Vehiculo;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
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

//    @Override
//    public Licencia buscarLicenciaActiva(PersonaDTO persona) {
//
//        EntityManager entityManager = this.conexion.crearConexion();
//        Licencia licencia;
//        String jpqlQuery = """
//                   SELECT l FROM Licencia l
//                   JOIN l.persona p
//                   WHERE p.rfc = :rfc
//                   AND l.estado = 1
//                   """;
//        TypedQuery<Licencia> query = entityManager.createQuery(jpqlQuery, Licencia.class);
//        query.setParameter("rfc", persona.getRfc());
//        try {
//            licencia = query.getSingleResult();
//        } catch (PersistenceException ex) {
//            licencia = null;
//        } finally {
//            entityManager.close();
//        }
//        return licencia;
//    }
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
            logger.log(Level.INFO, "Se consulto {0}", licencia);
        } catch (PersistenceException ex) {
            licencia = null;
        } finally {
            entityManager.close();
        }
        return licencia;
    }

    @Override
    public List<Licencia> consultarLicenciasPersona(PersonaDTO personaDTO) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();

        String jpqlQuery = """
                       SELECT l FROM Licencia l
                       JOIN l.persona p
                       WHERE p.rfc = :rfc
                       """;
        TypedQuery<Licencia> query = entityManager.createQuery(jpqlQuery, Licencia.class);
        query.setParameter("rfc", personaDTO.getRfc());

        List<Licencia> licencias;
        try {
            licencias = query.getResultList();
        } catch (NoResultException ex) {
            throw new PersistenciaException("No se encontraron licencias para la persona con RFC: " + personaDTO.getRfc(), ex);
        } finally {
            entityManager.close();
        }

        return licencias;
    }

    @Override
    public void desactivarLicencia(LicenciaDTO licencia) throws PersistenceException {
        EntityManager entityManager = this.conexion.crearConexion();
        EntityTransaction transaction = null;

        String jpqlQuery = """
                                   UPDATE Licencia l
                                   SET l.estado = 0
                                   WHERE l.numero_licencia = :numeroLicencia
                                   """;
        Query query = entityManager.createQuery(jpqlQuery);
        query.setParameter("numeroLicencia", licencia.getNumero_licencia());
        entityManager.getTransaction().begin();
        int filasActualizadas = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();

        if (filasActualizadas == 0) {
            throw new PersistenceException("No se encontraron licencias con ese número");
        }
    }

    /**
     * Método el cual es utilizado para verificar si un automovil ya no existe
     * tomando en cuenta el numero de serie del objeto AutomovilDTO
     *
     * @param automovilDTO automovil que se requere verificar que no existe
     * @return automovil encontrado
     */
    @Override
    public Automovil obtenerAutomovil(AutomovilDTO automovilDTO) {
        EntityManager entityManager = this.conexion.crearConexion();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Automovil> criteriaQuery = criteriaBuilder.createQuery(Automovil.class);
        Root<Automovil> root = criteriaQuery.from(Automovil.class);

        criteriaQuery.select(root)
                .where(criteriaBuilder.equal(root.get("numero_serie"), automovilDTO.getNumero_serie()));

        Automovil automovil = null;
        try {
            automovil = entityManager.createQuery(criteriaQuery).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
        entityManager.close();
        return automovil;
    }

    @Override
    public Placa obtenerPlaca(String matricula) {
        EntityManager entityManager = this.conexion.crearConexion();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Placa> criteriaQuery = criteriaBuilder.createQuery(Placa.class);
        Root<Placa> root = criteriaQuery.from(Placa.class);

        criteriaQuery.select(root)
                .where(criteriaBuilder.equal(root.get("matricula"), matricula));

        Placa placa = null;
        try {
            placa = entityManager.createQuery(criteriaQuery).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
        entityManager.close();
        return placa;
    }

    @Override
    public List<Placa> consultarPlacasPersona(PersonaDTO personaDTO) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();

        String jpqlQuery = """
                       SELECT p FROM Placa p
                       JOIN p.persona pe
                       WHERE pe.rfc = :rfc
                       """;
        TypedQuery<Placa> query = entityManager.createQuery(jpqlQuery, Placa.class);
        query.setParameter("rfc", personaDTO.getRfc());

        List<Placa> placas;
        try {
            placas = query.getResultList();
            logger.log(Level.INFO, "Consulta de {0} placas realizada con éxito.", placas.size());
        } catch (NoResultException ex) {
            throw new PersistenciaException("No se encontraron placas para la persona con RFC: " + personaDTO.getRfc(), ex);
        } finally {
            entityManager.close();
        }
        return placas;
    }

    @Override
    public Placa crearPlacaVehiculoNuevo(PersonaDTO persona, AutomovilDTO automovil, String matricula) throws PersistenceException {

        Placa placaNueva = new Placa();

        Persona personaE;
        try {
            personaE = personasDAO.consultarPersona(persona.getRfc());
            Vehiculo vehiculo = obtenerAutomovil(automovil);

            if (vehiculo != null) {

                placaNueva.setVehiculo(vehiculo);
                placaNueva.setEstado(Byte.valueOf("1"));
                placaNueva.setPersona(personaE);
                placaNueva.setCosto(1500F);
                placaNueva.setMatricula(matricula);
                placaNueva.setFecha_tramite(new Fecha());

                EntityManager em = conexion.crearConexion();
                em.getTransaction().begin();
                em.persist(placaNueva);
                em.getTransaction().commit();
                em.close();

            } else {
                throw new PersistenceException("Este automovil no esta registrado");
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(TramitesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return placaNueva;
    }

    @Override
    public List<Tramite> consultarTramitesPersona(PersonaDTO personaDTO) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();

        String jpqlQuery = """
                   SELECT t FROM Tramite t
                   JOIN t.persona pe
                   WHERE pe.rfc = :rfc
                   """;
        TypedQuery<Tramite> query = entityManager.createQuery(jpqlQuery, Tramite.class);
        query.setParameter("rfc", personaDTO.getRfc());

        List<Tramite> tramites;
        try {
            tramites = query.getResultList();
            logger.log(Level.INFO, "Consulta de {0} trámites realizada con éxito.", tramites.size());
        } catch (NoResultException ex) {
            throw new PersistenciaException("No se encontraron trámites para la persona con RFC: " + personaDTO.getRfc(), ex);
        } finally {
            entityManager.close();
        }
        return tramites;
    }

    @Override
    public Placa obtenerPlaca(Tramite tramite) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();

        String jpqlQuery = """
                SELECT t.placa FROM Tramite t
                WHERE t.id = :tramiteId
                """;
        TypedQuery<Placa> query = entityManager.createQuery(jpqlQuery, Placa.class);
        query.setParameter("tramiteId", tramite.getId());

        Placa placa;
        try {
            placa = query.getSingleResult();
            logger.log(Level.INFO, "Se consultó la placa con matrícula {0} realizada con éxito.", placa.getMatricula());
        } catch (NoResultException ex) {
            throw new PersistenciaException("No se encontró una placa para el trámite con ID: " + tramite.getId(), ex);
        } finally {
            entityManager.close();
        }
        return placa;
    }

    @Override
    public Licencia obtenerLicencia(Tramite tramite) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();

        String jpqlQuery = """
                SELECT t.licencia FROM Tramite t
                WHERE t.id = :tramiteId
                """;
        TypedQuery<Licencia> query = entityManager.createQuery(jpqlQuery, Licencia.class);
        query.setParameter("tramiteId", tramite.getId());

        Licencia licencia;
        try {
            licencia = query.getSingleResult();
            logger.log(Level.INFO, "Se consultó la licencia con número {0} realizada con éxito.", licencia.getNumero_licencia());
        } catch (NoResultException ex) {
            throw new PersistenciaException("No se encontró una licencia para el trámite con ID: " + tramite.getId(), ex);
        } finally {
            entityManager.close();
        }
        return licencia;
    }

    @Override
    public Automovil crearAutomovil(AutomovilDTO automovil) throws PersistenciaException {
        EntityManager em = conexion.crearConexion();

        Automovil automovilEntity = new Automovil();

        automovilEntity.setColor(automovil.getColor());
        automovilEntity.setLinea(automovil.getLinea());
        automovilEntity.setMarca(automovil.getMarca());
        automovilEntity.setModelo(automovil.getModelo());
        automovilEntity.setNumero_serie(automovil.getNumero_serie());

        em.getTransaction().begin();

        em.persist(automovilEntity);

        em.getTransaction().commit();
        em.close();
        return automovilEntity;
    }

}
