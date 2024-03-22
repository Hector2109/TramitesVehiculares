/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import java.util.List;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Persona;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
public interface IPersonasDAO {
    
    /**
     * Este método retorna una lista de personas las cuales son
     * insertadas de forma hardcodeada 
     * @param personas lista personas que se desean insertar
     * @return lista de personas
     */
    public List <Persona> insercionMasiva(List<Persona> personas);
    
    /**
     * Esté método retorna la lista de personas que se encuentran
     * en los registros de la base de datos
     * @return lista de personas en los registros
     */
    public List<Persona> consultar();
    
    /**
     * Este método retorna una persona en base a la rfc
     * @param rfc rfc de la persona
     * @return persona del registro encontrada con la rfc especificada
     * @throws PersistenciaException en caso de no encontrar a la persona
     */
    public Persona consultarPersona(String rfc)throws PersistenciaException;
    
}
