/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.tramitesvehiculares;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.IPersonaBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.ITramiteBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.NegocioException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.PersonaBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.TramiteBO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.Conexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.IConexion;

/**
 *
 * @author Hector Espinoza
 */
public class Principal {

    static final Logger logger = Logger.getLogger(Principal.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PersistenciaException, NegocioException {

        IConexion conexion = new Conexion();
        IPersonaBO personaBO = new PersonaBO();
        ITramiteBO tramiteBO = new TramiteBO();

        DlgPrincipal DP = new DlgPrincipal(conexion);
        DP.setVisible(true);

//        ITramitesDAO tramiteDAO = new TramitesDAO(conexion);
//        PersonaDTO persona = null;
//        try {
//            persona = personaBO.consultarPersona("HSR210940254B");
//            if (persona == null) {
//                System.out.println("null");
//            } else {
//                System.out.println(persona.getNombre());
//            }
//
//        } catch (NegocioException ex) {
//            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        List<Tramite> tramites = tramiteDAO.consultarTramitesPersona(persona);
//        
//        for (Tramite tramite : tramites) {
//            if (tramite instanceof Placa) {
//                System.out.println("Tipo de trámite: Placa");
//            } else if (tramite instanceof Licencia) {
//                System.out.println("Tipo de trámite: Licencia");
//            } else {
//                System.out.println("Tipo de trámite desconocido");
//            }
//        }
//        PersonaDTO persona;
//        try {
//            persona = personaBO.consultarPersona("HSR210940254B");
//            if(persona==null){
//                System.out.println("null");
//            }
//            else{
//                System.out.println(persona.getNombre());
//            }
//            
//            List<PlacaDTO> placas = tramiteBO.consultarPlacasPersona(persona);
//            int num =0;
//            for (PlacaDTO placa : placas) {
//                System.out.println(placa.getMatricula());
//                num++;
//                System.out.println(num);
//            }
//            System.out.println(num);
//            
//        } catch (NegocioException ex) {
//            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        DlgPrincipal principal = new DlgPrincipal(conexion);
//        principal.setVisible(true);
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
