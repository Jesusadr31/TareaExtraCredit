
package tareapokemones;

/**
 *
 * @author chris
 */
public class NodeTree{
    private int num,height;
    private List gifts;
    private int cont;
    private Gift store;
    
    private NodeTree left,right;
    
    public NodeTree(int num){
        this.num = num;
        this.gifts = new List();
        this.left = this.right = null;
    }
    public NodeTree(int num,Gift store,List gifts){
        this.num = num;
        this.gifts = gifts;
        this.store = store;
        this.left = this.right = null;
    }
    
    public NodeTree(int num,Gift store){
        this.num = num;
        this.store = store;
        this.cont = 0;
        this.left = this.right = null;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int id) {
        this.num = id;
    }

    
    public NodeTree getLeft() {
        return left;
    }

    public NodeTree getRight() {
        return right;
    }

    public void setLeft(NodeTree left) {
        this.left = left;
    }

    public void setRight(NodeTree right) {
        this.right = right;
    }

    public Gift getStore() {
        return store;
    }

    public void setStore(Gift store) {
        this.store = store;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List getGifts() {
        return gifts;
    }

    public void setGifts(List gifts) {
        this.gifts = gifts;
    }

    public int getCont() {
        return cont;
    }
    
    public void sumCont() {
        this.cont += 1;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
}

