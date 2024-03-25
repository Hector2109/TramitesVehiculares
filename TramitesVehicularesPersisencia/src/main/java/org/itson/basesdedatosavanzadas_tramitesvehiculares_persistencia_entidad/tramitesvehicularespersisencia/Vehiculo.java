/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Abe
 */
@Entity
@Table(name = "vehiculos")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_vehiculo")
public class Vehiculo implements Serializable {

    /**
     * Identificador del vehiculo
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private Long id_vehiculo;
    
    /**
     * Marca del vehiculo
     */
    @Column (name = "marca", nullable = false)
    private String marca;
    
    /**
     * Color del vehiculo
     */
    @Column (name = "color", nullable = false)
    private String color;

    /**
     * Método para obtener el identificadr dekl vehiculo
     * @return id del vehiculo
     */
    public Long getId_vehiculo() {
        return id_vehiculo;
    }

    /**
     * Método para establecer identificador del vehiculo
     * @param id id del vehiculo
     */
    public void setId_vehiculo(Long id) {
        this.id_vehiculo = id;
    }

    /**
     * Método para obtener la marca del vehiculo
     * @return 
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para establecer la marca del vehiculo
     * @param marca marca del vehicuo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para obtener el color del vehiculo
     * @return 
     */
    public String getColor() {
        return color;
    }

    /**
     * Método para establecer el color del vehiculo
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_vehiculo != null ? id_vehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.id_vehiculo == null && other.id_vehiculo != null) || (this.id_vehiculo != null && !this.id_vehiculo.equals(other.id_vehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id_vehiculo=" + id_vehiculo + '}';
    }

    
    
}
