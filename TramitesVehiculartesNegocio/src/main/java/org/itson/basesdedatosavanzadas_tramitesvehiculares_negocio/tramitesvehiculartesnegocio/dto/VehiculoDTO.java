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

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    
    
    
}
