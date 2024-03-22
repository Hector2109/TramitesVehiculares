package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import java.util.List;
import javax.persistence.PersistenceException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Hector Espinoza y Abel Sanchez
 */
public interface IPersonaBO {

    /**
     * Método el cual hace una inserción masiva de personas a la base de datos
     */
    public void insercionMasiva();

    /**
     * Método el cuál nos regresa una lista de PersonaDTO
     *
     * @return lista de PersonaDTO
     */
    public List<PersonaDTO> consultar();

    /**
     * Método para consultar una PersonaDTO a través de su RFC
     *
     * @param rfc rfc de la persona
     * @return PersonaDTO que se encontró con la rfc
     */
    public PersonaDTO consultarPersona(String rfc);
    
    /**
     * Regresa la lista de las personas que se consultaron del DAO similares
     * @param nombre valor del nombre
     * @return regresa la lista de las personas
     * @throws PersistenceException cuando ocurre un error de persistencia
     */
    public List<PersonaDTO> consultarPersonasSimilar(String nombre) throws PersistenciaException;
    
    /**
     * Regresa la lista de las personas que se consultaron del DAO con rfc
     * @param nombre valor del nombre
     * @return regresa la lista de las personas
     * @throws PersistenceException cuando ocurre un error de persistencia
     */
    public List<PersonaDTO> consultarPersonasSimilarRFC(String rfc) throws PersistenciaException;
    
    /**
     * Regresa una lista de personas con el año dado en el parametro
     * @param anio año de nacimiento de las personas a buscar
     * @return regresa una lista de personas con el año
     * @throws PersistenciaException lanza excepcion en caso de error
     */
    public List<PersonaDTO> consultarPersonasAnio(String anio) throws PersistenciaException;
}
