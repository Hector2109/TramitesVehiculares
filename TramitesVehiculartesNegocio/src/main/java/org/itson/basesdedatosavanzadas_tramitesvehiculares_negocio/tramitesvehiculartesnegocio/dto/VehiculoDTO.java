package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
public class VehiculoDTO {
    
    /**
     * Representa la marca de un vehiculo
     */
    private String marca;
    
    /**
     * Representa el color de un vehiculo;
     */
    private String color;

    /**
     * Retorna la marca de un vehiculo
     * @return marca del vehiculo
     */
    public String getMarca() {
        return marca;
    }

    public VehiculoDTO() {
    }
    
    

    /**
     * Retorna el color de un vehiculo
     * @return 
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece la marca del vehiculo
     * @param marca marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Establece el color dl vehiculo
     * @param color color
     */
    public void setColor(String color) {
        this.color = color;
    }
   
    
    
    
}
