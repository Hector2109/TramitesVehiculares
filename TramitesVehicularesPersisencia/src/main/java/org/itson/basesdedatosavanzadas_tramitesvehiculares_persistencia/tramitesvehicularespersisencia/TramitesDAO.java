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

    /**
     * Método que busca una licencia activa consultando los datos de una persona
     * DTO
     *
     * @param persona persona DTO
     * @return Licencia encontrada
     */
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

    /**
     * Regresa una lista de licencias que le pertenecen a una persona
     *
     * @param persona persona a la que se le buscaran las licencias
     * @return lista de licencias
     * @throws NegocioException en caso de algun error al momento de consultar
     */
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

    /**
     * Método usado para desactivar una licencia
     * @param licenciaDTO Licencia que se desea desactiar
     * @return Licencia desactivada
     * @throws PersistenceException en caso de no encontrar la iicencia
     */
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

    /**
     * Método el cual verifica la existencia de plcas
     * en base a su matricula
     * @param matricula matricula que se busca
     * @return Placa que contiene la matricula
     */
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

    /**
     * Método para crear la placa de un vehiculo nuevo
     * @param persona persona la cual realiza el tramite de placa
     * @param automovil automovil que se desea registrar
     * @param matricula matricula d la placa
     * @return Placa del nuevo vehiculo
     * @throws PersistenceException 
     */
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

    /**
     * Consulta los trámites de una persona
     * @param personaDTO persona para buscar los trámites
     * @return regresa la lista de tramties asociados a una persona
     * @throws PersistenciaException  lanza una excepcion en caso de error
     */
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

    /**
     * Método para obtener la placa a través de un trámite
     * @param tramite trámite de la placa
     * @return placa obtenida
     * @throws PersistenciaException 
     */
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

    /**
     * Método que se usa para obtener una licencia de un trámite
     * @param tramite trámite de la licencia
     * @return licencia encontrada
     * @throws PersistenciaException 
     */
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

    /**
     * Método el cuál crea un automovil 
     * @param automovilDTO Automovil que se desea crear
     * @return Automovil creado
     * @throws PersistenciaException 
     */
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

    /**   
     * Obtiene un automovil basandose en la placa 
     * @param placa placa del automovila buscar
     * @return automovil encontrado
     * @throws PersistenciaException en caso de no encontrar ningún automovil 
     */
    @Override
    public Automovil obtenerAutomovilPlaca(PlacaDTO placa) throws PersistenciaException {
        EntityManager em = conexion.crearConexion();

        Automovil automovil;

        String jpqlQuery = """
                       SELECT a 
                           FROM Automovil a 
                           JOIN a.placas p 
                           WHERE p.matricula = :matricula
                       """;
        TypedQuery<Automovil> query = em.createQuery(jpqlQuery, Automovil.class);
        query.setParameter("matricula", placa.getMatricula());

        try {
            automovil = query.getSingleResult();
            logger.log(Level.INFO, "Consulta de 1 automovil realizada con éxito.");
        } catch (NoResultException ex) {
            throw new PersistenciaException("No se encontraron automoviles con la placa: " + placa.getMatricula(), ex);
        } finally {
            em.close();
        }
        return automovil;

    }

    /**
     * Verifica que una placa este activa
     * @param placa que se desea saber si esta ativa
     * @return placa encontrada
     * @throws PersistenciaException en caso de no encontrar ninguna placa 
     */
    @Override
    public Placa obtenerPlacaActiva(PlacaDTO placaDTO) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();
        String jpqlQuery = """
                   SELECT p
                   FROM Placa p
                   WHERE p.estado = 1
                   AND p.matricula = :matricula
                   """;
        Placa placa;

        TypedQuery<Placa> query = entityManager.createQuery(jpqlQuery, Placa.class);
        query.setParameter("matricula", placaDTO.getMatricula());
        try {
            placa = query.getSingleResult();
            logger.log(Level.INFO, "Se consulto {0}", placa);
        } catch (PersistenceException ex) {
            placa = null;
        } finally {
            entityManager.close();
        }
        return placa;
    }

    /**
     * Crea una placa para un automovil usado
     *
     * @param placa la placa actual
     * @param automovil automovil que pertenecerá a la placa
     * @param persona persona dueña dueña del automovil
     * @param matricula matricula de la nueva placa
     * @return Placa nueva generada
     * @throws PersistenciaException en caso de algún error
     */
    @Override
    public Placa placasAutomovilUsado(PlacaDTO placa, AutomovilDTO automovil, PersonaDTO persona, String matricula) throws PersistenciaException {
        Placa placaNueva = new Placa();

        Persona personaE;
        try {
            personaE = personasDAO.consultarPersona(persona.getRfc());
            Vehiculo vehiculo = obtenerAutomovil(automovil);

            if (vehiculo != null) {

                desactivarPlaca(placa);
                placaNueva.setVehiculo(vehiculo);
                placaNueva.setEstado(Byte.valueOf("1"));
                placaNueva.setPersona(personaE);
                placaNueva.setCosto(1000F);
                placaNueva.setMatricula(matricula);
                placaNueva.setFecha_tramite(new Fecha());
                placaNueva.setFecha_recepcion(new Fecha());

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

    /**
     * Método que sirve para desactivar las placas de un automovil
     * @param placa placa que se desea desactivar
     * @throws PersistenciaException en caso de no encontrar la placa
     */
    @Override
    public void desactivarPlaca(PlacaDTO placa) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();
        EntityTransaction transaction = null;

        String jpqlQuery = """
                            UPDATE Placa p
                            SET p.estado = 0
                            WHERE p.matricula = :matricula
                            """;
        Query query = entityManager.createQuery(jpqlQuery);
        query.setParameter("matricula", placa.getMatricula());
        entityManager.getTransaction().begin();
        int filasActualizadas = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();

        if (filasActualizadas == 0) {
            throw new PersistenceException("No se encontraron licencias con ese número");
        }
    }

    /**
     * Consulta todos los trámites realizados
     * @return regresa la lista de todos los trámites realizados
     * @throws PersistenceException 
     */
    public List<Tramite> consultarTramitesTotales(String nombre) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();

        String jpqlQuery;
        TypedQuery<Tramite> query;

        if (nombre != null && !nombre.trim().isEmpty()) {
            jpqlQuery = """
               SELECT t FROM Tramite t
               JOIN t.persona p
               WHERE p.nombre LIKE :nombre 
               OR p.apellido_paterno LIKE :nombre 
               OR p.apellido_materno LIKE :nombre
               """;
            query = entityManager.createQuery(jpqlQuery, Tramite.class);
            query.setParameter("nombre", "%" + nombre + "%");
        } else {
            jpqlQuery = "SELECT t FROM Tramite t";
            query = entityManager.createQuery(jpqlQuery, Tramite.class);
        }

        List<Tramite> tramites;
        try {
            tramites = query.getResultList();
            logger.log(Level.INFO, "Consulta de {0} trámites realizada con éxito.", tramites.size());
        } catch (NoResultException ex) {
            throw new PersistenceException("No se encontraron trámites.", ex);
        } finally {
            entityManager.close();
        }
        return tramites;
    }

    /**
     * Método el cuál desactiva las licencias
     * que no se encuentrn vigentes según su la fecha actual
     * @throws PersistenciaException en caso de no encontrar licencias
     */
    @Override
    public void desactivarLicenciaFechaActual() throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            String jpqlQuery = """
                           UPDATE Licencia l
                           SET l.estado = 0
                           WHERE l.vigencia < :fechaActual
                           """;
            Query query = entityManager.createQuery(jpqlQuery);
            query.setParameter("fechaActual", new Fecha());
            int filasActualizadas = query.executeUpdate();

            transaction.commit();

            if (filasActualizadas == 0) {
                throw new PersistenceException("No hay estados por actualizar");
            }
        } catch (PersistenceException ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw new PersistenciaException("Error al desactivar licencias vencidas", ex);
        } finally {
            entityManager.close();
        }

    }

}
