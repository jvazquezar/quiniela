package quiniela;

/**
 * Esta clase representa una excepción personalizada para manejar errores relacionados con pronósticos
 * incorrectos en una quiniela.
 */
public class Partido1X2Exception extends Exception {

    /**
     * Constructor predeterminado de la excepción.
     */
    public Partido1X2Exception() {
    	
    }

    /**
     * Constructor que acepta un mensaje descriptivo del error.
     * 
     * @param message Mensaje descriptivo del error.
     */
    public Partido1X2Exception(String message) {
        super(message);

    }

    /**
     * Constructor que acepta una causa específica del error.
     * 
     * @param cause Causa específica del error.
     */
    public Partido1X2Exception(Throwable cause) {
        super(cause);

    }

    /**
     * Constructor que acepta un mensaje descriptivo del error y una causa específica.
     * 
     * @param message Mensaje descriptivo del error.
     * @param cause Causa específica del error.
     */
    public Partido1X2Exception(String message, Throwable cause) {
        super(message, cause);

    }

    /**
     * Constructor que acepta un mensaje descriptivo del error, una causa específica, y opciones para
     * habilitar/deshabilitar la supresión y la capacidad de escritura en la pila de llamadas.
     * 
     * @param message Mensaje descriptivo del error.
     * @param cause Causa específica del error.
     * @param enableSuppression Indica si la supresión está habilitada o no.
     * @param writableStackTrace Indica si la capacidad de escritura en la pila de llamadas está habilitada o no.
     */
    public Partido1X2Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);

    }

}
