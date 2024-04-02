
package tareapokemones;

/**
 *Clase que representa el nodo de la lista enlazada.
 * Esta clase contiene los atributos del nodo de la lista enlazada.
 * @author chris
 */
public class NodeList {
    
    private int num;
    private Gift gift;
    private int currentWatts;
    private Pokemon pokemon;
    private Tree inventory = new Tree();
    private List store = new List();
    private NodeList next;
    
    /**
     *Constructor de la clase NodeList 
     * @param gift  regalos
     */
    public NodeList(Gift gift){
        this.gift = gift;
        this.next = null;
    }
    
    /**
     * Constructor de la clase NodeList
     * @param gift regalos 
     * @param num numero
     */
    public NodeList(Gift gift,int num){
        this.num = num;
        this.gift = gift;
        this.next = null;
    }
    
    /**
     * Constructor de la clase NodeList
     * @param gift regalo
     * @param store tienda
     */
    public NodeList(Gift gift,List store){
        this.gift = gift;
        this.store = store;
        this.next = null;
    }
    
    /**
     * Constructor de la clase NodeList
     * @param pokemon pokemon
     */
    public NodeList(Pokemon pokemon){
        this.pokemon = pokemon;
        this.next = null;
    }
     
    /**
     * Constructor de la clase NodeList
     * @param pokemon pokemon
     * @param t arbol
     */
    public NodeList(Pokemon pokemon, Tree t){
        this.pokemon = pokemon;
        this.inventory = t;
        this.next = null;
    }
    
    /**
     * Constructor de la clase NodeList
     * @param pokemon pokemon
     * @param t arbol
     * @param currentWatts watts actuales
     */
    public NodeList(Pokemon pokemon, Tree t,int currentWatts){
        this.pokemon = pokemon;
        this.currentWatts = currentWatts;
        this.inventory = t;
        this.next = null;
    }

    /**
     * Método para obtener el numero.
     * @return un numero.
     */
    public int getNum() {
        return num;
    }

    /**
     * Método para asignarle nuevo numero
     * @param num nuevo numero.
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * Mñetodo para obtener el regalo.
     * @return regalo.
     */
    public Gift getGift() {
        return gift;
    }

    /**
     * Método para asignar nuevo regalo
     * @param gift regalo nuevo.
     */
    public void setGift(Gift gift) {
        this.gift = gift;
    }

    /**
     * Método para obtener los watts actuales.
     * @return los watts actuales.
     */
    public int getCurrentWatts() {
        return currentWatts;
    }

    /**
     * Método para asignar nuevo valor a los watts.
     * @param currentWatts watts actualizados.
     */
    public void setCurrentWatts(int currentWatts) {
        this.currentWatts = currentWatts;
    }

    /**Método para obtener el pokemon.
     * @return the pokemon
     */
    public Pokemon getPokemon() {
        return pokemon;
    }

    /**Método para asignar un pokemon
     * @param pokemon the pokemon to set
     */
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    /**
     * Método para obtener el inventario.
     * @return the inventory
     */
    public Tree getInventory() {
        return inventory;
    }

    /**
     * Método para asignar al inventario.
     * @param inventory the inventory to set
     */
    public void setInventory(Tree inventory) {
        this.inventory = inventory;
    }

    /**
     * Método para obtener la tienda.
     * @return the store
     */
    public List getStore() {
        return store;
    }

    /**
     * @param store the store to set
     */
    public void setStore(List store) {
        this.store = store;
    }

    /**
     * Método para obtener nodo siguiente.
     * @return the next
     */
    public NodeList getNext() {
        return next;
    }

    /**
     * Metodo para settear el sigiente nodo.
     * @param next the next to set
     */
    public void setNext(NodeList next) {
        this.next = next;
    }
    
    
    
    
}

