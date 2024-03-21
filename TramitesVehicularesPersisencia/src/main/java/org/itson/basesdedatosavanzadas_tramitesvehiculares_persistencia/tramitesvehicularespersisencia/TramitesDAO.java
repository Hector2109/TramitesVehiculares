package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.Fecha;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Licencia;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Persona;

/**
 *
 * @author Abe
 */
public class TramitesDAO implements ITramitesDAO {

    private IConexion conexion;
    private PersonasDAO personasDAO;
    static final Logger logger = Logger.getLogger(PersonasDAO.class.getName());

    public TramitesDAO(IConexion conexion) {
        this.conexion = conexion;
        personasDAO = new PersonasDAO(this.conexion);
    }

    @Override
    public Licencia realizarTramiteLicencia(PersonaDTO personaDTO, int anios) throws PersistenceException{

        Persona persona = new Persona();
        try {
            persona = personasDAO.consultarPersona(personaDTO.getRfc());
            

            
            Licencia licencia = new Licencia();
            licencia.setPersona(persona);
            Fecha fechaTramite = new Fecha();
            licencia.setFecha_tramite(fechaTramite);
            Fecha fecha_vigencia = new Fecha();
            fecha_vigencia.add(Calendar.YEAR, anios);
            //prueba hardcodeada
            licencia.setNumero_licencia("123456789");

            if (anios == 1) {

                
                licencia.setVigencia(fecha_vigencia);
                if (persona.getDiscapacidad().equals("DISCAPACITADO")) {
                    licencia.setCosto(200.0F);
                } else {
                    licencia.setCosto(600.0F);
                }
                
            } else if (anios == 2) {
                
                licencia.setPersona(persona);
                licencia.setVigencia(fecha_vigencia);
                if (persona.getDiscapacidad().equals("DISCAPACITADO")) {
                    licencia.setCosto(500.0F);
                } else {
                    licencia.setCosto(900.0F);
                }
                
            } else if (anios == 3) {
                
                licencia.setPersona(persona);
                licencia.setVigencia(fecha_vigencia);
                if (persona.getDiscapacidad().equals("DISCAPACITADO")) {
                    licencia.setCosto(700.0F);
                } else {
                    licencia.setCosto(1100.0F);
                }
            }
            
            EntityManager em = conexion.crearConexion();
            em.getTransaction().begin();
            em.persist(licencia);
            em.getTransaction().commit();
            em.close();
            
            return licencia;
            


        } catch (PersistenciaException ex) {
            Logger.getLogger(TramitesDAO.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
         throw new PersistenceException("No se ha podido realizar el registro de licencia");
        }
        
    }

}
