
package tareapokemones;

/**
 * Clase que representa el arbol como Estructura de Datos (EDD).
 * Esta clase representa la implementacion de un arbol como EDD.
 * @author Jesús
 */

public class Tree {
    private NodeTree root;
    private int size;
    
    /**
     * Constructor de la raiz del arbol de la clase Tree.
     */
    public Tree() {
        root = null;
    }
    
    /**
     * Método para obtener la altura.
     * @param N Nodo del arbol
     * @return altura del arbol
     */
    public int altura(NodeTree N) {
        if (N == null)
            return 0;
        return N.getHeight();
    }
    
    /**
     * Método para saber si está vacío el arbol.
     * @return null si la raiz no contiene nada.
     */
    public boolean isEmpty(){
        return root == null;
    }
    
    
    /**
     * Método para añadir regalos al arbol.
     * @param numWatts numero de watts
     * @param gifts regalos
     */
    public void addGift(int[] numWatts,List gifts){
        root = insert(numWatts,0,numWatts.length-1,gifts);
        size++;
    }
    /**
     * Método para insertar en el arbol
     * @param numWatts numero de watts
     * @param start inicio
     * @param end final
     * @param gifts regalos 
     * @return 
     */
    private NodeTree insert(int[] numWatts, int start, int end,List gifts) {
        
        if (start > end) {
            return null;
        }
        // Obtener el elemento medio del arreglo y hacerlo raíz
        int middle = (start + end) / 2;
        NodeTree node = new NodeTree(numWatts[middle],GiftObj(gifts,numWatts[middle]));
       
        node.setLeft(insert(numWatts, start, middle - 1,gifts));
        node.setRight(insert(numWatts, middle + 1,end,gifts));
        
        node.setHeight(1 + Math.max(altura(node.getLeft()), altura(node.getRight())));
        
        int balance = getBalance(node);

        // Si el nodo se desbalanceó, hay 4 casos

        // Caso Izquierda Izquierda
        if (balance > 1 && numWatts[middle] < node.getLeft().getNum())
            return rotacionDerecha(node);

        // Caso Derecha Derecha
        if (balance < -1 && numWatts[middle] > node.getRight().getNum())
            return rotacionIzquierda(node);

        // Caso Izquierda Derecha
        if (balance > 1 && numWatts[middle] > node.getLeft().getNum()) {
            node.setLeft(rotacionIzquierda(node.getLeft())); 
            return rotacionDerecha(node);
        }

        // Caso Derecha Izquierda
        if (balance < -1 && numWatts[middle] < node.getRight().getNum()) {
            node.setRight(rotacionDerecha(node.getRight()));
            return rotacionIzquierda(node);
        }
        
        return node;
    }

    
    /**
     * Método para buscar un elemento.
     * @param watts watts 
     * @return la raiz con los watts
     */
    public NodeTree searchElement(int watts){
        return search(root,watts);
    }
    /**
     * Metodo privado recursivo de buscar un nodo en el arbol.
     * @param node nodo del arbol
     * @param num numero
     * @return retorna la busqueda.
     */
    private NodeTree search(NodeTree node, int num){
        if(node == null || node.getNum() == num){
            return node != null ? node: null;
        }
        if(num < node.getNum()){
            return search(node.getLeft(),num);
        }else{
            return search(node.getRight(),num);
        }
    }
   
    /**
     * Método inorder 
     * @return la raiz.
     */
    public String inorder() {
    return inorderRec(root);
}

    /**
     * Método para recorrer el arbol inorder.
     * @param root raiz del arbol
     * @return variable para mostrar
     */
    private String inorderRec(NodeTree root) {
        String result = "";
        if (root != null) {
            result += inorderRec(root.getLeft()); // Agrega el resultado de la rama izquierda
            result += "->" + root.getStore().getElement()+ " : " + root.getCont() + "\n"; // Agrega el número actual
            result += inorderRec(root.getRight()); // Agrega el resultado de la rama derecha
            
        }
        return result; // Devuelve el resultado completo
    }


    /**
     * Eliminar un nodo del arbol recursivamente.
     * @param num numero a eliminar
     */
    public void delete(int num){
        root = deleteNode(root, num);
    }
    
    /**
     * Método para eliminar nodo del arbol.
     * @param node nodo del arbol
     * @param num numero 
     * @return nodo
     */
    private NodeTree deleteNode(NodeTree node, int num) {
        if (node == null) {
            return null; 
        }
        if (num < node.getNum()) {
            node.setLeft(deleteNode(node.getLeft(), num));
        } else if (num > node.getNum()) {
            node.setRight(deleteNode(node.getRight(), num));
        } else {
        
            if (node.getLeft() == null && node.getRight() == null) {
                return null;
            }
            
            else if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            }
            // Caso 3: Nodo con dos hijos.
            else {
                node.setNum(foundMini(node.getRight()));  // O encontrarMaximo(nodo.izquierdo).
                node.setRight(deleteNode(node.getRight(), node.getNum()));
            }
        }
        return node;
    }

    /**
     * Método para obtener el apuntador izquierdo con el dato.
     * @param nodo
     * @return el numero del nodo
     */
    private int foundMini(NodeTree nodo) {
        while (nodo.getLeft() != null) {
            nodo = nodo.getLeft();
        }
        return nodo.getNum();
    }
    
    /**
     * Obtiene el tamaño del arbol.
     * @return tamaño del arbol.
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Método
     * @param gifts regalos
     * @param watts watts
     * @return 
     */
    public Gift GiftObj(List gifts,int watts){
        NodeList currentNode = gifts.getHead();
        while(currentNode != null){
            if(currentNode.getGift().getPrice() == watts)return currentNode.getGift();  
            currentNode = currentNode.getNext();
            
        }
        return null;
    }
    
    /**
     * Método para obtener el balance del arbol.
     * @param N nodo
     * @return la altura.
     */
    public int getBalance(NodeTree N) {
        if (N == null)
            return 0;
        return altura(N.getLeft()) - altura(N.getRight());
    
    }
    
    /**
     * Método para rotar el arbol hacia la derecha.
     * @param y nodo
     * @return nodo con el apuntador izquierda
     */
    private NodeTree rotacionDerecha(NodeTree y) {
        NodeTree x = y.getLeft();
        NodeTree T2 = x.getRight();
        x.setRight(y);
        y.setLeft(T2);
        y.setHeight(Math.max(altura(y.getLeft()), altura(y.getRight())) + 1);
        x.setHeight(Math.max(altura(x.getLeft()), altura(x.getRight())) + 1);
        return x;
    }

    /**
     * Método para rotar el arbol hacia la izquierda.
     * @param x nodo
     * @return nodo con el apuntador derecho.
     */
    private NodeTree rotacionIzquierda(NodeTree x) {
        NodeTree y = x.getRight();
        NodeTree T2 = y.getLeft();
        y.setLeft(x);
        x.setRight(T2);
        x.setHeight(Math.max(altura(x.getLeft()), altura(x.getRight())) + 1);
        y.setHeight(Math.max(altura(y.getLeft()), altura(y.getRight())) + 1);
        return y;
    }
    
    
}