package tareapokemones;

import interfaces.vtnPrincipal;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *Clase que representa una cuenta de un usuario.
 * Esta clase contiene los metodos Getters and setters del usuario para poder acceder y otorgar valores
 * @author chris
 */
public class Account {
    private List utility;
    private int watts;

    /**
     * Contructor vacío de la clase Account.
     * @param utility Lista de utilidades de la cuenta.
     * @param watts inciializados en valor 0.
     * 
     */
    
    public Account() {
        this.utility = new List();
        this.watts = 0;
    }
    
    /**
     * Método para sumar los watts mediante un número entero.
     * @param num número de watts a sumar.
     */
    public void SumWatts(int num){
        this.watts += num;
    }
    /**
     * Método para incrementar el tiempo.
     * 
     */
    public void SumTime(){
        this.watts += 1;
    }
    /**
     * Método para restar los watts mediante un número entero.
     * @param num número de watts a restar.
     */
    public void ResWatts(int num){
        this.watts -= num;
    }
    /**
     * Getter de Utilidad.
     * @return retorna una lista de utilidades.
     */
    public List getUtility() {
        return utility;
    }
    /**
     * Setter de Utilidad.
     * @param utility para asignarle valor a la lista.
     */
    public void setUtility(List utility) {
        this.utility = utility;
    }
    /**
     * Getter de Watts.
     * @return retorna el valor de watts.
     */
    public int getWatts() {
        return watts;
    }
    /**
     * Setter de Watts.
     * @param watts para asignarle valor a los watts.
     */
    public void setWatts(int watts) {
        this.watts = watts;
    }
    
}
