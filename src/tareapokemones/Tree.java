
package tareapokemones;


//Utilizando un Arbol Binario de Busqueda para guardar el historial de habitaciones
public class Tree {
    private NodeTree root;
    private int size;
    
    
    public Tree() {
        root = null;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    // Metodo para agregar un cliente al la lista de reservaciones
    public void addElement(int watts, Gift store){
        root = insertElement(root,watts,store);
        size++;
    }
    
    //Metodo privado recursivo de insertar un nodo al arbol
    private NodeTree insertElement(NodeTree node, int watts, Gift store) {
        if (node == null) {
            return new NodeTree(watts,store);
        }if (watts < node.getNum()){
            node.setLeft(insertElement(node.getLeft(),watts,store));
        }else if(watts > node.getNum()){
            node.setRight(insertElement(node.getRight(),watts,store));
        }
        
        return node;
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
        NodeTree node = new NodeTree(numWatts[middle],GiftObj(gifts,middle));
       
        node.setLeft(insertClient(numWatts, start, middle - 1,gifts));
        node.setRight(insertClient(numWatts, middle + 1,end,gifts));
        
        return node;
    }

    
    // Metodo para buscar clientes que se han hospedado en una habitacion
    public Gift searchElement(int watts){
        return search(root,watts);
    }
    //Metodo privado recursivo de buscar un nodo en el arbol
    private Gift search(NodeTree node, int num){
        if(node == null || node.getNum() == num){
            return node != null ? node.getStore() : null;
        }
        if(num < node.getNum()){
            return search(node.getLeft(),num);
        }else{
            return search(node.getRight(),num);
        }
    }
   
    public void inorder() {
        inorderRec(root);
    }
    
    private void inorderRec(NodeTree root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.print(root.getNum() + " ");
            inorderRec(root.getRight());
        }
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
            if(currentNode.getGift().getPrice() == watts+1)return currentNode.getGift();  
            currentNode = currentNode.getNext();
        }
        return null;
    }
}