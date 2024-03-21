package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Persona;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
public class PersonasDAO implements IPersonasDAO{
    
    private IConexion conexion;
    
    public PersonasDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * Este método hace una insersion masiva de personas a la base de datos, enriptando sus telefonos
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
     * @return regresa la lista de personas
     */
    @Override
    public List<Persona> consultar() {
        EntityManager entityManager = this.conexion.crearConexion();
    
        //Objeto consulta que se esta construyendo
        String jpqlQuery = """
                           SELECT p FROM Persona p
                           """;
        //Consulta construida
        TypedQuery<Persona> query = entityManager.createQuery(jpqlQuery,Persona.class);
        List<Persona> personas = query.getResultList();
        entityManager.close();
        return personas;
    }

    /**
     * Obtiene una persona mediante un id
     * @param id valor del id
     * @return regresa el objeto de tipo persona
     */
    @Override
    public Persona consultarPeresona(int id) {
        
        EntityManager entityManager = this.conexion.crearConexion();
        Persona persona = new Persona();
        return persona;
    }
}
