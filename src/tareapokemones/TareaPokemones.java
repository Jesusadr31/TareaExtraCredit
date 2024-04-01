
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
        Read doc = new Read();
        try{       
            doc.ReadStore(); 

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo importar");
        }

        Menu ventana = new Menu();
        ventana.show();
       
    }
    
}