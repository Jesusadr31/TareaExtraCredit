
package tareapokemones;

import interfaces.Menu;
import javax.swing.JOptionPane;

/**
 *Clase Main donde se ejecuta todo el programa.
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

        ReproSound player = new ReproSound();
        String ruta = "..\\1-01-Title-Demo-_Departure-From-The.wav";
        player.loadSound(ruta);
        player.loop();
        
        
        Menu ventana = new Menu();
        ventana.show();
       
    }
    
  
}