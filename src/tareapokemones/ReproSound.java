
package tareapokemones;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *Clase que representa la reproduccion de musica.
 * Esta clase contiene los metodos para reproducir la música dentro del juego.
 * @author Jesús
 */
public class ReproSound {
    private Clip clip;

    /**
     * Método para cargar el sonido de música
     * @param filePath archivo ruta
     */
    public void loadSound(String filePath) {
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(filePath));
            clip = AudioSystem.getClip();
            clip.open(audioIn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método para iniciar la reproducción del sonido.
     */
    public void play() {
        if (clip != null) {
            clip.start();
        }
    }
    
    /**
     * Método para crear un bucle de reproducción del sonido.
     */
    public void loop() {
        if (clip != null) {
            clip.loop(1000000000);
        }
    }
}
