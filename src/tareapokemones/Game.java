package tareapokemones;

/**
 *
 * @author chris
 */
public class Game {
    private Pokemon pk;
    private Tree inven;
    private int currentWatts;

    public Game(Pokemon pk, Tree inven, int currentWatts) {
        this.pk = pk;
        this.inven = inven;
        this.currentWatts = currentWatts;
    }
    
    public Pokemon getPk() {
        return pk;
    }

    public void setPk(Pokemon pk) {
        this.pk = pk;
    }

    public Tree getInven() {
        return inven;
    }

    public void setInven(Tree inven) {
        this.inven = inven;
    }

    public int getCurrentWatts() {
        return currentWatts;
    }

    public void setCurrentWatts(int currentWatts) {
        this.currentWatts = currentWatts;
    }

}
