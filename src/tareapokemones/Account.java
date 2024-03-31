package tareapokemones;

/**
 *
 * @author chris
 */
public class Account {
    private List utility;
    private int watts;

    public Account() {
        this.utility = new List();
        this.watts = 0;
    }
    
    public void SumWatts(int num){
        this.watts += num;
    }
    
    public void SumTime(){
        this.watts += 1;
    }
    
    public void ResWatts(int num){
        this.watts -= num;
    }
    
    public List getUtility() {
        return utility;
    }

    public void setUtility(List utility) {
        this.utility = utility;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }
}
