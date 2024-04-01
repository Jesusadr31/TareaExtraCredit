package tareapokemones;

/**
 * Clase que representa atributos para un juego.
 * Esta clase contiene constructor y métodos getter and setter.
 * @author chris
 */
public class Game {
    private Pokemon pk;
    private Tree inven;
    private int currentWatts;

    /**
     * Constructor de la clase Game
     * @param pk atributo de tipo Pokemón.
     * @param inven Arbol de intentario.
     * @param currentWatts Watts actuales de tipo entero.
     */
    public Game(Pokemon pk, Tree inven, int currentWatts) {
        this.pk = pk;
        this.inven = inven;
        this.currentWatts = currentWatts;
    }
    /**
     * Getter de pk
     * @return retorna información del pokemón.
     */
    public Pokemon getPk() {
        return pk;
    }
    /**
     * Setter de pk
     * @param pk asigna valor al pk de tipo Pokemon.
     */
    public void setPk(Pokemon pk) {
        this.pk = pk;
    }
    /**
     * Getter de Inven
     * @return retorna un arbol de inventario.
     */
    public Tree getInven() {
        return inven;
    }
    /**
     * Stter de Invent
     * @param inven asigna valor al arbol de inventario.
     */
    public void setInven(Tree inven) {
        this.inven = inven;
    }
    /**
     * Getter de CurrentWatts
     * @return el valor de los watts actuales.
     */
    public int getCurrentWatts() {
        return currentWatts;
    }
    /**
     * Setter de CurrentWatts
     * @param currentWatts asigna valor a los watts actuales.
     */
    public void setCurrentWatts(int currentWatts) {
        this.currentWatts = currentWatts;
    }

}
