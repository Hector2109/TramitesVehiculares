package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion.Fecha;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.excepciones.PersistenciaException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.Conexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.IConexion;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia.PersonasDAO;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion.AESEncriptador;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Discapacidad;

import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Persona;

/**
 *
 * @author Hector Espinoza y Abel Sanchez
 */
public class PersonaBO implements IPersonaBO {

    private PersonasDAO personasDAO;

    /**
     * Constructor que instancia un objeto de PersonasBO
     */
    public PersonaBO() {
        IConexion conexion = new Conexion();
        personasDAO = new PersonasDAO(conexion);
    }

    /**
     * Método el cual hace una inserción masiva de personas a la base de datos
     */
    @Override
    public void insercionMasiva() {

        Persona persona1 = new Persona(
                new Fecha("2004-02-12"), "RFC1234567891",
                "MAURO",
                "GARCIA",
                "VARELA",
                AESEncriptador.encriptar("6447801501"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona2 = new Persona(
                new Fecha("2004-09-21"), "HSR210940254B",
                "HECTOR",
                "ESPINOZA",
                AESEncriptador.encriptar("6448902540"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona3 = new Persona(
                new Fecha("1997-01-15"), "AAO84054084C1",
                "AGUSTIN",
                "VAZQUEZ",
                "SANFecha",
                AESEncriptador.encriptar("6485506340"),
                Discapacidad.DISCAPACITADO);
        Persona persona4 = new Persona(
                new Fecha("1980-02-01"), "TFV47458908D1",
                "ANACLETO",
                "VAZQUEZ",
                AESEncriptador.encriptar("6447805904"),
                Discapacidad.DISCAPACITADO);
        Persona persona5 = new Persona(
                new Fecha("1982-03-19"), "RFC123456789E",
                "CATALINA",
                "CASTRO",
                AESEncriptador.encriptar("8540598502"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona6 = new Persona(
                new Fecha("2003-04-02"), "ASD8504840F1",
                "FELIPE",
                "VAZQUEZ",
                "PALOMO",
                AESEncriptador.encriptar("8405950150"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona7 = new Persona(
                new Fecha("2002-05-13"), "IFS01235840G1",
                "LUISA",
                "GALAVIZ",
                AESEncriptador.encriptar("6840806204"),
                Discapacidad.DISCAPACITADO);
        Persona persona8 = new Persona(
                new Fecha("1989-07-25"), "NRB84039508H1",
                "MARIA GILA",
                "HURTADO ",
                AESEncriptador.encriptar("5587058901"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona9 = new Persona(
                new Fecha("2000-07-01"), "OPS84058904I1",
                "PABLO",
                "CARDONA",
                "VIDALES",
                AESEncriptador.encriptar("8540598502"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona10 = new Persona(
                new Fecha("2004-02-07"), "OJQ54035904J1",
                "MA SOCORRO",
                "NIÑO",
                "RUIZ ",
                AESEncriptador.encriptar("8504803501"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona11 = new Persona(
                new Fecha("1990-12-12"), "ABE41090450K1",
                "ABEL",
                "SANCHEZ",
                "GUERRERO",
                AESEncriptador.encriptar("6447059660"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona12 = new Persona(
                new Fecha("1999-11-23"), "SIH84056809L1",
                "HIPOLITO",
                "QUIROZ",
                AESEncriptador.encriptar("8059055096"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona13 = new Persona(
                new Fecha("1995-10-13"), "TSG80650196M1",
                "PEDRO",
                "MORENO",
                AESEncriptador.encriptar("6084805502"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona14 = new Persona(
                new Fecha("1970-09-22"), "RQX50150365N1",
                "CECILIA",
                "MARTINEZ",
                AESEncriptador.encriptar("6889032324"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona15 = new Persona(
                new Fecha("2005-01-02"), "TMA84601503O1",
                "ABDON",
                "TORRES",
                AESEncriptador.encriptar("8406650120"),
                Discapacidad.DISCAPACITADO);
        Persona persona16 = new Persona(
                new Fecha("2008-02-23"), "INS45095024P1",
                "ELEAZAR",
                "SILOS",
                "SORIANO",
                AESEncriptador.encriptar("8049503405"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona17 = new Persona(
                new Fecha("2010-06-21"), "YSN840350S4Q1",
                "JUANA",
                "TOVAR",
                "GUEVARA",
                AESEncriptador.encriptar("8506005848"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona18 = new Persona(
                new Fecha("2006-02-02"), "TLQ84060324R1",
                "TELESFORO",
                "REYNA",
                "RODRIGUEZ",
                AESEncriptador.encriptar("8409504806"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona19 = new Persona(
                new Fecha("2007-11-15"), "JNA80368502S1",
                "JUAN SANTOS",
                "GARCIA",
                "RODRIGUEZ",
                AESEncriptador.encriptar("8098801544"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona20 = new Persona(
                new Fecha("2015-02-08"), "ANS84022305T1",
                "ARACELI",
                "DOMINGUEZ",
                "TORRES ",
                AESEncriptador.encriptar("6640289501"),
                Discapacidad.NO_DISCAPACITADO);

        List<Persona> personas = new ArrayList<>();
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

    /**
     * Método el cuál nos regresa una lista de PersonaDTO
     *
     * @return lista de PersonaDTO
     */
    @Override
    public List<PersonaDTO> consultar() {

        List<Persona> personas = personasDAO.consultar();
        List<PersonaDTO> personasDTO = new ArrayList<>();

        for (Persona persona : personas) {
            personasDTO.add(new PersonaDTO(
                    persona.getFecha_nacimiento(),
                    persona.getRfc(),
                    persona.getNombre(),
                    persona.getApellido_paterno(),
                    persona.getApellido_materno()));
        }

        return personasDTO;
    }

    /**
     * Método para consultar una PersonaDTO a través de su RFC
     *
     * @param rfc rfc de la persona
     * @return PersonaDTO que se encontró con la rfc
     */
    @Override
    public PersonaDTO consultarPersona(String rfc) {
        try {
            Persona persona = personasDAO.consultarPersona(rfc);
            PersonaDTO personaDTO = new PersonaDTO(
                    persona.getFecha_nacimiento(),
                    persona.getRfc(),
                    persona.getNombre(),
                    persona.getApellido_paterno(),
                    persona.getApellido_materno());
            return personaDTO;

        } catch (PersistenciaException ex) {
            Logger.getLogger(PersonaBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new PersistenceException("No se pudo consultar la persona");
        }
    }

    /**
     * Regresa la lista de las personas que se consultaron den DAO
     * @param nombre valor del nombre
     * @return regresa la lista de las personas
     * @throws PersistenceException cuando ocurre un error de persistencia
     */
    @Override
    public List<PersonaDTO> consultarPersonasSimilar(String nombre) throws PersistenciaException {
        try {
            List<Persona> personas = personasDAO.buscarPersonasSimilar(nombre);
            List<PersonaDTO> personasDTO = new ArrayList<>();

            for (Persona persona : personas) {
                PersonaDTO personaDTO = new PersonaDTO(
                        persona.getFecha_nacimiento(), 
                        persona.getRfc(),
                        persona.getNombre(), 
                        persona.getApellido_paterno(), 
                        persona.getApellido_materno());
                personasDTO.add(personaDTO);
            }

            return personasDTO;

        } catch (PersistenciaException ex) {
              Logger.getLogger(PersonaBO.class.getName()).log(Level.SEVERE, null, ex);
              throw new PersistenceException("No se pueden consultar las personas");
        }
    }

    @Override
    public List<PersonaDTO> consultarPersonasSimilarRFC(String rfc) throws PersistenciaException {
        try {
            List<Persona> personas = personasDAO.buscarRFCSimilar(rfc);
            List<PersonaDTO> personasDTO = new ArrayList<>();

            for (Persona persona : personas) {
                PersonaDTO personaDTO = new PersonaDTO(
                        persona.getFecha_nacimiento(), 
                        persona.getRfc(),
                        persona.getNombre(), 
                        persona.getApellido_paterno(), 
                        persona.getApellido_materno());
                personasDTO.add(personaDTO);
            }

            return personasDTO;

        } catch (PersistenciaException ex) {
              Logger.getLogger(PersonaBO.class.getName()).log(Level.SEVERE, null, ex);
              throw new PersistenceException("No se pueden consultar las personas");
        }
    }

    @Override
    public List<PersonaDTO> consultarPersonasAnio(String anio) throws PersistenciaException {
        try {
            List<Persona> personas = personasDAO.buscarAnioSimilar(anio);
            List<PersonaDTO> personasDTO = new ArrayList<>();

            for (Persona persona : personas) {
                PersonaDTO personaDTO = new PersonaDTO(
                        persona.getFecha_nacimiento(), 
                        persona.getRfc(),
                        persona.getNombre(), 
                        persona.getApellido_paterno(), 
                        persona.getApellido_materno());
                personasDTO.add(personaDTO);
            }

            return personasDTO;

        } catch (PersistenciaException ex) {
              Logger.getLogger(PersonaBO.class.getName()).log(Level.SEVERE, null, ex);
              throw new PersistenceException("No se pueden consultar las personas");
        }
    }

}
