package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto;

import java.util.GregorianCalendar;
import java.util.List;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Discapacidad;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia.Tramite;

/**
 *
 * @author Hector Espinoza
 */
public class PersonaDTO {
    

    /**
     * Fecha de nacimiento de la persona.
     */
    private GregorianCalendar fecha_nacimiento;

    /**
     * RFC (Registro Federal de Contribuyentes) de la persona.
     */
    private String rfc;

    /**
     * Nombre de la persona.
     */
    private String nombre;

    /**
     * Apellido paterno de la persona.
     */
    private String apellido_paterno;

    /**
     * Apellido materno de la persona.
     */
    private String apellido_materno;

    /**
     * Teléfono de contacto de la persona.
     */
    private String telefono;

    /**
     * Lista de tramites de la persona
     */
    
    /**
     * Indica si la persona tiene alguna discapacidad.
     */
    private Discapacidad discapacidad;

    /**
     * Construye una nueva instancia de PersonaDTO con la fecha de nacimiento, RFC, nombre y apellidos especificados.
     *
     * @param fecha_nacimiento La fecha de nacimiento de la persona.
     * @param rfc El RFC de la persona.
     * @param nombre El nombre de la persona.
     * @param apellido_paterno El apellido paterno de la persona.
     * @param apellido_materno El apellido materno de la persona.
     */
    public PersonaDTO(GregorianCalendar fecha_nacimiento, String rfc, String nombre, String apellido_paterno, String apellido_materno) {
        this.fecha_nacimiento = fecha_nacimiento;
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
    }
   
    /**
     * Obtiene la fecha de nacimiento de la persona.
     *
     * @return La fecha de nacimiento de la persona.
     */
    public GregorianCalendar getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * Obtiene el RFC de la persona.
     *
     * @return El RFC de la persona.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido paterno de la persona.
     *
     * @return El apellido paterno de la persona.
     */
    public String getApellido_paterno() {
        return apellido_paterno;
    }

    /**
     * Obtiene el apellido materno de la persona.
     *
     * @return El apellido materno de la persona.
     */
    public String getApellido_materno() {
        return apellido_materno;
    }

    /**
     * Obtiene el teléfono de la persona.
     *
     * @return El teléfono de la persona.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Obtiene la discapacidad de la persona, si la tiene.
     *
     * @return La discapacidad de la persona, o null si no tiene ninguna.
     */
    public Discapacidad getDiscapacidad() {
        return discapacidad;
    }    
    
    
}
