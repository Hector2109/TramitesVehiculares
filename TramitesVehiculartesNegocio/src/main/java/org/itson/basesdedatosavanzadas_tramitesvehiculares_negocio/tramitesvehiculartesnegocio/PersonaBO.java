package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.Conexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.IConexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.PersonasDAO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Discapacidad;

import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Persona;

/**
 *
 * @author Hector Espinoza y Abel Sanchez
 */
public class PersonaBO implements IPersonaBO {
    
    private PersonasDAO personasDAO;

    public PersonaBO(PersonasDAO personasDAO) {
        IConexion conexion = new Conexion();
        this.personasDAO = personasDAO;
    }
    
    

    @Override
    public void insercionMasiva() {
        
        Persona persona1 = new Persona("GAVM540516HJCRRR02", 
                new Date(), "RFC1234567890", 
                "MAURO", 
                "GARCIA", 
                "VARELA", 
                "6447801501", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona2 = new Persona("EIDH040921HSRSRCA9", 
                new Date(), "HSR2109402541", 
                "Hector", 
                "Espinoza", 
                "6448902540", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona3 = new Persona("VASA420527HSPZNG05", 
                new Date(), "AAO8405408424", 
                "AGUSTIN", 
                "VAZQUEZ", 
                "SANDATE", 
                "6485506340", 
                Discapacidad.DISCAPACITADO);
        Persona persona4 = new Persona("VATA540713HSPZVN06", 
                new Date(), "TFV4745890802", 
                "ANACLETO", 
                "VAZQUEZ", 
                "6447805904", 
                Discapacidad.DISCAPACITADO);
        Persona persona5 = new Persona("CAVC570405MSPSLT08 ", 
                new Date(), "RFC1234567890", 
                "CATALINA", 
                "CASTRO",  
                "8540598502", 
                Discapacidad.NO_DISCAPACITADO);
        
        List <Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        
        personasDAO.insersionMasiva(personas);
        
    }
    
    
    
    
}
