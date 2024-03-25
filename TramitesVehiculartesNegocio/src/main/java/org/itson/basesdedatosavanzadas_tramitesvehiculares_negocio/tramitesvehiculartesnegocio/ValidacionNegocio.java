package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio.dto.AutomovilDTO;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
public class ValidacionNegocio {
    
    /**
     * Método que válida si un automovil tiene sus camos de forma correcta
     * @param automovilDTO automovil a evaluar
     * @return true si los datos cumplen el formato, false en caso contrario
     */
    public static boolean validacionAutomovil(AutomovilDTO automovilDTO){
        
        if (automovilDTO.getMarca().length()>50){
            return false;
        }else if (automovilDTO.getColor().length()>50){
            return false;
        }else if (!(automovilDTO.getNumero_serie().length()==17)){
            return false;
        }else if (automovilDTO.getModelo().length()>50){
            return false;
        }else if (automovilDTO.getLinea().length()>50){
            return false;
        }
        return true;
        
    }
    
}
