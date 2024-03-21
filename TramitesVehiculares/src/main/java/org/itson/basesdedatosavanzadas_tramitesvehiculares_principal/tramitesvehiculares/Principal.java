/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.tramitesvehiculares;

import java.util.Date;
import javax.persistence.EntityManager;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.PersonaBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.Conexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.IConexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.IPersonasDAO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.PersonasDAO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Discapacidad;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Licencia;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Persona;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Tramite;

/**
 *
 * @author Hector Espinoza
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IConexion conexion = new Conexion();

        
        PersonasDAO personasDAO = new PersonasDAO(conexion);
        
        PersonaBO personaBO = new PersonaBO(personasDAO);
        
        personaBO.insersionMasiva();

//        EntityManager em = conexion.crearConexion();
//        em.getTransaction().begin();
//        Persona persona = new Persona();
//        persona.setNombre("Abel");
//        persona.setApellido_materno("Sanchez");
//        persona.setApellido_paterno("Guerrero");
//        persona.setCurp("SAGA040513HSRNRBA2");
//        persona.setDiscapacidad(Discapacidad.DISCAPACITADO);
//        persona.setFecha_nacimiento(new Date(2004, 05, 13));
//        persona.setRfc("asdfghjklñqwe");
//        persona.setTelefono("6441297653");
//
//        Licencia licencia = new Licencia();
//        licencia.setFecha_tramite(new Date(2024, 01, 1));
//        licencia.setEstado((byte) 0);
//        licencia.setCosto(200f);
//        licencia.setNumero_licencia("2345678");
//        licencia.setVigencia(new Date(2028, 12, 12));
//
//        licencia.setPersona(persona); 
//        
//        em.persist(licencia);
//
//        em.persist(persona); 
//
//        em.getTransaction().commit();
//        em.close();
    }

}
