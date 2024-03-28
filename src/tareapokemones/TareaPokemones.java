
package tareapokemones;

import interfaces.Menu;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesús
 */
public class TareaPokemones {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReadCsv doc = new ReadCsv(); // Objeto para leer datos desde un archivo CSV
        try{
        
            doc.Read(); // Lee los datos desde el archivo CSV
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo importar");
        }
        
        Menu ventana = new Menu();
        ventana.setVisible(true);
       
    }
    
}