package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import java.util.List;
import javax.persistence.EntityManager;
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
    
}
