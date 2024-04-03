
package tareapokemones;

/**
 *Clase que representa el nodo del arbol como EDD.
 * Esta clase contiene todos los componentes de la estructura de datos.
 * @author chris
 */
public class NodeTree{
    private int num,height;
    private List gifts;
    private int cont;
    private Gift store;
    private NodeTree left,right;
    
    /**
     * Constructor de la clase NodeTree
     * @param num número entero 
     */
    public NodeTree(int num){
        this.num = num;
        this.gifts = new List();
        this.left = this.right = null;
    }
    
    /**
     * Constructor de la clase NodeTree
     * @param num numero entero
     * @param store tienda
     * @param gifts regalos
     */
    public NodeTree(int num,Gift store,List gifts){
        this.num = num;
        this.gifts = gifts;
        this.store = store;
        this.left = this.right = null;
    }
    
    /**
     * Constructor de la clase NodeTree
     * @param num numero entero
     * @param store tienda
     */
    public NodeTree(int num,Gift store){
        this.num = num;
        this.store = store;
        this.cont = 0;
        this.left = this.right = null;
    }
    
    /**
     * Obtiene el número.
     * @return el número.
     */
    public int getNum() {
        return num;
    }

    /**
     * Asigna nuevo id
     * @param id id para acceder a valores.
     */
    public void setNum(int id) {
        this.num = id;
    }

    /**
     * Obtiene el nodo izquierdo del arbol
     * @return nodo izquierdo.
     */
    public NodeTree getLeft() {
        return left;
    }

    /**
     * Obtiene el nodo derecho del arbol
     * @return nodo derecho.
     */
    public NodeTree getRight() {
        return right;
    }

    /**
     * Asigna nuevo nodo izquierdo
     * @param left nuevo nodo izquierdo
     */
    public void setLeft(NodeTree left) {
        this.left = left;
    }

    /**
     * Asigna nuevo nodo derecho
     * @param right nuevo nodo derecho
     */
    public void setRight(NodeTree right) {
        this.right = right;
    }

    /**
     * Obtiene la tienda
     * @return la tienda
     */
    public Gift getStore() {
        return store;
    }

    /**
     * Asigna valor a la tienda.
     * @param store la tienda de regalos.
     */
    public void setStore(Gift store) {
        this.store = store;
    }

    /**
     * Obtiene la altura
     * @return la altura
     */
    public int getHeight() {
        return height;
    }

    /**
     * Asigna nuevo valor a la altura
     * @param height nueva altura
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Obtiene los regalos
     * @return regalos
     */
    public List getGifts() {
        return gifts;
    }

    /**
     * Asigna nuevos regalos
     * @param gifts nuevos regalos
     */
    public void setGifts(List gifts) {
        this.gifts = gifts;
    }

    /**
     * Obtiene el contador
     * @return el contador
     */
    public int getCont() {
        return cont;
    }
    
    /**
     * Método para incrementar el contador.
     */
    public void sumCont() {
        this.cont += 1;
    }

    /**
     * Asigna nuevo contador
     * @param cont nuevo contador
     */
    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
}

