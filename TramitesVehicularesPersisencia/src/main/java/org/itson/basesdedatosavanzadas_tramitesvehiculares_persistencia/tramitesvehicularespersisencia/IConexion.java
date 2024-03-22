
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import javax.persistence.EntityManager;


/**
 *
 * @author Hector Espinoza y Abel Sanchez
 */
public interface IConexion {
    
    /**
     * Esté metodo crea la conexionde un EntityManager a la base de datos
     * @return entitymanager con conexión a la bd
     */
    public EntityManager crearConexion();
}
