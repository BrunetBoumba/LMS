/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.connetion;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.Statement;
import entite.Paramtres;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public abstract class ControleConnection {
    static Paramtres lesParamtres  = new Paramtres();
    static boolean etatConnexion;

    static Connection laConnetionStatique;

    static {
        boolean ok = true;
        //lesParamtres = new Paramtres();
        try {
            Class.forName(lesParamtres.getDriverSGBD());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControleConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        etatConnexion = true;
        if (ok) {
            try {
                String urlBD = lesParamtres.getServeurBD();
                String nomUtilisateur = lesParamtres.getNomUtilisateur();
                String MDP = lesParamtres.getMotDePasse();

                laConnetionStatique = (Connection) DriverManager.getConnection(urlBD, nomUtilisateur, MDP);
                etatConnexion = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Impossible de se connecter" + " à la base de donnée", "ALERTE", JOptionPane.ERROR_MESSAGE);
                etatConnexion = false;

            }
        }
    }

    public static Paramtres getLesParamtres() {
        return lesParamtres;
    }

    public static boolean isEtatConnexion() {
        return etatConnexion;
    }

    public static Connection getLaConnetionStatique() {
        return laConnetionStatique;
    }
    
    public static boolean controle (String Nom, String MotDePasse) {
         boolean verificationSaisie= false;
          try {
            
            Statement st = laConnetionStatique.createStatement();
             
             ResultSet rs = st.executeQuery("SELECT * "  + "FROM user ");
              while (rs.next()){
                  
                 //int id_userj = rs.getInt("id_user");
                 String use_namej = rs.getString("user_name");
                  String passwordj = rs.getString("password");
                  //int id = 1;   
        if (Nom.equals(use_namej) && MotDePasse.equals(passwordj)){
            
            verificationSaisie = true;    
              }
        
                
        }
              if (verificationSaisie == false){
                   JOptionPane.showMessageDialog(null, "Vous n'existez pas dans la BD.", " ERREUR",JOptionPane.ERROR_MESSAGE);
              }
    }catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, "verifié votre saisie.", " ERREUR",JOptionPane.ERROR_MESSAGE);
        verificationSaisie = false; 
        
        }
         
       return verificationSaisie;
    }
    public boolean creerCRUD (int vid_user, String vuser_name,String vpassword,  String vnom,String vprenom,int vtelephone, String vmail){
         boolean bcreation = false;
         String requete = null;
         try {
             
            requete = "INSERT INTO "
                 + "user  VALUES(?,?,?,?,?,?,?)"; //('"+vNom+"','"+vSexe+"','"+vPhone_number+"','"+vAdresse_mail+"','"+vDate_naissance+"','"+vStatut+"','"+vMatricule+"','"+vId_user+"','"+vLogin+"','"+vPassword+"','"+vNationalite+"')";
             PreparedStatement prepare = laConnetionStatique.prepareStatement(requete);
                 prepare.setInt(1, vid_user);
                 prepare.setString(2, vuser_name);
                 prepare.setString(3, vpassword);
                 prepare.setString(4, vnom);
                 prepare.setString(5, vprenom);
                 prepare.setInt(6,vtelephone );
                 prepare.setString(7, vmail);
                 prepare.executeUpdate();
                 prepare.close();
                  bcreation = true;     
                    JOptionPane.showMessageDialog(null, "Ajout dans la BD effectué avec succès :");
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Ajout dans la BD non effectué :) " + e.getMessage(), "Problème rencontré", JOptionPane.ERROR_MESSAGE);
         }
        return bcreation;
     }
    
    // METHODE DE FERMETURE DE LA SESSION 
     public static void fermetureSession () {
         try {
             laConnetionStatique.close();
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Problème rencontré" + " à la fermeture de la connection" , "ERREUR", JOptionPane.ERROR_MESSAGE);
         }
    }
       
}


