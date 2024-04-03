
package tareapokemones;

/**
 *Clase que representa una lista enlazada para almacenar datos en ella.
 * Esta clase contiene todo lo referente al cuerpo de una lista enlazada con sus primitivas para recorrer y acceder a sus datos.
 * @author chris
 */
public class List {
    private NodeList head;
    private int size;
    
    /**
     * Constructor de la clase List.
     */
    public List(){
        head = null;
    }
    /**
     * Método para verificar si la lista está vacía.
     * @return null si está vacía la lista.
     */
    public boolean isEmpty(){
        return head == null;
    }
    
    /**
     * Método para insertar un regalo de tipo Gift al final de la lista
     * @param gift regalo que se insertará en la lista.
     */
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
    
    /**
     * Método para insertar al final un regalo y un número que será tomado como el precio.
     * @param gift regalo que se insertará en la lista.
     * @param num precio.
     */
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
    
    /**
     * Método para insertar al final de la lista un pokemon y un arbol para almacenar los datos.
     * @param pokemon pokemon a insertar.
     * @param t arbol EDD.
     */
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
    
    /**
     * Método para insertar al final un pokemón en la lista.
     * @param pokemon pokemón a insertar.
     */
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
    /**
     * Método para buscar un pokemón en una EDD.
     * @param poke pokemón que se desea buscar.
     * @return el nodo que encontrará el pokemón.
     */
    public NodeList search(String poke){
        NodeList currentNode = head;
        while(currentNode != null){
            if(currentNode.getPokemon().getName().toLowerCase().equals(poke.toLowerCase())){
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }
    
    public NodeList searchNum(int num){
        NodeList currentNode = head;
        int cont = 1 ;
        while(currentNode != null){
            if(cont == num){
                return currentNode;
            }
            currentNode = currentNode.getNext();
            cont++;
        }
        return null;
    }
    
    /**
     * Método para mostrar los regalos.
     * @return variable para mostrar los detalles de cada regalo.
     */
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
    
    /**
     * Método para mostrar los pokemones. 
     * @return variable para mostrar los detalles de los pokemones.
     */
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
    
    /**
     * Método para mostrar la tienda de regalos.
     * @return variable para mostrar los regalos con sus detalles en la tienda.
     */
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
    
    public String printgamePachi(){
        NodeList currentNodo = head;
        String result = "";
        int cont=1;
        while(currentNodo != null){
            result += "->"+ cont + "\n Regalo: " + currentNodo.getGift().getElement() + "\n";
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

    //Métodos Getters and Strers.
    
    /**
     * Método Getter para obtener la cabeza de la lista.
     * @return el primer elemento de la lista.
     */
    public NodeList getHead() {
        return head;
    }

    /**
     * Método para obtener el tamaño de la lista.
     * @return el tamaño de la lista.
     */
    public int getSize() {
        return size;
    }

    /**
     * Método para asignar un nuevo valor en la cabeza de la lista.
     * @param head nueva cabeza de la lista.
     */
    public void setHead(NodeList head) {
        this.head = head;
    }

    /**
     * Métodom para asignarle un nuevo tamaño a la lista.
     * @param size nuevo tamaño de la lista.
     */
    public void setSize(int size) {
        this.size = size;
    }

}
