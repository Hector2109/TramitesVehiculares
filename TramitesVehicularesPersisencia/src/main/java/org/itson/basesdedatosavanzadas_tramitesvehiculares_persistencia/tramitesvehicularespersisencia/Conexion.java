
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Hector Espinoza y Abel Sanchez
 */
public class Conexion implements IConexion{

    /**
     * Esté metodo crea la conexionde un EntityManager a la base de datos
     * @return entitymanager con conexión a la bd
     */
    @Override
    public EntityManager crearConexion() {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TramitesPU");
        
        //Solicitamos una entity manager(acceso a la BD)
        EntityManager entityManager = emFactory.createEntityManager();
        return entityManager;
    }
    
}
