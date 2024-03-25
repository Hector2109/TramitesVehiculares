/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia_entidad.tramitesvehicularespersisencia;

import java.io.Serializable;
import java.util.GregorianCalendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
@Entity
@DiscriminatorValue("Placa")
@Table (name = "Placas")
public class Placa extends Tramite implements Serializable {

    
    /**
     * Matricula de la placa
     */
    @Column (name = "matriula", nullable = false, unique = true, length = 7)
    private String matricula;
    
    /**
     * Fecha de modificacion de placa en un automovil
     */
    @Column (name = "fecha_recepcion", nullable = true)
    private GregorianCalendar fecha_recepcion;

    /**
     * Estado de la placa
     */
    @Column(name = "estado", nullable = false)
    private byte estado;
    
    @ManyToOne
    @JoinColumn (name = "id_vehiculo", nullable = false)
    private Vehiculo vehiculo;

    /**
     * Constructor usado para la generacíon de una placa nueva para un automovil
     * @param matricula matricula de la placa
     * @param estado estado de la placa
     * @param fecha_tramite fecha en que se realizo la solictud del trámite
     * @param costo costo del trámite de placas
     * @param persona persona que solicito las placas
     */
    public Placa(
            String matricula,
            byte estado, 
            GregorianCalendar fecha_tramite, 
            Float costo, Persona persona) {
        super(fecha_tramite, costo, persona);
        this.matricula = matricula;
        this.estado = estado;
    }

    /**
     * Método el cual se usa para generar placas nuevas a un vehiculo que ya esta registrado
     * @param matricula matricula de su placa
     * @param fecha_recepcion fecha en que se otorgan las placas modificadas
     * @param estado estado de las placas
     * @param fecha_tramite fecha en que se solciito el trámite
     * @param costo costo del trámite
     * @param persona persona la cual solicito el trámite
     */
    public Placa(String matricula, 
            GregorianCalendar fecha_recepcion, 
            byte estado, 
            GregorianCalendar fecha_tramite,
            Float costo, 
            Persona persona) {
        super(fecha_tramite, costo, persona);
        this.matricula = matricula;
        this.fecha_recepcion = fecha_recepcion;
        this.estado = estado;
    }

    /**
     * Constructor vacio
     */
    public Placa() {
    }
    
        

    /**
     * Método que obtiene la matricula
     * @return matricula de la placa
     */
    public String getMatricula() {
        return matricula;
    }
    
    /**
     * Método para establecer matricula de la placa
     * @param matricula 
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Método para obtener la fecha en que 
     * se modifico la placa
     * @return fecha de modifciacion de la placa
     */
    public GregorianCalendar getFecha_recepcion() {
        return fecha_recepcion;
    }

    /**
     * Método para establecer la fecha de modificacion de las placas
     * @param fecha_recepcion fecha de modificacion de placas
     */
    public void setFecha_recepcion(GregorianCalendar fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    /**
     * Método para obtener el estado de las placas
     * @return estadod e las placas
     */
    public byte getEstado() {
        return estado;
    }

    /**
     * Método para establecer el estado de las placas
     * @param estado estado de la placa
     */
    public void setEstado(byte estado) {
        this.estado = estado;
    }
    
    
    
    
}
