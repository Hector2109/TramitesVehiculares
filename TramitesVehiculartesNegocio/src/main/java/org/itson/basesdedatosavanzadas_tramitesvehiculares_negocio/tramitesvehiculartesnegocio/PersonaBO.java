package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.PersonaDTO;
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

    public PersonaBO() {
        IConexion conexion = new Conexion();
        personasDAO = new PersonasDAO(conexion);
    }

    @Override
    public void insercionMasiva() {

        Persona persona1 = new Persona(
                new Date(), "RFC1234567891",
                "MAURO",
                "GARCIA",
                "VARELA",
                AESEncriptador.encriptar("6447801501"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona2 = new Persona(
                new Date(), "HSR210940254B",
                "HECTOR",
                "ESPINOZA",
                AESEncriptador.encriptar("6448902540"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona3 = new Persona(
                new Date(), "AAO84054084C1",
                "AGUSTIN",
                "VAZQUEZ",
                "SANDATE",
                AESEncriptador.encriptar("6485506340"),
                Discapacidad.DISCAPACITADO);
        Persona persona4 = new Persona(
                new Date(), "TFV47458908D1",
                "ANACLETO",
                "VAZQUEZ",
                AESEncriptador.encriptar("6447805904"),
                Discapacidad.DISCAPACITADO);
        Persona persona5 = new Persona(
                new Date(), "RFC123456789E",
                "CATALINA",
                "CASTRO",
                AESEncriptador.encriptar("8540598502"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona6 = new Persona(
                new Date(), "ASD8504840F1",
                "FELIPE",
                "VAZQUEZ",
                "PALOMO",
                AESEncriptador.encriptar("8405950150"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona7 = new Persona(
                new Date(), "IFS01235840G1",
                "LUISA",
                "GALAVIZ",
                AESEncriptador.encriptar("6840806204"),
                Discapacidad.DISCAPACITADO);
        Persona persona8 = new Persona(
                new Date(), "NRB84039508H1",
                "MARIA GILA",
                "HURTADO ",
                AESEncriptador.encriptar("5587058901"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona9 = new Persona(
                new Date(), "OPS84058904I1",
                "PABLO",
                "CARDONA",
                "VIDALES",
                AESEncriptador.encriptar("8540598502"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona10 = new Persona(
                new Date(), "OJQ54035904J1",
                "MA SOCORRO",
                "NIÑO",
                "RUIZ ",
                AESEncriptador.encriptar("8504803501"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona11 = new Persona(
                new Date(), "ABE41090450K1",
                "ABEL",
                "SANCHEZ",
                "GUERRERO",
                AESEncriptador.encriptar("6447059660"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona12 = new Persona(
                new Date(), "SIH84056809L1",
                "HIPOLITO",
                "QUIROZ",
                AESEncriptador.encriptar("8059055096"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona13 = new Persona(
                new Date(), "TSG80650196M1",
                "PEDRO",
                "MORENO",
                AESEncriptador.encriptar("6084805502"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona14 = new Persona(
                new Date(), "RQX50150365N1",
                "CECILIA",
                "MARTINEZ",
                AESEncriptador.encriptar("6889032324"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona15 = new Persona(
                new Date(), "TMA84601503O1",
                "ABDON",
                "TORRES",
                AESEncriptador.encriptar("8406650120"),
                Discapacidad.DISCAPACITADO);
        Persona persona16 = new Persona(
                new Date(), "INS45095024P1",
                "ELEAZAR",
                "SILOS",
                "SORIANO",
                AESEncriptador.encriptar("8049503405"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona17 = new Persona(
                new Date(), "YSN840350S4Q1",
                "JUANA",
                "TOVAR",
                "GUEVARA",
                AESEncriptador.encriptar("8506005848"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona18 = new Persona(
                new Date(), "TLQ84060324R1",
                "TELESFORO",
                "REYNA",
                "RODRIGUEZ",
                AESEncriptador.encriptar("8409504806"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona19 = new Persona(
                new Date(), "JNA80368502S1",
                "JUAN SANTOS",
                "GARCIA",
                "RODRIGUEZ",
                AESEncriptador.encriptar("8098801544"),
                Discapacidad.NO_DISCAPACITADO);
        Persona persona20 = new Persona(
                new Date(), "ANS84022305T1",
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

}
