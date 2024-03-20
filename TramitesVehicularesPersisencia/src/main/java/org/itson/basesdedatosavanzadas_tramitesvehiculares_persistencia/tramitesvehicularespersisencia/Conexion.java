
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Abe
 */
public class Conexion implements IConexion{

    @Override
    public EntityManager crearConexion() {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TramitesPU");
        
        //Solicitamos una entity manager(acceso a la BD)
        EntityManager entityManager = emFactory.createEntityManager();
        return entityManager;
    }
    
}
