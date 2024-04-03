package tareapokemones;

/**
 *Clase que representa al Pokemón y sus atributos.
 * Esta clase contiene la informacion de los pokemones y un metodo para actualizar el estado de animo.
 * @author chris
 */
public class Pokemon {
    private String name;
    private int relation;
    private String status;
    

    /**
     * Constructor de la clase Pokemon.
     * @param name nombre del pokemon
     * @param relation relacion del pokemon
     * @param status estado del pokemon
     */
    public Pokemon(String name, int relation,String status) {
        this.name = name;
        this.relation = relation;
        this.status = status;
    }

    /**
     * Obtiene el nombre del pokemon
     * @return nombre del pokemon
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene relacion del pokemon
     * @return relacion del pokemon
     */
    public int getRelation() {
        return relation;
    }
     
    /**
     * Asigna nuevo nombre al pokemon
     * @param name nuevo nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Asigna nueva relacion al pokemon.
     * @param relation relacion nueva del pokemon
     */
    public void setRelation(int relation) {
        this.relation = relation;
    }
    
    /**
     * Método para incrementar la relacion del pokemon
     * @param num nuevo incremento
     */
    public void SumRelation(int num){
        this.relation += num;
        if(this.relation >= 10000){
            this.relation=10000;
        }
    }

    /**
     * Obtiene el estado de animo del pokemon
     * @return estado de animo
     */
    public String getStatus() {
        return status;
    }

    /**
     * Asigna nuevo estado de animo al pokemon
     * @param status nuevo estado de animo
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Método para actualizar el estado de animo del pokemon.
     */
    public void UpdateStatus(){
        if(relation >= 0 && relation <= 2000){
            this.status = "Sigh";
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
