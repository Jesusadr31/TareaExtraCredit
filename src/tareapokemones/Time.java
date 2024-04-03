package tareapokemones;

/**
 *Clase que representa el tiempo en el juego.
 * Esta clase es para representar el tiempo que se transcurrirá en el programa.
 * @author chris
 */
public class Time {
    private long currentTime;
    private int time;

    /**
     * Constructor vacío de la clase tiempo.
     */
    public Time() {
        
    }

    /**
     * Obtiene el tiempo actual.
     * @return el tiempo actual
     */
    public long getCurrentTime() {
        return currentTime;
    }
    
    /**
     * Obtiene el tiempo.
     * @return el tiempo
     */
    public int getTime() {
        return time;
    }

    /**
     * Asigna nuevo valor al tiempo actual.
     * @param currentTime nuevo tiempo actual
     */
    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    /**
     * Asigna nuevo valor al tiempo.
     * @param time nuevo tiempo.
     */
    public void setTime(int time) {
        this.time = time;
    }

}
