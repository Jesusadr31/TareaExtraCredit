
package tareapokemones;

/**
 *
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
    
    public NodeList(Gift gift){
        this.gift = gift;
        this.next = null;
    }
    
    public NodeList(Gift gift,int num){
        this.num = num;
        this.gift = gift;
        this.next = null;
    }
    
    public NodeList(Gift gift,List store){
        this.gift = gift;
        this.store = store;
        this.next = null;
    }
    
    public NodeList(Pokemon pokemon){
        this.pokemon = pokemon;
        this.next = null;
    }
     
    public NodeList(Pokemon pokemon, Tree t){
        this.pokemon = pokemon;
        this.inventory = t;
        this.next = null;
    }
    
    public NodeList(Pokemon pokemon, Tree t,int currentWatts){
        this.pokemon = pokemon;
        this.currentWatts = currentWatts;
        this.inventory = t;
        this.next = null;
    }
    
    public void setNext(NodeList next) {
        this.next = next;
    }
    
    public Gift getGift() {
        return gift;
    }

    public NodeList getNext() {
        return next;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Tree getInventory() {
        return inventory;
    }

    public List getStore() {
        return store;
    }

    public void setInventory(Tree inventory) {
        this.inventory = inventory;
    }

    public void setStore(List store) {
        this.store = store;
    }

    public int getCurrentWatts() {
        return currentWatts;
    }

    public void setCurrentWatts(int currentWatts) {
        this.currentWatts = currentWatts;
    }
    
    
}

