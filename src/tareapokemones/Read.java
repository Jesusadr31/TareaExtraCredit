
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
 *
 * @author chris
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
    /*
    public void Load() throws FileNotFoundException, IOException{
        
        boolean city = false; 
        int i = 0;

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
                if(line.equals("ciudad")){
                    city = true;
                    line = in.readLine();
                }
                if(line.equals("aristas")){
                    city = false;
                    line = in.readLine();
                }
                if(city == true){
                    numVert++;
                }else{
                    aristas[i] = line;
                    numAri++;
                    i++;
                }
                    line = in.readLine();
            }            
	}
    }
    
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
            
            
            fw.write("ciudad\n");
            for (int i = 1; i < grafo.getNumVerts()+1; i++) {
                fw.write(i+" ");
                fw.write("\n");
            }
            
            fw.write("aristas\n");
            for (int i = 0; i < grafo.getNumVerts(); i++) {
                for (int j = 0; j < grafo.getNumVerts(); j++) {
                    if (grafo.getMatrixAdy()[i][j] != 0) {
                        fw.write(String.valueOf(i+1)+","+ String.valueOf(j+1) +","+String.valueOf(grafo.getMatrixAdy()[i][j])+"");
                        fw.write("\n");
                    }
                }
            }
            fw.close();

        }
    }*/
    
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
