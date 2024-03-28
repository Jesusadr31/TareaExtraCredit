
package tareapokemones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class ReadCsv {
    Tree store = Global.getStore();
    
    private String [] values_store;
    
    private int [] watts;
    private List giftlist = new List();

    private String filePathStore = "C:\\Users\\chris\\OneDrive\\Escritorio\\Pokemon\\Store.csv";
    
    String line = "";
    int cont = 0;
    
    public void Read()throws FileNotFoundException, IOException{
        //Importar el archivo de reservas
        BufferedReader reser = new BufferedReader(new FileReader(filePathStore));
        try{  
            while ((line = reser.readLine()) != null) {
                if (cont > 0) {
                    values_store = line.split(",");
                    giftlist.insertarFinal(new Gift(values_store[0],Integer.parseInt(values_store[1]),Integer.parseInt(values_store[2])));
                    
                }
                cont += 1;
            }
            cont=0;
            
        watts = wattsnum(giftlist);
        
        store.addGift(watts, giftlist);
        
        store.inorder();
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "NO SE PUDO IMPORTAR");
        } 
    }
    
    public int [] wattsnum(List giftslist){
        int tamaño = giftslist.getSize();
        int[] array = new int[tamaño];
        NodeList currentNode = giftslist.getHead();
        int i = 0;
        while (currentNode != null) {
            if(currentNode.getGift().getPrice() != 0){
                array[i] = currentNode.getGift().getPrice();
            } 
            currentNode = currentNode.getNext();
            i++;
        }
        return array;
    }
}
