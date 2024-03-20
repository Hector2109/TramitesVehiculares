package org.itson.basesdedatosavanzadas_tramitesvehiculares_dominio.tramitesvehicularesdominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */

@Entity
@Table (name = "personas")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_persona")
    private Long id;
    
    @Column (name = "curp", nullable = false, length = 18)
    private String curp;
    
    @Column (name = "fecha_nacimiento", nullable = false)
    private Date fecha_nacimiento;
    
    @Column (name = "rfc", nullable = false, length = 13)
    private String rfc;
    
    @Column (name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    @Column (name = "apellido_paterno", nullable = false, length = 50)
    private String apellido_paterno;
    
    @Column (name = "apellido_materno", nullable = true, length = 50)
    private String apellido_materno;
    
    @Column (name = "telefono", nullable = false, length = 10)
    private String telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
