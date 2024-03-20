package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
@Entity
@Table (name = "licencias")
public class Licencia extends Tramite implements Serializable {

    /** Número de la licencia. */
    @Column(name = "numero_licencia", nullable = false, length = 9)
    private String numero_licencia;
    
    /** Fecha de vigencia de la licencia. */
    @Column(name = "vigencia", nullable = false)
    private Date vigencia;
    
    /** Estado de la licencia. */
    @Column(name = "estado", nullable = false)
    private Byte estado;

    /**
     * Devuelve el número de la licencia.
     * @return El número de la licencia.
     */
    public String getNumero_licencia() {
        return numero_licencia;
    }

    /**
     * Establece el número de la licencia.
     * @param numero_licencia El número de la licencia.
     */
    public void setNumero_licencia(String numero_licencia) {
        this.numero_licencia = numero_licencia;
    }

    /**
     * Devuelve la fecha de vigencia de la licencia.
     * @return La fecha de vigencia de la licencia.
     */
    public Date getVigencia() {
        return vigencia;
    }

    /**
     * Establece la fecha de vigencia de la licencia.
     * @param vigencia La fecha de vigencia de la licencia.
     */
    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Devuelve el estado de la licencia.
     * @return El estado de la licencia.
     */
    public Byte getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la licencia.
     * @param estado El estado de la licencia.
     */
    public void setEstado(Byte estado) {
        this.estado = estado;
    }

}
