package org.itson.basesdedatosavanzadas_tramitesvehiculares_dominio.tramitesvehicularesdominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
@Entity
@Table(name = "personas")
public class Persona implements Serializable {

    /**
     * Identificador único de la persona.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long id;

    /**
     * CURP (Clave Única de Registro de Población) de la persona.
     */
    @Column(name = "curp", nullable = false, length = 18)
    private String curp;

    /**
     * Fecha de nacimiento de la persona.
     */
    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fecha_nacimiento;

    /**
     * RFC (Registro Federal de Contribuyentes) de la persona.
     */
    @Column(name = "rfc", nullable = false, length = 13)
    private String rfc;

    /**
     * Nombre de la persona.
     */
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    /**
     * Apellido paterno de la persona.
     */
    @Column(name = "apellido_paterno", nullable = false, length = 50)
    private String apellido_paterno;

    /**
     * Apellido materno de la persona.
     */
    @Column(name = "apellido_materno", nullable = true, length = 50)
    private String apellido_materno;

    /**
     * Teléfono de contacto de la persona.
     */
    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

    /**
     * Indica si la persona tiene alguna discapacidad.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "discapacidad", nullable = false)
    private Discapacidad discapacidad;

    /**
     * Devuelve el identificador único de la persona.
     *
     * @return El identificador único de la persona.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el identificador único de la persona.
     *
     * @param id El identificador único de la persona.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Devuelve el CURP (Clave Única de Registro de Población) de la persona.
     *
     * @return El CURP de la persona.
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Establece el CURP (Clave Única de Registro de Población) de la persona.
     *
     * @param curp El CURP de la persona.
     */
    public void setCurp(String curp) {
        this.curp = curp;
    }

    /**
     * Devuelve la fecha d nacimiento de la persona
     *
     * @return fecha de nacimiento de la persona
     */
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * Establece la fecha de nacimiento de la persona.
     * @param fecha_nacimiento La fecha de nacimiento de la persona.
     */
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * Devuelve el RFC (Registro Federal de Contribuyentes) de la persona.
     *
     * @return El RFC de la persona.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Establece el RFC (Registro Federal de Contribuyentes) de la persona.
     *
     * @param rfc El RFC de la persona.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Devuelve el nombre de la persona
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona
     * @param nombre Nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el apellido paterno de la persona
     * @return apellido paterno de la persona
     */
    public String getApellido_paterno() {
        return apellido_paterno;
    }

    /**
     * Establece el apellido paterno de la persona
     * @param apellido_paterno apellido paterno de la persona
     */
    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    /**
     * Devuelve el apellido materno de la persona.
     * @return El apellido materno de la persona.
     */
    public String getApellido_materno() {
        return apellido_materno;
    }

    /**
     * Establece el apellido materno de la persona.
     * @param apellido_materno El apellido materno de la persona.
     */
    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    /**
     * Devuelve el número de teléfono de la persona.
     * @return El número de teléfono de la persona.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono de la persona.
     * @param telefono El número de teléfono de la persona.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve la discapacidad de la persona.
     *
     * @return La discapacidad de la persona.
     */
    public Discapacidad getDiscapacidad() {
        return discapacidad;
    }

    /**
     * Establece la discapacidad de la persona.
     *
     * @param discapacidad La discapacidad de la persona.
     */
    public void setDiscapacidad(Discapacidad discapacidad) {
        this.discapacidad = discapacidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.itson.basesdedatosavanzadas_tramitesvehiculares_dominio.tramitesvehicularesdominio.Persona[ id=" + id + " ]";
    }

}
