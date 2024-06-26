package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia;

import java.io.Serializable;
import java.util.GregorianCalendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
@Entity
@DiscriminatorValue("Licencia")
@Table(name = "licencias")
public class Licencia extends Tramite implements Serializable {

    /**
     * Número de la licencia.
     */
    @Column(name = "numero_licencia", nullable = false, length = 9)
    private String numero_licencia;

    /**
     * Fecha de vigencia de la licencia.
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "vigencia", nullable = false)
    private GregorianCalendar vigencia;

    /**
     * Estado de la licencia.
     */
    @Column(name = "estado", nullable = false)
    private byte estado;

    /**
     * Construye una nueva instancia de Licencia con los parámetros
     * especificados.
     *
     * @param fecha_tramite La fecha en la que se tramitó la licencia.
     * @param costo El costo asociado a la licencia.
     * @param persona La persona a la que se le emitió la licencia.
     * @param numero_licencia El número de la licencia.
     * @param vigencia La fecha de vigencia de la licencia.
     * @param estado El estado de la licencia (por ejemplo, activa, vencida,
     * suspendida, etc.).
     */
    public Licencia(
            GregorianCalendar fecha_tramite,
            Float costo,
            Persona persona,
            String numero_licencia,
            GregorianCalendar vigencia,
            byte estado) {
        super(fecha_tramite, costo, persona);
        this.numero_licencia = numero_licencia;
        this.vigencia = vigencia;
        this.estado = estado;
    }

    /**
     * Constructor vació para constuir ua instancia de Licencia.
     */
    public Licencia() {
    }

    /**
     * Devuelve el número de la licencia.
     *
     * @return El número de la licencia.
     */
    public String getNumero_licencia() {
        return numero_licencia;
    }

    /**
     * Establece el número de la licencia.
     *
     * @param numero_licencia El número de la licencia.
     */
    public void setNumero_licencia(String numero_licencia) {
        this.numero_licencia = numero_licencia;
    }

    /**
     * Devuelve la fecha de vigencia de la licencia.
     *
     * @return La fecha de vigencia de la licencia.
     */
    public GregorianCalendar getVigencia() {
        return vigencia;
    }

    /**
     * Establece la fecha de vigencia de la licencia.
     *
     * @param vigencia La fecha de vigencia de la licencia.
     */
    public void setVigencia(GregorianCalendar vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Devuelve el estado de la licencia.
     *
     * @return El estado de la licencia.
     */
    public byte getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la licencia.
     *
     * @param estado El estado de la licencia.
     */
    public void setEstado(byte estado) {
        this.estado = estado;
    }

}
