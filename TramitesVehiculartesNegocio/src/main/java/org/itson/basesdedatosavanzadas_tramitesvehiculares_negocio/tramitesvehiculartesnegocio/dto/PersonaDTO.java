package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto;

import java.util.Date;
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
    private Date fecha_nacimiento;

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

    public PersonaDTO(Date fecha_nacimiento, String rfc, String nombre, String apellido_paterno, String apellido_materno) {
        this.fecha_nacimiento = fecha_nacimiento;
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
    }
   


    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getRfc() {
        return rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public String getTelefono() {
        return telefono;
    }

    public Discapacidad getDiscapacidad() {
        return discapacidad;
    }
    
    
    
    
}
