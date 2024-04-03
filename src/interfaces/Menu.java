package interfaces;

import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import tareapokemones.Account;
import tareapokemones.Global;
import tareapokemones.List;
import tareapokemones.Read;
import tareapokemones.Time;
import tareapokemones.Tree;

/**
 *Ventana del menu principal donde se ejecutarán las acciones principales del programa.
 * En esta ventana, el usuario puede iniciar un nuevo juego, puede cargar un juego ya creado anteriormente, puede aprender a jugar utilizando el programa
 * y además podrá tener una vista de los créditos que se otorgan por el desempeño del programa.
 * 
 * @author Jesús
 */
public class Menu extends javax.swing.JFrame {
    Tree inven = Global.getInvent();
    Account user = Global.getUser();
    List pokemons = Global.getPokemons();
    Time playtime = Global.getPlaytime();
    
    
    /**
     * Constructor de la clase Menu.
     * Inicializa los componentes de la interfaz gráfica, centra la ventana y desactiva la capacidad de redimensionamiento.
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNewGame = new javax.swing.JButton();
        btnLoadGame = new javax.swing.JButton();
        btnHowToPlay = new javax.swing.JButton();
        btnCredits = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNewGame.setBackground(new java.awt.Color(255, 255, 153));
        btnNewGame.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnNewGame.setText("New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 180, 40));

        btnLoadGame.setBackground(new java.awt.Color(255, 255, 153));
        btnLoadGame.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnLoadGame.setText("Load Game");
        btnLoadGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadGameActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoadGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 180, 40));

        btnHowToPlay.setBackground(new java.awt.Color(255, 255, 153));
        btnHowToPlay.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnHowToPlay.setText("How To Play");
        btnHowToPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHowToPlayActionPerformed(evt);
            }
        });
        jPanel1.add(btnHowToPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 180, 40));

        btnCredits.setBackground(new java.awt.Color(255, 255, 153));
        btnCredits.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnCredits.setText("Credits");
        btnCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditsActionPerformed(evt);
            }
        });
        jPanel1.add(btnCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 180, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 50, -1));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel2.setText("POKEMON GAME");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 200, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 50));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagePikachu1.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 170));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagePikachu2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 120, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción realizada al presionar el botón para iniciar un nuevo juego.
     * Cierra la ventana actual y redirecciona a la ventana de nuevo juego.
     * 
     * @param evt El evento de acción que desencadena esta acción.
     */
    
    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        ShowPokemons poke = new ShowPokemons();
        poke.show(true);
        this.dispose();
    }//GEN-LAST:event_btnNewGameActionPerformed

    /**
     * Acción realizada al presionar el botón para conocer la esencia del juego, y poder ver como jugarlo.
     * Muestra un mensaje en formato de JOptionPane, para indicar cobo saber jugar.
     * @param evt El evento de acción que desencadena esta acción.
     */

    private void btnHowToPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHowToPlayActionPerformed
        JOptionPane.showMessageDialog(null, """
                                    >>>>>>>>>>>>>>>>>>>>>>>>   APRENDE A JUGAR POKEMON GAME    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
                                            
                                         Este programa consiste en un juego de probabilidades acerca de pokemones
                                         en donde el usuario puede escoger el pokemon con el que desea jugar. 
                                         A continuación se presentan las funciones del juego:
                                            
                                         >>>NEW GAME<<<
                                            Iniciamos escogiendo el pokemón con el que se quiere jugar(Pikachu/Pachirisu)
                                            Una vez escogido el pokemón se dirige a una ventana para poder acceder a las
                                            demás funciones del juego en donde podremos:
                                            
                                            - Visualizar a los pokemones
                                               "Muestra el pokemon con su información y los regalos que posee"
                                            
                                            - Ver el estado de relación de los pokemones
                                               "Indicar el número del pokemon que se posee para poder identificar el estado"
                                            
                                            - Dirigirse a la tienda
                                               "Se debe de indicar el pokemón y el regalo que se desea comprar"
                                            
                                            - Iniciar el juego
                                               "Se debe de indicar el número del pokemón y los watts que se quieren apostar"
                                            
                                            - Agregar pokemón (Debes tener +8000 relación)
                                            
                                            - Guardar juego
                                               "Se puede guardar un juego existente para ser conservado"
                                            
                                         >>>LOAD GAME<<<
                                            Esta función permite al usuario poder cargar un archivo de juego ya creado 
                                            anteriormente con el fin de preservar los datos.
                                            
                                         >>>CREDITS<<<
                                            Muestra los créditos de los creadores del programa y todos aquellos créditos
                                            adicionales de imágenes y sonidos.
                                            """, "¿Cómo jugar Pokemon Game?", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHowToPlayActionPerformed

    /**
     * Acción realizada al presionar el botón para cargar un juego existente.
     * Esta acción permite al usuario poder importar el archivo de juego ya creado.
     * 
     * @param evt El evento de acción que desencadena esta acción.
     */
    
    private void btnLoadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadGameActionPerformed
        
        Read doc = new Read();
        long j;
        try{
            
            doc.Load(inven);
            
            
            long x = System.currentTimeMillis();
            j = TimeUnit.MILLISECONDS.toSeconds(x);
            playtime.setCurrentTime(j);
            vtnPrincipal vtn = new vtnPrincipal();
            vtn.show();
            this.dispose();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo importar");
        }
    }//GEN-LAST:event_btnLoadGameActionPerformed

    private void btnCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditsActionPerformed
        JOptionPane.showMessageDialog(null, """
                                             >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   CRÉDITOS    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
                                            
                                                    PROGRAMADORES: Angulo, Jesús / Sanchez, Christian
                                            
                                                    REFERENCIA DE IMÁGENES:
                                            
                                                        https://www.wikidex.net/wiki/Pikachu_%28Pok%C3%A9mon_UNITE%29

                                                        https://i.pinimg.com/originals/89/35/5d/89355d9b2954ed401254c4c52ff5a058.png
                                            
                                                        https://sprites.pmdcollab.org/
                                            
                                            
                                                    REFERENCIA DE SONIDOS:
                                            
                                                        https://downloads.khinsider.com/game-soundtracks/album/pokemon-ruby-sapphire
                                                        -music-super-complete/1-01%2520Title%2520Demo%2520~Departure%2520From%2520The.mp3
                                            """, "CREDITOS DEL PROGRAMA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCreditsActionPerformed

    /**
     * Método principal para ejecutar la aplicación.
     * Crea y muestra la ventana de menú principal.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizados en esta aplicación).
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCredits;
    private javax.swing.JButton btnHowToPlay;
    private javax.swing.JButton btnLoadGame;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
