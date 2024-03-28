
package tareapokemones;


public class Gift {
    private String element;
    private int price;
    private int effect;
    
    public Gift(String element, int price, int effect){
        this.element = element;
        this.price = price;
        this.effect = effect;
    }

    public String getElement() {
        return element;
    }

    public int getPrice() {
        return price;
    }

    public int getEffect() {
        return effect;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }
    
    
}
