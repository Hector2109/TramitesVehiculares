/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.tramitesvehiculares;

import java.util.Date;
import javax.persistence.EntityManager;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_dominio.tramitesvehicularesdominio.Discapacidad;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_dominio.tramitesvehicularesdominio.Persona;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.Conexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.IConexion;

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
        
        EntityManager em = conexion.crearConexion();
        em.getTransaction().begin();
        Persona persona = new Persona("SAGA043222HSRNRJA1", new Date(2004, 5, 13), "JFLÑAJFDL", "Abel Eduardo", "Sanchez", "Guerrero", "6441298238", Discapacidad.DISCAPACITADO);
        
        em.persist(persona);
        em.getTransaction().commit();
        em.close();
    }
    
}
