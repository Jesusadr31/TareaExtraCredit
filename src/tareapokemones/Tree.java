
package tareapokemones;


//Utilizando un Arbol Binario de Busqueda para guardar el historial de habitaciones
public class Tree {
    private NodeTree root;
    private int size;
    
    
    public Tree() {
        root = null;
    }
    
     // Obtener la altura del nodo
    public int altura(NodeTree N) {
        if (N == null)
            return 0;
        return N.getHeight();
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    //Falta agregar las habitaciones
    public void addGift(int[] numWatts,List gifts){
        root = insertClient(numWatts,0,numWatts.length-1,gifts);
        size++;
    }
    // Metodo para agregar un cliente en habitaciones agarrando un arreglo
    private NodeTree insertClient(int[] numWatts, int start, int end,List gifts) {
        
        if (start > end) {
            return null;
        }
        // Obtener el elemento medio del arreglo y hacerlo raíz
        int middle = (start + end) / 2;
        NodeTree node = new NodeTree(numWatts[middle],GiftObj(gifts,numWatts[middle]));
       
        node.setLeft(insertClient(numWatts, start, middle - 1,gifts));
        node.setRight(insertClient(numWatts, middle + 1,end,gifts));
        
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

    
    // Metodo para buscar clientes que se han hospedado en una habitacion
    public NodeTree searchElement(int watts){
        return search(root,watts);
    }
    //Metodo privado recursivo de buscar un nodo en el arbol
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
   
    public String inorder() {
    return inorderRec(root);
}

    private String inorderRec(NodeTree root) {
        String result = "";
        if (root != null) {
            result += inorderRec(root.getLeft()); // Agrega el resultado de la rama izquierda
            result += "->" + root.getStore().getElement()+ " : " + root.getCont() + "\n"; // Agrega el número actual
            result += inorderRec(root.getRight()); // Agrega el resultado de la rama derecha
            
        }
        return result; // Devuelve el resultado completo
    }


    //Eliminar un nodo del arbol recursivamente
    public void delete(int num){
        root = deleteNode(root, num);
    }
    
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

    private int foundMini(NodeTree nodo) {
        while (nodo.getLeft() != null) {
            nodo = nodo.getLeft();
        }
        return nodo.getNum();
    }
    public int getSize() {
        return size;
    }
    
    public Gift GiftObj(List gifts,int watts){
        NodeList currentNode = gifts.getHead();
        while(currentNode != null){
            if(currentNode.getGift().getPrice() == watts)return currentNode.getGift();  
            currentNode = currentNode.getNext();
            
        }
        return null;
    }
    
    public int getBalance(NodeTree N) {
        if (N == null)
            return 0;
        return altura(N.getLeft()) - altura(N.getRight());
    
    }
    
    // Rotación a la derecha
    private NodeTree rotacionDerecha(NodeTree y) {
        NodeTree x = y.getLeft();
        NodeTree T2 = x.getRight();
        x.setRight(y);
        y.setLeft(T2);
        y.setHeight(Math.max(altura(y.getLeft()), altura(y.getRight())) + 1);
        x.setHeight(Math.max(altura(x.getLeft()), altura(x.getRight())) + 1);
        return x;
    }

    // Rotación a la izquierda
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