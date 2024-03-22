package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import java.util.List;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Persona;

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
}
