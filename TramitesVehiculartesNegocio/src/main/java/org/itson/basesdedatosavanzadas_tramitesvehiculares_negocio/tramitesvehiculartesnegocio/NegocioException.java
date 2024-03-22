package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.tramitesvehiculartesnegocio;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
public class NegocioException extends Exception {

    /**
     * Construye una nueva instancia de NegocioException con un mensaje
     * específico.
     *
     * @param message El mensaje que describe la excepción.
     */
    public NegocioException(String message) {
        super(message);
    }

    /**
     * Construye una nueva instancia de NegocioException con un mensaje
     * específico y una causa raíz.
     *
     * @param message El mensaje que describe la excepción.
     * @param cause La causa raíz que desencadenó esta excepción.
     */
    public NegocioException(String message, Throwable cause) {
        super(message, cause);
    }

}
