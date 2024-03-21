package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public Licencia realizarTramiteLicencia(PersonaDTO personaDTO, int anios) {

        Persona persona = new Persona();
        try {
            persona = personasDAO.consultarPeresona(personaDTO.getRfc());
            

            
            Licencia licencia = new Licencia();
            licencia.setPersona(persona);
            Date fechaTramite = new Date();
            licencia.setFecha_tramite(fechaTramite);
            Date fecha_vigencia = fechaTramite;

            if (anios == 1) {

                fecha_vigencia.setYear(fecha_vigencia.getYear() + anios);
                licencia.setVigencia(fecha_vigencia);
                if (persona.getDiscapacidad().equals("DISCAPACITADO")) {
                    licencia.setCosto(200.0F);
                } else {
                    licencia.setCosto(600.0F);
                }
                
            } else if (anios == 2) {
                
                licencia.setPersona(persona);
                fecha_vigencia.setYear(fecha_vigencia.getYear() + anios);
                licencia.setVigencia(fecha_vigencia);
                if (persona.getDiscapacidad().equals("DISCAPACITADO")) {
                    licencia.setCosto(500.0F);
                } else {
                    licencia.setCosto(900.0F);
                }
                
            } else if (anios == 3) {
                
                licencia.setPersona(persona);
                fecha_vigencia.setYear(fecha_vigencia.getYear() + anios);
                licencia.setVigencia(fecha_vigencia);
                if (persona.getDiscapacidad().equals("DISCAPACITADO")) {
                    licencia.setCosto(700.0F);
                } else {
                    licencia.setCosto(1100.0F);
                }
            }
            
            return licencia;
            


        } catch (PersistenciaException ex) {
            Logger.getLogger(TramitesDAO.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return null;
    }

}
