package tareapokemones;

/**
 *
 * @author chris
 */
public class Pokemon {
    private String name;
    private int relation;
    private String status;
    


    public Pokemon(String name, int relation,String status) {
        this.name = name;
        this.relation = relation;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getRelation() {
        return relation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelation(int relation) {
        this.relation = relation;
    }
    
    public void SumRelation(int num){
        this.relation += num;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void UpdateStatus(){
        if(relation >= 0 && relation <= 2000){
            this.status = "Sight";
        }else if(relation >= 2000 && relation <= 4000){
            this.status = "Angry";
        }else if(relation >= 4000 && relation <= 6000){
            this.status = "Normal";
        }else if(relation >= 6000 && relation <= 8000){
            this.status = "Happy";
        }else if(relation >= 8000 && relation <= 10000){
            this.status = "Inspired";
        }
    }
}
