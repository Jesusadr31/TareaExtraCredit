package tareapokemones;

/**
 *
 * @author chris
 */
public class Time {
    private long currentTime;
    private int time;

    public Time() {
        
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public int getTime() {
        return time;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public void setTime(int time) {
        this.time = time;
    }

}
