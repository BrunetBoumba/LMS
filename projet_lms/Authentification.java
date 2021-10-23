/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_lms;
import controle.connetion.ControleConnection;
import javax.swing.JOptionPane;
import projet_lms.Gestion_Abonnes;
import projet_lms.Gestion_articles;
import projet_lms.CreationCompteGestionnaire;
/**
 *
 * @author Princy-Grace
 */
public class Authentification extends javax.swing.JFrame {

    /**
     * Creates new form Authentification
     */
    public Authentification() {
        initComponents();
        setLocationRelativeTo(null);
        
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
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxT_MDP = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxT_nom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(39, 103, 165));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 61, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LOGICIEL LMS");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 136, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Logiciel de Gestion de Bibliothèque ");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 167, 171, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/user_90px.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 87));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 260));

        jTxT_MDP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTxT_MDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 184, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mot de passe :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Créer un compte utilisateur");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jTxT_nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTxT_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 184, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nom d'utilisateur :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("PAGE DE CONNECTION");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 21, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 49, 194, 10));

        jValider.setText("Connexion...");
        jValider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jValiderMouseClicked(evt);
            }
        });
        jValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jValiderActionPerformed(evt);
            }
        });
        jValider.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jValiderKeyPressed(evt);
            }
        });
        getContentPane().add(jValider, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 114, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jValiderActionPerformed
        
    
   
    }//GEN-LAST:event_jValiderActionPerformed

    private void jValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jValiderMouseClicked
     // if(controleConnection_Appel()){
          String leNom = jTxT_nom.getText();
          String lemotDePasse = String.valueOf(jTxT_MDP.getPassword());
          
        boolean bControle = ControleConnection.controle(leNom, lemotDePasse);
        
        
        if (bControle == true ){
             Gestion_articles lafenetre = new Gestion_articles();
                lafenetre.setVisible(true);
                dispose();
              lafenetre.jBtn_enrg.setVisible(false);
    //}                     
            
        }
                                      
                                     
    }//GEN-LAST:event_jValiderMouseClicked

    private void jValiderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jValiderKeyPressed
        // TODO add your handling code here:
        String leNom = jTxT_nom.getText();
          String lemotDePasse = String.valueOf(jTxT_MDP.getPassword());
          
        boolean bControle = ControleConnection.controle(leNom, lemotDePasse);
        
        
        if (bControle == true ){
             Gestion_articles lafenetre = new Gestion_articles();
                lafenetre.setVisible(true);
                dispose();
              lafenetre.jBtn_enrg.setVisible(false);
    //}                     
            
        }
    }//GEN-LAST:event_jValiderKeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       CreationCompteGestionnaire l_CreationCompteGestionnaire = new CreationCompteGestionnaire();
       l_CreationCompteGestionnaire.setVisible(true);
       dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
 //CECI PERMET DE CONTROLER LA CONNECTION
    
    private boolean controleConnection_Appel(){
       //contrôle de saisie
        
        String leNom = jTxT_nom.getText();
        boolean bControle = false;
        String lemotDePasse = String.valueOf(jTxT_MDP.getPassword());
        
        if (ControleConnection.controle(leNom, lemotDePasse)){
            if (ControleConnection.isEtatConnexion()) {
                  bControle = true;
                //    char[] vChar;
                 //   vChar = jPassword_MDP.getPassword();
                    
            } else{
            JOptionPane.showMessageDialog(null, "impossible de se connecter" + " à la base de donnée '\n\n'" + "vos noms et mot de passe sont corrects \n" + "Mais les paramètres pour le pilote" + " et la base de donnée" + " doivenet être verifiés. \n"," ALERTE" , JOptionPane.ERROR );        
            
        }
            
        }
        
        return bControle;   
    }
      
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
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField jTxT_MDP;
    private javax.swing.JTextField jTxT_nom;
    private javax.swing.JButton jValider;
    // End of variables declaration//GEN-END:variables
}
