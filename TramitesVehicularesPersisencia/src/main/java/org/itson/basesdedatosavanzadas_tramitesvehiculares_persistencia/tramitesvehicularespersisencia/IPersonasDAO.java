/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import java.util.List;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PlacaDTO;
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
    public List<Persona> consultar() throws PersistenciaException;
    
    /**
     * Este método retorna una persona en base a la rfc
     * @param rfc rfc de la persona
     * @return persona del registro encontrada con la rfc especificada
     * @throws PersistenciaException en caso de no encontrar a la persona
     */
    public Persona consultarPersona(String rfc)throws PersistenciaException;
    
    /**
     * Permite consultar todas las personas que esten registradas con licenciaS
     * @return regresa la lista de personas con licencia
     * @throws PersistenciaException  lanza excepcion si no encuentra las personas
     */
    public List<Persona> consultarPersonasConLicencia()throws PersistenciaException;
   
    /**
     * Este metodo busca nombres similares que incluyan algunos valores
     * @param nombre valor del nombre a buscar
     * @return regresa la lista de personas que tienen ese nombre
     * @throws PersistenciaException lanza excepcion en caso de error
     */
    public List<Persona> buscarPersonasSimilar(String nombre) throws PersistenciaException;
    
    /**
     * Este metodo busca RFC que incluyan algunos valores
     * @param rfc valor del rfc
     * @return regresa la lista de personas que tienen ese rfc
     * @throws PersistenciaException lanza excepcion en caso de error
     */
    public List<Persona> buscarRFCSimilar(String rfc) throws PersistenciaException;
    
    /**
     * Este metodo busca fecha de nacimiento que incluyan algunos valores
     * @param anio valor del año
     * @return regresa la lista de personas que tienen ese año
     * @throws PersistenciaException lanza excepcion en caso de error
     */
    public List<Persona> buscarAnioSimilar(String anio) throws PersistenciaException;
    
    
    public Persona buscarPersonaPlaca (PlacaDTO placa) throws PersistenciaException;
}
