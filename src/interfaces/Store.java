package interfaces;

import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import tareapokemones.Account;
import tareapokemones.Global;
import tareapokemones.List;
import tareapokemones.NodeList;
import tareapokemones.Time;

/**
 *
 * @author chris
 */
public class Store extends javax.swing.JFrame {
    Account user = Global.getUser();
    List store = Global.getStore();
    Time playtime = Global.getPlaytime();
    long j = playtime.getCurrentTime();

    /**
     * Creates new form Store
     */
    public Store() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        user.SumWatts(10);
        textAreaStore.setText(store.printStore());
        watts.setText(Integer.toString(user.getWatts()));
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
        btnChoose = new javax.swing.JButton();
        txtnum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        watts = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        txtPokemon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaStore = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Store");
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnChoose.setBackground(new java.awt.Color(255, 255, 153));
        btnChoose.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        btnChoose.setText("Escoger");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });
        jPanel1.add(btnChoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 150, 30));
        jPanel1.add(txtnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 150, 30));

        jLabel1.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        jLabel1.setText("Elija un regalo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 110, -1));

        jLabel2.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        jLabel2.setText("Watts");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        watts.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        watts.setText("watt");
        jPanel1.add(watts, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 40, -1));

        btnExit.setBackground(new java.awt.Color(255, 255, 153));
        btnExit.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        btnExit.setText("Regresar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 150, 30));

        txtPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPokemonActionPerformed(evt);
            }
        });
        jPanel1.add(txtPokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 150, 30));

        jLabel3.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        jLabel3.setText("Pokemon");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 350));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaStore.setColumns(20);
        textAreaStore.setRows(5);
        jScrollPane1.setViewportView(textAreaStore);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 300));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 310, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        vtnPrincipal principal = new vtnPrincipal();
        principal.show();
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        String name;
        int n;
        
        try {
            
            if(txtnum.getText().equals("") && txtPokemon.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe completar el campo");
            }else{
                n = Integer.parseInt(txtnum.getText());
                name = txtPokemon.getText().toLowerCase();                
                
                int cont = 0;
                NodeList currentNode = user.getUtility().getHead();
                while (currentNode != null) {
                    if (currentNode.getPokemon().getName().toLowerCase().equals(name)) {
                        NodeList current = store.getHead();
                        while (current != null) {
                            if (cont == n - 1) {
                                if (user.getWatts() >= current.getGift().getPrice()) {
                                    int input = JOptionPane.showConfirmDialog(null, "Desea comprar este regalo?");
                                    // 1= sí, 2 = no, 0 = cancelar
                                    switch (input) {
                                        case JOptionPane.YES_OPTION -> {
                                            currentNode.getInventory().searchElement(current.getGift().getPrice()).sumCont();
                                            currentNode.getPokemon().SumRelation(current.getGift().getEffect());
                                            currentNode.getPokemon().UpdateStatus();
                                            user.ResWatts(current.getGift().getPrice());
                                            JOptionPane.showMessageDialog(null, "Objeto comprado!!");
                                        }
                                        case JOptionPane.NO_OPTION -> JOptionPane.showMessageDialog(null, "Compra rechazada");
                                        case JOptionPane.CANCEL_OPTION -> JOptionPane.showMessageDialog(null, "Cancelada");
                                        default -> {
                                        }
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(null, "No hay bs");
                                }
                            }
                            cont++;
                            current = current.getNext();
                        }

                    }
                    currentNode = currentNode.getNext();
                }
                

            }
            
            watts.setText(Integer.toString(user.getWatts()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valores Invalidos!!");
        }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void txtPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPokemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPokemonActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaStore;
    private javax.swing.JTextField txtPokemon;
    private javax.swing.JTextField txtnum;
    private javax.swing.JLabel watts;
    // End of variables declaration//GEN-END:variables
}
