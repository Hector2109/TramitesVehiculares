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
        Persona persona5 = new Persona("CAVC570405MSPSLT08", 
                new Date(), "RFC1234567890", 
                "CATALINA", 
                "CASTRO",  
                "8540598502", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona6 = new Persona("VAPF420526HSPZLL00", 
                new Date(), "ASD8504840", 
                "FELIPE", 
                "VAZQUEZ",  
                "PALOMO",
                "8405950150", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona7 = new Persona("GAML320621MSPLXS09", 
                new Date(), "IFS0123584080", 
                "LUISA", 
                "GALAVIZ",  
                "6840806204", 
                Discapacidad.DISCAPACITADO);
        Persona persona8 = new Persona("HUHG200901MSPRRL09", 
                new Date(), "NRB8403950850", 
                "MARIA GILA", 
                "HURTADO ",  
                "5587058901", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona9 = new Persona("CAVP441113HSPRDB04", 
                new Date(), "OPS8405890450", 
                "PABLO", 
                "CARDONA",  
                "VIDALES",
                "8540598502", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona10 = new Persona("NIRS490513MSPXZC07", 
                new Date(), "OJQ5403590480", 
                "MA SOCORRO", 
                "NIÑO",  
                "RUIZ ",
                "8504803501", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona11 = new Persona("SAGA040513HSRNRBA1", 
                new Date(), "ABE4109045015", 
                "ABEL", 
                "SANCHEZ",  
                "GUERRERO",
                "6447059660", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona12 = new Persona("QUEH490813HSPRSP01", 
                new Date(), "SIH8405680950", 
                "HIPOLITO", 
                "QUIROZ",  
                "8059055096", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona13 = new Persona("QUMP700429HSPRRD06 ", 
                new Date(), "TSG8065019650", 
                "PEDRO", 
                "MORENO",  
                "6084805502", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona14 = new Persona("MAMC661121MSPRRC05", 
                new Date(), "RQX5015036581", 
                "CECILIA", 
                "MARTINEZ",  
                "6889032324", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona15 = new Persona("TOHA480503HSPRRB01", 
                new Date(), "TMA8460150388", 
                "ABDON", 
                "TORRES",  
                "8406650120", 
                Discapacidad.DISCAPACITADO);
        Persona persona16 = new Persona("SISE760208HSPLRL11", 
                new Date(), "INS4509502440", 
                "ELEAZAR", 
                "SILOS",
                "SORIANO",
                "8049503405", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona17 = new Persona("TOGJ271208MSPVVN07 ", 
                new Date(), "YSN840350S410", 
                "JUANA", 
                "TOVAR",
                "GUEVARA",
                "8506005848", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona18 = new Persona("RERT640413HSPYDL08", 
                new Date(), "TLQ8406032410", 
                "TELESFORO", 
                "REYNA",
                "RODRIGUEZ",
                "8409504806", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona19 = new Persona("GARS500320HSPRDN00", 
                new Date(), "JNA8036850211", 
                "JUAN SANTOS", 
                "GARCIA",  
                "RODRIGUEZ",
                "8098801544", 
                Discapacidad.NO_DISCAPACITADO);
        Persona persona20 = new Persona("DOTA790607MSPMRR06", 
                new Date(), "ANS8402230554", 
                "ARACELI", 
                "DOMINGUEZ",
                "TORRES ",  
                "6640289501", 
                Discapacidad.NO_DISCAPACITADO);
        
        
        List <Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        personas.add(persona6);
        personas.add(persona7);
        personas.add(persona8);
        personas.add(persona9);
        personas.add(persona10);
        personas.add(persona11);
        personas.add(persona12);
        personas.add(persona13);
        personas.add(persona14);
        personas.add(persona15);
        personas.add(persona16);
        personas.add(persona17);
        personas.add(persona18);
        personas.add(persona19);
        personas.add(persona20);
        
        personasDAO.insercionMasiva(personas);
        
    }
    
    
    
    
}
