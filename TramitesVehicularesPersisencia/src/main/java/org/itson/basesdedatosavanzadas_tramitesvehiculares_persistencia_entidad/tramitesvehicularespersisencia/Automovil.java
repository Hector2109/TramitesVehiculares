/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
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
@DiscriminatorValue("Automovil")
@Table(name = "automoviles")
public class Automovil extends Vehiculo implements Serializable {

    
    /**
     * Número de serie del vehiculo
     */
    @Column(name = "numero_serie", nullable =false, unique = true)
    private String numero_serie;
    
    /**
     * Línea a la pertenece el automovil
     */
    @Column(name = "linea", nullable =false)
    private String linea;
    
    /**
     * Modelo del automovil
     */
    @Column (name = "modelo", nullable = false)
    private String modelo;

    /**
     * Constructor vacio
     */
    public Automovil() {
    }

    /**
     * Construictor que instancia al automovil
     * @param numero_serie númeroi de serie del automovil
     * @param linea linea del automovil
     * @param modelo modelo del automovil
     */
    public Automovil(String numero_serie, String linea, String modelo) {
        this.numero_serie = numero_serie;
        this.linea = linea;
        this.modelo = modelo;
    }
    
    
            
    /**
     * Método para btener el numero de serie del automovil
     * @return número de serie del automovil
     */
    public String getNumero_serie() {
        return numero_serie;
    }

    /**
     * Método para establecer el número de serie del automovil
     * @param numero_serie número de serie del automovil
     */
    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    /**
     * Método para obtener la línea del automovil
     * @return linea del automovil
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Método para establecer la linea del automovil
     * @param linea linea del automovil
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Método para obtener el modelo del automovil
     * @return modelo del automovil
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método para establecer el modelo del automovil
     * @param modelo modelo del automovil
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
