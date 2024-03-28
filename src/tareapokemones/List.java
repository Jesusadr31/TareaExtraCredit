
package tareapokemones;

/**
 *
 * @author chris
 */
public class List {
    private NodeList head;
    private int size;
    
    public List(){
        head = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void insertarInicio(Gift gift){
        NodeList newNodo = new NodeList(gift);
        if(isEmpty()){
            head = newNodo;
 
        }else{
            newNodo.setNext(head);
            head = newNodo;
        }
        size ++;
    }
    
    public void insertarFinal(Gift gift){
        NodeList newNode = new NodeList(gift);
        if(isEmpty()){
            head = newNode;
        }
        else{
            NodeList currentNodo = head;
            while(currentNodo.getNext() != null){
                currentNodo = currentNodo.getNext();
            }
            currentNodo.setNext(newNode);
        }
        size++;
    }
    
    
    
    public String printGift(){
        NodeList currentNodo = head;
        String result = "";
        while(currentNodo != null){
            result += "Regalo: " + currentNodo.getGift().getElement()+ "\n";
            result += "Costo: " + currentNodo.getGift().getPrice() + "\n";
            result += "Efecto: " + currentNodo.getGift().getEffect() + "\n";
            currentNodo = currentNodo.getNext();
            
        }return result;
    }

    
    /*public void printCi() {
        NodeList nodoActual = head;
        while (nodoActual != null) {
            System.out.println(nodoActual.getClient().getCi());
            nodoActual = nodoActual.getNext();
        }
    }
    public void print() {
        NodeList nodoActual = head;
        while (nodoActual != null) {
            System.out.println(nodoActual.getRoomNum());
            nodoActual = nodoActual.getNext();
        }
    }*/
    
    public void print() {
        NodeList nodoActual = head;
        while (nodoActual != null) {
            System.out.println(nodoActual.getGift().getElement());
            nodoActual = nodoActual.getNext();
        }
    }

    public NodeList getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void setHead(NodeList head) {
        this.head = head;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
