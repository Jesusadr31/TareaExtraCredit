
package tareapokemones;



/**
 * Clase que representa los atributos de los regalos.
 * Esta clase contiene métodos para poder acceder e imprimir los atributos de los regalos.
 * @author Jesús
 */

public class Gift {
    private String element;
    private int price;
    private int effect;
    
    /**
     * Constructor de la clase Gift.
     * @param element indica el elemento que contendrá  el regalo.
     * @param price indica el precio del regalo.
     * @param effect indica la relación que otroga el regalo al pokemón.
     */
    
    public Gift(String element, int price, int effect){
        this.element = element;
        this.price = price;
        this.effect = effect;
    }
    /**
     * Método para imprimir el regalo con sus atributos.
     * @return una variable para mostrar aquellos atributos.
     */
    public String printGift(){
       
        String result = "";
   
        result += "\n Regalo: " + element + "\n";
        result += "Costo: " + price + "\n";
        result += "Relacion: " + effect + "\n";
 
        return result;
    
    }

    //Métodos Getters and Setters
    
    /**Método Getter que obtiene elemento del regalo.
     * 
     * @return el elemento del regalo.
     */
    public String getElement() {
        return element;
    }

    /**
     * Método Getter que obtiene el precio del regalo.
     * @return el precio del regalo.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Método Getter que obtiene la relación del regalo.
     * @return la relación del regalo.
     */
    public int getEffect() {
        return effect;
    }

    /**
     * ´Método Setter que asigna el elemento del regalo.
     * @param element nuevo elemento del regalo.
     */
    public void setElement(String element) {
        this.element = element;
    }

    /**
     * Método Stter que asiga el precio del regalo.
     * @param price nuevo precio del regalo.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Método Setter que asigna la relación del regalo.
     * @param effect nueva relación del regalo.
     */
    public void setEffect(int effect) {
        this.effect = effect;
    }
    
    
}
