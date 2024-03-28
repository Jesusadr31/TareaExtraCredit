
package tareapokemones;

/**
 *
 * @author chris
 */
public class NodeTree{
    private int num;
    private Gift store;
    
    private NodeTree left,right;
    
    public NodeTree(int num,Gift store){
        this.num = num;
        this.store = store;
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
    
    
}

