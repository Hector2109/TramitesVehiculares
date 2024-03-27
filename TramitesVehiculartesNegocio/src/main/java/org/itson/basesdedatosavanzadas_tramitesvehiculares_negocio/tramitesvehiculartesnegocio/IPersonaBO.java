package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import java.util.List;
import javax.persistence.PersistenceException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PlacaDTO;
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
    public List<PersonaDTO> consultar() throws NegocioException ;

    /**
     * Método que regresa una lista de personas que cuenten con licencias activas
     * @return regresa la lista de las personasDTO
     * @throws NegocioException si ocurre un erro lanza el error
     */
    public List<PersonaDTO> consultarPersonasLicenciaActiva() throws NegocioException ;
    /**
     * Método para consultar una PersonaDTO a través de su RFC
     *
     * @param rfc rfc de la persona
     * @return PersonaDTO que se encontró con la rfc
     */
    public PersonaDTO consultarPersona(String rfc) throws NegocioException;
    
    /**
     * Regresa la lista de las personas que se consultaron del DAO similares
     * @param nombre valor del nombre
     * @return regresa la lista de las personas
     * @throws PersistenceException cuando ocurre un error de persistencia
     */
    public List<PersonaDTO> consultarPersonasSimilar(String nombre) throws NegocioException;
    
    /**
     * Regresa la lista de las personas que se consultaron del DAO con rfc
     * @param nombre valor del nombre
     * @return regresa la lista de las personas
     * @throws PersistenceException cuando ocurre un error de persistencia
     */
    public List<PersonaDTO> consultarPersonasSimilarRFC(String rfc) throws NegocioException;
    
    /**
     * Regresa una lista de personas con el año dado en el parametro
     * @param anio año de nacimiento de las personas a buscar
     * @return regresa una lista de personas con el año
     * @throws PersistenciaException lanza excepcion en caso de error
     */
    public List<PersonaDTO> consultarPersonasAnio(String anio) throws NegocioException; 
    
    
    public PersonaDTO consultaPersonaPlaca (PlacaDTO placa) throws  NegocioException;
}
