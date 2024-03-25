package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto;

/**
 *
 * @author @author Hector Espinoza & Abel Sanchez
 */
public class AutomovilDTO extends VehiculoDTO{
    
    /**
     * Representa el número de serie de un automovil
     */
    private String numero_serie;
    
    /**
     * Representa la linea de un automovil
     */
    private String linea;
    
    /**
     * Representa el modelo de un automovil
     */
    private String modelo;

    public AutomovilDTO() {
    }

    
    
    /**
     * Obtiene el numero des serie de un automovil
     * @return número de serie del autoovil
     */
    public String getNumero_serie() {
        return numero_serie;
    }

    /**
     * Retorna la linea del automovil
     * @return linea del automovil
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Retorna el modelo del automovil
     * @return modelo del automovil
     */
    public String getModelo() {
        return modelo;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
}
