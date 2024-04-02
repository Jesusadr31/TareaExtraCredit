
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
    public void insertarFinal(Gift gift,int num){
        NodeList newNode = new NodeList(gift,num);
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
    
    public void insertarFinal(Pokemon pokemon,Tree t){
        NodeList newNode = new NodeList(pokemon,t);
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
    
    public void insertarFinal(Pokemon pokemon){
        NodeList newNode = new NodeList(pokemon);
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
    
    public NodeList search(String poke){
        NodeList currentNode = head;
        while(currentNode != null){
            if(currentNode.getPokemon().getName().equals(poke)){
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
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
    
    public String printPokemon(){
        NodeList currentNodo = head;
        String result = "";
        int cont= 1;
        while(currentNodo != null){
            result += "->" + cont +" "+ currentNodo.getPokemon().getName() + "\n";
            currentNodo = currentNodo.getNext();
            cont++;
        }return result;
    }
    
    public String printStore(){
        NodeList currentNodo = head;
        String result = "";
        int cont=1;
        while(currentNodo != null){
            result += "->"+ cont + "\n Regalo: " + currentNodo.getGift().getElement() + "\n";
            result += "Costo: " + Integer.toString(currentNodo.getGift().getPrice()) + "\n";
            result += "Relacion: " + Integer.toString(currentNodo.getGift().getEffect()) + "\n";
            currentNodo = currentNodo.getNext();
            cont ++;
            
        }return result;
    }
    
    
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
