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
     * Este método hace una insersion masiva de personas a la base de datos,
     * enriptando sus telefonos
     *
     * @return lista de personas insertadas
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
     * Metodo que consulta todos los personas registrados
     *
     * @return regresa la lista de personas
     */
    @Override
    public List<Persona> consultar() {
        EntityManager entityManager = this.conexion.crearConexion();
        
        CriteriaQuery <Persona> criteria = entityManager.getCriteriaBuilder().createQuery(Persona.class);
        
        criteria.select(criteria.from(Persona.class));

        List<Persona> personas = entityManager.createQuery(criteria).getResultList();
        
        entityManager.close();
        
        return personas;
    }

    /**
     * Obtiene una persona mediante un id
     * @param id valor del id
     * @return regresa el objeto de tipo persona
     */
    @Override
    public Persona consultarPersona(String rfc)throws PersistenciaException {

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
