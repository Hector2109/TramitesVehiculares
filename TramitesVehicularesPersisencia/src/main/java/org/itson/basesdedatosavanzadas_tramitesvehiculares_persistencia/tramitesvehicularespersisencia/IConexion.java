
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import javax.persistence.EntityManager;


/**
 *
 * @author Hector Espinoza y Abel Sanchez
 */
public interface IConexion {
    public EntityManager crearConexion();
}
