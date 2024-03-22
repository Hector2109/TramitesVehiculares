package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Persona;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
public class PersonasDAO implements IPersonasDAO {

    private IConexion conexion;
    static final Logger logger = Logger.getLogger(PersonasDAO.class.getName());

    public PersonasDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * Este método retorna una lista de personas las cuales son insertadas de
     * forma hardcodeada
     *
     * @param personas lista personas que se desean insertar
     * @return lista de personas
     */
    @Override
    public List<Persona> insercionMasiva(List<Persona> personas) {
        EntityManager em = conexion.crearConexion();

        em.getTransaction().begin();

        for (Persona persona : personas) {
            em.persist(persona);
        }
        em.getTransaction().commit();
        em.close();
        return personas;
    }

    /**
     * Esté método retorna la lista de personas que se encuentran en los
     * registros de la base de datos
     *
     * @return lista de personas en los registros
     */
    @Override
    public List<Persona> consultar() {
        EntityManager entityManager = this.conexion.crearConexion();

        CriteriaQuery<Persona> criteria = entityManager.getCriteriaBuilder().createQuery(Persona.class);

        criteria.select(criteria.from(Persona.class));

        List<Persona> personas = entityManager.createQuery(criteria).getResultList();

        entityManager.close();

        return personas;
    }

    /**
     * Este método retorna una persona en base a la rfc
     *
     * @param rfc rfc de la persona
     * @return persona del registro encontrada con la rfc especificada
     * @throws PersistenciaException en caso de no encontrar a la persona
     */
    @Override
    public Persona consultarPersona(String rfc) throws PersistenciaException {

        EntityManager entityManager = this.conexion.crearConexion();

        try {
            String jpqlQuery = """
                           SELECT p FROM Persona p Where p.rfc = :rfc
                           """;

            TypedQuery<Persona> query = entityManager.createQuery(jpqlQuery, Persona.class);
            query.setParameter("rfc", rfc);
            Persona persona = query.getSingleResult();
            return persona;
        } catch (PersistenceException e) {
            logger.log(Level.SEVERE, "No se pudieron consultar a la persona.", e);
            throw new PersistenciaException("No se pudieron consultar los clientes.", e);
        }

    }

}
