
package tareapokemones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 * Clase que representa la lectura del archivo CSV.
 * Esta clase contiene los métodos para leer un archivo CSV y cargarlo o guardarlo.
 * @author Jesús
 */
public class Read {
    Account user = Global.getUser();
    Tree inven = Global.getInvent();
    List store = Global.getStore();
    List pokemons = Global.getPokemons();

    private String [] values_store;
    
    private int [] watts;
    //private List giftlist = new List();

    private String filePathStore = "..\\Store.csv";
    
    
    /**
     * Método para leer la tienda en el archivo.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void ReadStore()throws FileNotFoundException, IOException{
        String line = "";
        int cont = 0;
        //Importar el archivo de reservas
        BufferedReader reser = new BufferedReader(new FileReader(filePathStore));
        try{  
            while ((line = reser.readLine()) != null) {
                if (cont > 0) {
                    values_store = line.split(",");

                    store.insertarFinal(new Gift(values_store[0],Integer.parseInt(values_store[1]),Integer.parseInt(values_store[2])));

                }
                cont += 1;
            }
       
            
        watts = wattsnum(store);
        
        inven.addGift(watts,store);
        
        
        pokemons.insertarFinal(new Pokemon("Pikachu",0,"Sigh"));
        pokemons.insertarFinal(new Pokemon("Pachirisu",0,"Sigh"));
  
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "NO SE PUDO IMPORTAR");
        } 
    }
    
    /**
     * Método para cargar un archivo
     * @param inven1 arbol de inventario
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void Load(Tree inven1) throws FileNotFoundException, IOException{
        
        int cont = 0;
        boolean poke = false; 
        boolean w1 = false;
        boolean w = false;
        int i = 0;
        int [] inventory =new int[15];
        int [] inventory1 =new int[15];
        

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Select txt");
	jfc.setAcceptAllFileFilterUsed(false);
	FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo texto", "txt");
	jfc.addChoosableFileFilter(filter);

	int Value = jfc.showOpenDialog(null);
		
        
	if (Value == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
                        
            BufferedReader in;
            in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                if(line.equals("Pokemons")){
                    line = in.readLine();
                    user.getUtility().insertarFinal(new Pokemon(line,0,"Sight"),inven1);
                    cont ++;
                    if(cont == 2){
                       
                        line = in.readLine();
                        user.getUtility().insertarFinal(new Pokemon(line,0,"Sight"),inven1);
                        cont ++;
                    }
                }
                if(line.equals("Relacion") && cont > 0){
                    line = in.readLine();
                    user.getUtility().getHead().getPokemon().setRelation(Integer.parseInt(line));
                    if(cont == 2){
                        user.getUtility().getHead().getNext().getPokemon().setRelation(Integer.parseInt(line));
                    }
                }
                if(line.equals("Watts")){
                    line = in.readLine(); 
                    user.setWatts(Integer.parseInt(line));
                }
                if(line.equals("Invetory")&& cont > 0){
                    w = true;
                    line = in.readLine();
                    if(cont == 2){
                        w1 = true;
                    }
                }
                if(w == true){
                    
                    inventory[i] = Integer.parseInt(line);
                    i++;
                } 
                if(w1 == true){
                    
                    inventory1[i] = Integer.parseInt(line);
                    i++;
                }
                line = in.readLine();
            }
        }
        int cont1 = 100;
        for (int j = 0; j < 9; j++) {
            user.getUtility().getHead().getInventory().searchElement(cont1).setCont(inventory[j]);
            if(user.getUtility().getHead().getNext()!= null){
                user.getUtility().getHead().getNext().getInventory().searchElement(cont1).setCont(inventory[j]);
            }
            cont1+=100;
        }
    }
    
    /**
     * Método para guardar un archivo de juego.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void Save()throws FileNotFoundException, IOException{
        
        
        JFileChooser fc = new JFileChooser();
            
        
        fc.setDialogTitle("Guardar Grafo...");
        fc.setDialogType(JFileChooser.SAVE_DIALOG);

        
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));

        int seleccion = fc.showSaveDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            
            File fichero = fc.getSelectedFile();

            if (!fichero.getName().endsWith(".txt")) {
                
                fichero = new File(fichero.getAbsolutePath() + ".txt");
            } 
            FileWriter fw = null;
            
            fw = new FileWriter(fichero);
            
           
            fw.write("Pokemons\n");
            
                fw.write(user.getUtility().getHead().getPokemon().getName()+" ");
                fw.write("\n");
            
            
            fw.write("Relacion\n");
            fw.write(user.getUtility().getHead().getPokemon().getRelation()+" ");
            fw.write("\n");
                    
                
            fw.write("Watts\n");
            fw.write(user.getWatts()+" ");
            fw.write("\n");
            
            int cont = 100;
            fw.write("Iventary\n");
            for (int i = 1; i < 9; i++) {
                fw.write(user.getUtility().getHead().getInventory().searchElement(cont).getCont()+" ");
                fw.write("\n");
                cont += 100;
            }
            
            if(user.getUtility().getHead().getNext() != null){
                fw.write("Pokemons\n");
                fw.write(user.getUtility().getHead().getNext().getPokemon().getName() + " ");
                fw.write("\n");

                fw.write("Relacion\n");
                fw.write(user.getUtility().getHead().getNext().getPokemon().getRelation() + " ");
                fw.write("\n");

                fw.write("Watts\n");
                fw.write(user.getWatts() + " ");
                fw.write("\n");

                cont = 100;
                fw.write("Iventary\n");
                for (int i = 1; i < 9; i++) {
                    fw.write(user.getUtility().getHead().getNext().getInventory().searchElement(cont).getCont() + " ");
                    fw.write("\n");
                    cont += 100;
                }
            }
            
            fw.close();
            
            

        }
    }
    
    /**
     * 
     * @param giftslist
     * @return 
     */
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
