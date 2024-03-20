/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 * @author Abe
 */
@Entity
@Table(name = "tramites")
public class Tramite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tramite")
    private Long id;
    
    @Column(name = "fecha_tramite")
    private Date fecha_tramite;
    
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "costo")
    private Float costo;

    /**
     * Regresa el valor de la fecha de tramite
     * @return valor de la fecha de tramite
     */
    public Date getFecha_tramite() {
        return fecha_tramite;
    }

    /**
     * Establece el valor de la fecha de tramite
     * @param fecha_tramite valor de la fecha de tramite
     */
    public void setFecha_tramite(Date fecha_tramite) {
        this.fecha_tramite = fecha_tramite;
    }

    /**
     * Regresa el tipo de tramite
     * @return valor del tipo de tramite
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el valor del tipo
     * @param tipo valor del tipo de tramite
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Regresa el valor del costo
     * @return valor del costo
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Establece el valor del costo
     * @param costo valor del costo
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }
    
    /**
     * Regresa el valor del id
     * @return valor del id
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el valor del id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metodo hash de la entidad
     * @return regresa el hash del objeto
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * Verifica que el objeto del parametro sea igual
     * @param object objeto a comparar
     * @return regresa verdadero o falso si son iguales los objetos
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tramite)) {
            return false;
        }
        Tramite other = (Tramite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Regresa una cadena de texto con los valores de la entidad
     * @return cadena de texto con los valores
     */
    @Override
    public String toString() {
        return "org.itson.basesdedatosavanzadas_tramitesvehiculares_dominio.tramitesvehicularesdominio.Tramite[ id=" + id + " ]";
    }
    
}
