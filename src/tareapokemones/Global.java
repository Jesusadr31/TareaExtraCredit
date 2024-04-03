package tareapokemones;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *Clase que representa funciones globales para acceder a ellas en el programa.
 * Esta clase contiene la creación de estructuras de datos como arboles, listas, entre otras, donde se relacionan en el programa para almacenar datos y valores.
 * @author chris
 */
public class Global {
    private static Account user = new Account();
    private static Tree utility = new Tree();
    private static List store = new List();
    private static List Pokemons = new List();
    private static Time playtime = new Time();
    private static Tree invent = new Tree();
    private static Game game = new Game(new Pokemon("",0,""),new Tree(),0);
    private static ImageIcon icon = new ImageIcon();
    


    //Métodos Getters and Setters.
    /**
     * Método Getter para obtener el juego.
     * @return el juego de la clase Game.
     */
    public static Game getGame() {
        return game;
    }

    /**
     * Método Setter para asignarle otro valor al parametro de el juego.
     * @param game nuevo valor para game.
     */
    public static void setGame(Game game) {
        Global.game = game;
    }

    /**
     * Método Getter para obtener una lista de la tienda.
     * @return lista de tienda.
     */
    public static List getStore() {
        return store;
    }

    /**
     * Método Setter para asignarle nuevo valor a Store.
     * @param store nuevo valor de Store
     */
    public static void setStore(List store) {
        Global.store = store;
    }

    /**
     * Método Getter para obtener una lista de pokemones.
     * @return la lista de pokemones.
     */
    public static List getPokemons() {
        return Pokemons;
    }

    /**
     * Método Setter para asignarle nuevo valor a Pokemons.
     * @param Pokemons nuevo valor de Pokemons.
     */
    public static void setPokemons(List Pokemons) {
        Global.Pokemons = Pokemons;
    }

    /**
     * Método Getter para obtener el valor del tiempo en la variable playtime.
     * @return el tiempo a través de la variable.
     */
    public static Time getPlaytime() {
        return playtime;
    }

    /**
     * Método Setter para asignarle nuevo valor a playtime.
     * @param playtime nuevo valor para el tiempo en playtime.
     */
    public static void setPlaytime(Time playtime) {
        Global.playtime = playtime;
    }

    /**
     * Método Getter para obtener una cuenta de usuario.
     * @return cuenta de usuario.
     */
    public static Account getUser() {
        return user;
    }

    /**
     * Método Setter para asignarle nuevo valor ala cuenta de user.
     * @param user nuevo valor para la cuenta de user.
     */
    public static void setUser(Account user) {
        Global.user = user;
    }

    /**
     * Método Getter para obtener un arbol de utilidades.
     * @return arbol de utilidades.
     */   
    public static Tree getUtility() {
        return utility;
    }

    /**
     * Método Setter para asignarle nuevo valor al arbol de utility.
     * @param utility nuevo valor para el arbol de utility.
     */
    public static void setUtility(Tree utility) {
        Global.utility = utility;
    }

    /**
     * Método Getter para obtener un arbol de inventario.
     * @return arbol  de inventario.
     */
    public static Tree getInvent() {
        return invent;
    }

    /**
     * Método Setter para asignarle nuevo valor al arbol de invent.
     * @param invent nuevo valor para arbol de invent (inventario).
     */
    public static void setInvent(Tree invent) {
        Global.invent = invent;
    }

    /**
     * Método Getter para obtener el icono.
     * @return el icono.
     */
    public static ImageIcon getIcon() {
        return icon;
    }

    /**
     * Método Setter para asignarle nuevo icono.
     * @param icon nuevo icono.
     */
    public static void setIcon(ImageIcon icon) {
        Global.icon = icon;
    }
    
    
}

