package tareapokemones;

/**
 *
 * @author chris
 */
public class Global {
    private static Account user = new Account();
    private static Tree utility = new Tree();
    private static List store = new List();
    private static List Pokemons = new List();
    private static Time playtime = new Time();
    private static Tree invent = new Tree();



    public static List getStore() {
        return store;
    }

    public static void setStore(List store) {
        Global.store = store;
    }

    public static List getPokemons() {
        return Pokemons;
    }

    public static void setPokemons(List Pokemons) {
        Global.Pokemons = Pokemons;
    }

    public static Time getPlaytime() {
        return playtime;
    }

    public static void setPlaytime(Time playtime) {
        Global.playtime = playtime;
    }

    public static Account getUser() {
        return user;
    }

    public static void setUser(Account user) {
        Global.user = user;
    }

    public static Tree getUtility() {
        return utility;
    }

    public static void setUtility(Tree utility) {
        Global.utility = utility;
    }

    public static Tree getInvent() {
        return invent;
    }

    public static void setInvent(Tree invent) {
        Global.invent = invent;
    }
    
    
}

