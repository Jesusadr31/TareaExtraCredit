
package tareapokemones;

/**
 *
 * @author chris
 */
public class NodeList {
   
    private Gift gift;
    private int watts;
    private NodeList next;
    
    public NodeList(Gift gift){
        this.gift = gift;
        this.next = null;
    }
   
    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
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
    
}

